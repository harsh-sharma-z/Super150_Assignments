#include<iostream>
using namespace std;
void generate(char *inp, char *out,int i,int j){
	if(inp[i]=='\0'){
		out[j]='\0';
		cout<<out<<endl;
		return ;
	}
	//single digit
	int dig = inp[i]-'0';
	if(dig==0){
		generate(inp,out,i+1,j);
	}
	else{
	char ch = dig + 'A' - 1;
	out[j] = ch;
	// cout<<ch<<" hi"<<endl;
	generate(inp,out,i+1,j+1);
	}
	if(inp[i+1]!='\0'){
		int second = inp[i+1]-'0';
		int num = 10*dig+second;
		if(num<=26){
		char ch1 = num+'A'-1;
		out[j]=ch1;
		generate(inp,out,i+2,j+1);
		}
	}
	return ;
}
int main() {
	char a[1000000];
	cin>>a;
	char out[1000000];
	generate(a,out,0,0);
	return 0;
}
