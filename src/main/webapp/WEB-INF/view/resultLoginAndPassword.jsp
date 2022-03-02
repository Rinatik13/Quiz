<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Quiz</title>
</head>

<body style="text-align: center">
<div>
    <h2>${resultLoginPassword}</h2>
</div>

<form action="${resultAction}" method="post">
    <input type="submit" value="${resultSubmitValue}" style="border-radius: 5px">
</form>

</body>
</html>