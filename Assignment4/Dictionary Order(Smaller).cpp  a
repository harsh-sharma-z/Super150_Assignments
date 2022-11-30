#include<bits/stdc++.h>
using namespace std;
vector<string>ans;
void permutate(string s,int i,string target){
	if(i == s.size()){
		if( s < target){
ans.push_back(s);
		}
		return;
	}
	for(int j=i;j<s.size();j++){
		swap(s[i],s[j]);
		permutate(s,i+1,target);
		swap(s[j],s[i]);
	}
}
int main() {
	string s;
	cin>>s;
	permutate(s,0,s);
	sort(ans.begin(),ans.end());
	for(int i=0;i<ans.size();i++){
		cout<<ans[i]<<endl;
	}
	return 0;
}
