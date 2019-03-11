<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
	<head>
		<title>
			Student Registration Form
		</title>
		<style>
			.error{ color:red }
		</style>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName"/>
						<form:errors path="firstName" cssClass="error" />
			<br><br>
			Last Name (*):  <form:input path="lastName"/>
							<form:errors path="lastName" cssClass="error" />
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
				<form:checkboxes 	path="operatingSystem" 
									items="${ student.operatingSystemOptions }" />
			<br><br>
			Free Passes (*):  <form:input path="freePasses"/>
							<form:errors path="freePasses" cssClass="error" />
							
			<br><br>
			Postal Code (*):  <form:input path="postalCode"/>
							<form:errors path="postalCode" cssClass="error" />
							
			<br><br>
			Course Code (*):  <form:input path="courseCode"/>
							<form:errors path="courseCode" cssClass="error" />
							
			<br><br>
			<input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>