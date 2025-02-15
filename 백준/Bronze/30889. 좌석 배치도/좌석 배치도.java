import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 손님 수 입력
        int N = sc.nextInt();
        sc.nextLine();  // 버퍼에 남은 개행문자 제거
        
        // 좌석 배치 초기화 (10행 20열)
        char[][] seats = new char[10][20];
        
        // 좌석을 모두 '.'으로 초기화
        for (int i = 0; i < 10; i++) {
            Arrays.fill(seats[i], '.');
        }
        
        // 예매된 좌석 정보 입력 처리
        for (int i = 0; i < N; i++) {
            String reservation = sc.nextLine();
            
            // 예약된 좌석의 열과 행 추출
            char row = reservation.charAt(0); // 예: 'A'
            int col = Integer.parseInt(reservation.substring(1)); // 예: 5
            
            // 열 인덱스 계산 (A->0, B->1, ..., J->9)
            int rowIndex = row - 'A';
            int colIndex = col - 1; // 1번부터 시작하므로 1을 빼서 0부터 시작
            
            // 해당 좌석에 'o' 표시
            seats[rowIndex][colIndex] = 'o';
        }
        
        // 좌석 배치 출력
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(seats[i][j]);
            }
            System.out.println();
        }
        
        sc.close();
    }
}
