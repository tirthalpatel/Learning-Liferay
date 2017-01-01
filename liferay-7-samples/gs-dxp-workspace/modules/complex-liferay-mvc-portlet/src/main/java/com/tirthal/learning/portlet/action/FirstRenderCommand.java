package com.tirthal.learning.portlet.action;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.tirthal.learning.constants.ComplexPortletKeys;

@Component(
    immediate = true,
    property = {
       "javax.portlet.name=" + ComplexPortletKeys.COMPLEX_MVC_POC,
       "mvc.command.name=/complex/render_first"
    },
    service = MVCRenderCommand.class
)
public class FirstRenderCommand implements MVCRenderCommand {
	
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		if(_log.isInfoEnabled())
			_log.info("In render phase");
		
		return "/render_first.jsp";		
	}

	private static final Log _log = LogFactoryUtil.getLog(FirstRenderCommand.class);
}
