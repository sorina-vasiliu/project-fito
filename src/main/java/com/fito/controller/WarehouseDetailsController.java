package com.fito.controller;

import com.fito.model.entities.Locality;
import com.fito.model.entities.Warehouse;
import com.fito.service.LocalityService;
import com.fito.service.WarehouseService;
import com.fito.util.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Dragos on 4/5/2016.
 */
@Controller
public class WarehouseDetailsController {

    @Autowired
    private WarehouseService warehouseService;
    @Autowired
    private LocalityService localityService;

    @RequestMapping(value = "/warehouseDetails" ,method = RequestMethod.GET)
    public String getConsultantDetails(@RequestParam("id") int id, ModelMap modelMap) {
        SessionUtils.populateModelWithAuthenticatedRole(modelMap);
        Warehouse warehouse = warehouseService.getWarehouseById(id);
        List<Locality> locations = localityService.getAllLocations();
        modelMap.put("locations", locations);
        modelMap.addAttribute("warehouse", warehouse);

        return "warehouse-details-page";
    }
}
