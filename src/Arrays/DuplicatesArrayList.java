package Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesArrayList {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(2,3,4,4,5,5,6,7,8,8,9);
      //  List<Integer> al = List.of(2,3,4,4,5,5,6,7,8,8,9);  //JDK 9
       // Set<Integer> hs = new HashSet<>(al);
       // System.out.println("hs = " + hs);

       // System.out.println(al.stream().distinct().collect(Collectors.toList()));

       /*ArrayList<Integer> newList = new ArrayList<>();
       for ( int list :al){
           if(!newList.contains(list)){
               newList.add(list);
           }
       }
        System.out.println(newList);*/

       // System.out.println(al.stream().collect(Collectors.toSet()));
       // al.stream().distinct().forEach(System.out::println);

    }

}
