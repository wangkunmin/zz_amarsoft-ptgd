package com.xj.ptgd.xmlEntity;

import com.xj.ptgd.entity.BaseDto;
import com.xj.ptgd.entity.User;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name="UserXML")
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"userId","userName"})
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class UserXML extends BaseDto {
    @XmlAttribute
    private Integer userId;
    @XmlAttribute
    private String userName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserXML{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}