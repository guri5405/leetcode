import java.util.Arrays;

class Solution {
  // longest consecutive sequence print
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        
        if (n == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int cnt = 1;
        int maxi = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    cnt++;
                } else {
                    maxi = Math.max(maxi, cnt);
                    cnt = 1;
                }
            }
        }

        return Math.max(maxi, cnt);
    }
  public static void main(String [] args){
    int nums[] = {0,3,7,2,5,8,4,6,0,1};
    System.out.print(longestConsecutive(nums));
}
