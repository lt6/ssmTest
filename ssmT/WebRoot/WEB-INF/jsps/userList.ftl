<#assign projectName="ssmT" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body> 

用户列表：
<table width="100%" border=1>
<tr>
	<td>用户ID</td>
	<td>用户名称</td>
</tr>

<#list userList as user>
	<tr>
		<td>${user.id }</td>
		<td>${user.username }</td>
	</tr>
</#list>

</table>

</body>

</html>