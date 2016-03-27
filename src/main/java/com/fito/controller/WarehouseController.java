package com.fito.controller;

import com.fito.model.entities.Warehouse;
import com.fito.service.WarehouseService;
import com.fito.util.SessionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * Created by Dragos on 3/27/2016.
 */
@Controller
public class WarehouseController {
    private static final Logger LOG = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private WarehouseService workhouseService;

    @RequestMapping(value = "/warehouse", method = RequestMethod.GET)
    public String getAllWorkhouses(ModelMap modelMap) {

        SessionUtils.populateModelWithAuthenticatedRole(modelMap);

        List<Warehouse> warehouses =  workhouseService.getAllWorkhouses();
        modelMap.addAttribute("warehouses", warehouses);
        return "warehouse-page";
    }
}
