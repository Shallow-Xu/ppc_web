package shallow.xu.ppc.api.text;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import shallow.xu.ppc.database.entity.Article;
import shallow.xu.ppc.page.PageParams;

@RestController
@RequestMapping("/text")
public class TextController {

    @Autowired
    private TextService textService;


    @RequestMapping(name = "/", method = RequestMethod.GET)
    @ApiOperation(value = "获取文字内容列表", notes = "")
    public Page<Article> getTextList(PageParams pageParams) {
        return textService.getTextList(pageParams.getPageRequest());
    }

    @RequestMapping(name = "page/{pageNum}", method = RequestMethod.GET)
    @ApiOperation(value = "获取指定分页的文字内容列表", notes = "")
    public Page<Article> getPageTextList(PageParams pageParams) {
        return textService.getTextList(pageParams.getPageRequest());
    }
}
