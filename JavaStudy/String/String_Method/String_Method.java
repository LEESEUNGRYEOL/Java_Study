package String.String_Method;

// 01) .equals 메서드 : 두개의 문자열이 동일한지를 비교하여 결과값을 리턴한다.
class String_Method_1 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";
        System.out.println(a.equals(b)); // false 출력
        System.out.println(a.equals(c)); // true 출력
        System.out.println(a == b);  // false (다음과 같이 쓰면 안됨!)
    }
}


// 02) indexOf 메서드: 문자열에서 특정 문자열이 시작되는 위치(인덱스)를 리턴.
// 즉 내가 어떠한 문자열이 시작되는 위치를 알고싶을때 사용하면 될 듯.
class String_Method_2 {
    public static void main(String[] args) {
        String a = "Hello Java";
        System.out.println(a.indexOf("Java"));  // 6 출력
    }

}

// 03) contains 메서드: 문자열에서 특정한 문제열이 포함되어 있는지의 여부를 리턴
// 어떠한 문자열이 다른 문자열에 포함되어있는지 판단할때
class String_Method_3 {
    public static void main(String[] args) {
        String a = "Hello Java";
        System.out.println(a.contains("Java"));  // true 출력
    }

}

// 04) charAt 메서드: 문자열에서 특정 위치의 문자를 리턴한다.
// 말 그대로 어떠한 인덱스에 대응하는 문자를 출력해주는 것이다.

class String_Method_4 {
    public static void main(String[] args) {
        String a = "Hello Java";
        System.out.println(a.charAt(6));  // "J" 출력
    }

}

// 05) replaceAll 메서드: 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용한다.
// 이때 replace를 쓰는 경우와 replaceAll 을 쓰는 경우가 다른데, 보통은 replaceAll 을 사용한다.

class String_Method_5 {
    public static void main(String[] args) {
        String a = "Hello Java";
        System.out.println(a.replaceAll("Java", "World"));  // Hello World 출력
    }

}

// 06) substring 메서드: 문자열 중 특정 부분을 뽑아낼 경우에 사용한다.
// 시작위치와 끝 위치를 정하면 그 문자열을 뽑아서 쓸 수 있다.

class String_Method_6 {
    public static void main(String[] args) {
        String a = "Hello Java";
        System.out.println(a.substring(0, 4));  // Hell 출력
    }

}


// 07) toUpperCase: 문자열을 모두 대문자로 변경할때 사용한다.
// 당연하게도 문자열을 모두 소문자로 변경을 할때는 toLowerCase를 사용한다.
class String_Method_7 {
    public static void main(String[] args) {
        String a = "Hello Java";
        System.out.println(a.toUpperCase());  // HELLO JAVA 출력
    }

}

// 08) split 메서드: 문자열을 특정 구분자로 나누어 문자열 배열로 리턴하는 메서드이다.
// 이때 리턴하는 값을 "문자열 배열" 이라는 것을 기억해 놓자.
class String_Method_8 {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String[] result = a.split(":");  // result는 {"a", "b", "c", "d"}
    }

}