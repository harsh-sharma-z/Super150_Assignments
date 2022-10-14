// Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value returned.

// Input Format
// String

// Constraints
// A string of length between 1 to 1000

// Output Format
// String

// Sample Input
// aabccba
// Sample Output
// abcba
// Explanation
// For the given example, "aabccba", Consecutive Occurrence of a is 2, b is 1, and c is 2.

// After removing all of the consecutive occurences, the Final ans will be : - "abcba".





#include<bits/stdc++.h>
using namespace std;
void duplicateString(char*str, int i, int j, int n) {

	if(i==n) {
		return;
	}
    cout << str[i];
	while(i+1 < n and str[i] == str[i+1]) {
        
		i++;
	}
	duplicateString(str,i+1, j , n);
}
int main() {
	char str[1001];
	cin >> str;
	int n = strlen(str);
    duplicateString(str,0, 0 ,n);
	return 0;
}
