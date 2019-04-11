package com.background.dto;

import com.background.pojo.UserInfo;
import com.background.untils.SplitPage;

import java.util.List;

public class UserInfoDto {
   private  List<UserInfo> userInfoList;
   private SplitPage splitPage;

    public List<UserInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfo> userInfoList) {
        this.userInfoList = userInfoList;
    }

    public SplitPage getSplitPage() {
        return splitPage;
    }

    public void setSplitPage(SplitPage splitPage) {
        this.splitPage = splitPage;
    }
}
