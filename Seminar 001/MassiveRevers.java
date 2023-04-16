import java.util.Arrays;

public class MassiveRevers {
    public static void main(String[] args) {
        int[] nums = new int[] { 3, 2, 2, 4, 1, 3 };
        int[] arrRes = new int[nums.length];
        int val = 3;
        int end = nums.length - 1;
        int begin = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                arrRes[end--] = nums[i];
                // end--;
            } else {
                arrRes[begin++] = nums[i];
                // begin++;
            }
        }
        System.out.println(Arrays.toString(arrRes));
    }
}
