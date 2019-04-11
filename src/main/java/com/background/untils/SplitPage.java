package com.background.untils;

public class SplitPage {
   private int currentPage;//当前页
   private int totalPage;//总页数
   private int totalCount;//总行数
   private int pageSize=3;//每页显示数据数量
   private int start;//显示的数据开始值

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        if (totalCount==0){
            return 0;
        }
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        setTotalPage(totalCount/pageSize==0?totalCount/pageSize:totalCount/pageSize+1);
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStart() {
        return (currentPage-1)*pageSize;
    }

    public void setStart(int start) {
        this.start = start;
    }
}
