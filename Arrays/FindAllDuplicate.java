import java.util.*;
// Find All Duplicates in an Array
class FindAllDuplicate {
    public List<Integer> findDuplicates(int[] nums) {
      if(nums.empty()) 
        return {};
    List<Integer> list = new ArrayList<>();
        for(int i =0; i<nums.lenght; i++){
          for(int j =i+1; j<nums.lenght; j++){
            if(nums[i]!=nums[j]){
              continue;}
            else{
              list.add(nums[i]);
              break;}
          }
          
    }
      return list;
}
  public static void main(String [] args){
    int nums[] ={4,3,2,7,8,2,3,1};
    System.out.print(findDuplicates(nums));
}
