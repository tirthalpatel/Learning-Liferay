package com.tirthal.learning;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

/*
 * Notes:
 * (1) @Component --- defines the class as a Service Component: a provider of a particular service class
 * (2) immediate=true --- when this module is deployed and all of its dependencies are satisfied, it should be started immediately instead of being lazy-loaded
 * (3) property { *.portlet.* } --- portlet specific properties such as the category in which it should appear in Liferay’s UI, its display name, its default view, and more. 
 * (4) service=Portlet.class --- the service (which is just a Java Interface) that it implements is defined, which is the portlet class.  
 */

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=hello-world-mvc-portlet Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class HelloWorldMvcPortlet extends MVCPortlet {
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();

		renderRequest.setAttribute("userName", user.getFirstName());

		super.render(renderRequest, renderResponse);
	}

}