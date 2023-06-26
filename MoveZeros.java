public class MoveZeros {

    public static void moveZeros(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeros(nums);
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2] + " " + nums[3] + " " + nums[4]);
    }
}
