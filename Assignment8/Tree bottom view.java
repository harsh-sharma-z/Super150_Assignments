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
#include<bits/stdc++.h>
using namespace std;
class TreeNode
{
public:
    int data;
    TreeNode*left,*right;
    TreeNode(int d){
        data=d;
        left=NULL;
        right=NULL;
    }
};
TreeNode* buildTree(){
        queue<TreeNode*>q;
        int d;cin>>d;
        TreeNode* root=new TreeNode(d);
        q.push(root);
        while(!q.empty()){
            TreeNode*temp=q.front();
            q.pop();
            int rc,lc;
            cin>>rc>>lc;
            if(rc!=-1){
                temp->left=new TreeNode(rc);
                q.push(temp->left);
            }
            if(lc!=-1){
                temp->right=new TreeNode(lc);
                q.push(temp->right);
            }

        }
        return root;
}
void constructTree(TreeNode*rt,map<int,pair<int,int>>&hashmap,int level,int hd){
    if(rt==NULL)return;
    if(hashmap.find(hd)==hashmap.end())
        hashmap.insert({hd,{rt->data,level}});
    else{
        pair<int ,int >p=hashmap[hd];
        if(level>=p.second){
            hashmap[hd]={rt->data,level};
        }
        
    }
    constructTree(rt->left,hashmap,level+1,hd-1);
    constructTree(rt->right,hashmap,level+1,hd+1);
}
void TreeBottomView(TreeNode*rt){
    map<int,pair<int,int>>hashmap;
    constructTree(rt,hashmap,0,0);
    for(auto it:hashmap){
        cout<<it.second.first<<" ";
    }
    cout<<endl;

}
int main(){
    TreeNode*root=NULL;
    root=buildTree();
    TreeBottomView(root);
    return 0;
}
