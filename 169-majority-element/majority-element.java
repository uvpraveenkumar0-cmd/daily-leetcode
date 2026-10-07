// class Solution {
//     public int majorityElement(int[] nums) {
// HashMap<Integer,Integer> map=new HashMap<>();
// int count=0;
// int ele=0;
// for(int i=0;i<nums.length;i++){
//     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//     if(map.get(nums[i])>(nums.length/2)){
//         ele=nums[i];

//     }
// }
// return ele;
        
// //     }
// // }
import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        // Step 2: Return the middle element
        return nums[nums.length / 2];
    }
}