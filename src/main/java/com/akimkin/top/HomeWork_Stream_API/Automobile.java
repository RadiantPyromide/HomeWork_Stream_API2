package com.akimkin.top.HomeWork_Stream_API;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public  class  Automobile {
    public int yearOfManufacture;

    public String getCarName() {
        return carName;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "yearOfManufacture=" + yearOfManufacture +
                ", volumeOfEngin=" + volumeOfEngin +
                ", price=" + price +
                ", carName='" + carName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVolumeOfEngin() {
        return volumeOfEngin;
    }

    public void setVolumeOfEngin(int volumeOfEngin) {
        this.volumeOfEngin = volumeOfEngin;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int volumeOfEngin;
    public int price;
    public String carName;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String color;

    public   ArrayList<Automobile> automobiles=new ArrayList<>();



    public Automobile(int yearOfManufacture, int volumeOfEngin, int price, String carName,String color) {
        this.yearOfManufacture = yearOfManufacture;
        this.volumeOfEngin = volumeOfEngin;
        this.price = price;
        this.carName = carName;
    }

    public ArrayList<Automobile> getAutomobiles() {
        return automobiles;
    }

    public void setAutomobiles(ArrayList<Automobile> automobiles) {
        this.automobiles = automobiles;
    }

    /**
     * Метод выводит в консоль все автомобили
     * @param automobiles-Принимает Список автомобилей для вывода.
     */
    public static void showAutomobile(ArrayList<Automobile>automobiles){
       automobiles.stream().forEach(System.out::println);



}

    /**
     * Метод выводит в консоль отсортированный список по цвету.
     * @param automobiles -Принимает Список автомобилей для вывода.
     * @param color-Принимает цвет по которому будет происходить сортировка.
     */
    public  static void sortedByColor(ArrayList<Automobile>automobiles, String color) {
      automobiles.stream().filter(s->s.getColor().equals(color)).forEach(System.out::println);



}

    /**
     * Выводит в консоль все автомобили с указанным объемом двигателя.
     * @param automobiles-Принимает Список автомобилей для вывода.
     * @param volumeOfEngin-Объем двигателя по которому будет происходить сортировка.
     */
    public static void sortedByVolumeEngin(ArrayList<Automobile>automobiles, int volumeOfEngin){

automobiles.stream().filter(automobile -> automobile.getVolumeOfEngin()==volumeOfEngin).forEach(System.out::println);



}

    /**
     * Выводит в консоль все автомобили дороже указанной цены
     * @param automobiles-Принимает Список автомобилей для вывода.
     * @param price-Цена по которой будет происходить сортировка.
     */
    public static void sortedByPrice(ArrayList<Automobile> automobiles,int price){

        automobiles.stream().filter(s->s.getPrice()>price).forEach(System.out::println);

}

    /**
     * Выводит в консоль все автомобили в ценовом диапазоне.
     * @param automobiles-Принимает Список автомобилей для вывода.
     * @param from-От заданного года.
     * @param to-До заданного года.
     */
    public static void sortedByYearRange(ArrayList<Automobile>automobiles,int from,int to){
automobiles.stream().filter(s->s.getYearOfManufacture()>from).
        filter(s->s.getYearOfManufacture()<to).forEach(System.out::println);



}




}
