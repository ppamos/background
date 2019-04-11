package com.background.service;


import com.background.dto.RoleInfoDto;
import com.background.pojo.RoleInfo;
import com.background.pojo.UserInfo;
import com.background.vo.ChangeRoleVo;

import java.util.List;

public interface RoleService {
    List<RoleInfoDto> getRoleInfo(UserInfo userInfo);
     void changeRoleMessage(ChangeRoleVo changeRoleVo);
     List<RoleInfo> getAllRole();
}
