// Take N (number of rows), print the following pattern (for N = 4).

//                        1           1
//                        1 2       2 1  
//                        1 2 3   3 2 1
//                        1 2 3 4 3 2 1   
// Input Format
// Constraints
// 0 < N < 10

// Output Format
// Sample Input
// 4
// Sample Output
// 1						1
// 1	2				2	1
// 1	2	3		3	2	1
// 1	2	3	4	3	2	1




#include<bits/stdc++.h>
//  		1
// 		2	3	2
// 	3	4	5	4	3
// 		2	3	2
// 			1
using namespace std;
int main() {
	int a;
	cin>>a;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if(j<=i)
				cout<<j<<" ";
				else
				cout<<"  ";
			}
			for(int j=a-1;j>=1;j--)
			{
				if(j<=i)
				cout<<j<<" ";
				else
				cout<<"  ";
			}
			cout<<endl;
		}
	return 0;
}
