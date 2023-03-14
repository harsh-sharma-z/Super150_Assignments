import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int n=sc.nextInt();
            String name[]=new String[n];
            int marks[]= new int[n];

            for(int i=0;i<n;i++)
            {
                name[i]=sc.next();
                marks[i]=sc.nextInt();
            }


            int temp;
            String temps;

            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-i-1;j++)
                {
                    if(marks[j]==marks[j+1])
                    {
                        if(name[j].compareTo(name[j+1])>0)
                        {
                            temp=marks[j];
                            marks[j]=marks[j+1];
                            marks[j+1]=temp;

                            temps=name[j];
                            name[j]=name[j+1];
                            name[j+1]=temps;
                        }
                    }
                    if(marks[j]<marks[j+1])
                    {
                        temp=marks[j];
                        marks[j]=marks[j+1];
                        marks[j+1]=temp;

                        temps=name[j];
                        name[j]=name[j+1];
                        name[j+1]=temps;
                    }

                }
            }

            for(int i=0;i<n;i++)
            {
                if(marks[i]<x)
                {
                    break;
                }
                else
                {
                    System.out.println(name[i]+" "+marks[i]);
                }
            }
    }
}
