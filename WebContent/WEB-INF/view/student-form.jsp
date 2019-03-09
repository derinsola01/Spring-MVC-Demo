<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
	<head>
		<title>
			Student Registration Form
		</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName"/>
			<br><br>
			Last Name:  <form:input path="lastName"/>
			<br><br>
			Select Country: 
			<br>
			<form:select path="country">
				<form:options items="${ student.countryOptions }"/>
			</form:select>
			<br><br>
			Programming Language: 
				<form:radiobuttons 	path="favoriteLanguage" 
									items="${ student.favoriteLanguageOptions }" />
			<br><br>
			Operating Systems: 
				Windows <form:checkbox path="operatingSystem" value="Windows"/>
				Linux <form:checkbox path="operatingSystem" value="Linux"/>
				Mac <form:checkbox path="operatingSystem" value="Mac"/>
				Ubuntu <form:checkbox path="operatingSystem" value="Ubuntu"/>
			<br><br>
			<input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>