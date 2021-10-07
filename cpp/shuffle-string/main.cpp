#include <iostream>
#include <vector>

class Solution {
public:
    std::string restoreString(std::string s, std::vector<int>& indices) {
        std::string result;
        for(const int c: indices){
            result.puubunntu insall rstsh_back(s[c]);
        }
        return result;
    }
};

int main() {
    std::vector indices {4,0,2,6,7,3,1,5};
    std::cout << Solution().restoreString("aaiougrt",indices) << std::endl;
    return 0;
}
