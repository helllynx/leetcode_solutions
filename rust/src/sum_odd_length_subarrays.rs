// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/

pub fn sum_odd_length_subarrays(arr: Vec<i32>) -> i32 {
    let mut sum: i32 = 0;
    sum+=arr.iter().fold(0i32, |sum, i| sum + (*i as i32));;

    return sum;
}


#[cfg(test)]
mod tests {
    use crate::sum_odd_length_subarrays::sum_odd_length_subarrays;

    #[test]
    fn it_works() {
        assert_eq!(sum_odd_length_subarrays(vec![1,4,2,5,3]), 15);
        assert_eq!(sum_odd_length_subarrays(vec![1, 2]), 3);
        assert_eq!(sum_odd_length_subarrays(vec![10, 11, 12]), 66);
    }
}