import java.util.*;
public class Main {


    public static boolean helper(char arraybhai[][],String str,int a,int b,int c)
    {
        if(c==str.length())
            return true;

        if(a<0||b<0||a>=arraybhai.length||b>=arraybhai[0].length||arraybhai[a][b]!=str.charAt(c))
            return false;

        char chr=arraybhai[a][b];

        arraybhai[a][b]='.';

        boolean var = helper(arraybhai,str,a+1,b,c+1);
        boolean var1 = helper(arraybhai,str,a,b-1,c+1);
        boolean var2 = helper(arraybhai,str,a-1,b,c+1);
        boolean var3 = helper(arraybhai,str,a,b+1,c+1);

        arraybhai[a][b] = chr;

        return var || var2 || var3 || var1;
    }
    
    
    
    public static void main (String []args) {
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int num=sc.nextInt();
        
        int l=sc.nextInt();
        
        char arraybhai[][]=new char[n][];
        
        for(int a=0;a<arraybhai.length;a++)
            arraybhai[a]=sc.next().toCharArray();
        
        String jawaab[]=new String[l];
        
        for(int a=0;a<jawaab.length;a++)
            jawaab[a]=sc.next();
        
        Arrays.sort(jawaab);
        
        for(int a=0;a<jawaab.length;a++){
            
            int flag=0;
            for(int p=0;p<arraybhai.length;p++){
                
                for(int b=0;b<arraybhai[p].length;b++){
                    
                    if(arraybhai[p][b]==jawaab[a].charAt(0))
                        if(helper(arraybhai,jawaab[a],p,b,0)){
                            System.out.print(jawaab[a]+" ");
                            flag=1;
                            break;
                            
                        }
                }
                
                if(flag==1)
                    break;
            }
        }
    }
    
}
