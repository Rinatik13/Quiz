<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Quiz</title>
</head>

<body>

<div style="text-align: center">
    <h2>
        Registration!
    </h2>
    <form action="resultAddNewQuestion">
        Question
        <br>
        <input type="text" name="questionView"
               placeholder="Question" style="border-radius: 3px; text-align: center">
        <br>
        <br>

        Correct answer
        <br>
        <input type="text" name="correct.answer"
               placeholder="Answer" style="border-radius: 3px; text-align: center">
        <br>
        <br>

        Incorrect answer 1
        <br>
        <input type="text" name="incorrect.answer1"
               placeholder="Answer" style="border-radius: 3px; text-align: center">
        <br>
        <br>
        Incorrect answer 2
        <br>
        <input type="text" name="incorrect.answer2"
               placeholder="Answer" style="border-radius: 3px; text-align: center">
        <br>
        <br>
        Incorrect answer 3
        <br>
        <input type="text" name="incorrect.answer3"
               placeholder="Answer" style="border-radius: 3px; text-align: center">
        <br>
        <br>
        <input type="submit" value="Registration" style="border-radius: 3px">
    </form>
</div>

</body>
</html>