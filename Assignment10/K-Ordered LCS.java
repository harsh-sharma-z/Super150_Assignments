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

int uwu[2001][2001][6];
int korderlcs(int a[],int i,int b[],int j,int k){
    if(i==-1 or j==-1)
        return 0;
    if(uwu[i][j][k] != -1){
        return uwu[i][j][k];
    }
    if(a[i] == b[j]){
        return 1+korderlcs(a,i-1,b,j-1,k);
    }
    int onichan1=korderlcs(a,i-1,b,j,k);
    int onichan2=korderlcs(a,i,b,j-1,k);
    int onichan3 = -1;
    if(k>0){
        onichan3=1+korderlcs(a,i-1,b,j-1,k-1);
    }
    return uwu[i][j][k]=max(onichan1,max(onichan2,onichan3));
}
int main(){
    int n,m,k;
    memset(uwu,-1,sizeof uwu);
    cin>>n>>m>>k;
    int a[n],b[m];
    for(int i=0;i<n;++i){
        cin>>a[i];
    }
    for(int i=0;i<m;++i){
        cin>>b[i];
    }
    cout<<korderlcs(a,n-1,b,m-1,k);
}
