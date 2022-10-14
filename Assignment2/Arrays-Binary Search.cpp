// Take as input N, the size of array. Take N more inputs and store that in an array. Take as input a number M. Write a function which returns the index on which M is found in the array, in case M is not found -1 is returned. Print the value returned.You can assume that the array is sorted, but you’ve to optimize the finding process. For an array of size 1024, you can make 10 comparisons at maximum.

// 1.It reads a number N.
// 2.Take Another N numbers as input in Ascending Order and store them in an Array.
// 3.Take Another number M as input and find that number in Array.
// 4.If the number M is found, index of M is returned else -1 is returned.Print the number returned.

// Input Format
// Constraints
// N cannot be Negative. Range of Numbers N and M can be between -1000000000 to 1000000000

// Output Format
// Sample Input
// 5
// 3
// 5
// 6
// 9
// 78
// 6
// Sample Output
// 2
// Explanation
// Array = {3, 5, 6, 9, 78}, target number = 6 . Index of number 6 in the given array = 2. Write Binary search to find the number in given array as discuss in the class.



#include<iostream>
#include<algorithm>
using namespace std;
int main() 
{
	long long int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	// sort(a,a+n);
	long long int start=0,end=n-1;
	long long int search;
	cin>>search;
	while(start<=end)
	{
		long long int mid=(start+end)/2;
		if(a[mid]==search)
		{
			cout<<mid;
			break;	
		}
		else if(a[mid]>search)
		{
			end=mid-1;
		}
		else if(a[mid]<search)
		{
			start=mid+1;
		}
	}
	if(start>end)
	{
		cout<<"-1";
	}
	return 0;
}
