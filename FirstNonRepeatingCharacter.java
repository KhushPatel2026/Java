public class FirstNonRepeatingCharacter {

    public static int firstNonRepeatingCharacter(String s) {
        int[] seen = new int[26];
        for (int i = 0; i < s.length(); i++) {
            seen[s.charAt(i) - 'a']++;
        }

        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (seen[s.charAt(i) - 'a'] == 1) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int index = firstNonRepeatingCharacter(s);
        System.out.println(index);
    }
}
