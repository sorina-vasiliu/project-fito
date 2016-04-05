<#macro renderTable agentsList>
<table class="table">
    <#if agentsList?has_content>
      <thead>
        <th class="table-header">Nume</th>
        <th class="table-header">Email</th>
        <th class="table-header">Locatie</th>
        <th class="table-header">Depozit</th>
        <th class="table-header">Detalii</th>
      </thead>
     <tbody style="text-align: left">
        <#list agentsList as agent>
        <tr class="tableRow">
            <td>${agent.name}</td>
            <td>${agent.mail}</td>
            <td>${agent.locality.name}</td>
            <td>${agent.warehouse.name}</td>
            <td>
                <form class="details-button-qaa-${agent.id}" action="./agentDetails" method="GET">
                    <input type="hidden" name="id" value="${agent.id}" />
                    <button id="edit${agent.id}" type="submit" class="btn details-button">Detatlii</button>
                </form>
            </td>
        </tr>
        </#list>
    <#else>
        Momentant nu este nici un agent!
    </#if>
</tbody>
</table>
</#macro>