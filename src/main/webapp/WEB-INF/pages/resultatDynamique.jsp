<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: tplocal
  Date: 01/02/2022
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <title><s:text name="resultatDynamique.titre"></s:text></title>
</head>
<style>
    body {
        background-color: #212529;
        color: white;
    }
</style>
<body>
<s:property value="operand1"></s:property>
<s:property value="operation"></s:property>
<s:property value="operand2"></s:property>
<s:text name = "resultatDynamique.egal"/>
<s:property value="resultat"></s:property>
<s:text name = "resultatDynamique.compteurText"></s:text>
<s:property value="compteur"></s:property>


</body>
</html>
