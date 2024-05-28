import java.io.*;
import java.util.*;

public class Main {
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int o = 0; 
      int w = 0; 
      
      int scenario = 0;
      String pet_state = "";
      int game_state = 0;

      while( true )
      {
    	  String s = br.readLine();
    	  if( s.equals("# 0") ) {
    		 bw.write(scenario + " " + pet_state + "\n") ;
    		 game_state = 0;
    		 continue;
    	  } else if (s.equals("0 0")) {
    		  break;
    	  }
    	  
    	  if(game_state == 0) { 
    		  StringTokenizer st = new StringTokenizer(s);
    		  o = Integer.parseInt(st.nextToken()); 
    	      w = Integer.parseInt(st.nextToken()); 
    	      game_state = 1;
    	      scenario++;
    	  } else if (game_state == 1) {
    		  StringTokenizer st = new StringTokenizer(s);
    		  String action = st.nextToken();
    		  int n = Integer.parseInt(st.nextToken());
    		  
    		  if(action.equals("E")) {
    			  w -= n;
    		  } else if (action.equals("F")) {
    			  w += n;
    		  }
    	  } else {
    		  continue;
    	  }
    	  if( o/2 < w && w < o*2 ) {
    		  pet_state = ":-)"; 
    	  } else if ( w <= 0) {
    		  pet_state = "RIP";
    		  game_state = -1;
    	  } else {
    		  pet_state = ":-(";
    	  }
    	  
      }
      bw.flush();
      bw.close();
      br.close();
   }   
}