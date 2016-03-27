package com.fito.controller;

import com.fito.model.entities.Agent;
import com.fito.service.AgentService;
import com.fito.util.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class AgentConstroller {
    @Autowired
    private AgentService agentService;

    @RequestMapping(value = "/agents", method = RequestMethod.GET)
    public String getAllAgents(ModelMap modelMap) {

        SessionUtils.populateModelWithAuthenticatedRole(modelMap);

        List<Agent> agents=  agentService.getAllAgents();
        modelMap.addAttribute("agents", agents);
        return "agent-page";
    }
}
