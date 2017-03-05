package week1_assignments;
import java.util.*;
public class Week1_assignment_24_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<>(); 
        list1.add("Tom"); 
        list1.add("George"); 
        list1.add("Peter"); 
        list1.add("Jean"); 
        list1.add("Jane");
                  
     
        ArrayList<String> list2 = new ArrayList<>(); 
        list2.add("Tom");
        list2.add("George");
        list2.add("Michael");
        list2.add("Michelle");
        list2.add("Daniel");
        
        ArrayList<String> c1 = (ArrayList<String>) (list1.clone());
        c1.addAll(list2);
        System.out.println("\nNames in list1 and list2 are: ");
        System.out.println(c1);
        
        c1 = (ArrayList<String>)(list1.clone());
        c1.removeAll(list2);
        System.out.print("\nNames that are in list1, but not 2: ");
        System.out.println(c1);
        
        c1 = (ArrayList<String>)(list1.clone());
        c1.retainAll(list2);
        System.out.print("\nNames shared in list1 and list2: ");
        System.out.println(c1);

	}

}
