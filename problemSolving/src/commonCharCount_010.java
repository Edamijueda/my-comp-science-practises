/**/

public class commonCharCount_010 {
    public static void main(String[] args) {
        String s1 = "aabcc", s2 = "adcaa"; // //refer to TEST CASES for more input
        System.out.println("No of cmon char btn them is " +solution(s1, s2));
    }
    static int solution(String s1, String s2) {
        int before = s1.length();
        for(int pos = 0; pos < s2.length(); pos++){
            s1 = s1.replaceFirst(s2.substring(pos, pos+1), "");
        }
        int after = s1.length();
        return before - after;
    }
}

// TEST CASES
// String s1 = "aabcc", s2 = "adcaa";
// String s1 = "zzzz", s2 = "zzzzzzz";
// String s1 = "abca", s2 = "xyzbac";
// String s1 = "a", s2 = "b";
// String s1 = "a", s2 = "aaa";