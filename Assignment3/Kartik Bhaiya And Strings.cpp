// Kartik Bhaiya has a string consisting of only 'a' and 'b' as the characters. Kartik Bhaiya describes perfectness of a string as the maximum length substring of equal characters. Kartik Bhaiya is given a number k which denotes the maximum number of characters he can change. Find the maximum perfectness he can generate by changing no more than k characters.

// Input Format
// The first line contains an integer denoting the value of K. The next line contains a string having only ‘a’ and ‘b’ as the characters.

// Constraints
// 2 ≤ N ≤ 10^6

// Output Format
// A single integer denoting the maximum perfectness achievable.

// Sample Input
// 2
// abba
// Sample Output
// 4
// Explanation
// We can swap the a's to b using the 2 swaps and obtain the string "bbbb". This would have all the b's and hence the answer 4.
// Alternatively, we can also swap the b's to make "aaaa". The final answer remains the same for both cases.






#include <iostream>
#include <cstring>
using namespace std;

int countMaxWindowSize(const string &s, char ch, int k)
{
    int i = 0;
    int j = 0; 


    int c = 0; 

    int ans = 0; 

    for (j; c < k && j < s.size() - 1; j++)
    {
        if (s[j] != ch)
        {
            c++;
        }
        if (c == k)
        {
            break;
        }
    }

    while (i < j)
    {

        while (j < s.size() - 1 && s[j + 1] == ch)
        {
            j++;
        }

        int currentLength = j - i + 1;
        ans = max(ans, currentLength);

        i++;

        if (j < s.size() - 1 && s[i - 1] != ch)
        {
            j++;
        }
    }

    return ans;
}

int main()
{
    int k;
    cin >> k;
    string s;
    cin >> s;

    if (k >= s.size())
    {
        cout << s.size();
        return 0;
    }

    int ansForA = countMaxWindowSize(s, 'a', k);

    int ansForB = countMaxWindowSize(s, 'b', k);

    cout << max(ansForA, ansForB);

    return 0;
}
