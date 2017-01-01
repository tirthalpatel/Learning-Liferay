<portlet:resourceURL id="/complex/resource_second" var="refreshDateURL">
	<liferay-portlet:param name="param1" value="Test Value 1" />
</portlet:resourceURL>

<aui:a href="#" onclick="freshDateTime()">Refresh</aui:a>

<script type="text/javascript">
	function freshDateTime() {
		AUI().use('aui-io-request', function(A) {
			A.io.request('${refreshDateURL}', {
				method : 'post',
				data : {
					<portlet:namespace />param2 : 'Test Value 2',
				},
				on : {
					success : function() {
						alert(this.get('responseData'));
					}
				}
			});

		});
	}
</script>