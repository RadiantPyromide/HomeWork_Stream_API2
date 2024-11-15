package com.akimkin.top.HomeWork_Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2=new Task2();
        task2.getCityName();


    }
   public  void getCityName(){

  findByLitter();

       }
       public ArrayList<String> getArray(){
           ArrayList<String> arrayList=new ArrayList<>();
           String city1 = "Новосибирск";
           String city2 = "Томск";
           String city3 = "Москва";
           String city4 = "Тогучин";
           String city5 = "Кемерово";
           String city6 = "Москва";
           arrayList.add(city1);
           arrayList.add(city2);
           arrayList.add(city3);
           arrayList.add(city4);
           arrayList.add(city5);
           arrayList.add(city6);


        return arrayList;
       }
       public void showifLenghtMore6(){
        getArray().stream().filter(e->e.length()>6).forEach(System.out::println);


       }
       public void hitCounter(){
           Scanner scanner=new Scanner(System.in);
           System.out.println("Введите название города");
           String cityName=scanner.nextLine();
           scanner.close();
            long count=getArray().stream().filter(s -> s.equals(cityName)).count();
           System.out.println(count);



       }
       public void findByLitter(){
        Scanner scanner=new Scanner(System.in);
           System.out.println("Введите букву для поиска города");
String str=scanner.nextLine();
        getArray().stream().filter(e->e.indexOf(str)==0).forEach(System.out::println);




       }


}

