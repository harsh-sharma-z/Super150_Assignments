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

string alphabet = "#ABCDEFGHIJKLMNOPQRSTUVWXYZ";



void createMappedString(int n, char ans[],int i, int j){
    if(n/i == 0){
        return;
    }
    int a,b;
    a = n % i;
    b= n / i ;
    if( a>26 || b>26){
        createMappedString(n, ans,i*10,j);
    }
    else{
        ans[j]=alphabet[b];
        ans[j+1]=alphabet[a];
        ans[j+2]='\0';
        cout<<ans<<endl;
        createMappedString(n,ans,i*10,0);
    }

}



int  main()
{
    int  n;
    cin>>n;
    char ans[50];
    int copy=n;
    int idx=0;
    while(copy){
        ans[idx]=alphabet[copy%10];
        idx++;
        copy = copy /10;
    }
    for(int i= idx-1;i>=0;i--){
        cout<<ans[i];
        ans[i]='\0';
    }
    cout<<endl;
    createMappedString(n,ans,1,0);
    return 0;
}

