package com.akimkin.top.HomeWork_Stream_API;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;

public class Task1 {
    static Task1 className =new Task1();
    Random random=new Random();
    public static void main(String[] args) {

className.counterOfPredicate(2);

    }

    public void counterOfEvenNumbers(){
        long count = Arrays.stream(className.getRangomArray()).
                filter(s->s%2==0).count();
        System.out.println(count);

    }


    public  int[] getRangomArray(){
        int[] array=new int[10];
      for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(10);
        }
return array;
    }
    public void counterOfOddNumbers(){
        long count = Arrays.stream(className.getRangomArray()).
                filter(s->s%2!=0).count();
        System.out.println(count);

    }
    public void counterOfZero(){
        long count = Arrays.stream(className.getRangomArray()).
                filter(s->s==0).count();
        System.out.println(count);

    }
    public void counterOfPredicate(int predicate){

        long count = Arrays.stream(className.getRangomArray()).
                filter(s->s== predicate).count();
        System.out.println(count);

    }


}
