<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Quiz</title>
</head>
<body>
<div style="text-align: center">
    <h1>Game!</h1>
    <br>
    <br>
    <form action="gameView" method="post">
        <div>
            Question:
            <br>
            <p>${questionView}</p>
        </div>
        <br>
        <br>
        <div style="flex: auto">
            <p>${questionAnswer1}</p><input type="radio" name="answer" value="answer1">
            <p>${questionAnswer2}</p><input type="radio" name="answer" value="answer2">
        </div>
        <br>
        <br>
        <div>
            <p>${questionAnswer3}</p><input type="radio" name="answer3">
            <p>${questionAnswer4}</p><input type="radio" name="answer4">
        </div>
        <br>
        <br>
        <input type="submit" value="Next"
               style="border-radius: 5px">
    </form>
</div>


</body>
</html>