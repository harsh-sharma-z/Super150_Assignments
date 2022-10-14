// Deepak and Gautam are having a discussion on a new type of number that they call Coding Blocks Number or CB Number. They use following criteria to define a CB Number.

// 0 and 1 are not a CB number.
// 2,3,5,7,11,13,17,19,23,29 are CB numbers.
// Any number not divisible by the numbers in point 2( Given above) are also CB numbers.
// Deepak said he loved CB numbers.Hearing it, Gautam throws a challenge to him.

// Gautam will give Deepak a string of digits. Deepak's task is to find the number of CB numbers in the string.

// CB number once detected should not be sub-string or super-string of any other CB number.
// Ex- In 4991, both 499 and 991 are CB numbers but you can choose either 499 or 991, not both.

// Further, the CB number formed can only be a sub-string of the string.
// Ex - In 481, you can not take 41 as CB number because 41 is not a sub-string of 481.

// As there can be multiple solutions, Gautam asks Deepak to find the maximum number of CB numbers that can be formed from the given string.

// Deepak has to take class of Launchpad students. Help him by solving Gautam's challenge.

// Input Format
// First line contain size of the string.

// Next line is A string of digits.

// Constraints
// 1 <= Length of strings of digits <= 17

// Output Format
// Maximum number of CB numbers that can be formed.

// Sample Input
// 5
// 81615
// Sample Output
// 2
// Explanation
// 61 and 5 are two CB numbers.







#include<bits/stdc++.h>
using namespace std;
bool isCb(long long int s)
{  if(s==0 ||s==1)
    return false;
   int cb[]={2,3,5,7,11,13,17,19,23,29};
   for(int i=0;i<10;i++)
   {
       if(s==cb[i])
       {
           return true;
       }
   }
    for(int i=0;i<10;i++)
   {
       if(s%cb[i]==0)
       {
           return false;
       }
   }
return true;
}
bool isvalid(int *visited,string str,int start,int end)
{
    for(int i=start;i<end;i++)
    {
        if(visited[i]==1)
        {
            return false;
        }
    }
    return true;
}
int main()
{
    int n;
    cin>>n;
    string s;
    cin>>s;
    int visited[s.length()];
    for(int i=0;i<s.length();i++)
    {
        visited[i]=0;
    }
    int cnt=0;
    for(int i=1;i<=s.length();i++)
    {
        for(int j=0;j+i-1<s.length();j++)
        {
                string str=s.substr(j,i);
			
                if(isCb(stoll(str)) and isvalid(visited,str,j,j+i))
                {
                    cnt++;
                    for(int k=j;k<j+i;k++)
                    {
                        visited[k]=1;
                    }
                }
    
        }
    }
    cout<<cnt;
    return 0;
}
