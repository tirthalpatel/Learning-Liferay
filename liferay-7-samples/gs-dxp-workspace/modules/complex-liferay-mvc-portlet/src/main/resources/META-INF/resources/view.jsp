<%@ include file="/init.jsp" %>

<b>Welcome to POC portlet to try render, action and resource commands approach of Liferay 7</b>

<br />
<hr />

<p><b>First Example</b></p>

<portlet:renderURL var="firstRenderURL">
	<portlet:param name="mvcRenderCommandName" value="/complex/render_first"></portlet:param>	
</portlet:renderURL>

<aui:a href="<%= firstRenderURL %>" >Say Hello</aui:a> 


<br />
<hr />

<p><b>Second Example</b></p>

<portlet:renderURL var="secondRenderURL">
	<portlet:param name="mvcRenderCommandName" value="/complex/render_second"></portlet:param>	
</portlet:renderURL>

<aui:a href="<%= secondRenderURL %>" >What's date and time?</aui:a>