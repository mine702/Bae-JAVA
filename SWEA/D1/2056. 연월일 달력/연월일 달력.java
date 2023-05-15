import java.io.*;
import java.util.*;

public class Solution
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 1; i<=n;i++) {
			String result = br.readLine();
			String year = result.substring(0,4);
			String month = result.substring(4,6);
			String day = result.substring(6,8);
			sb.append("#"+i+" ");
			if(Integer.parseInt(month) <0 ||Integer.parseInt(month) >12 ) {
				sb.append("-1\n");
			}else {
				int b = Integer.parseInt(month);
				switch(b){
				case 1: if(Integer.parseInt(day)<0 || Integer.parseInt(day)>31) {
					sb.append("-1\n");
				}else {
					sb.append(year+"/"+month+"/"+day+"\n");
				}
				break;
				case 2: if(Integer.parseInt(day)<0 || Integer.parseInt(day)>28) {
					sb.append("-1\n");
				}else {
					sb.append(year+"/"+month+"/"+day+"\n");
				}
				break;
				case 3: if(Integer.parseInt(day)<0 || Integer.parseInt(day)>31) {
					sb.append("-1\n");
				}else {
					sb.append(year+"/"+month+"/"+day+"\n");
				}
				break;
				case 4: if(Integer.parseInt(day)<0 || Integer.parseInt(day)>30) {
					sb.append("-1\n");
				}else {
					sb.append(year+"/"+month+"/"+day+"\n");
				}
				break;
				case 5: if(Integer.parseInt(day)<0 || Integer.parseInt(day)>31) {
					sb.append("-1\n");
				}else {
					sb.append(year+"/"+month+"/"+day+"\n");
				}
				break;
				case 6: if(Integer.parseInt(day)<0 || Integer.parseInt(day)>30) {
					sb.append("-1\n");
				}else {
					sb.append(year+"/"+month+"/"+day+"\n");
				}
				break;
				case 7: if(Integer.parseInt(day)<0 || Integer.parseInt(day)>31) {
					sb.append("-1\n");
				}else {
					sb.append(year+"/"+month+"/"+day+"\n");
				}
				break;
				case 8: if(Integer.parseInt(day)<0 || Integer.parseInt(day)>31) {
					sb.append("-1\n");
				}else {
					sb.append(year+"/"+month+"/"+day+"\n");
				}
				break;
				case 9: if(Integer.parseInt(day)<0 || Integer.parseInt(day)>30) {
					sb.append("-1\n");
				}else {
					sb.append(year+"/"+month+"/"+day+"\n");
				}
				break;
				case 10: if(Integer.parseInt(day)<0 || Integer.parseInt(day)>31) {
					sb.append("-1\n");
				}else {
					sb.append(year+"/"+month+"/"+day+"\n");
				}
				break;
				case 11: if(Integer.parseInt(day)<0 || Integer.parseInt(day)>30) {
					sb.append("-1\n");
				}else {
					sb.append(year+"/"+month+"/"+day+"\n");
				}
				break;
				case 12: if(Integer.parseInt(day)<0 || Integer.parseInt(day)>31) {
					sb.append("-1\n");
				}else {
					sb.append(year+"/"+month+"/"+day+"\n");
				}
				break;
				default:
					sb.append("-1\n");
					break;
				}
			}
		}
		System.out.println(sb);
	}
}