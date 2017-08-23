package com.linchao.controller;

import com.github.pagehelper.PageInfo;
import com.linchao.dto.CommonResponseVo;
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

import java.util.List;

/**
 * @author : linchao
 * @date : 2017/7/23.
 * @description :
 */
@Controller
@ResponseBody
public class HomeController {
    //edit

    @Autowired
    UserServiceImp userService;

    @RequestMapping(value = "/a", method = RequestMethod.GET)
    public String index() {
//        return new ModelAndView("index", "command", new PageUserVo());
        return "index";
    }

    @RequestMapping(value = "/map")
    @ResponseBody
    public CommonResponseVo home(@ModelAttribute("pageUserVo") PageUserVo pageUserVo, BindingResult result, Model model) {
//        model.addAttribute("userId", pageUserVo.getCurrentPage());
        PageInfo<UserPO> pageInfo = new PageInfo<>();
        List<UserPO> userList = userService.getUser();
        pageInfo.setList(userList);
        pageInfo.setPages(pageUserVo.getCurrentPage());
        CommonResponseVo commonResponseVo = new CommonResponseVo();
        commonResponseVo.setBody(pageInfo);
        return commonResponseVo;
    }

}
