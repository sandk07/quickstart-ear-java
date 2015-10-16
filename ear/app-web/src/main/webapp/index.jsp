<%@ page import="org.wipro.com.*"%>
<html>
<head>
<title>Hello Ear</title>

<style type="text/css">
#login-frm {
	background-color: #efefef;
	padding: 20px;
}

.container {
	width: 500px;
	margin-left: auto;
	margin-right: auto;
}

.container table td {
	padding: 10px;
}

#output {
	background-color: #A2F9A2;
	display: block;
	padding: 10px 0px;
	text-align: center;
}
</style>

</head>
<body>
<div class="container" >
	<form id="login-frm" action="InvokerServlet" method="post">
		<table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="fname"></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lname"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" id="submit" value="submit" /></td>
			</tr>
		</table>
	</form>

	<span class="container" id="output">
		<%
			UserDetail usdet = (UserDetail)request.getAttribute("userDetail");
			if(null != usdet){
				String user = usdet.getFirstName() + " " +usdet.getLastName(); 
				if(null != user){
					%>
						<%=user%>
					<%
				}
			}
		%></span>
		</div>
</body>
</html>
