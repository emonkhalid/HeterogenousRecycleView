package com.example.heterogenousrecycleview;

import java.util.ArrayList;

public class Mobile {


    private String mobileModel;
    private String mobileName;
    private String mobileBrand;
    private int mobileReleaseYear;
    private int mobileImage;

    public Mobile( String mobileModel, String mobileName, String mobileBrand, int mobileImage,  int mobileReleaseYear) {
        this.mobileModel = mobileModel;
        this.mobileName = mobileName;
        this.mobileBrand = mobileBrand;
        this.mobileImage = mobileImage;
        this.mobileReleaseYear = mobileReleaseYear;
    }


    public int getMobileImage() {
        return mobileImage;
    }

    public void setMobileImage(int mobileImage) {
        this.mobileImage = mobileImage;
    }

    public String getMobileModel() {
        return mobileModel;
    }

    public void setMobileModel(String mobileModel) {
        this.mobileModel = mobileModel;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public String getMobileBrand() {
        return mobileBrand;
    }

    public void setMobileBrand(String mobileBrand) {
        this.mobileBrand = mobileBrand;
    }



    public int getMobileReleaseYear() {
        return mobileReleaseYear;
    }

    public void setMobileReleaseYear(int mobileReleaseYear) {
        this.mobileReleaseYear = mobileReleaseYear;
    }

    public ArrayList<Mobile>getAllMobile(){
        ArrayList<Mobile>mobileArrayList = new ArrayList<>();
        mobileArrayList.add(new Mobile("Pixel 3", "Google Pixel 3", "Google", R.drawable.mobile, 2018));
        mobileArrayList.add(new Mobile("iPhone 8", "iPhone 8x", "Apple", R.drawable.mobile, 2018));
        mobileArrayList.add(new Mobile("Pixel-3", "Google Pixel", "Google", R.drawable.mobile, 2018));
        mobileArrayList.add(new Mobile("Note-8", "Note 8", "Samsung", R.drawable.mobile, 2018));
        mobileArrayList.add(new Mobile("Pixel-3", "Google Pixel", "Google", R.drawable.mobile, 2018));
        mobileArrayList.add(new Mobile("Mi 10", "Xiaomi Mi 10", "Xiaomi ", R.drawable.mobile, 2018));
        mobileArrayList.add(new Mobile("Pixel-3", "Google Pixel", "Google", R.drawable.mobile, 2018));

        return mobileArrayList;
    }


}
