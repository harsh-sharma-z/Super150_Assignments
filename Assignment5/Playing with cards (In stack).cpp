//Harsh Sharma's Code 
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
#define MAX 1299709         


bool sieve[MAX];

vector<int> primes;

void createSieve(){
    for(long i=0;i<MAX;i++){
        sieve[i] = true;
    }
    sieve[0] = sieve[1] = false;
    for(long i=2;i<MAX;i++){
        if(sieve[i]){
            primes.push_back(i);
            for(long j=i*i;j<MAX;j+=i){
                sieve[j] = false;
            }
        }
    }
}


int main() {
    primes.push_back(1);     
	
    createSieve();

    int n,q;

    cin >> n >> q;

    int size = q+1;

    stack<int> a[size];
    stack<int> b[size];
    while(n--){
        int x;
        cin >> x;
        a[0].push(x);
    }


    int i=1;


    while(q--)
	{
        while(!a[i-1].empty()){
            int topElement = a[i-1].top();
            a[i-1].pop();
            if(topElement % primes[i] == 0){
                b[i].push(topElement);
            }
            else {
                a[i].push(topElement);
            }
        }
        i++;
    }



    for(int i=0;i<size;i++)
	{

        while(!b[i].empty())
		{

            cout << b[i].top() << endl;
            b[i].pop();
        }
    }


    for(int i=0;i<size;i++)
	{
        while(!a[i].empty())
		{
            cout << a[i].top() << endl;
            a[i].pop();
        }
    }


    return 0;    
}
