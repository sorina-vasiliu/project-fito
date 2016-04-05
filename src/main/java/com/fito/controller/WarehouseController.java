package com.fito.controller;

import com.fito.model.entities.Locality;
import com.fito.model.entities.Warehouse;
import com.fito.security.Role;
import com.fito.service.LocalityService;
import com.fito.service.WarehouseService;
import com.fito.util.SessionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


/**
 * Created by Dragos on 3/27/2016.
 */
@Controller
public class WarehouseController {
    private static final Logger LOG = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private WarehouseService workhouseService;
    @Autowired
    private LocalityService localityService;

    @RequestMapping(value = "/warehouses", method = RequestMethod.GET)
    public String getAllWorkhouses(ModelMap modelMap) {
        SessionUtils.populateModelWithAuthenticatedRole(modelMap);
        List<Warehouse> warehouses =  workhouseService.getAllWorkhouses();
        modelMap.addAttribute("warehouses", warehouses);
        return "warehouse-page";
    }

    @RequestMapping(value = "/createWarehouse", method = RequestMethod.GET)
    public String loadCreateWarehousePage(ModelMap modelMap) {
        SessionUtils.populateModelWithAuthenticatedRole(modelMap);

        List<Locality> locations = localityService.getAllLocations();
        modelMap.put("locations", locations);
        return "create-warehouse-page";
    }

    @RequestMapping(value = "/createWarehouse", method = RequestMethod.POST)
    public String createWarehouse(@ModelAttribute("warehouse") Warehouse warehouse){
        warehouse.setRole(Role.WAREHOUSE);
        workhouseService.createWarehouse(warehouse);

        return "redirect:/warehouses";
    }
}
