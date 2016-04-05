<!DOCTYPE html>
<#assign userRole = "${userRole}">
<#import "*/components/navbar.ftl" as navbarRenderer/>
<#import "*/components/warehouse-table.ftl" as workhouseTable/>
<html>
<header>
<#include "*/includes.ftl">
    <link rel="stylesheet" type="text/css" href="./css/warehouse.css">
</header>
<body>
<input id="userRole" type="hidden" class="hidden" value="${userRole}" />
<@navbarRenderer.renderNavbar userRole="${userRole}" activePage="warehouse"/>
<#if userRole=="ADMIN">
<div class="container">
    <div class="col-md-11">
        <div class="col-md-2 col-md-offset-0 h2 ">
            <a href="./createWarehouse"><button type="submit" class="btn btn-primary btn-lg">Creeaza Depozit</button></a>
        </div>
        <div  class="col-md-9 h2">
            Depozite
        </div>
    </div>
    <div class="warehouse-table generic-table">
    <@workhouseTable.renderTable warehouses/>
    </div>
</div>
</#if>
</body>
</html>