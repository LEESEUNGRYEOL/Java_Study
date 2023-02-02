package StringBuffer.StringBuffer_Method;
// StringBuffer 는 문자열을 추가하거나, 변경을 할때 주로 사용하는 자료형이다.

// StringBuffer 의 Method

//01) append 메서드: 문자열을 계속해서 추가해 나갈 수 있다.

class StringBuffer_Method_1{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result);  // "hello jump to java" 출력

        // append 메서드를 사용하지 않고, String 자료형을 사용할 경우
        String result2 = "";
        result2 += "hello";
        result2 += " ";
        result2 += "jump to java";
        System.out.println(result2);  // "hello jump to java" 출력

        // 두개의 예제의 출력 결과는 동일하지만, String 자료형은 계속해서 새로운 객체를 만드는 것이고, (imutable: 불변)
        // StringBuffer 자료형은 값을 변경할 수 있다. (mutatble: 가변)
    }
}


// 02) insert 메서드 : 주어진 인덱스 위치에 원하는 문자열을 삽입할 수 있다.

class StringBuffer_Method_2{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("jump to java");
        sb.insert(0, "hello ");
        System.out.println(sb.toString());
    }
}


// 03) substring 메서드: 시작인덱스, 마지막 인덱스값을 받으면 그 문자열을 반환한다.

class StringBuffer_Method_3{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello jump to java");
        System.out.println(sb.substring(0, 4));
    }
}