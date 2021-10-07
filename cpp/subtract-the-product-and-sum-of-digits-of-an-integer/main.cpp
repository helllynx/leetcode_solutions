#include <iostream>

class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum = 0, product = 1, current_number = 0;

        while (n > 0) {
            current_number = n % 10;
            sum += current_number;
            product *= current_number;
            n /= 10;
        }

        return product - sum;
    }
};

int main() {
    std::cout << Solution().subtractProductAndSum(234) << std::endl;
    return 0;
}
