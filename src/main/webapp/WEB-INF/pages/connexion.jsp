<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: tplocal
  Date: 27/01/2022
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <title><s:text name="connexion.titre"></s:text></title>
</head>
<style>
    body {
        background-color: #212529;
        color: white;
    }
</style>
<body>
<s:form action="saisie">
    <s:textfield name="pseudo" key="connexion.pseudo"></s:textfield>
    <s:password name="motSecret" key="connexion.motSecret"></s:password>


    <s:submit key="connexion.bouton"></s:submit>
</s:form>
<s:a action = "accueil"><s:text name = "accueil.titre"></s:text></s:a>

</body>
</html>
