import java.util.ArrayList;

class arraylist{

public static void main(String[] args){
    ArrayList<String> list1 = new ArrayList<String>(); //Arraylist works with 
    ArrayList<Integer> list2 = new ArrayList<Integer>(); //Always Use rapper class (Interger than int)
//Adding elements
    list1.add("Apple");
list1.add("Amazon");
list1.add("Google");
list1.add("Facebook");
list1.add("Netflix");
//Printing Elements
System.out.println(list1);

list2.add(1);
list2.add(2);
list2.add(3);
list2.add(4);
list2.add(5);
System.out.println(list2);
}
}