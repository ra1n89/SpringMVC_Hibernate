

<!--


<html xmlns:th="http://www.thymeleaf.org">

<body>
<h2>Add user!</h2>

<form action="#" th:action="@{/adding}" th:object="user" method="post">

    <label>
        <input type="text" th:field = "*{name}"/>
    </label>

    <br>
     <input type="text" th:field= "*{surname}"/>
    <br>
     <input type="text" th:field= "*{age}"/>
    <br>
    <input type="submit" value="OK">
</form>
</body>
</html>
-->

<html>
<body>
<h2>User!</h2>
<form action="#" th:action="@{/adding}" th:object="${user1}" method="post">
    <input type="hidden" th:field="*{id}">
    <p>Name:
        <input type="text" th:field = "*{name}" />
    </p>
    <p>Surname
        <input type="text" th:field = "*{surname}" />
    </p>
    <p>Age:
        <input type="text" th:field = "*{age}" />
    </p>
    <p><input type="submit" value="Submit" /> </p>
</form>
</body>
</html>

