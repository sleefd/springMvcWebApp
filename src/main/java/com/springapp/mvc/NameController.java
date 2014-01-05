package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by _ashao2321919 on 14-1-5.
 */
@Controller
@RequestMapping("/name")
public class NameController {
    @RequestMapping(method = RequestMethod.GET)
    public String showName(ModelMap model) {
        model.addAttribute("name", "Li Chenyang");
        return "name";
    }
}
