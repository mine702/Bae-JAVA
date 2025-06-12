class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // 앞부분 + overwrite_string + 뒷부분
        String prefix = my_string.substring(0, s);
        String suffix = my_string.substring(s + overwrite_string.length());
        return prefix + overwrite_string + suffix;
    }
}
