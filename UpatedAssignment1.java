import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class UpatedAssignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.println("Enter Size ");
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        HashMap<String,ArrayList<String>> m = new HashMap<>();

        ArrayList<ArrayList<String>> ans = new ArrayList<>(n);

        // Entering array elements
        System.out.println("Enter array Elemts of string type");
        for(int i=0;i<n;i++)
        {
            arr.add(sc.next());
        }

        //Traversing in array and stoing element in HashMap
        for(int i=0;i<n;i++)
        {
            String s = arr.get(i);

            // Sorting the string
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);

            // Adding and Updating in the Map elements
            m.computeIfAbsent(temp, k -> new ArrayList<>()).add(s);
            
        }


        // Adding in 2D array for final output
        for (String key : m.keySet()) {
            ans.add(m.get(key));
        }

        System.out.println(ans);

        sc.close();
    }
}
