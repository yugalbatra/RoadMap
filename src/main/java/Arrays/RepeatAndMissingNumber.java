package Arrays;

public class RepeatAndMissingNumber {

    public static void main(String[] args) {
        var abc = new RepeatAndMissingNumber();
        int[] ab = abc.findErrorNums(new int[]{3, 1, 2, 5, 3});
        System.out.println(ab[0]);
        System.out.println(ab[1]);
    }

    public int[] repeatedNumber(final int[] arr) {
        int n = arr.length;
        long sum1ToN = (n * ((long) n + 1)) / 2;
        long sum1ToN2 = (n * ((long) n + 1) * ((long) n * 2 + 1)) / 6;
        long sum = 0;
        long sumOfSquares = 0;
        for (int i : arr) {
            sum += i;
            sumOfSquares += (long) i * i;
        }
        long aMinusB = sum - sum1ToN;
        long a2MinusB2 = sumOfSquares - sum1ToN2;
        long aPlusB = a2MinusB2 / aMinusB;
        int a = (int) ((aPlusB + aMinusB) / 2);
        int b = (int) (aPlusB - a);
        return new int[]{a, b};
    }

    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0) {
                ans[0] = Math.abs(num);
            } else {
                nums[Math.abs(num) - 1] *= -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[1] = i + 1;
                break;
            }
        }
        return ans;
    }
}