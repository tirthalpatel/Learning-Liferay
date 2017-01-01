<%@ include file="/init.jsp"%>

<p style="color:red">
	<b>Hello <%=ParamUtil.getString(renderRequest, "name")%>!</b>
</p>

<hr />

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>	
</portlet:renderURL>

<aui:a href="<%= viewURL %>" >Back</aui:a>