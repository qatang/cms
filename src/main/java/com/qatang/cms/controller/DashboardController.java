package com.qatang.cms.controller;

import com.qatang.cms.constants.CommonConstants;
import com.qatang.cms.entity.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by qatang on 14-6-5.
 */
@Controller
//@SessionAttributes(CommonConstants.USER_SESSION_KEY)
public class DashboardController extends BaseController {
    @RequestMapping("/dashboard")
    public String dashboard(@ModelAttribute(CommonConstants.USER_SESSION_KEY) User user, ModelMap modelMap) {

        modelMap.addAttribute(user);
        return "/user/dashboard";
    }
}
