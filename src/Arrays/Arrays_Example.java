package Arrays;

import java.util.Arrays;

// 배열과 관련된 예제이다.
public class Arrays_Example {

    public static void main(String[] args) {

        // 1-1. 배열선언 (리터럴값 지정)
        // 다음과 같이 배열을 선언할때는 배열의 인스턴스 배열이 아닌, 그냥 배열이다. (틀림)
        // 위와 같이 생각했지만, 밑에 출력을 해보니 밑의 예제와 같이 new 가 생략되었던 것이다.
        int[] A1 = {1, 2, 3, 4, 5} ;
        char[] B1 = {'A','B','C','D','E'};
        String[] C1 = { "A", "B", "C", "D" };
        // 출력해보자
        System.out.println("A1 = " + A1);
        System.out.println("B1 = " + B1);
        System.out.println("C1 = " + C1);

        System.out.println("A1 = " + Arrays.toString(A1));

        // ** 배열은 기본형 자료형이 아니므로 "주소" 값을 가진다 따라서 Arrays.toString() 을 통해서 출력한다.

        // 1-2. 배열선언 (인스턴스 객체 생성)
        // 다음과 같이 인스턴스 객체를 생성해서 초기화를 할 수 있다.
        int[] A2 = new int[]{ 1, 2, 3, 4, 5} ;
        char[] B2 = new char[]{'A','B','C','D','E'};
        String[] C2 = new String[]{ "A", "B", "C", "D" };
        // 출력해보자
        System.out.println("A2 = " + A2);
        System.out.println("B2 = " + B2);
        System.out.println("C2 = " + C2);

    }
}
