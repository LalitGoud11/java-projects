<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!-- THE ABOVE LINE IS USED IN SPRING MVC TO SUPPORT MVC FORM TAG  -->



<html>
	<head>
		<title>
	
		Student form validation.
		
		
		</title>
		
		<style>
			 
			
			.error{
			color:red;
			}
			
		</style>
	
	</head>

	<body>
		<form:form action="displayfile" modelAttribute="student">
			<label>First name:</label>
			<form:input path="firstName"  placeholder="FIRST NAME" />
			<br>
			<br>
			<label>Last name  <span class="error">(*)</span> :</label>
			<form:input path="lastName"  placeholder="LAST NAME"/>
			<form:errors path="lastName" class="error"></form:errors>
			<br>
			<br>
			<label>Your skills: </label>
			<form:checkbox path="checkBox" value="java"/>java
			<form:checkbox path="checkBox" value="html"/>html
			<form:checkbox path="checkBox" value="css"/>css
			<br>
			<br>
			<label>Gender:</label>	
			<form:radiobutton path="radioButton" value="Male"/>Male
			<form:radiobutton path="radioButton" value="Female"/>Female
			<form:radiobutton path="radioButton" value="Other"/>Other
			<br>
			<br>
			<label>Country:</label>
			<form:select path="country">
				<form:option value="India"></form:option>
				<form:option value="USA"></form:option>
				<form:option value="Australia"></form:option>
				<form:option value="Nepal"></form:option>
		</form:select>
			<br>
			<br>
			<input type="submit">
			
		</form:form>
	</body>

</html>