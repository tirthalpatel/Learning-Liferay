package com.tirthal.learning;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.captcha.CaptchaException;
import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=simple-liferay-mvc-portlet Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class SimpleLiferayMvcPortlet extends MVCPortlet {
	
	@Override	
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {	

		super.render(renderRequest, renderResponse);
	}
	
	@ProcessAction(name="sayHello")
	public void sayHello(ActionRequest request, ActionResponse response) throws IOException, PortletException {		

        try {
        	
            CaptchaUtil.check(request);
            if (_log.isDebugEnabled()) {
    			_log.debug("CAPTCHA validated successfully");
    		}
            
            String name = ParamUtil.getString(request, "name");
    		
    		response.setRenderParameter("name", name);
    		response.setRenderParameter("mvcPath", "/say_hello.jsp");
    		
        } catch (CaptchaException e) {
        	
            SessionErrors.add(request, "captchaErrorMessage");
            response.setRenderParameter("mvcPath", "/view.jsp");            
        }
        		
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {

		if (_log.isDebugEnabled()) {
			_log.debug("get captcha resource ");
		}

		try {
			CaptchaUtil.serveImage(resourceRequest, resourceResponse);			
		}
		catch (Exception e) {
			_log.error(e, e);
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(SimpleLiferayMvcPortlet.class);
}