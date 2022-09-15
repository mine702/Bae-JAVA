import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Member[] members = new Member[Integer.parseInt(br.readLine())];
        for (int i = 0; i < members.length; i++) {
            st = new StringTokenizer(br.readLine());
            members[i] = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
        }
        Arrays.sort(members, new Comparator<Member>() {
            public int compare(Main.Member o1, Main.Member o2) {
                return o1.age - o2.age;
            }
        });

        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i].age + " " + members[i].name);
        }
    }

    public static class Member {
        int age;
        String name;

        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}