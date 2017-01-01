package com.tirthal.learning.portlet.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.tirthal.learning.constants.ComplexPortletKeys;

@Component(
    immediate = true,
    property = {
       "javax.portlet.name=" + ComplexPortletKeys.COMPLEX_MVC_POC,
       "mvc.command.name=/complex/resource_second"
    },
    service = MVCResourceCommand.class
)
public class SecondResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException {
		
		if(_log.isInfoEnabled())
			_log.info("In serve resource phase: Resource request parameters = " + resourceRequest.getParameter("param1") + " & " + resourceRequest.getParameter("param2"));
		
		resourceRequest.setAttribute("REFRESHED_CURRENT_DATE_TIME", LocalDateTime.now().toString());
		PrintWriter out;
		try {
			out = resourceResponse.getWriter();
			out.println("Refreshed date and time is: " + LocalDateTime.now().toString());
			out.flush();
		} catch (IOException e) {			
			_log.error(e);
		}		
		
		return true;
	}

	private static final Log _log = LogFactoryUtil.getLog(SecondResourceCommand.class);
}
