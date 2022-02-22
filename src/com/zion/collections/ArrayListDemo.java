package com.zion.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//Iterationg ArrayList using for , for each and streams
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C#");
        arrayList.add("Ruby");
        arrayList.add("JavaScript");
        arrayList.add("GoLang");

//        for(int i=0;i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));           // Normal for loop
//        }
//        for(String al:arrayList){
//            System.out.println(al);                        // advanced for loop
//        }

//        Iterator iterator = arrayList.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());          // using Iterator object
//        }

//        ListIterator iterator = arrayList.listIterator();    // using ListIterator object
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

       // arrayList.stream().forEach(System.out::println);           // using streams


      //  arrayList.forEach(n->System.out.println(n));              // using forEach method in java8


          arrayList.forEach(System.out::println);


    }
}
