package com.xj.amarspi.common.exception;


import com.xj.amarspi.common.result.ResultEnum;

/**
 * DataNullException
 * @author wkm
 * @since 2018/7/30
 */
public class DataNullException extends CustomException{
   public DataNullException(ResultEnum resultEnum) {
       super(resultEnum);
   }
}
