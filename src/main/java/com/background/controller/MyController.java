package com.background.controller;

import com.background.dto.UserInfoDto;
import com.background.pojo.UserInfo;
import com.background.service.UserService;
import com.background.vo.UserInfoVo;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class MyController {

    @Autowired
   UserService userService;

    @ResponseBody
    @RequestMapping(value = "loginCheck",method = RequestMethod.POST)
    public String loginCheck(@RequestBody UserInfo userInfo){
        Boolean flag=false;
        System.out.println("username="+userInfo.getUsername()+",password="+userInfo.getPassword());
        flag = userService.loginCheck(userInfo);
        return flag.toString();
    }
    @ResponseBody
    @RequestMapping(value = "getUserInfos",method = RequestMethod.POST)
    public Object getUserInfos(@RequestBody(required = false) UserInfo userInfo){
        List<UserInfo> userInfos = userService.getUserInfos(userInfo);
        return userInfos;
    }
    @ResponseBody
    @RequestMapping(value = "getUserById",method = RequestMethod.POST)
    public Object getUserById(@RequestBody(required = false) UserInfo userInfo){
        UserInfo newUserInfo = userService.getUserById(userInfo.getUserId());
        return newUserInfo;
    }

    @ResponseBody
    @RequestMapping(value = "updateUser",method = RequestMethod.POST)
    public Object updateUser(@RequestBody(required = false) UserInfo userInfo){
        boolean b = userService.updateUser(userInfo);
        return b;
    }
    @ResponseBody
    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public Object addUser(@RequestBody(required = false) UserInfo userInfo){
        System.out.println(userInfo);
        boolean b = userService.addUser(userInfo);
        return b;
    }
    @ResponseBody
    @RequestMapping(value = "deleteUser",method = RequestMethod.POST)
    public Object deleteUser(@RequestBody(required = false) UserInfo userInfo){
        boolean b = userService.deleteUser(userInfo);
        return b;
    }
    @ResponseBody
    @RequestMapping(value = "batchDelete",method = RequestMethod.POST)
    public boolean batchDelete(@RequestParam int[] userIds){
//        boolean b = userService.batchDelete(userIds);
//        return b;
        System.out.println(Arrays.toString(userIds));
        return true;
    }
    @ResponseBody
    @RequestMapping(value = "getUserDto",method = RequestMethod.POST)
    public UserInfoDto getUserDto(@RequestBody(required = false) UserInfoVo userInfoVo){
        UserInfoDto userInfoDto = userService.getUserInfoDto(userInfoVo);
        return userInfoDto;
        //System.out.println(id);
    }
}
