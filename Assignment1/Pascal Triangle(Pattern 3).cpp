// Take N (number of rows), print the following pattern (for N = 6)
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
// 1 5 10 10 5 1

// Input Format
// Constraints
// 0 < N < 100

// Output Format
// Sample Input
// 6
// Sample Output
// 1  
// 1	1  
// 1	2	1  
// 1	3	3	1  
// 1	4	6	4	1  
// 1	5	10	10	5	1
// Explanation
// Each number is separated from other by a tab.



#include<bits/stdc++.h>

using namespace std;
void recurse(vector<int>v,int i)
{
	if(i==0)
	return;

	for(auto c:v)
	cout<<c<<"\t";
	cout<<"\n";
	vector<int>p;
	p.push_back(1);
	for(int j=0;j<v.size()-1;++j)
		p.push_back(v[j]+v[j+1]);
	p.push_back(1);

	recurse(p,i-1);

}
int main() {

	int n;cin>>n;
	vector<int>v;
	v.push_back(1);
	recurse(v,n);	

	return 0;
}
