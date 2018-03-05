package com.caicai.mapstruct.domain;

/**
 * @author zhengchubin
 * @create 2018-03-01 下午4:51
 **/
public class Owner {

    private String ownerName;


    public Owner(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
