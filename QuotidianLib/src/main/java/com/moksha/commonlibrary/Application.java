package com.moksha.commonlibrary;

/**
 * Created by sanjay.rajput on 11/03/18.
 */

public enum Application {
    PHOTO_OF_THE_DAY("Photo of The Day"),
    MINIATURE_CALENDER("Miniature Calender");

    public String name;

    Application(String name) {
        this.name = name;
    }
}
