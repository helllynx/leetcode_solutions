#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        for(vector<int>::size_type i = 0; i != nums.size(); i++) {
            int n = nums[i];
            for(vector<int>::size_type j = i; j != nums.size(); j++) {
                if (n == nums[j])
                    break;
            }
            return n;
        }
    }
};

int main() {
    vector<int> test = {2,2,1};
    Solution solution = Solution();
    cout<<solution.singleNumber(test);
    return 0;
}
