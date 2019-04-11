package com.background.service.impl;

import com.background.dto.RoleInfoDto;
import com.background.mapper.RoleInfoMapper;
import com.background.pojo.RoleInfo;
import com.background.pojo.UserInfo;
import com.background.service.RoleService;
import com.background.vo.ChangeRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleInfoMapper roleInfoMapper;
    public List<RoleInfoDto> getRoleInfo(UserInfo userInfo){
      return roleInfoMapper.getRoleInfos(userInfo.getUserId());
    }

   @Transactional
    public void changeRoleMessage(ChangeRoleVo changeRoleVo){
        if (changeRoleVo.getAllocatedRoleIds().length!=0) {
            int i = roleInfoMapper.showRole(changeRoleVo);
        }
        if (changeRoleVo.getNotAllocatedRoleIds().length!=0) {
            int i1 = roleInfoMapper.deleteRole(changeRoleVo);
        }

   }

    public List<RoleInfo> getAllRole() {
        return roleInfoMapper.getAllRole();
    }
}
