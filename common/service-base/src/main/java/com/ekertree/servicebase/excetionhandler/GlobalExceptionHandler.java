package com.ekertree.servicebase.excetionhandler;

import com.ekertree.commonutils.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * ClassName: GlobalExcetionHandler
 * Description:
 * date: 2022/6/20 15:10
 *
 * @author Ekertree
 * @since JDK 1.8
 */
@ControllerAdvice
public class GlobalExceptionHandler {

        @ExceptionHandler(Exception.class)
        public Result error(Exception e) {
            e.printStackTrace();
            return Result.error().setMessage(e.getMessage());
        }
}