package com.linchao.controller;

import com.linchao.po.UserPO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.registry.infomodel.User;

/**
 * @author : linchao
 * @date : 2017/7/23.
 * @description :
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/a", method = RequestMethod.GET)
    public ModelAndView index(){
        return new ModelAndView("index", "command", new UserPO());
    }

    @RequestMapping(value = "/map", method = RequestMethod.POST)
    public String home(@ModelAttribute("SpringWeb")UserPO user, ModelMap model){
        model.addAttribute("userId", user.getUserId());
        model.addAttribute("userName", user.getUserName());
        return "home";
    }

}
