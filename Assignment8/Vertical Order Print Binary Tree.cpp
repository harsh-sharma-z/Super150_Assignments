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

class TreeNode {
public:
    int data;
    TreeNode *left;
    TreeNode *right;
    TreeNode (int d){
        data = d;
        left = NULL;
        right = NULL;
    }
};




void vertOrder(TreeNode* root, int hd, map<int, vector<int>> &m) 
{ 
    if (root == NULL) 
        return; 
      m[hd].push_back(root->data); 
      vertOrder(root->left, hd-1, m); 
      vertOrder(root->right, hd+1, m); 
} 
void printTree(TreeNode* root) 
{      
    map < int,vector<int> > m; 
    int hd = 0; 
    vertOrder(root, hd,m); 
    map< int,vector<int> > :: iterator it; 
    for (it=m.begin(); it!=m.end(); it++) 
        for (int i=0; i<it->second.size(); ++i) 
            cout << it->second[i] << " ";  
    
} 

TreeNode* build(){
    int d;
    cin>>d;

    TreeNode*root = new TreeNode(d);
    queue<TreeNode*> q;
    q.push(root);

    while(!q.empty()){

        TreeNode*f = q.front();
        q.pop();
        int c1,c2;
        cin>>c1>>c2;

        if(c1!=-1){
            f->left = new TreeNode(c1);
            q.push(f->left);
        }
        if(c2!=-1){
            f->right = new TreeNode(c2);
            q.push(f->right);
        }
    }
    return root;
}


int main (){
    int n;
    cin >>n;
    
    TreeNode *root =build ();

    printTree(root); 
    
    return 0;
}
