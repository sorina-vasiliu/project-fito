<!DOCTYPE html>
<#assign userRole = "${userRole}">
<#import "*/../components/navbar.ftl" as navbarRenderer />
<html>
<head>
<#include "*/includes.ftl">
    <link rel="stylesheet" type="text/css" href="css/home.css" />
    <link rel="stylesheet" type="text/css" href="css/mediaQueries/home-media-queries.css" />

</head>
<body>
<input id="userRole" type="hidden" class="hidden" value="${userRole}" />
<@navbarRenderer.renderNavbar userRole="${userRole}" activePage="home" userHasProjects=userHasProjects />
<#if userRole == 'ADMIN'>
<div class="container">
    <div class="row">
        <div class="col-md-12 col-xs-12" >
            <div class="roleBox">
            Welcome ${userRole}
            </div>
        </div>
    </div>
</div>
<#else>
<div class="container">
    <div class="row">
        <div class="col-md-12 col-xs-12" >
            <div class="roleBox">
            Welcome ${userRole}
            </div>
        </div>
    </div>
</div>
</#if>
<#if errors?? && errors?has_content>
    <@errorBox.renderErrors errors />
</#if>
<script src="script/home.js"></script>
</body>
</html>