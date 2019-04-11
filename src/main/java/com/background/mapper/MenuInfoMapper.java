package com.background.mapper;

import com.background.dto.MenuInfoDto;

import java.util.List;

public interface MenuInfoMapper {
    List<MenuInfoDto> getMenuInfos(int roleId);
}
