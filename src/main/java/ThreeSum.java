import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 * <p>
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        if (nums.length <= 0) return output;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int targe = -nums[i];
            int j = i + 1;//left pointer
            int k = nums.length - 1;//right pointer
            while (j < k) {
                if (nums[j] + nums[k] == targe) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    output.add(list);
                    j++;
                    k--;
                    //because j++,so nums[j-1] is the first num,k is too;
                    while (j < nums.length && nums[j] == nums[j - 1]) j++;
                    while (k > j && nums[k] == nums[k + 1]) k--;
                } else if (nums[j] + nums[k] > targe) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return output;
    }
}
