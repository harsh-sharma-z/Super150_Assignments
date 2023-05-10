
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        List<String> ans=new ArrayList<>();
        ans=(all_longest_common_subsequences(a,b));
        System.out.println(ans.get(0));

    }

    public static List<String> all_longest_common_subsequences(String s, String t)
    {
        int m=s.length();
        int n=t.length();
        HashSet<String> set=new HashSet<>();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        StringBuilder str=new StringBuilder();
        int lcsLength=dp[m][n];
        List<String> res=new ArrayList<>();
        printSeq(s,t,0,0,str,set,lcsLength);
        res.addAll(set);
        Collections.sort(res);
        return res;
    }
    public static void printSeq(String s,String t,int m,int n, StringBuilder str,HashSet<String> set,int lcsLen){
        if(lcsLen==0){
            set.add(str.toString());
            return ;
        }
        if(m>=s.length()||n>=t.length()){
            return ;
        }
        for(int i=m;i<s.length();i++){
            for(int j=n;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    str.append(s.charAt(i));
                    printSeq(s,t,i+1,j+1,str,set,lcsLen-1);
                    str.deleteCharAt(str.length()-1);
                }
            }
        }
    }
}


