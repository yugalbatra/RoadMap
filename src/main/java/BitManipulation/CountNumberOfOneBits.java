package BitManipulation;

public class CountNumberOfOneBits {

    static int setBits(int num) {
        int count = 0;
        while (num != 0) {
            count += num % 2;
            num /= 2;
        }
        return count;
    }
}
