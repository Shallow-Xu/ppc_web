package shallow.xu.ppc.page;

import org.springframework.data.domain.PageRequest;

/**
 * Created by liang.zhou on 2017/7/13.
 */
public class PageParams {
    private Integer pageNum;

    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public PageRequest getPageRequest() {
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize <= 0) {
            pageSize = PageConstant.DEFAUTL_PAGE_SIZE;
        }
        return new PageRequest(pageNum - 1, pageSize);
    }
}
