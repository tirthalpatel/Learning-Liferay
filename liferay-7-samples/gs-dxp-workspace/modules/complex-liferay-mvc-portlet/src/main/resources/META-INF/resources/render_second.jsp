<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>

<b>Current date and time is:</b> <%= renderRequest.getAttribute("CURRENT_DATE_TIME") %>

<br /><br />

<%@ include file="/resource_second.jsp" %>

<hr />

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcRenderCommandName" value="/complex/render_view"></portlet:param>	
</portlet:renderURL>

<aui:a href="<%= viewURL %>" >Back</aui:a>