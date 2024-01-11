
<html>
<body>
<h2>Users!</h2>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Surname</td>
        <td>Age</td>
        <td>Change</td>
    </tr>
    <tr  th:each="u : ${user}">

        <td th:text="${u.getName()}"></td>
        <td th:text="${u.getSurname()}"></td>
        <td th:text="${u.getAge()}"></td>
        <td>
            <input  type="button" name="Edit"  value="Edit" th:onclick="'window.location.href=\'/changing?id='+${u.getId()}+'\''">
            <input  type="button" name="Delete"  value="Delete" th:onclick="'window.location.href=\'/delete?id='+${u.getId()}+'\''">

        </td>
    </tr>
</table>
<br>
<input type="button" onclick="window.location.href='add'" value="Add">Add User</input>

</body>
</html>
