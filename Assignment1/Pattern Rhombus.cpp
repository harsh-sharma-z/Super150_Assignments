// Take N (number of rows), print the following pattern (for N = 3).

//                          1
//                        2 3 2
//                      3 4 5 4 3
//                        2 3 2
//                          1
// Input Format
// Constraints
// 0 < N < 10

// Output Format
// Sample Input
// 3
// Sample Output
//                 1
// 	2	3	2
// 3	4	5	4	3
// 	2	3	2
// 		1
// Explanation
// Each number is separated from other by a tab.




#include<bits/stdc++.h>
using namespace std;
int main() {
	int a;
	cin>>a;
		int b,c;
		vector<string> v;
		for(int i=1;i<=a;i++){
			string s="";
			for(int k=i;k<a;k++)
				cout<<"\t",s+="\t";
			b=i;
			for(int j=1;j<=i*2-1;j++){
				cout<<b<<"\t",s+=to_string(b)+"\t";
				if(j>=i)
					b--;
				else
					b++;
			}
			cout<<endl;
			v.push_back(s);
		}
		for(int i=v.size()-2;i>=0;i--)
			cout<<v[i]<<endl;
	return 0;
}
