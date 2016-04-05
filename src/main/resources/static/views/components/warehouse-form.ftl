<#macro renderForm titlePage locations=""  warehouse="">
<div id ="warehouse-details">
         <form class="create-form form-horizontal" role="form" action="./createWarehouse" method="POST" enctype="multipart/form-data">
             <#if warehouse?has_content>
                 <input type="hidden" name="id" value="${warehouse.id}"/>
             </#if>
         <div class="form-group">
             <h2>${titlePage}</h2>
         </div>
         <div class="form-group">
            <div class="col-md-2 col-xs-2">
                 <label for="warehouse-mail" class="control-label">Email:</label>
            </div>
            <div class="col-md-6 col-xs-6">
                <#if warehouse?has_content>
                     <input type="text" class="form-control" id="warehouse-mail" value="${warehouse.mail!''}" name="mail" placeholder="Introduceti adresa de email a depozitului.">
                <#else>
                     <input type="text" class="form-control" id="warehouse-mail" value="warehouse@mail.com"  name="mail" placeholder="Introduceti adresa de email a depozitului." required>
                </#if>
            </div>
         </div>

        <div class="form-group">
         <div class="col-md-2 col-xs-2">
             <label for="locality" class="control-label">Locatie:</label>
          </div>
         <div class="col-md-6 col-xs-6">
            <select id="category-dropdown" name="locality" class="form-control">
                <#if locations?has_content>
                    <#list locations as location>
                        <#if warehouse?has_content>
                            <option  value="${location.localityId}" name="localityId" ${(warehouse.locality.localityId == location.localityId)?string('selected','')} > ${location.name}</option>
                        <#else>
                            <option  value="${location.localityId}" name="localityId"> ${location.name}</option>
                        </#if>
                    </#list>
                </#if>
            </select>
         </div>
        </div>

       <#if warehouse?has_content>
        <div class="form-group">
            <div class="col-md-2 col-xs-2">
                <label for="warehouse-agents" class="control-label">Numar Agenti:</label>
            </div>
            <div class="col-md-4 col-xs-4">
              <#if warehouse.agents?has_content>
                <a href="./agents?warehouseId=${warehouse.id}"> ${warehouse.agents.size} </a></p>
              <#else>
                <p>0</p>
              </#if>
            </div>
         </div>
       </#if>
      <div class="form-group">
        <div class="col-md-4 col-xs-4">
            <button class="btn btn-default btn-save" type="submit">Salveaza</button>
            <a href="/warehouses"><button class="btn btn-default" type="button" id="cancel-btn">Anuleaza</button></a>
        </div>
       </div>
  </form>
</div>
</#macro>