package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        StringTokenizer st = new StringTokenizer(str1);
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(str2);

        if ((M+C) >= 60) {
            H += (M + C) / 60;
            M = (M + C) % 60;
            if (H>=24) {
                H -= 24;
            }
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + (M+C));
        }
    }
}
