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

class node
{
public:
    int val;
    node *left, *right;
    node(int d)
    {
        val = d;
        right = NULL;
        left = NULL;
    }
};


int ReplaceSum(node *root, int &badaSum)
{
    if (root == NULL)
        return 0;

    int rans = ReplaceSum(root->right, badaSum);

    int puranaRoot = root->val;
    root->val = badaSum; 
    badaSum += puranaRoot; 

    int lans = ReplaceSum(root->left, badaSum); 
    return lans + rans + puranaRoot;
}

void display(node *root)
{
    if (root == NULL)
    {
        return;
    }
    if (root->left)
    {
        cout << root->left->val << " => ";
    }
    else
    {
        cout << "END => ";
    }
    cout << root->val << " <= ";
    if (root->right)
    {
        cout << root->right->val << endl;
    }
    else
    {
        cout << "END" << endl;
    }

    display(root->left);

    display(root->right);
}
node*ins(node*root,int d){ 
    if(root==NULL){
        return new node(d);
    }
    if(d <= root->val){
        root->left = ins(root->left,d);
    }
    else{
        root->right = ins(root->right,d);
    }
    return root;
}
node*builtBST(int n){
    node*root = NULL;
    for( int i = 0; i<n; i++){
        int x;
        cin>>x;
        root = ins(root,x);
    }
    return root;
}
int main()
{
    int n;
    cin >> n;
    node *root =  builtBST(n);
    int ls = 0;
    ReplaceSum(root, ls);
    display(root);
    return 0;
}
