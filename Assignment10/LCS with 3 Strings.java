import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String c=sc.next();
        System.out.println(LCSof3(a,b,c,a.length(),b.length(),c.length()));
    }
    private static int LCSof3(String A, String B, String C, int n1, int n2, int n3) {
        int dp[][][] = new int[n1+1][n2+2][n3+3];

        for(int i = n1; i >= 0; i--){
            for(int j = n2; j >= 0; j--){
                for(int k = n3; k >= 0; k--){
                    if(i == n1 || j == n2 || k == n3){
                        dp[i][j][k] = 0;
                    } else {
                        char a = A.charAt(i);
                        char b = B.charAt(j);
                        char c = C.charAt(k);
                        if(a==b && b == c){
                            dp[i][j][k] = 1 + dp[i+1][j+1][k+1];
                        } else {
                            dp[i][j][k] = Math.max(dp[i+1][j][k], Math.max(dp[i][j][k+1], dp[i][j+1][k]));
                        }
                    }
                }
            }
        }
        return dp[0][0][0];
    }
}


