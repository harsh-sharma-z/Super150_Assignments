// Take as input S, a string. Write a function that does basic string compression. Print the value returned. E.g. for input “aaabbccds” print out a3b2c2d1s1.

// Input Format
// A single String S

// Constraints
// 1 < = length of String < = 1000

// Output Format
// The compressed String.

// Sample Input
// aaabbccds
// Sample Output
// a3b2c2d1s1
// Explanation
// In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' is repeated twice and 'd and 's' occurred only once.




#include<bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    cin>>s;

    if(s.length()==1){
        cout<<s<<"1";
        return 0; 
    } 

    for(int i=0;i<s.length();i++){ 
        int count=1;
        for(int j=i+1;j<s.length();j++){
            if(s[i]==s[j])
            {
                count++;
            }
            else{
                break;
            }
        }
        cout<<s[i]<<count;
        i=i+count-1;
    }
    return 0;
}
