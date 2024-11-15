package com.akimkin.top.HomeWork_Stream_API;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class TV  {
    public ArrayList<TV> tvArrayList = new ArrayList<>();
    public String nameOfModel;
    public int diagonal;
    public int YearOfManufacture;
    public int price;
    public String manufacturer;

    public TV(String nameOfModel, int diagonal, int YearOfManufacture, int price, String manufacturer) {
        this.nameOfModel = nameOfModel;
        this.diagonal = diagonal;
        this.YearOfManufacture = YearOfManufacture;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public ArrayList<TV> getTvArrayList() {
        return tvArrayList;
    }

    public void setTvArrayList(ArrayList<TV> tvArrayList) {
        this.tvArrayList = tvArrayList;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }

    public void setNameOfModel(String nameOfModel) {
        this.nameOfModel = nameOfModel;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getYearOfManufacture() {
        return YearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.YearOfManufacture = yearOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "TV{" +
                "nameOfModel='" + nameOfModel + '\'' +
                ", diagonal=" + diagonal +
                ", YearOfManufacture=" + YearOfManufacture +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public static void showAllTV(ArrayList<TV> arrayList) {

        arrayList.stream().forEach(System.out::println);


    }

    public static void showTvWithCertainDiagonal(ArrayList<TV> arrayList, int diagonal) {
        arrayList.stream().filter(s -> s.getDiagonal() == diagonal).forEach(System.out::println);


    }

    public static void showTvByManufacturer(ArrayList<TV> arrayList, String manufacturer) {

        arrayList.stream().filter(s -> s.getManufacturer().equals(manufacturer)).forEach(System.out::println);


    }

    public static void showTvByYearOfManufacture(ArrayList<TV> arrayList, int yearOfManufacture) {

        arrayList.stream().filter(
                s -> s.getYearOfManufacture() == yearOfManufacture).forEach(System.out::println);


    }

    public static void showAbovePrice(ArrayList<TV> arrayList, int price) {

        arrayList.stream().filter(s -> s.getPrice() > price).forEach(System.out::println);

    }

    public static void sortedByPrice(ArrayList<TV> arrayList) {

        arrayList.stream().sorted(new Comparator<TV>() {
            @Override
            public int compare(TV o1, TV o2) {
                return o1.price-o2.price;
            }
        }).forEach(System.out::println);

    }
    public static void sortedByPriceReversed(ArrayList<TV> arrayList) {

        arrayList.stream().sorted(new Comparator<TV>() {
            @Override
            public int compare(TV o1, TV o2) {
                return o1.price-o2.price;
            }
        }.reversed()).forEach(System.out::println);

    }
    public  static void sortedByDiagonal(ArrayList<TV>arrayList){
        arrayList.stream().sorted(new Comparator<TV>() {
            @Override
            public int compare(TV o1, TV o2) {
                return o1.getDiagonal()-o2.getDiagonal();
            }
        }).forEach(System.out::println);




    }
    public  static void sortedByDiagonalReversed(ArrayList<TV>arrayList){
        arrayList.stream().sorted(new Comparator<TV>() {
            @Override
            public int compare(TV o1, TV o2) {
                return o1.getDiagonal()-o2.getDiagonal();
            }
        }.reversed()).forEach(System.out::println);




    }



}