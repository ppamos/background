package com.background.controller;


import com.background.dto.RoleInfoDto;
import com.background.pojo.UserInfo;
import com.background.service.RoleService;
import com.background.vo.ChangeRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.StandardConstants;
import java.util.Arrays;
import java.util.List;

@RestController
public class RoleController {


    @Autowired
    RoleService roleService;

       @RequestMapping(value = "getRoleInfo",method = RequestMethod.POST)
    public List<RoleInfoDto> getRoleInfo(@RequestBody(required = false) UserInfo userInfo){
        List<RoleInfoDto> roleInfoDtos = roleService.getRoleInfo(userInfo);
        return roleInfoDtos;

    }
    @RequestMapping(value = "updateRoleMessage",method = RequestMethod.POST)
    public void updateRoleMessage(@RequestBody(required = false) ChangeRoleVo changeRoleVo){
        System.out.println(changeRoleVo);
        roleService.changeRoleMessage(changeRoleVo);
    }
    @RequestMapping(value = "getAllRole",method = RequestMethod.POST)
    public Object getAllRole( ){
         return roleService.getAllRole();
    }
}
