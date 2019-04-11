package com.background.vo;

import java.util.Arrays;

public class ChangeRoleVo {
    private int userId;
    private int[] allocatedRoleIds;
    private int[] notAllocatedRoleIds;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int[] getAllocatedRoleIds() {
        return allocatedRoleIds;
    }

    public void setAllocatedRoleIds(int[] allocatedRoleIds) {
        this.allocatedRoleIds = allocatedRoleIds;
    }

    public int[] getNotAllocatedRoleIds() {
        return notAllocatedRoleIds;
    }

    public void setNotAllocatedRoleIds(int[] notAllocatedRoleIds) {
        this.notAllocatedRoleIds = notAllocatedRoleIds;
    }

    @Override
    public String toString() {
        return "ChangeRoleVo{" +
                "userId=" + userId +
                ", allocatedRoleIds=" + Arrays.toString(allocatedRoleIds) +
                ", notAllocatedRoleIds=" + Arrays.toString(notAllocatedRoleIds) +
                '}';
    }
}
