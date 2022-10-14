// You will be given a number N. You have to code a hollow diamond looking pattern.

// The output for N=5 is given in the following image.

// Screen Shot 2016-06-09 at 2.47.18 pm.png

// Input Format
// The input has only one single integer N.

// Constraints
// Output Format
// Output the given pattern.

// Sample Input
// Sample Output
// Explanation
// Write a code to print above given pattern. No space between any two characters.



#include<iostream>
using namespace std;
int main() {
  int n;cin>>n;
  n = 2*n-1;
  string s[n];
  for(int i=0;i<n/2+1;i++){
    string s1 = "";
    for(int j=0;j<n;j++){
      if(i==0 || j<n/2+1-i){
        cout<<"*";
        s1 += "*";
      }
      else if(j>=n/2+1-i && j<n/2+i){
        cout<<" ";
        s1 += " ";
      }
      else{
        cout<<"*";
        s1 += "*";
      }
    }
    s[i] = s1;
    cout<<"\n";
  }
  for(int i=n/2-1;i>=0;i--){
    cout<<s[i]<<"\n";
  }
}
