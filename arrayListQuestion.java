import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class arrayListQuestion {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<String> list = new ArrayList<>();
        File file = new File("C:\\Users\\waheguru\\.vscode\\Desktop\\myWorkspace", "Check.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String temp = sc.next();
            // Store the string inside list
            list.add(temp);

        }
        sc.close();
    int n = list.size();
        System.out.println("Elements is the File are : ");
        System.out.println(list);
        System.out.println("Array List in reverse Order is : ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        System.out.println("Elements ending with s are : ");
        for (int i = 0; i < n; i++) {
            String checkWord = list.get(i);
            if (checkWord.endsWith("s")) {
                System.out.println(list.get(i));
                }
        }
        

        System.out.println("Remove all Plural words (ending in 's')");
        for (int i = 0; i < list.size(); i++) {
            String removeWord = list.get(i);
            if (removeWord.endsWith("s")) {
                list.remove(i);
                
            }
        }
        System.out.println(list);
        System.out.println(list.size());

    }
}