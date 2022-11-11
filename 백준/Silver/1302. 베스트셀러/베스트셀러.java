import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> books = new HashMap<String, Integer>();
        HashSet<String> booknames = new HashSet<>();
        Integer Bigcount = 0;
        String bookname = "";
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            booknames.add(name);
            if (books.containsKey(name)) {
                Integer count = books.get(name);
                count++;
                books.put(name, count);
            } else {
                books.put(name, 1);
            }
        }
        ArrayList<String> al = new ArrayList<>(booknames);
        Collections.sort(al);
        for (int i = 0; i < al.size(); i++) {
            String name = al.get(i);
            if (i == 0) {
                Bigcount = books.get(name);
                bookname = name;
            } else {
                Integer result = books.get(name);
                if (result > Bigcount) {
                    bookname = name;
                    Bigcount = result;
                }
            }
        }
        bw.write(bookname);
        br.close();
        bw.flush();
        bw.close();
    }
}
