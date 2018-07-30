package com.xj.ptgd.common.result;

import javax.xml.bind.annotation.XmlRootElement;

 /**
  * Result http请求返回的最外层对象
  * @author wkm
  * @since 2018/7/30
  */
@XmlRootElement(name="ResultXML")
public class Result<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体的内容. */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}