<!DOCTYPE html>
<#assign userRole = "${userRole}">
<#import "*/components/navbar.ftl" as navbarRenderer/>
<html>
<header>
<#include "*/includes.ftl">
</header>
<body>
<input id="userRole" type="hidden" class="hidden" value="${userRole}" />
<@navbarRenderer.renderNavbar userRole="${userRole}" activePage="agent"/>
<div class="container">
    <div class ="panel-group">
        <div class="h2">
            Agenti
        </div>
    </div>
</div>
</body>
</html>