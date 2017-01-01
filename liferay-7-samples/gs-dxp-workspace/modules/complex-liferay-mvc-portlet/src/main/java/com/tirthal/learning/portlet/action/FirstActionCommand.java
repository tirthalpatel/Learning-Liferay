package com.tirthal.learning.portlet.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.captcha.CaptchaException;
import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.tirthal.learning.constants.ComplexPortletKeys;

@Component(
    immediate = true,
    property = {
       "javax.portlet.name=" + ComplexPortletKeys.COMPLEX_MVC_POC,
       "mvc.command.name=/complex/action_first"
    },
    service = MVCActionCommand.class
)
public class FirstActionCommand implements MVCActionCommand {

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		
		if(_log.isInfoEnabled())
			_log.info("In process action phase");					
		
		try {        	
            CaptchaUtil.check(actionRequest);                        
    		
            String name = ParamUtil.get(actionRequest, "name", StringPool.BLANK);
    		String greetingMessage = "Hello " + name + "! Welcome to Liferay Portal 7.";
    				
    		actionResponse.setRenderParameter("GREETER_MESSAGE", greetingMessage);
    		
        } catch (CaptchaException e) {
        	
            SessionErrors.add(actionRequest, "captchaErrorMessage");           
        }
		
		return true;
	}

	private static final Log _log = LogFactoryUtil.getLog(FirstActionCommand.class);
}
