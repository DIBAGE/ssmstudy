package com.linchao.controller;

import com.linchao.dto.UserPageDTO;
import com.linchao.po.UserPO;
import com.linchao.service.UserServiceImp;
import com.linchao.vo.PageUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.json.JsonObject;
import java.util.List;

/**
 * @author : linchao
 * @date : 2017/7/23.
 * @description :
 */
@Controller
@ResponseBody
public class HomeController {

    @Autowired
    UserServiceImp userService;

    @RequestMapping(value = "/a", method = RequestMethod.GET)
    public String index() {
//        return new ModelAndView("index", "command", new PageUserVo());
        return "index";
    }

    @RequestMapping(value = "/map")
    @ResponseBody
    public UserPageDTO home(@ModelAttribute("pageUserVo") PageUserVo pageUserVo, BindingResult result, Model model) {
//        model.addAttribute("userId", pageUserVo.getCurrentPage());
        List<UserPO> userList = userService.getUser();
        UserPageDTO userPageDTO = new UserPageDTO();
        userPageDTO.setPage(1);
        userPageDTO.setBody(userList);
        return userPageDTO;
    }

}
