package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str1 = br.readLine();
        int x = Integer.parseInt(str);
        int y = Integer.parseInt(str1);
        System.out.println((y > 0) ? ((x > 0) ? "1" : "2") : ((x > 0) ? "4" : "3"));
    }
}
