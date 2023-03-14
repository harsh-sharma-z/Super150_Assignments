//Harsh Sharma's Code 
#include <iostream>
#include<bits/stdc++.h>
using namespace std;
#define f(i,a,b) for(long long i=a;i<b;i++)
#define rf(i,a,b) for(long long i=a;i>=b;i--)
#define ll long long
#define pb push_back
#define vll vector<long long>
#define vc vector
#define fi first
#define se second
#define pqmin priority_queue<ll,vector<ll>,greater<ll>>
#define all(x) x.begin(),x.end()
#define IOS ios_base::sync_with_stdio(0)
#define tie cin.tie(NULL),cout.tie(NULL) 

//This is a test file to create a cpp program
//It can hold minor peices of code to run for the instance.

int main(){
    long long int n,k;
    cin>>n>>k;
    priority_queue<long long int> pq;
    for(int i=0; i<n; i++){
        long long int itr,x,y;
        cin>>itr;
        if(itr==1){
            cin>>x>>y;
            long long int distance = (x*x)+(y*y);
            if(pq.size()<k){
                pq.push(distance);
            }
            else if(distance<pq.top()){
                pq.pop();
                pq.push(distance);
            }
        }
        else if(itr==2){
            cout<<pq.top()<<endl;
        }
    }
}
