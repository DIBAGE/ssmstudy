<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" scope="session"/>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
%>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/staticsource/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/staticsource/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/staticsource/demo.css">
    <script type="text/javascript" src="${ctx}/staticsource/jquery.min.js"></script>
    <script type="text/javascript" src="${ctx}/staticsource/jquery.easyui.min.js"></script>
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
        <li>using easyui you don't need to write many javascript code, you usually defines user-interface by writing
            some HTML markup.
        </li>
        <li>complete framework for HTML5 web page.</li>
        <li>easyui save your time and scales while developing your products.</li>
        <li>easyui is very easy but powerful.</li>
    </ul>

    <div id="pp" class="easyui-pagination" style="background: #efefef; border: 1px;"
         data-options="total:200,pageSize:10">
        jksfjskfdsjflskdja;lkfsa
    </div>
    <select id="cc" class="easyui-combobox" name="dept" style="width: 200px">
        <option value="aa">a1</option>
        <option value="aa1">a2</option>
        <option value="aa2">a3</option>
        <option value="aa3">a4</option>
    </select>
</div>
<select id="ccc" class="easyui-combogrid" name="dept" style="width:250px;"
        data-options="
    panelWidth:450,
    value:'006',
    idField:'code',
    textField:'name',
    url:'datagrid_data.json',
    columns:[[
    {field:'code',title:'Code',width:60},
    {field:'name',title:'Name',width:100},
    {field:'addr',title:'Address',width:120},
    {field:'col4',title:'Col41',width:100}
    ]]
    ">

</select>
<input id="ss"value="2" />
<table class="easyui-datagrid" style="width:400px;height:250px"
       data-options="url:'datagrid_data.json',fitColumns:true,singleSelect:true">
    <thead>
    <tr>
        <th data-options="field:'code',width:100">Code</th>
        <th data-options="field:'name',width:100">Name</th>
        <th data-options="field:'price',width:100,align:'right'">Price</th>
    </tr>
    </thead>
</table>
</body>
<script>
    $(function () {
        $("#ccc").combogrid('setValue', '002');
        $('#ss').numberspinner({
            min: 10,
            max: 100,
            editable: false
        });
    })

    //定义公共的组件function
    /**
     * datagrid处理response
     */
    function doResponse2(response2, dataGridId, dataDialog2) {
        if (1 == response2.code) {//操作成功
            alertDelay(response2.message);
            if (dataGridId != null && dataGridId != undefined) {
                $("#" + dataGridId).datagrid('reload');
            }
            if (dataDialog2 != null && dataDialog2 != undefined) {
                dataDialog2.dialog('close');
            }
        }
        else {
            if (response2 != null && response2 != undefined) {
                $.messager.alert('提示信息', response2.message, 'info');
            }
        }
    }

    //延迟tm秒后自动关闭提示框，用于成功时的弹出框自动关闭
    function alertDelay(msg, tm) {
        var interval;
        var time = 1000;
        var x;
        if (null == tm || '' == tm) {
            x = Number(2);
        } else {
            x = Number(tm);
        }
        $.messager.alert('系统提示', '<div class="messager-icon messager-info"></div><div>' + msg + '</div>', "", function () {
        });
        $(".messager-window .window-header .panel-title").append("（" + x + "秒后自动关闭）");
        interval = setInterval(fun, time);

        function fun() {
            --x;
            if (x == 0) {
                clearInterval(interval);
                $(".messager-body").window('close');
            }
            $(".messager-window .window-header .panel-title").text("");
            $(".messager-window .window-header .panel-title").append("系统提示（" + x + "秒后自动关闭）");
        }
    }
    //1.确认的信息，2发送的url，3.传输的数据，4，返回的setID，5使用的提交数据的对话框
    function commonSubmit(comfirmMsg, submitUrl, submitData, datagridId, submitDialog) {
        $.messager.confirm("请确认", comfirmMsg, function (flag) {
            if (flag) {
                showProgress();
                $.ajax({
                    url: submitUrl,
                    type: 'POST',
                    data: submitData,
                    cache: false,
                    dataType: 'json',
                    error: function () {
                        closeProgress();
                        $.messager.alert('提示信息', '操作失败！');
                    },
                    success: function (response) {
                        closeProgress();
                        doResponse2(response, datagridId, submitDialog);
                    }
                });
            }
        });
    }
</script>
</html>
