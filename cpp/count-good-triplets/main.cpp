#include <iostream>
#include <vector>


//0 <= i < j < k < arr.length
//|arr[i] - arr[j]| <= a
//|arr[j] - arr[k]| <= b
//|arr[i] - arr[k]| <= c
//

class Solution {
public:
    int countGoodTriplets(std::vector<int> &arr, int a, int b, int c) {
        const int arr_size = arr.size();
        int count = 0;
        for (int i = 0; i < arr_size; ++i) {
            for (int j = i + 1; j < arr_size; ++j) {
                for (int k = j + 1; k < arr_size; ++k) {
                    if (abs(arr[i] - arr[j]) <= a && abs(arr[j] - arr[k]) <= b && abs(arr[i] - arr[k]) <= c) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
};

int main() {

    std::vector<int> arr{1,1,2,2,3};
    int a = 0, b = 0, c = 1;
    std::cout << Solution().countGoodTriplets(arr, a, b, c) << std::endl;
    return 0;
}
