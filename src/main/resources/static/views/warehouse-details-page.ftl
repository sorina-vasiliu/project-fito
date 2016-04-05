<!DOCTYPE html>
<#assign userRole = "${userRole}">
<#import "*/components/navbar.ftl" as navbarRenderer/>
<#import "*/components/warehouse-form.ftl" as warehouseForm/>
<head>
<#include "*/includes.ftl">
</head>
<body>
<input id="userRole" type="hidden" value="${userRole}">
<@navbarRenderer.renderNavbar userRole="${userRole}" activePage="consultant"/>
<#if userRole=="ADMIN">
<div class="container">
    <div class="col-md-12 col-xs-12">
        <@warehouseForm.renderForm "Editare Depozit" locations warehouse/>
    </div>
</div>
</#if>
</body>
<html>