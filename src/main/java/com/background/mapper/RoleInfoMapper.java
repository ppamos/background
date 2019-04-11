package com.background.mapper;

import com.background.dto.RoleInfoDto;
import com.background.pojo.RoleInfo;
import com.background.vo.ChangeRoleVo;

import java.util.List;

public interface RoleInfoMapper {

    List<RoleInfoDto> getRoleInfos(int userId);
    int showRole(ChangeRoleVo changeRoleVo);
    int deleteRole(ChangeRoleVo changeRoleVo);
    int addRole(int userId);
    List<RoleInfo> getAllRole();
}
