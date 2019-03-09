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
				<%-- <form:option value="Nigeria" label="Nigeria"/>
				<form:option value="United States" label="United States"/>
				<form:option value="Canada" label="Canada"/>
				<form:option value="India" label="India"/>
				<form:option value="Spain" label="Spain"/>
				<form:option value="Germany" label="Germany"/> --%>
			</form:select>
			<br><br>
			Programming Language: 
			<br>
			Java	<form:radiobutton path="favoriteLanguage" value="Java"/>
			Python	<form:radiobutton path="favoriteLanguage" value="Python"/>
			C#		<form:radiobutton path="favoriteLanguage" value="C#"/>
			C++		<form:radiobutton path="favoriteLanguage" value="C++"/>
			Ruby	<form:radiobutton path="favoriteLanguage" value="Ruby"/>
			<br><br>
			<input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>