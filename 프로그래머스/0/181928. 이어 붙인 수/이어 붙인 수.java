class Solution {
    public int solution(int[] num_list) {
        String oddStr = "";
        String evenStr = "";

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenStr += num;
            } else {
                oddStr += num;
            }
        }

        int oddNum = Integer.parseInt(oddStr);
        int evenNum = Integer.parseInt(evenStr);

        return oddNum + evenNum;
    }
}
