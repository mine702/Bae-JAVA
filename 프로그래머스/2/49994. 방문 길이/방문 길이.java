import java.io.*;
import java.util.*;

class Solution {
    
    public static int[][] locations = { {1,0}, {-1,0}, {0,1}, {0,-1}};
    public static HashMap<String, Integer> map = new HashMap<>();
    public int solution(String dirs) {
        int answer = 0;
        int startY = 0;
        int startX = 0;
        for(int i = 0 ; i < dirs.length(); i++){
            char order = dirs.charAt(i);
            int locationsIndex = -1;
            switch(order){
                case 'U' : locationsIndex = 0;
                    break;
                case 'D' : locationsIndex = 1;
                    break;
                case 'R' : locationsIndex = 2;
                    break;
                case 'L' : locationsIndex = 3;
                    break;
            }
            int offerY = startY + locations[locationsIndex][0];
            int offerX = startX + locations[locationsIndex][1];
            
            if(offerY < -5 || offerX < -5 || offerY > 5 || offerX > 5)
                continue;
            
            String orderLocation1 = String.valueOf(startY) + String.valueOf(startX) + String.valueOf(offerY)
					+ String.valueOf(offerX);
			String orderLocation2 = String.valueOf(offerY) + String.valueOf(offerX) + String.valueOf(startY)
			+ String.valueOf(startX);
			if (!map.containsKey(orderLocation1) || !map.containsKey(orderLocation2)) {
				map.put(orderLocation1, 1);
				map.put(orderLocation2, 1);
				answer++;
			}
            startY = offerY;
            startX = offerX;
        }
        return answer;
    }
}