#include<iostream>
using namespace std;
string table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
void generate(char *inp,int i,int j,char *out){
	if(inp[i]=='\0'){
		out[j]='\0';
		cout<<out<<endl;
		return;
	}

	int key = inp[i] - '0';
	// if(key==0)
	// generate(inp,i+1,j,out);
	for(int k=0;table[key][k]!='\0';k++){
		out[j]=table[key][k];
		generate(inp,i+1,j+1,out);
	}
	return;
}
int main() {
	
	char inp[100],out[1000];
	cin>>inp;
	generate(inp,0,0,out);
	return 0;
}
