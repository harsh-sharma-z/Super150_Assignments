
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            
            LinkedList<Integer> list1 = new LinkedList<>();
            
            for (int i = 0; i < n; i++) {
                list1.add(sc.nextInt());
            }
            
            
            int m = sc.nextInt();
            LinkedList<Integer> list2 = new LinkedList<>();
            for (int i = 0; i < m; i++) {
                list2.add(sc.nextInt());
            }
            helper(list1, list2);
        }
    }
    private static void helper(LinkedList<Integer> list1, LinkedList<Integer> list2){
        LinkedList<Integer> ans = new LinkedList<>();
        int i = 0;
        int j = 0;
        while (i<list1.size() && j<list2.size()){
            if(list1.get(i) < list2.get(j)){
                ans.add(list1.get(i));
                i++;
            }
            else{
                ans.add(list2.get(j));
                j++;
            }
        }
        while (i<list1.size()){
            ans.add(list1.get(i));
            i++;
        }
        while (j<list2.size()){
            ans.add(list2.get(j));
            j++;
        }
        
        
        for (int h:ans) {
            System.out.print(h+" ");
        }
        System.out.println();
    }
}
