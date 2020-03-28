#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    string longestCommonPrefix(vector<string> &strs) {
        if (strs.empty())
            return "";

        string prefix;

        for (int i = 0; i <= strs[0].length(); ++i) {
            prefix = strs[0].substr(0, i);

            // here must be starts_with but leetcode supports only c++17
            bool ans = all_of(strs.begin(), strs.end(),
                              [&prefix](const string &s) { return s.rfind(prefix, 0) == 0; });
            if (!ans)
                return prefix.substr(0, i - 1);
        }

        return prefix;
    }
};

int main() {
    vector<string> v = {"d"};
    Solution solution = Solution();
    cout << solution.longestCommonPrefix(v);

    return 0;
}
