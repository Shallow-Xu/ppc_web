package shallow.xu.ppc.api.text;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shallow.xu.ppc.core.Result;
import shallow.xu.ppc.core.ResultGenerator;
import shallow.xu.ppc.page.PageParams;

@RestController
@RequestMapping("/text")
public class TextController {

    @Autowired
    private TextService textService;

    @RequestMapping()
    @ApiOperation(value = "获取文字内容列表", notes = "")
    public Result getTextList(PageParams pageParams) {
        return ResultGenerator.genSuccessResult(textService.getTextList(pageParams.getPageRequest()));
    }
}
