<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h2>form</h2>
<form:form method="post" action="map">
    <table>
        <tr>
            <td><form:label path="userName">Name</form:label></td>
            <td><form:input path="userName"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="userId">userId</form:label></td>
            <td><form:input path="userId"></form:input></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交"></input>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
