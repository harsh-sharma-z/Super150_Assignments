// Take N (number of rows - only odd numbers allowed), print the following pattern (for N = 5).

//       *
//    *  *  *  
// *  *  *  *  *  
//    *  *  *
//       *
// Input Format
// Constraints
// 0 < N < 10 (only odd numbers allowed)

// Output Format
// Sample Input
// 5
// Sample Output
//       *
//     * * *
//   * * * * *
//     * * *
//       *
// Explanation
// Each '*' is separated from other by a tab.



#include<bits/stdc++.h>

using namespace std;

int main() {

  int n;cin>>n;
  int h = 1;
  int l = (n+1)/2-1;
  vector<string>v;
  for(int i =0;i<(n+1)/2;++i)
  {
	  string s="";
	  for(int j = 0;j<l;++j)
	  cout<<"\t",s+="\t";

	  for(int j = 0;j<h;++j)
	  cout<<"*\t",s+="*\t";

	  v.push_back(s);
	  l-=1;
	  cout<<"\n";
	  h+=2;
	
  }

	for(int i = v.size()-2;~i;--i)
	cout<<v[i]<<"\n";
  return 0;
}
