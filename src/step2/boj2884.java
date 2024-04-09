package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        M -= 45;
        if (M >= 0) {
            System.out.println( H +" "+ M );
        } else {
            M += 60;
            if (H == 0) {
                H = 23;
                System.out.println( H +" "+ M );
            } else {
                H -= 1;
                System.out.println( H +" "+ M );
            }
        }
    }
}
