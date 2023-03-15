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
class Node{
    public:
    Node*left;
    Node*right;
    int data;
    int hd;

    Node(int d){
        this->data=d;
        this->left=NULL;
        this->right=NULL;

    }
};
Node*constructTree(){
    queue<Node*>q;
    int d;
    cin>>d;
    Node*root=new Node(d);
    q.push(root);
    while(!q.empty()){
        Node*t=q.front();
        q.pop();
        int a,b;
        cin>>a>>b;
        if(a!=-1){
            t->left=new Node(a);
            q.push(t->left);
        }
        if(b!=-1){
            t->right=new Node(b);
                q.push(t->right);
            
        }
        
    }
    return root;
}
void topView(Node*root){
    if(root==NULL){
        return;
    }
    queue<Node*>q;
    map<int ,int> m;
    int hd=0;
    root->hd=hd;

    q.push(root);
    while(q.size()){
        hd=root->hd;
        if(m.count(hd)==0){
            m[hd]=root->data;
        }
        if(root->left){
            root->left->hd=hd-1;
            q.push(root->left);
        }
    if(root->right)
    {
        root->right->hd=hd+1;
        q.push(root->right);
        }
        q.pop();
        root=q.front();
          
            }
            for(auto i=m.begin();i!=m.end();i++){
                cout<<i->second<<" ";
            }

    

}
int main() {
    Node*root=constructTree();
    topView(root);
    return 0;
    }
