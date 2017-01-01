<h3><%=ParamUtil.getString(renderRequest, "GREETER_MESSAGE")%></h3>

<portlet:actionURL name="/complex/action_first" var="sayHelloURL">
	<portlet:param name="mvcRenderCommandName" value="/complex/render_first"></portlet:param>
</portlet:actionURL>

<portlet:resourceURL id="/complex/resource_first" var="captchaURL" />

<liferay-ui:error key="captchaErrorMessage" message="Enter correct data as shown in the image"/>

<aui:form action="<%= sayHelloURL %>" method="post" name="<portlet:namespace />fm">
	<aui:input name="name" type="text" />
	
	<aui:fieldset>
		<liferay-ui:captcha url="<%= captchaURL %>" />		
	</aui:fieldset>
	
	<aui:button-row>
		<aui:button type="submit" id="submit" value="Greet"></aui:button>
	</aui:button-row>
</aui:form>
