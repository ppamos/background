package com.background.service.impl;

import com.background.dto.UserInfoDto;
import com.background.mapper.RoleInfoMapper;
import com.background.mapper.UserInfoMapper;
import com.background.pojo.UserInfo;
import com.background.service.UserService;


import com.background.untils.SplitPage;
import com.background.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by DELL on 2019/3/27.
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserInfoMapper userInfoMapper;
  @Autowired
  private RoleInfoMapper roleInfoMapper;

    public boolean loginCheck(UserInfo userInfo) {
        UserInfo checkUserInfo = userInfoMapper.loginCheck(userInfo);
        if (checkUserInfo!=null){
            return true;
        }
        return false;
    }


    @Transactional
    public boolean addUserInfo(UserInfo userInfo) throws RuntimeException {
        int count = this.userInfoMapper.addUserInfo(userInfo);
        if(true){
            throw new NegativeArraySizeException();
        }
        int count1 = this.userInfoMapper.addUserInfo(userInfo);
        if(count>0){
            return true;
        }
        return false;
    }

    public List<UserInfo> getUserInfo() {
        System.out.println(userInfoMapper);
        return userInfoMapper.getUserInfo();
    }

  public List<UserInfo> getUserInfos(UserInfo userInfo){
        return userInfoMapper.getUserInfosBy(userInfo);
  }

    public UserInfo getUserById(Integer userId) {
        UserInfo userInfo = userInfoMapper.getUserInfoById(userId);
        return userInfo;
    }

    public boolean updateUser(UserInfo userInfo) {
        boolean flag=false;
        int i = userInfoMapper.updateUser(userInfo);
        if (i==1){
            flag=true;
        }
        return flag;
    }

    @Transactional
    public boolean addUser(UserInfo userInfo) throws RuntimeException{
        boolean flag =false;
        int i = userInfoMapper.addUser(userInfo);
        int j = roleInfoMapper.addRole(userInfo.getUserId());
        if (j>0){
            flag=true;
        }
        return flag;
    }

    public boolean deleteUser(UserInfo userInfo) {
        boolean flag =false;
        int i = userInfoMapper.deleteUser(userInfo);
        if (i==1){
            flag=true;
        }
        return flag;
    }

    public boolean batchDelete(int[] userIds) {
        int i = userInfoMapper.batchDelete(userIds);
        if (i>0){
            return true;
        }
        return false;
    }

    public UserInfoDto getUserInfoDto(UserInfoVo userInfoVo) {
        List<UserInfo> userInfoList = userInfoMapper.getSplitPage(userInfoVo);
        UserInfoDto userInfoDto = new UserInfoDto();
        SplitPage splitPage = userInfoVo.getSplitPage();
        int count = getCount();
        splitPage.setTotalCount(count);
        userInfoDto.setSplitPage(splitPage);
        userInfoDto.setUserInfoList(userInfoList);
        return userInfoDto;
    }
    public int getCount(){
        int count = userInfoMapper.getCount();
        return count;
    }
}
