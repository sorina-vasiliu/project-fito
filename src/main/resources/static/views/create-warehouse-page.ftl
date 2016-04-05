<html>
<head>
<#include "*/includes.ftl">
<#import "*/components/navbar.ftl" as navbarRenderer/>
<#import "*/components/warehouse-form.ftl" as warehouseFormRenderer />
</head>

<body>
<input id="userRole" type="hidden" value="${userRole!'sdasd'}" />
<@navbarRenderer.renderNavbar userRole "warehouse" />
<#if userRole=="ADMIN">
<div class="container">
    <div class="col-md-9 col-xs-7">
         <@warehouseFormRenderer.renderForm "Creeaza depozit" locations "" />
    </div>
</div>
</#if>
</body>
</html>