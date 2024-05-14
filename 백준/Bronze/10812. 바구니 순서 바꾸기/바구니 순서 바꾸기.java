import java.io.*;
import java.util.StringTokenizer;

  public class Main {
      public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          StringTokenizer token = new StringTokenizer(br.readLine());

          int N = Integer.parseInt(token.nextToken());
          int M = Integer.parseInt(token.nextToken());

          int [] basket = new int[N];

          int [] rotationBasket = new int[N];

          for(int i = 0; i < basket.length; i++){
              basket[i] = i+1;
          }

          for(int r = 0; r < M; r++){ 
              token = new StringTokenizer(br.readLine());
              int i =  Integer.parseInt(token.nextToken())-1;
              int j =  Integer.parseInt(token.nextToken())-1;
              int k =  Integer.parseInt(token.nextToken())-1;

              int i1 = i; 
              for(int b = 0; b < j-i+1; b++){
                  if(k+b <= j){ 
                      rotationBasket[b+i] = basket[k+b];
                  }else{ 
                      rotationBasket[b+i] = basket[i1];
                      i1++; 
                  }
             }
             for(int b = 0; b < N; b++){
                 if(rotationBasket[b] != 0){
                     basket[b] = rotationBasket[b];
                 }
             }

          }
          br.close();

          for(int i = 0; i < N; i++){ 
              bw.write(basket[i] + " ");
          }

          bw.flush();
          bw.close();

    }
}