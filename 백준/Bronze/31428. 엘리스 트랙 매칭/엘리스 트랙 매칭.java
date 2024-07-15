import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 첫 번째 줄: 친구들의 수 N 입력
        int N = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기
        
        // 두 번째 줄: 친구들이 지원하는 트랙 정보 입력
        String[] friendsTracks = scanner.nextLine().split(" ");
        
        // 세 번째 줄: 헬로빗이 지원하는 트랙 정보 입력
        String hellobitsTrack = scanner.nextLine();
        
        // 헬로빗과 같은 트랙을 지원하는 친구들의 수를 세기 위한 변수
        int count = 0;
        
        // 친구들이 지원하는 트랙을 하나씩 확인하며 헬로빗의 트랙과 같은지 비교
        for (int i = 0; i < N; i++) {
            if (friendsTracks[i].equals(hellobitsTrack)) {
                count++;
            }
        }
        
        // 결과 출력
        System.out.println(count);
        
        scanner.close();
    }
}
