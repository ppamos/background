package com.background.service.impl;

import com.background.dto.MenuInfoDto;
import com.background.mapper.MenuInfoMapper;
import com.background.pojo.RoleInfo;
import com.background.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuInfoMapper menuInfoMapper;

    public List<MenuInfoDto> getMenuInfos(RoleInfo roleInfo) {
        return menuInfoMapper.getMenuInfos(roleInfo.getRoleId());
    }
}
