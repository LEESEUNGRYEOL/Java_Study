package Object_Oriented.OO_Example;

// ** EX 01) 객체의 생성
// 1. 객체의 역할에는 속성(변수), 기능(메소드) 가 있다.
// 2. 이때 변수에는 iv(instance Variable), cv(class variable), lv(local variable)이 있다.
//
class Tv1_1 {

    //  ** 속성 : 변수 선언 **
    // 앞에 static 이 붙여지지 않았으므로 iv 이다.
    String color; // 색깔

    // 앞에 static 이 붙여지지 않았으므로 iv 이다.
    // "기본형" 변수의 "명시적 초기화"
    boolean power = false; // 전원상태 : false 로 초기화

    // 앞에 static 이 붙여지지 않았으므로 iv 이다.
    // "기본형" 변수의 "명시적 초기화"
    int channel = 1;  // 채널 : 1 로 초기화

    // ** 기능 : 메서드 선언 **
    // static이 붙여지지 않았으므로, im (instance Method) 이다.
    // 따라서 인스턴스 변수를 사용 가능하다.
    void power() {  // 전원 기능
        power = !power;
        if (power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    // static이 붙여지지 않았으므로, im (instance Method) 이다.
    // 따라서 인스턴스 변수를 사용 가능하다.
    void channelUp() { // 채널 증가
        channel++;
        System.out.println("채널 증가");
    }

    // static이 붙여지지 않았으므로, im (instance Method) 이다.
    // 따라서 인스턴스 변수를 사용 가능하다.
    void channelDown() { // 채널 감소
        channel--;
        System.out.println("채널 감소");
    }
}

class Tv1_1Main {
    public static void main(String[] args) {

        // Tv1_1 : 클래스 이름
        // t1,t2 : 참조 변수

        // ** 인스턴스 객체 생성시 순서 **
        // 1. Tv1_1 t1 : 참조변수 생성
        // 2. new : 객체를 생성
        // 3. Tv1_1() :  객체 초기화 (생성자 호출)
        // 4. = : 참조변수에 주소를 대입

        // Tv1_1 에는 생성자가 1개도 없으므로, 기본 생성자가 자동으로 추가
        Tv1_1 t1 = new Tv1_1(); // TV1 인스턴스

        // 참조변수. 인스턴스변수 : 인스턴스변수 값 지정.
        // 인스턴스 생성될 때마다 인스턴스 변수가 생기는 것을 유의
        t1.color = "검정색"; // 색깔 초기화

        // Tv1_1 에는 생성자가 1개도 없으므로, 기본 생성자가 자동으로 추가
        Tv1_1 t2 = new Tv1_1(); // TV2 인스턴스

        // 참조변수. 인스턴스변수 : 인스턴스변수 값 지정.
        // 인스턴스 생성될 때마다 인스턴스 변수가 생기는 것을 유의
        t2.color = "흰색"; // 색깔 초기화

        // 인스턴스 변수 값 변경이 되었는지 확인.
        System.out.println("TV1 인스턴스 색깔 = " + t1.color);
        System.out.println("TV2 인스턴스 색깔 = " + t2.color);

        // 인스턴스 메서드 호출
        t1.power();
        // 인스턴스 매서드를 통한 값 변경 확인.
        System.out.println("TV1 인스턴스 채널 = " + t1.channel);

        // 인스턴스 메서드 호출
        t1.channelUp();
        // 인스턴스 메서드를 통한 값 변경 확인
        System.out.println("TV1 인스턴스 채널 : " + t1.channel);
        // 인스턴스 메서드 호출
        t1.channelDown();
        // 인스턴스 메서드를 통한 값 변경 확인
        System.out.println("TV1 인스턴스 채널 : " + t1.channel);

        // 인스턴스 메서드 호출
        t1.power();


        // TV2 인스턴스 참조변수에 TV1 인스턴스의 "주소" 저장 했을 때
        // 이때 항상 참조변수에 저장되어있는 값들은  "주소" 이다.
        t2 = t1;

        System.out.println("TV1 인스턴스 색깔 = " + t1.color); // 검정색
        System.out.println("TV2 인스턴스 색깔 = " + t2.color); // 검정색

        //  ** 주소값을 대입했을때의 상황 **
        //  Question: 흰색이었던 TV2 인스턴스 의 색깔이 검정색으로 바뀐건가?
        //  Answer: 아닙니다.
        //  참조변수 t2 에 저장되어있던 TV2 인스턴스 의 주소가 없어지고
        //  TV1 의 주소가 t2 참조변수에 저장이 됩니다
        // 따라서 t2 = t1; 이후 부터는
        // t2 참조변수로는 더 이상 TV2 인스턴스 에 접근할 수 없습니다.

    }
}


