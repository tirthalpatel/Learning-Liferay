<%@ include file="/init.jsp"%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>	
</portlet:renderURL>

<portlet:actionURL name="sayHello" var="sayHelloURL" />	

<portlet:resourceURL var="captchaURL" />

<liferay-ui:error key="captchaErrorMessage" message="Enter correct data as shown in the image"/>

<aui:form action="<%= sayHelloURL %>" name="<portlet:namespace />fm">
	
	<aui:fieldset>
		<aui:input name="name">
		  	<aui:validator name="required" errorMessage="Please enter name to say hello." />
		</aui:input>
	</aui:fieldset>	

	<aui:fieldset>
		<liferay-ui:captcha url="<%= captchaURL %>" />		
	</aui:fieldset>
	    
	<aui:button-row>
		<aui:button type="submit" id="submit" value="Say Hello"></aui:button>
		
		<aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>
	</aui:button-row>
</aui:form>

