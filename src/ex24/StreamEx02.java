package ex24;

import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        // 한자리의 숫자를 받을 수
        InputStream in = System.in;
        // 고정된 길이이 문자를 받을 수 있다.
        InputStreamReader ir = new InputStreamReader(in); // Reader가 내가 캐스팅 안해도 되게 문자로 바꿔준다.
        // 단점만 정리
        char[] data = new char[3]; // char 2Byte
        try {
            ir.read(data);
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
