import java.util.*;
public class Main {
    static HashSet<Integer> uwu1;
    static HashSet<Integer> uwu2;
    static int onichann;
    public static void main(String args[]) {

        onichann=0;

        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        uwu1=new HashSet<>();
        uwu2=new HashSet<>();

        chessboard(num);

        board(num,0,0,"");

        System.out.println("\n"+onichann);
    }
    public static void board(int num,int i,int j,String shabd)
    {

        if(i<0||j<0||i>=num||j>=num)
            return;

        if(i==num-1&&j==num-1)
        {
            onichann++;
            System.out.print(shabd+'{'+i+'-'+j+"} ");
            return;
        }

        if(uwu1.contains(num*i+j+1))
            return;

        if(uwu2.contains(num*i+j+1))
        {
            board(num,num-1,num-1,  shabd+'{'+i+'-' + j+ "}P");
        }
        
        board(num,i+2,j+1, shabd+'{'+i+'-' + j+ "}K" );
        
        board(num,i+1,j+2, shabd+'{'+i+'-' + j+ "}K" );
        
        if(i==0||j==0||i==num-1||j==num-1)
        {
            for(int z=1;z<num;z++)
                board(num,i,j+z, shabd+'{'+i+'-' + j+ "}R" );
            
            for(int z=1;z<num;z++)
                board(num,i+z,j, shabd+'{'+i+'-' + j+ "}R" );
        }
        
        if(i==j||i+j==num-1)
            for(int z=0;z<num;z++)
                board(num,i+z+1,j+1+z,shabd+ '{'+i+'-' + j+ "}B" );
    }
    public static void chessboard(int num)
    {
        
        boolean array1[]=new boolean[num*num+1];
        
        for(int i=2;i<array1.length;i++)
            if(!array1[i])
                for(int j=i*i;j<array1.length;j+=i)
                    array1[j]=true;
        
        boolean sachhai=true;
        
        for(int i=2;i<array1.length;i++){
            if(!array1[i]&&sachhai)
                uwu1.add(i);
            else if(!array1[i])
                uwu2.add(i);
            if(!array1[i])
                sachhai=!sachhai;
        }
    }
}
