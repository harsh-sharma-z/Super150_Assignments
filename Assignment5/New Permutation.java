import java.util.*;
public class Main {
     public static List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        dfs(S.toLowerCase().toCharArray(), ans, 0, S.length());
        return ans;
    }
    public static void dfs(char[] chArr, List<String> ans, int i, int len) {
        if (i < len) {
            dfs(chArr, ans, i+1, len);
            if (Character.isLetter(chArr[i])) {
                chArr[i] = Character.toUpperCase(chArr[i]);
                dfs(chArr, ans, i+1, len);
                chArr[i] = Character.toLowerCase(chArr[i]);
            }
        } else ans.add(new String(chArr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        List<String> ans=letterCasePermutation(s);

        for(String a:ans)
            System.out.print(a+" ");
    }
}
