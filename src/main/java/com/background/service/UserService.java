package com.background.service;


import com.background.dto.UserInfoDto;
import com.background.pojo.UserInfo;
import com.background.vo.UserInfoVo;

import java.util.List;

/**
 * Created by DELL on 2019/3/27.
 */
public interface UserService {

    boolean loginCheck(UserInfo userInfo);

    boolean addUserInfo(UserInfo userInfo);

    List<UserInfo> getUserInfo();
    List<UserInfo> getUserInfos(UserInfo userInfo);
    UserInfo getUserById(Integer userId);
    boolean updateUser(UserInfo userInfo);
    boolean addUser(UserInfo userInfo) ;
    boolean deleteUser(UserInfo userInfo);
    boolean batchDelete(int[] userIds);
    UserInfoDto getUserInfoDto(UserInfoVo userInfoVo);
}
