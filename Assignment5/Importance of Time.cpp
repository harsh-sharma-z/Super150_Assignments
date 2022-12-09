#include<bits/stdc++.h>
using namespace std;
int main() {
	int n;
	cin>>n;
	queue<int> ideal,call;
	for(int i=0;i<n;i++)
	{
		int temp;
		cin>>temp;
		call.push(temp);
	}
	for(int i=0;i<n;i++)
	{
		int temp;
		cin>>temp;
		ideal.push(temp);
	}
	int sum=0;
	for(int i=0;i<n;i++){
		while(ideal.front()!=call.front()){
			call.push(call.front());
			call.pop();
			sum++;
		}
		ideal.pop();
		call.pop();
		sum++;
	}
	cout<<sum<<endl;
	return 0;
}
