// Take N as input, Calculate it's reverse also Print the reverse.

// Input Format
// Constraints
// 0 <= N <= 1000000000

// Output Format
// Sample Input
// 123456789
// Sample Output
// 987654321
// Explanation
// You've to calculate the reverse in a number, not just print the reverse.



#include<iostream>
using namespace std;
int main() {
	long long a,b=0;
	cin>>a;
	while(a!=0){
		b=b*10+(a%10);
		a/=10;
	}
	cout<<b;
	return 0;
}
