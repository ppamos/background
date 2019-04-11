package com.background.controller;


import com.background.dto.MenuInfoDto;
import com.background.pojo.RoleInfo;
import com.background.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {
    @Autowired
    MenuService menuService;
    @RequestMapping(value = "getMenuInfo",method = RequestMethod.POST)
    public Object getMenuInfo(@RequestBody RoleInfo roleInfo){
        List<MenuInfoDto> menuInfos = menuService.getMenuInfos(roleInfo);
        return menuInfos;
    }
}
