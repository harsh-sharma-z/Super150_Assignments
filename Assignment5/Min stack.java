import java.util.*;

public class Main {
    public static void main (String args[]) {
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        String dazai[]=new String[n];
        int s=0;
        for(int i=0;i<n;i++){
            
            dazai[i]=sc.next();
            
            if(dazai[i].equals("push"))
                s++;
            
        }
        
        int onichann[]=new int[s];
        
        for(int i=0;i<s;i++)
            onichann[i]=sc.nextInt();
        
        int j=0;
        
        YamateKudasai ss=new YamateKudasai();
        
        for(int i=0;i<n;i++)
        {
            if(dazai[i].equals("push"))
            {

                ss.push(onichann[j++]);
            }
            
            else if(dazai[i].equals("getMin"))
            {
                System.out.print(ss.getmin()+" ");
            }
            
            else if(dazai[i].equals("top"))
            {
                System.out.print(ss.top()+" ");
            }
            
            else if(dazai[i].equals("pop")){

                ss.pop();
            }
            
            else{
                System.out.println("failure");
            }
        }


    }
}


class YamateKudasai{
    static Stack<Integer> uwu;

    static int min;
    YamateKudasai()
    {
        min=0;
        uwu=new Stack<>();
    }

    public void push(int i)
    {
        if(uwu.isEmpty())
        {
            min=i;
            uwu.push(i);
        }
        else{
            if(min<i)
            {
                uwu.push(i);
            }else{
                uwu.push(2*i-min);
                min=i;
            }
        }
    }
    
    void pop()
    {
        if(uwu.size()==0)
            return ;
        else{
            if(uwu.peek()>=min)
                uwu.pop();
            else{

                min=2*min-uwu.peek();
                uwu.pop();
            }
        }}
    
    int getmin(){
        return min;
    }
    
    int top()
    {
        if(uwu.size()==0)
            return -1;
        else{
            if(min<=uwu.peek())
                return uwu.peek();
            else{
                return min;
            }
        }
    }
}
