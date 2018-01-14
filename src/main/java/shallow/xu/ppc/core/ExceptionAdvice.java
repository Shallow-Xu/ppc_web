package shallow.xu.ppc.core;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 * @author shallow
 * @date 2017/11/12
 */
@ControllerAdvice
public class ExceptionAdvice {

    /**
     * 统一异常处理
     *
     * @param request
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public Result handException(HttpServletRequest request, Exception e) throws Exception {
        Result result = new Result();
        if (e instanceof ServiceException) {
            //业务失败的异常，如“账号或密码错误”
            result.setCode(ResultCode.FAIL).setMessage(e.getMessage());
        } else if (e instanceof NoHandlerFoundException) {
            result.setCode(ResultCode.NOT_FOUND).setMessage("接口 [" + request.getRequestURI() + "] 不存在");
        } else if (e instanceof ServletException) {
            result.setCode(ResultCode.FAIL).setMessage(e.getMessage());
        } else {
            result.setCode(ResultCode.INTERNAL_SERVER_ERROR).setMessage("接口 [" + request.getRequestURI() + "] 内部错误，请联系管理员");
        }
        return result;
    }
}