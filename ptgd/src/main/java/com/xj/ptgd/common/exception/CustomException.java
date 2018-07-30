package com.xj.ptgd.common.exception;

import com.xj.ptgd.common.result.ResultEnum;

 /**
  * CustomException
  * @author wkm
  * @since 2018/7/30
  */
public class CustomException extends RuntimeException{
    private Integer code;

    public CustomException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
