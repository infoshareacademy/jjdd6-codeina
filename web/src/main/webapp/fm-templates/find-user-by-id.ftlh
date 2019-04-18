<!DOCTYPE html>
<html>
<head>
    <title>Find user by id </title>
</head>
<body>
<#-- af -->
<#if user??>
    <ul>
        <li> ID: ${user.id}</li>    <#-- textFM -->
        <li> Name: ${user.name}</li>
        <li>Login: ${user.login}</li>
        <li>Age: ${user.age}</li>
    </ul>
<#else>
    <font color="red">User has not been found</font>
</#if>

<#include "copyright.ftlh">
</body>
</html>