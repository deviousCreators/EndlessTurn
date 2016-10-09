package com.mygdx.endlessturn.box2d;

import com.mygdx.endlessturn.enums.UserDataType;

public abstract class UserData {

    protected UserDataType userDataType;

    public UserData() {

    }

    public UserDataType getUserDataType() {
        return userDataType;
    }

}