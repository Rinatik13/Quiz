<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Quiz</title>
    <link rel="stylesheet" href="myStyle.css">
</head>

<body>
<div style="text-align: center">
    <div>
        <h2>Hello!</h2>
        <form action="resultLoginAndPassword" method="post">
            Login
            <br>
            <input type="text" name="person.login"
            placeholder="What your login?"
            style="border-radius: 5px; text-align: center">
            <br>
            <br>
            Password
            <br>
            <input type="password" name="person.password"
            placeholder="What your password?"
            style="border-radius: 5px; text-align: center">
            <br>
            <br>
            <input type="submit" value="LOG IN" style="border-radius: 5px">
        </form>
        <br>
        <form action="addNewPerson">
            <input type="submit" value="REGISTRATION" style="border-radius: 5px">
        </form>
    </div>
</div>


</body>
</html>