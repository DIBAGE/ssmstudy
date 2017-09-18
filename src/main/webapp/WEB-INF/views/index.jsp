<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html; charset=UTF-8"  %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="http://localhost:8080/ssmstudy/staticsource/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="http://localhost:8080/ssmstudy/staticsource/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="http://localhost:8080/ssmstudy/staticsource/demo.css">
    <script type="text/javascript" src="http://localhost:8080/ssmstudy/staticsource/jquery.min.js"></script>
    <script type="text/javascript" src="http://localhost:8080/ssmstudy/staticsource/jquery.easyui.min.js"></script>
</head>
<body>
<h2>l</h2>
<p>The panel is a container for other components or elements.</p>
<div style="margin:20px 0 10px 0;">
    <a href="#" class="easyui-linkbutton" onclick="javascript:$('#p').panel('open')">Open</a>
    <a href="#" class="easyui-linkbutton" onclick="javascript:$('#p').panel('close')">Close</a>
    <a href="#" class="easyui-linkbutton" onclick="javascript:$('#p').panel('expand', true)">expand</a>
    <a href="#" class="easyui-linkbutton" onclick="javascript:$('#p').panel('collapse', true)">collapse</a>
</div>
<div id="p" class="easyui-panel" title="Basic " style="width:700px;height:200px;padding:10px;"
     data-options="iconCls:'icon-save',collapsible:true,minimizable:true,maximizable:true,closable:true">
    <p style="font-size:14px">jQuery EasyUI framework helps you build your web pages easily.</p>
    <ul>
        <li>easyui is a collection of user-interface plugin based on jQuery.</li>
        <li>easyui provides essential functionality for building modem, interactive, javascript applications.</li>
        <li>using easyui you don't need to write many javascript code, you usually defines user-interface by writing some HTML markup.</li>
        <li>complete framework for HTML5 web page.</li>
        <li>easyui save your time and scales while developing your products.</li>
        <li>easyui is very easy but powerful.</li>
    </ul>
</div>
</body>
</html>
