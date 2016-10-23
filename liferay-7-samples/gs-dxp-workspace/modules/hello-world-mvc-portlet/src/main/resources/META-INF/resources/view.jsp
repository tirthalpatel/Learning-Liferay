<%@ include file="/init.jsp"%>

<jsp:useBean id="userName" type="java.lang.String" scope="request" />
<p>
	<b>Hello <%=userName%>!</b>
</p>

<p>
	<b><liferay-ui:message key="hello_world_mvc_portlet_HelloWorldMvcPortlet.caption" /></b>
</p>


