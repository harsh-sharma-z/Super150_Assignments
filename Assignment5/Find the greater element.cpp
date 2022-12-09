#include<iostream>
using namespace std;
int main() {
	int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
	cin>>a[i];
	for(int i=0;i<n;i++){
		bool flag = false;
		int front =i;
		int rear = (i+1)%n;
		while(front!=rear){
			if(a[front]<a[rear]){
				cout<<a[rear]<<" ";
				flag = true;
				break;
			}
			rear = (rear+1)%n;
		}
		if(!flag)
		cout<<-1<<" ";
	}
	return 0;
}
