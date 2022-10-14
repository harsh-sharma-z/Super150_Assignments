// Take N (number of rows), print the following pattern (for N = 4)
// 0
// 1 1
// 2 3 5
// 8 13 21 34

// Input Format
// Constraints
// 0 < N < 100

// Output Format
// Sample Input
// 4
// Sample Output
// 0 
// 1    1 
// 2    3     5 
// 8   13    21    34
// Explanation
// Each number is separated from other by a tab. For given input n, You need to print n(n+1)/2 fibonacci numbers. Kth row contains , next k fibonacci numbers.





#include<iostream>
using namespace std;
int main() {
  int n;cin>>n;
  int a[100];
  a[0]=0;
  a[1] = 1;
  int b = 0;
  for(int i=0;i<n;i++){
    for(int j=0;j<=i;j++){
      cout<<a[b++]<<" ";
      a[b+1] = a[b]+a[b-1];
    }
    cout<<"\n";
  }
  
  return 0;
}
