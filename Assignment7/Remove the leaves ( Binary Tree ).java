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



class Node {
public:
    int val;
    Node *left, *right;
    Node(int d) {
        val = d;
        left = nullptr;
        right = nullptr;
    }
};

void CreateKaro(Node* &nodee) {
    string left, right;
    int d;
    cin >> d;
    nodee = new Node(d);
    cin >> left;
    if (left == "true") CreateKaro(nodee->left);
    cin >> right;
    if (right == "true") CreateKaro(nodee->right);
}

Node* Skip(Node*nodee) {
    if (nodee == nullptr) return nodee;

    if (!nodee->left && !nodee->right) {
        delete nodee;
        return nullptr;
    }

    nodee->left = Skip(nodee->left);
    nodee->right = Skip(nodee->right);
    return nodee;
}


void RemoveKaro(Node*nodee) {
    if (nodee == nullptr) return;
    if (nodee->left) cout << nodee->left->val << " => ";
    else cout << "END => ";
    cout << nodee->val;
    if (nodee->right) cout << " <= " << nodee->right->val;
    else cout << " <= END";
    cout << endl;
    RemoveKaro(nodee->left);
    RemoveKaro(nodee->right);
}

int main() {
    Node* nodee = nullptr;
    CreateKaro(nodee);
    Skip(nodee);
    RemoveKaro(nodee);
    return 0;
}
