package com.fito.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by dragos.triteanu on 3/20/16.
 */
@Controller
public class MainController {
    private static final Logger LOG = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam(value = "loginError", required = false) boolean loginError, ModelMap modelMap) {
        if (loginError == true) {
            LOG.info("loginError=" + loginError);

            modelMap.addAttribute("loginError", loginError);
        }
        return "login-page";
    }

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String welcomePage() {
        return "redirect:/home";
    }

    @RequestMapping(value = "/denied", method = RequestMethod.GET)
    public String denied() {
        return "403-page";
    }

    @RequestMapping(value = "/denied", method = RequestMethod.POST)
    public String deniedPost() {
        return "403-page";
    }
}
