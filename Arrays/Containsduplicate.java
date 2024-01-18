import java.util.ArrayList;

class containsDuplicate{
  // contain Duplicate
  public boolean containDup(int[] nums) {
      int n = nums.length;
      for (int i = 0; i < n - 1; i++) {
          for (int j = i + 1; j < n; j++) {
              if (nums[i] == nums[j])
                  return true;
          }
      }
      return false;
  }

public static void main(String[] args) {
  int arr[] = {1,2,3,1};
  containDup(arr);
  System.out.println();
}
}
