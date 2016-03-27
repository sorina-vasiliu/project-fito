package com.fito.controller;

import com.fito.model.entities.Client;
import com.fito.service.ClientService;
import com.fito.util.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public String getAllClients(ModelMap modelMap) {

        SessionUtils.populateModelWithAuthenticatedRole(modelMap);

        List<Client> clients=  clientService.getAllClients();
        modelMap.addAttribute("clients", clients);
        return "client-page";
    }
}
