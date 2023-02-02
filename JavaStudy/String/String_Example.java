package String;
// Ex1) 문자열 포매팅
// String.format 의 메서드를 사용하는 방법이다.
// 다른 문자열은 동일하고 같은 부분의 것을 바꾸고싶을때 사용한다.

// 01) 숫자를 바로 대입하기

class String_1_1 {
    public static void main(String[] args) {
        System.out.println(String.format("I eat %d apples.", 3));  // "I eat 3 apples." 출력
    }
}

// 02) 문자열을 바로 대입하기

class String_1_2 {
    public static void main(String[] args) {
        System.out.println(String.format("I eat %s apples.", "five"));  // "I eat five apples." 출력
    }
}

// 03) 숫자 값을 나타내는 변수로 대입

class String_1_3 {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(String.format("I eat %d apples.", number));  // "I eat 3 apples." 출력
    }
}


// 04) 두개이상의 값을 넣기
// 이때는 파라미터를 순서대로 전달하면 된다.
class String_1_5 {
    public static void main(String[] args) {
        int number = 10;
        String day = "three";
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));    }
}


