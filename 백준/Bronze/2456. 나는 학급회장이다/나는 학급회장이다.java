import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static int N;
	private static int score[][];
	private static int scoreCnt[][];
	private static List<Integer> idxOfScore=new ArrayList<Integer>();
	
	public static int isSame(int arr[], int m) {
		int cnt=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==m) {
				cnt++;
				idxOfScore.add(i);
			}
		}
		return cnt;
	}
	
	public static int compTwo(int a, int b) {
		if(scoreCnt[a][3]!=scoreCnt[b][3]) {
			return scoreCnt[a][3] > scoreCnt[b][3] ? a : b;
		}
		else if(scoreCnt[a][2]!=scoreCnt[b][2]) {
			return scoreCnt[a][2] > scoreCnt[b][2] ? a : b;
		} else {
			return 0;
		}
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total[]=new int[4];
		
		N=sc.nextInt();
		score=new int[N+1][4];
		scoreCnt=new int[4][4];
		for(int i=1;i<=N;i++) {
			score[i][1]=sc.nextInt();
			scoreCnt[1][score[i][1]]++;
			total[1]+=score[i][1];
			
			score[i][2]=sc.nextInt();
			scoreCnt[2][score[i][2]]++;
			total[2]+=score[i][2];
			
			score[i][3]=sc.nextInt();
			scoreCnt[3][score[i][3]]++;
			total[3]+=score[i][3];
		}

		int maxVal=0;
		int resultNum=-1;
		int resultScore=-1;
		for(int i=1;i<=3;i++) {
			if(total[i]>maxVal) {
				resultNum=i;
				maxVal=total[i];
			}
		}
		if(isSame(total, maxVal)==1) {	
			resultScore=maxVal;
		} else if(isSame(total, maxVal)==2) {	
			int a=idxOfScore.get(0);
			int b=idxOfScore.get(1);
			resultNum=compTwo(a, b);
			if(resultNum==0) resultScore=maxVal;
			else resultScore=total[resultNum];
		} else if(isSame(total, maxVal)==3) {	
			int a=idxOfScore.get(0);
			int b=idxOfScore.get(1);
			int c=idxOfScore.get(2);
			resultNum=compTwo(a,b);
			if(resultNum==0) resultNum=a;
			resultNum=compTwo(resultNum,c);
			if(resultNum==0) resultScore=maxVal;
			else resultScore=total[resultNum];
		}
		System.out.println(resultNum+" "+resultScore);
	}
}