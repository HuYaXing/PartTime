package org.wlgzs.parttime.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-01-16
 */
@RestController
@RequestMapping("/accept")
@Api(value = "AcceptController", description = "用户登录登出接口")
public class AcceptController {

    @ApiOperation(value = "用户登录", notes = "用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "string"),
            @ApiImplicitParam(name = "passwd", value = "密码", required = true, dataType = "string")
    })
    @RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView login(String username, String passwd, HttpServletRequest request) {
        if (username.equals("123456")) {
            System.out.println("YES!!!!");
        }
        return new ModelAndView("admin/adminOrderInfo");
    }


}
