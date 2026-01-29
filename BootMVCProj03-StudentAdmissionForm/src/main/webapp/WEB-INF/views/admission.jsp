<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Student Admission Form</title>
</head>
<body>

<h2>Student Admission Form</h2>

<form action="submit-form" method="post">

    Student Name:
    <input type="text" name="studentName"/><br><br>

    Roll Number:
    <input type="number" name="rollNumber"/><br><br>

    Date of Birth:
    <input type="date" name="dateOfBirth"/><br><br>

    Course:
    <input type="text" name="course"/><br><br>

    Contact Number:
    <input type="number" name="contactNumber"/><br><br>

    <input type="submit" value="Submit"/>

</form>

</body>
</html>
