<!DOCTYPE html>
<#assign userRole = "${userRole}">
<#import "*/components/navbar.ftl" as navbarRenderer/>
<#import "*/components/warehouse-table.ftl" as workhouseTable/>
<html>
<header>
<#include "*/includes.ftl">
</header>
<body>
    <input id="userRole" type="hidden" class="hidden" value="${userRole}" />
    <@navbarRenderer.renderNavbar userRole="${userRole}" activePage="warehouse"/>
    <div class="container">
        <div class ="panel-group">
            <div class="h2">
                Depozite
            </div>
            <div class="consultants-table generic-table">
                <@workhouseTable.renderTable warehouses/>
             </div>
        </div>
    </div>
</body>
</html>