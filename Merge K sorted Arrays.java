import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        ArrayList<Long> uwu=new ArrayList<>();

        for (int i = 0; i <k*n ; i++) {
                long a=sc.nextLong();
                uwu.add(a);
            }

        Collections.sort(uwu);

        for(Long i:uwu)
            System.out.print(i+" ");


    }
}
