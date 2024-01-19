// Top K Frequent Elements
import java.util.HashMap;
class Frequentlyelements {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
      // assign values into a hashmap
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());// sorting values in descending order

        ArrayList<Integer> list2 = new ArrayList<>(list.subList(0, k));

        int[] ans = new int[list2.size()];
        int j = 0;
        for (var entry : map.entrySet()) {
            if (list2.contains(entry.getValue())) {
                ans[j++] = entry.getKey();
            }
        }

        return ans;
    }
  public static void main(String [] args){
     int nums = {1,1,1,2,2,3}, k = 2;
     System.out.println(topKFrequent(nums,k));
  }
}
