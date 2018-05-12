package dario.java.std;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
                list.add(3);
		list.add(new Integer(2));
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(6);
                list.add(6);

                
		for (Integer integer : list) {
			System.out.println(integer);
		}
                
                for (int i = 0; i < list.size(); i++) {
                    Integer integer = list.get(i);
                    System.out.println(integer);
                }
                
                System.out.println(list.contains(10));
                
                list.forEach(t -> System.out.println(t));
                
                System.out.println(list.indexOf(8));
                
                ///list.remove(list.remove(6));

                //list.removeAll(Arrays.asList(6,6,6,5));
    
                
                list.forEach(t -> System.out.println(t));
                
                list.sort(null);

                System.out.println("Ordenados:");
                list.forEach(t -> System.out.println(t));
                
	}

}
