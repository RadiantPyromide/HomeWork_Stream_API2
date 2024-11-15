package com.akimkin.top.HomeWork_Stream_API;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<TV> tvArrayList=new ArrayList<>();
TV tv1=new TV("Super LED",16,2021,600,"Sony");
TV tv2=new TV("Ultra HD ",18,2021,700,"Panasonic");
TV tv3=new TV("Full HD 2K",16,2022,750,"LD");
TV tv4=new TV("Full HD 4K",20,2023,800,"Xiaomi");
TV tv5=new TV("Realistic piсture 8K",21,2024,850,"Sony");

tvArrayList.add(tv1);
tvArrayList.add(tv2);
tvArrayList.add(tv3);
tvArrayList.add(tv4);
tvArrayList.add(tv5);
TV.sortedByDiagonalReversed(tvArrayList);

    }
}
