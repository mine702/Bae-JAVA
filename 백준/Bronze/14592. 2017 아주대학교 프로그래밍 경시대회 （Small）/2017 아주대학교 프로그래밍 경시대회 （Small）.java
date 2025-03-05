import java.util.*;

class Participant implements Comparable<Participant> {
    int id, score, attempts, lastUpload;

    public Participant(int id, int score, int attempts, int lastUpload) {
        this.id = id;
        this.score = score;
        this.attempts = attempts;
        this.lastUpload = lastUpload;
    }

    @Override
    public int compareTo(Participant other) {
        if (this.score != other.score) {
            return Integer.compare(other.score, this.score); // 높은 점수 우선
        }
        if (this.attempts != other.attempts) {
            return Integer.compare(this.attempts, other.attempts); // 적은 제출 횟수 우선
        }
        return Integer.compare(this.lastUpload, other.lastUpload); // 빠른 업로드 시간 우선
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Participant> participants = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int score = sc.nextInt();
            int attempts = sc.nextInt();
            int lastUpload = sc.nextInt();
            participants.add(new Participant(i, score, attempts, lastUpload));
        }

        Collections.sort(participants);
        System.out.println(participants.get(0).id);
    }
}