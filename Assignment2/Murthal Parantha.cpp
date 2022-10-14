// The coding blocks members went to the success party of their first ever online boot-camp at Murthal. They ordered P number of paranthas. The stall has L cooks and each cook has a rank R. A cook with a rank R can cook 1 parantha in the first R minutes 1 more parantha in the next 2R minutes, 1 more parantha in 3R minutes and so on(he can only cook a complete parantha) ( For example if a cook is ranked 2.. he will cook one parantha in 2 minutes one more parantha in the next 4 mins and one more in the next 6 minutes hence in total 12 minutes he cooks 3 paranthas. In 13 minutes also he can cook only 3 paranthas as he does not have enough time for the 4th parantha). Calculate the minimum time needed to cook all the paranthas.

// Input Format
// First line contains P, the number of pratha ordered. In the next line the first integer denotes the number of cooks L and L integers follow in the Next line each denoting the rank of a cook.

// Constraints
// P <= 1000
// L <= 50
// 1 <= R <= 8

// Output Format
// Print an integer which tells the number of minutes needed to get the order done.

// Sample Input
// 10
// 4 
// 1 2 3 4
// Sample Output
// 12
// Explanation
// First cook with rank 1 cooks 4 paranthas in 10 minutes (1+2+3+4).
// Second cook with rank 2 cooks 3 paranthas in 12 minutes (2+4+6)
// Third cook with rank 3 cooks 2 paranthas in 9 minutes (3+6) Fourth cook with rank 4 only needs to cook one last remaining parantha. He can do that in 4 minutes.
// Since these cooks cook parallely, the total time taken will be the maximum of the four i.e. 12 minutes.






#include<bits/stdc++.h>
#include<unordered_set>
using namespace std;
 #define fio ios_base::sync_with_stdio(false)
 
#define ll long long int

#define s(x) scanf("%lld",&x)
#define s2(x,y) s(x)+s(y)
#define s3(x,y,z) s(x)+s(y)+s(z)
 
#define p(x) printf("%lld\n",x)
#define p2(x,y) p(x)+p(y)
#define p3(x,y,z) p(x)+p(y)+p(z)
#define F(i,a,b) for(ll i = (ll)(a); i <= (ll)(b); i++)
#define RF(i,a,b) for(ll i = (ll)(a); i >= (ll)(b); i--)
 
#define ff first
#define ss second
#define mp(x,y) make_pair(x,y)
#define pll pair<ll,ll>
#define pb push_back

ll inf = 1e18;
ll mod = 1e9 + 7 ;
ll gcd(ll a , ll b){return b==0?a:gcd(b,a%b);}


bool isPossible(vector<ll> &rnk, ll minTime,ll paranthas){
  ll n=rnk.size();
  for(ll i=0;i<n;i++){
    ll tm=0;
    ll ct=1;
    while(tm+ct*rnk[i]<=minTime and paranthas>0){
      tm+=ct*rnk[i];
      paranthas--;
      ct++;
    }
    if(paranthas==0)return true;
  }
  return (paranthas==0);
}

int main()
{
  ll t=1;
  // s(t);
  while(t--){

    ll par;
    s(par);
    ll n;
    s(n);
    vector<ll> ran(n);
    F(i,0,n-1)cin>>ran[i];
 ll lo=0;
    ll hi=1e18;
    ll ans=1e18;

    while(lo<=hi){
      ll mid=lo+hi;
      mid>>=1;
      if(isPossible(ran,mid,par)){
        ans=min(ans,mid);
        hi=mid-1;
      }else {
        lo=mid+1;
      }
    }
    p(ans);
  }
}
