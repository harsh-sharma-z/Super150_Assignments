// Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.

// Input Format
// A list of integers to be processed

// Constraints
// All numbers input are integers between -1000 and 1000.

// Output Format
// Print all the numbers before the cumulative sum become negative.

// Sample Input
// 1
// 2
// 88
// -100
// 49
// Sample Output
// 1
// 2
// 88



#include<bits/stdc++.h>
using namespace std;
int main() {
  vector<int> v;
  int sum = 0;
  while(true){
    int a;cin>>a;
    
    // cout<<sum<<endl;
    if(sum+a>=0){
      v.push_back(a);
      sum += a;
    }
    else
    break;
  }
  for(auto i : v) cout<<i<<endl;
  return 0;
}
