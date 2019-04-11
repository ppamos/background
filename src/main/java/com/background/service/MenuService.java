package com.background.service;

import com.background.dto.MenuInfoDto;
import com.background.pojo.RoleInfo;

import java.util.List;

public interface MenuService {
    List<MenuInfoDto> getMenuInfos(RoleInfo roleInfo);
}
