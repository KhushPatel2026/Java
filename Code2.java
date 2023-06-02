public class Code2 {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int j : nums) {
            if (j != 0) {
                nums[i] = j;
                i++;
            }
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

    public static void main(String[] args) {
        int nums[] = "1,2,3,4,5,0,2,4,0";
        moveZeroes
    }
}