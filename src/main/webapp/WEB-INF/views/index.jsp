<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html; charset=UTF-8"  %>
<html>
<meta />
<body>
<script typet="text/javascript" src="http://libs.baidu.com/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
    function aj() {
        $.ajax({
            type: "POST",
            url: "/ssmstudy/map",
            data: {
                "currentPage": 2
            },
            timeout: 10000,
            dataType: "json",
            success: function (result) {
               console.log(result);
            }
        });
    }
</script>
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
                <input type="button" onclick="aj()" value="button"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
