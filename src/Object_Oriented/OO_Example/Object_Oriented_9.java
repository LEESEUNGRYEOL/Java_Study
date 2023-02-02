package Object_Oriented.OO_Example;
// Ex09) 생성자

class Tv9_1 {
    // 속성 : 변수 선언
    boolean power; // 전원상태
    int channel;  // 채널
    String color; // 색깔
    long price; // 가격

    // 위 속성에서 필수로 초기값이 필요한 값들을 초기화 해주는 기본 생성자
    public Tv9_1() {
        power = false;
        channel = 1;
    }

    //  오버로딩 한 생성자 - 매장 진열 용 일 경우에는 가격과 색깔의 초기화가 필요합니다. this 는 이전 챕터에서 잠깐 봤었죠! 매개변수와 인스턴스변수를 구분하기 위해 사용하겠습니다.
    public Tv9_1(String color, long price) {
        power = false; // this.power, power 둘다 지금 상황에서는 인스턴스 변수를 명확하게 판단 할 수 있기 때문에 어떤걸 사용해도 상관 없습니다.
        channel = 1;
        this.color = color;
        this.price = price;
    }

    // 기능 : 메서드 선언
    void power() {  // 전원 기능
        power = !power;
        if (power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    void channelUp() { // 채널 증가
        channel++;
        System.out.println("채널 증가");
    }

    void channelDown() { // 채널 감소
        channel--;
        System.out.println("채널 감소");
    }

}

class Tv9_1Main {
    public static void main(String[] args) {
        // 기본 초기화된 Tv9_1 생성
        Tv9_1 tv = new Tv9_1();
        System.out.print("기본 생성자 TV: ");
        tv.power();

        // 진열 용 Tv9_1 생성
        Tv9_1 exTv = new Tv9_1("보라색", 3456789);
        System.out.print("오버로딩 생성자 TV: ");
        exTv.power();
        System.out.println("exTv.color = " + exTv.color);
        System.out.println("exTv.price = " + exTv.price);

        // 근데 이때 주의할 점!
        // 기본 생성자는 없고 오버로딩한 생성자만 있을 경우!
        // 컴파일러는 기본 생성자를 만들어주지 않기 때문에 기본 생성자를 사용하려고 하면 Error 발생!
        // 위 기본 생성자를 주석 하세요!!!!
        Tv9_1 tv2 = new Tv9_1(); // Error 발생, 기본 생성자가 없기 때문에 매개 변수를 넣으라고 intellij 가 요구합니다.

    }
}
