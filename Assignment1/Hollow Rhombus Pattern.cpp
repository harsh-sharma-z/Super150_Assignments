// Given number of rows N, you have to print a Hollow Rhombus. See the output for corresponding given input.

// Input Format
// Single integer N.

// Constraints
// N <= 20

// Output Format
// Print pattern.

// Sample Input
// 5
// Sample Output
//     *****
//    *   *
//   *   *
//  *   *
// *****
// Explanation
// For any input N. First line contains 4 space and then 5 {*} and then the second line contains according to the output format.




#include<bits/stdc++.h>
using namespace std;
int main() {
	int a;
	cin>>a;
	for(int i=0;i<a;i++){
		for(int j=a-1;j>i;j--)
			cout<<" ";
		if(i==0 || i==(a-1))
			for(int k=0;k<a;k++)
				cout<<"*";
		else{
			cout<<"*";
			for(int k=0;k<a-2;k++)
				cout<<" ";
			cout<<"*";
		}
		cout<<endl;
	}
	return 0;
}
