<%@page import="org.eclipse.jdt.internal.compiler.ast.PrefixExpression"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
h2 {
	text-align: center;
	color: red;
}

.container {
	border: 1px solid gray;
	width: 500px;
	height: 400px;
	margin: auto;
	box-shadow: 4px 4px 4px pink
}

#mess {
	background-color: gray;
	padding: 0px;
	position: relative;
	top: 27px;
	background-size: 100%;
	height: 28px;
	text-align: center;
	color: white;
	font-size: 19px
}
</style>
<link rel="stylesheet" href="/CSS/index.css">
</head>
<body>
	<h2>Welcome To Employee Registration</h2>
	<div class="container">
		<form:form action="insert" method="post" modelAttribute="employee">
			<pre>  
          Name:   <form:input path="Empname" /><br>          
          Gender:<form:radiobutton path="empGeneder" value="Male" />Male
                 <form:radiobutton path="empGeneder" value="Female" />Female<br>         
         Address: <form:textarea path="empAddress" /><br>      
         Country: <form:select path="empcntry"><br>
                  <form:option value="Eng">	England</form:option>
                  <form:option value="Ind">India</form:option>
                  <form:option value="Eng">Nepal</form:option>
                  </form:select><br>     
         Language: <form:checkbox path="empLangs" value="eng" />English
                   <form:checkbox path="empLangs" value="Hin" />Hindi
                   <form:checkbox path="empLangs" value="Mar" />Marathi
                   <form:checkbox path="empLangs" value="Tel" />Telgu<br>
                   <input type="submit" value="Register" />
   </pre>
		</form:form>
		<div id="mess">${message}</div>
	</div>
</body>
</html>