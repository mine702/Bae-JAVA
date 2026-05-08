import java.util.*;

class Solution {
    // 1. Comparable을 구현하는 Node 클래스 정의
    public class Node implements Comparable<Node> {
        String s;

        public Node(int num) {
            this.s = String.valueOf(num);
        }

        @Override
        public int compareTo(Node other) {
            // "나 + 상대방"과 "상대방 + 나"를 합쳐보고 더 큰 쪽이 앞으로 오게 함 (내림차순)
            // (other.s + this.s)와 (this.s + other.s)를 비교합니다.
            return (other.s + this.s).compareTo(this.s + other.s);
        }
    }

    public String solution(int[] numbers) {
        // 2. int[]를 Node[] 배열로 변환
        Node[] nodes = new Node[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nodes[i] = new Node(numbers[i]);
        }

        // 3. Arrays.sort 호출 (내부적으로 Node의 compareTo를 사용)
        Arrays.sort(nodes);

        // 4. 예외 처리: 모든 숫자가 0인 경우 "0" 하나만 리턴
        if (nodes[0].s.equals("0")) return "0";

        // 5. 정렬된 결과 합치기
        StringBuilder sb = new StringBuilder();
        for (Node node : nodes) {
            sb.append(node.s);
        }

        return sb.toString();
    }
}