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
    <form action="game" method="post">
        <div style="flex: auto">
            Question:
            <br>
                <span>${questionView}</span>
        </div>
        <br>
        <br>
        <div style="display: flex; justify-content: center">
            <p>${questionAnswer1}</p><input type="radio" name="answer" value="answer1">
            <p>${questionAnswer2}</p><input type="radio" name="answer" value="answer2">
        </div>
        <br>
        <br>
        <div style="display: flex; justify-content: center">
            <p>${questionAnswer3}</p><input type="radio" name="answer">
            <p>${questionAnswer4}</p><input type="radio" name="answer">
        </div>
        <br>
        <br>
        <input type="submit" value="Next"
               style="border-radius: 5px">
    </form>
</div>


</body>
</html>