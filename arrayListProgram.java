import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

class arrayListProgram{

public static void main(String[] args)throws FileNotFoundException, IOException{
    ArrayList<String> list = new ArrayList<>();
    File file = new File("C:\\Users\\waheguru\\.vscode\\Desktop\\myWorkspace", "Check.txt");
    Scanner sc = new Scanner(file);
    while (sc.hasNext()) {
        String temp = sc.next();
        //Store the string inside list
        list.add(temp);
        
    }
    sc.close();
    System.out.println(list);
    // for (String data : list) {
    //     System.out.println(data);
        
    // }
    System.out.println("Size of the list is: "+list.size());
    list.add("info");
    System.out.println(list);
    list.add(3, "going");
    System.out.println(list);
    list.clone();
    list.remove(3);
    System.out.println(list);
    list.set(2, "element");
    System.out.println(list);
}
}
