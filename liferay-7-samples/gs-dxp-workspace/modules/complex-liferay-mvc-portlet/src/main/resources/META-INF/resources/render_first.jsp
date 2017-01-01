<%@ include file="/init.jsp" %>

<b>Hurrah... Liferay is awesome!</b> 

<br />
<hr />

<%@ include file="/action_resource_first.jsp" %>

<hr />

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcRenderCommandName" value="/complex/render_view"></portlet:param>	
</portlet:renderURL>

<aui:a href="<%= viewURL %>" >Back</aui:a>