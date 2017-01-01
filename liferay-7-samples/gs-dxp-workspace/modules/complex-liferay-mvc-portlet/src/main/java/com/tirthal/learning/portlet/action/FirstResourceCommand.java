package com.tirthal.learning.portlet.action;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.tirthal.learning.constants.ComplexPortletKeys;

@Component(
    immediate = true,
    property = {
       "javax.portlet.name=" + ComplexPortletKeys.COMPLEX_MVC_POC,
       "mvc.command.name=/complex/resource_first"
    },
    service = MVCResourceCommand.class
)
public class FirstResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException {
		
		if(_log.isInfoEnabled())
			_log.info("In serve resource phase");
		
		try {
			CaptchaUtil.serveImage(resourceRequest, resourceResponse);			
		}
		catch (Exception e) {
			_log.error(e, e);
		}		
		
		return true;
	}

	private static final Log _log = LogFactoryUtil.getLog(FirstResourceCommand.class);
}
