package Object_Oriented.OO_Example;
// Ex 11) 변수의 초기화


// 01) 명시적 초기화
class Tv11_1 {
    boolean power = false;    // 기본형 변수의 초기화
    int channel = 1;          // 기본형 변수의 초기화
    //Audio audi = new Audio(); // 참조형 변수의 초기화, 참조형은 객체주소 or null 로 초기화!!
    // 참조형의 기본값은 null 입니다!!
}


// 02) 초기화 블럭
class Tv11_2 {
    static boolean power;
    int channel;

    // 클래스 초기화 블럭
    static
    {
        power = false;
    }

    // 인스턴스 초기화 블럭
    {
        channel = 1;
    }
}


// 03) 생성자 초기화
class Tv11_3 {
    // 속성 : 변수 선언
    boolean power; // 전원상태
    int channel;  // 채널
    String color; // 색깔
    long price; // 가격

    // 위 속성에서 필수로 초기값이 필요한 값들을 초기화 해주는 기본 생성자
    Tv11_3() {
        this.power = false;
        this.channel = 1;
    }
}