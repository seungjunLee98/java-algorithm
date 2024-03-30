package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class boj2588 {
    public static void main(String[] args) throws IOException {

        /* 방법1
        Scanner in = new Scanner(System.in); // Scanner 객체를 생성
        int A = in.nextInt(); // A는 int형으로 받아준다.
        String B = in.next(); // B는 문자형으로 받아준다.
        in.close();           // close() 메서드를 통해서 자원을 그만쓴다라는 것을 알리고 GC가 메모리를 해제 할 수 있도록 한다.

        System.out.println(A*(B.charAt(2) - '0')); // charAt으로 2번째 인덱스 값을 참조한 뒤 '0'을 빼준다. 아스키코드 참조
        System.out.println(A*(B.charAt(1) - '0'));
        System.out.println(A*(B.charAt(0) - '0'));
        System.out.println(A * Integer.parseInt(B)); // 전체 값을 계산해준다.

         */
        /* 방법2
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        in.close();

        System.out.println(A * (B % 10)); // 수학적으로 계산
        System.out.println(A * ((B / 10) % 10));
        System.out.println(A * (B / 100));
        System.out.println(A * B);
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        br.close();

        StringBuilder sb = new StringBuilder();

        sb.append(A * (B%10));
        sb.append('\n');

        sb.append(A * ((B%100)/10));
        sb.append('\n');

        sb.append(A * (B/100));
        sb.append('\n');

        sb.append(A * B);

        System.out.print(sb);
    }
}