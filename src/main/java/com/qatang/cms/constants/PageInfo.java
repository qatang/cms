package com.qatang.cms.constants;

/**
 * Created by zhangzq on 14-7-8.
 */
public class PageInfo {

    private Integer currentPage = 1;
    private Integer totalPages;
    private Integer pageSize = 5;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
