//package Arrays;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Set;
//
//class Solution {
//    public String smallestString(String s) {
//        char[] result = s.toCharArray();
//        int maxCount = 0, count = 0, currentStartIndex = 0;
//        int a = 0, b = 0;
//        for (int i = 0; i < result.length; i++) {
//            while (result[i] == 'a') {
//                if (count > maxCount) {
//                    maxCount = count;
//                    a = currentStartIndex;
//                    b = i;
//                }
//                currentStartIndex = i + 1;
//                count = 0;
//                i++;
//            }
//            else count++;
//        }
//        if (count > maxCount) {
//            a = currentStartIndex;
//            b = result.length;
//        }
//        for (int i = a; i < b; i++) {
//            result[i] = (char) (result[i] - 1);
//        }
//
//        return new String(result);
//    }
//}
//
//class RobotCollision {
//    public static int robotCollision(int[] nums, String s, int d) {
//        HashMap<Integer, Integer> positions = new HashMap<>();
//
//        // Initialize positions at time 0
//        for (int num : nums) {
//            positions.put(num, positions.getOrDefault(num, 0) + 1);
//        }
//
//        for (int i = 0; i < d; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (s.charAt(j) == 'R') {
//                    nums[j] += 1;
//                } else {
//                    nums[j] -= 1;
//                }
//
//                int num = nums[j];
//
//                if (positions.containsKey(num)) {
//                    positions.put(num, positions.get(num) + 1);
//                    positions.put(nums[j], positions.get(nums[j]) - 1);
//                    if (positions.get(num) == 0) {
//                        positions.remove(num);
//                    }
//                    if (positions.get(nums[j]) == 0) {
//                        positions.remove(nums[j]);
//                    }
//                } else {
//                    positions.put(num, 1);
//                }
//            }
//        }
//
//        int sumDistances = 0;
//
//        // Calculate sum of distances between pairs of robots
//        for (int count : positions.values()) {
//            sumDistances += count * (count - 1) / 2;
//        }
//
//        return sumDistances % (int) (1e9 + 7);
//    }
//
//    public static void main(String[] args) {
//        int[] nums1 = {-2, 0, 2};
//        String s1 = "RLL";
//        int d1 = 3;
//        System.out.println(robotCollision(nums1, s1, d1));  // Output: 8
//
//        int[] nums2 = {1, 0};
//        String s2 = "RL";
//        int d2 = 2;
//        System.out.println(robotCollision(nums2, s2, d2));  // Output: 5
//    }
//}
//
//
//class LongestSemiRepetitiveSubstring {
//    public int longestSemiRepetitiveSubstring(String s) {
//        int maxLength = 0;
//        int currentLength = 1;
//        int nonConsecutiveCount = 0;
//        boolean foundConsecutive = false;
//
//        char last = s.charAt(0);
//        for (int i = 1; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            if (last != c || !foundConsecutive) {
//                if (last == c) {
//                    foundConsecutive = true;
//                }
//                if (foundConsecutive) nonConsecutiveCount++;
//                currentLength++;
//            } else {
//                maxLength = Math.max(maxLength, currentLength);
//                currentLength = nonConsecutiveCount + 1;
//                nonConsecutiveCount = 1;
//            }
//            last = c;
//        }
//
//        maxLength = Math.max(maxLength, currentLength);
//        return maxLength;
//    }
//
//    public static void main(String[] args) {
//        LongestSemiRepetitiveSubstring lrs = new LongestSemiRepetitiveSubstring();
//
//        String s1 = "000116847928";
//        int length1 = lrs.longestSemiRepetitiveSubstring(s1);
//        System.out.println("Longest semi-repetitive substring in " + s1 + ": " + length1);
//
//        String s2 = "5494";
//        int length2 = lrs.longestSemiRepetitiveSubstring(s2);
//        System.out.println("Longest semi-repetitive substring in " + s2 + ": " + length2);
//
//        String s3 = "1111111";
//        int length3 = lrs.longestSemiRepetitiveSubstring(s3);
//        System.out.println("Longest semi-repetitive substring in " + s3 + ": " + length3);
//    }
//}
//
//class FascinatingNumber {
//    public static boolean isFascinating(int n) {
//        // Convert the number to a string
//        String numString = String.valueOf(n);
//
//        // Concatenate the string representations of n, 2 * n, and 3 * n
//        String concatenatedString = numString + (2 * n) + (3 * n);
//        System.out.println(concatenatedString);
//
//        // Check if the concatenated string contains all digits from 1 to 9 exactly once and no zeros
//        Set<Character> digits = new HashSet<>();
//        for (char c : concatenatedString.toCharArray()) {
//            if (c == '0' || !digits.add(c)) {
//                return false;
//            }
//        }
//
//        return digits.size() == 9;
//    }
//
//    public static void main(String[] args) {
//        int n = 783;
//        boolean isFascinating = isFascinating(n);
//        System.out.println("Is " + n + " fascinating? " + isFascinating);
//    }
//}
//
//public class example {
//}
