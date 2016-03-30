<#macro renderTable warehouseList>
<table class="table">
    <#if warehouseList?has_content>
        <thead>
        <th class="table-header">Email</th>
        <th class="table-header">Locatie</th>
        <th class="table-header">Numar Consultanti</th>
        <th class="table-header">Detalii</th>
        </thead>
    <tbody style="text-align: left">
        <#list warehouseList as warehouse>
        <tr class="tableRow">
            <td>${warehouse.mail}</td>
            <td>${warehouse.location}</td>
             <td>
                <#if warehouse.consultant?has_content>
                    ${warehouse.consultant?size}
                <#else>
                     0
                </#if>
            </td>
             <td>
                <form class="details-button-qaa-${warehouse.id}" action="./warehouseDetails" method="GET">
                    <input type="hidden" name="id" value="${warehouse.id}" />
                    <button id="edit${warehouse.id}" type="submit" class="btn details-button">Detatlii</button>
                </form>
            </td>
        </tr>
        </#list>
    <#else>
     Momentant nu este nici un depozit!
    </#if>
</tbody>
</table>
</#macro>