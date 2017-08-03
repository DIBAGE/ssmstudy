<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html; charset=UTF-8"  %>
<html>
<meta />
<body>
<h2>form</h2>
<form:form method="post" action="map">
    <table>
        <tr>
            <td><input name="currentPage" type="number"/>aa</td>
            <td></td>
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
