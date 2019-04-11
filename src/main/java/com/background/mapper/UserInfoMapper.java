package com.background.mapper;


import com.background.pojo.UserInfo;
import com.background.vo.UserInfoVo;

import java.util.List;


public interface UserInfoMapper {

    UserInfo loginCheck(UserInfo userInfo);

    int addUserInfo(UserInfo userInfo);

    UserInfo getUserInfoById(Integer id);

    List<UserInfo> getUserInfo();

    List<UserInfo>  getUserInfosBy(UserInfo userInfo);
    int  updateUser(UserInfo userInfo);
    int  addUser(UserInfo userInfo);
    int deleteUser(UserInfo userInfo);
    int batchDelete(int[] userIds);
    int getCount();
    List<UserInfo> getSplitPage(UserInfoVo userInfoVo);
}
