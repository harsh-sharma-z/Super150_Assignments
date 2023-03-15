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

bool comapareFun(string a, string b)
{
    if(a.size()<=b.size()&&b.substr(0,a.size())==a)return false;
    else if(b.size()<=a.size()&&a.substr(0,b.size())==b)return true;
    else return a<b;
}
int main()
{    vector<string>nums;
    string s;
    int n,i;
    cin>>n;
    for(i=0;i<n;i++)
    {
        cin>>s;
        nums.push_back(s);
    }
        sort(nums.begin(),nums.end(),comapareFun);
        for(auto x:nums)
    cout<<x<<endl;
    return 0;
}
