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
// TreeBottomView.cpp

int main() {
int t;
cin>>t;
while(t--)
{
    int n;
     cin>>n;
     priority_queue<int> lheap;
     priority_queue<int,vector<int>, greater<int>> rheap;
          int d;
     cin>>d;
     lheap.push(d);
     int median=d;
     cout<<median<<" ";
    
     for(int i=1;i<n;i++)
     { 
          cin>>d;// take input here
     if(lheap.size()>rheap.size())
     {
         if(d<median)
         {
             rheap.push(lheap.top());
             lheap.pop();
             lheap.push(d);
             
         }
         else{
             rheap.push(d);
         }
         median=(lheap.top()+rheap.top())/2;
     }
     else if(lheap.size()==rheap.size())// comapre size not the top
     {
         if(d<median)
         {  lheap.push(d);
           median=lheap.top();
         }
         else{
             rheap.push(d);
             median=rheap.top();
         }
     }
     else{
         if(d>median)
         {
             lheap.push(rheap.top());
             rheap.pop();
             rheap.push(d);
         }
         else{
             lheap.push(d);
         }
         median=(lheap.top()+rheap.top())/2;
     }

     cout<<median<<" ";

     }
     cout<<endl;
}
    return 0;
}
