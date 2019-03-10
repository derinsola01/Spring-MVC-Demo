<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
	<head>
		<title>
			Student Confirmation Form
		</title>
	</head>
	<body>
		The student is confirmed: ${ student.firstName } ${ student.lastName }
		<br>
		Country is ${ student.country }
		<br>
		Favorite Programming Language is: ${ student.favoriteLanguage }
		<br>
		Operating Systems:
		<ol>
			<c:forEach var="temp" items="${ student.operatingSystem }">
				<li>
					${ temp }
				</li>
			</c:forEach>
		</ol>
	</body>
</html>