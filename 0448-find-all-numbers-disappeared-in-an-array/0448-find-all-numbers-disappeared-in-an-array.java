import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        boolean[] found = new boolean[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            found[nums[i]] = true;
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!found[i]) {
                answer.add(i);
            }
        }

        return answer;
    }
}