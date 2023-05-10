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
#define INF 100000000
#define pqmin priority_queue<ll,vector<ll>,greater<ll>>
#define all(x) x.begin(),x.end()
#define IOS ios_base::sync_with_stdio(0)
#define tie cin.tie(NULL),cout.tie(NULL) 

//This is a test file to create a cpp program
//It can hold minor peices of code to run for the instance.
// TreeBottomView.cpp


ll findMinCost(vector<int> &cost, vector<int> &weight, int n, int s)
{
    ll dp[s+1];
    dp[0]=0;
    for(int i=1;i<=s;i++){
        dp[i]=INF;
        for(int j=0;j<n;j++){
            if(weight[j]<=i){
                dp[i]=min(dp[i],dp[i-weight[j]]+cost[j]);
            }
        }
    }
    return dp[s]==INF?-1:dp[s];
}

int main()
{
    int n, s;
    cin >> n >> s;

    vector<int> cost;
    vector<int> weight;

    for (int i = 0; i < s; i++)
    {
        int currcost;
        cin >> currcost;
        if (currcost != -1)
        {
            cost.push_back(currcost);
            weight.push_back(i + 1);
        }
    }
    cout << findMinCost(cost, weight, cost.size(), s) << endl;
}
