package com.example.w160623a.registeration;

/**
 * Created by w160623a on 2017-05-22.
 */

public class Notice {

    String notice;
    String name;
    String date;

    public Notice(String notice, String name, String date) {
        this.notice = notice;
        this.name = name;
        this.date = date;
    }

    public String getNotice() {
        return notice;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
