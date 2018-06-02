package com.example.niraj.musicalstructure;

public class Songs{
    private String mFirstItem;
    private String mSecondItem;

    public Songs(String firstItem, String secondItem) {
        this.mFirstItem = firstItem;
        this.mSecondItem = secondItem;
    }

    public String getFirstItem() {
        return mFirstItem;
    }

    public String getSecondItem() {
        return mSecondItem;
    }
}
