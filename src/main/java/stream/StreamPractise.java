package main.java.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractise {
    public static void main(String[] args) {

        ArrayList <Integer> number = new ArrayList<Integer>();
        number.add(2);
        number.add(9);
        number.add(3);
        number.add(8);
        number.add(5);

        number.forEach(value -> System.err.println(value));

        System.err.println("==========");

        for(int i=0; i<number.size(); i++){
            System.err.print(number.get(i)+" ");
        }

        System.err.println("\n"+"==========");

        Iterator <Integer> iterator = number.iterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            System.err.println("Using iterator : "+integer);
        }
        System.err.println("\n"+"Sort using Stream");
        List<Integer> sortList = number.stream().sorted(((o1, o2) -> o2.compareTo(o1))).collect(Collectors.toList());
        System.err.println(sortList);

        List <String> names = new LinkedList<String>();
        names.add("Batish");
        names.add("Matish");
        names.add("Satish");
        names.add("Ratish");
        names.add("Latish");
        names.add("Fathis");

        List <String> sortNames = names.stream().sorted(((o1, o2) -> o1.compareTo(o2))).collect(Collectors.toList());
        System.err.println(sortNames);

        List <String> SortRev = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.err.println("Reverse the Numbers :------");

        List<Integer> nums = Arrays.asList(9,8,7,5,4,3,2,1,0);

//        ListIterator<Integer> iterator1 = nums.listIterator().

        for (int i = nums.size()-1; i >= 0 ; i--){
                System.err.println(nums.get(i));
        }


    }
}
