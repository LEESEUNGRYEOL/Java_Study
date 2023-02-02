package Object_Oriented.OO_Example;
// Ex10) 참조변수 this 와 생성자 this()


// 01) 참조변수 this
class Tv10_1 {
    // 속성 : 변수 선언
    boolean power; // 전원상태
    int channel;  // 채널
    String color; // 색깔
    long price; // 가격

    // 위 속성에서 필수로 초기값이 필요한 값들을 초기화 해주는 기본 생성자
    public Tv10_1() {
        this.power = false;
        this.channel = 1;
    }

    //  오버로딩 한 생성자 - 매장 진열 용 일 경우에는 가격과 색깔의 초기화가 필요합니다.
    public Tv10_1(String color, long price) {
        this.power = false;
        this.channel = 1;
        this.color = color;
        this.price = price;
    }

    // 기능 : 메서드 선언
    void power() {  // 전원 기능
        this.power = !power;
        if (this.power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    void channelUp() { // 채널 증가
        this.channel++;
        System.out.println("채널 증가");
    }

    void channelDown() { // 채널 감소
        this.channel--;
        System.out.println("채널 감소");
    }

    // 색깔을 수정하고 자기 자신을 반환하는 메서드
    Tv10_1 changeColor(String color) { // 반환 타입으로 자기자신인 Tv 선언
        this.color = color;
        System.out.println("색깔 변경 완료!");
        return this; // this 는 자기 자신을 가리키는 참조변수!
    }

}

class Tv10_1Main {
    public static void main(String[] args) {
        // 기본 초기화된 Tv10_1 생성
        Tv10_1 tv = new Tv10_1();
        System.out.print("기본 생성자 Tv10_1: ");
        tv.power();

        // 진열 용 Tv10_1 생성
        Tv10_1 exTv = new Tv10_1("보라색", 3456789);
        System.out.print("오버로딩 생성자 Tv10_1: ");
        exTv.power();
        System.out.println("exTv.color = " + exTv.color);
        System.out.println("exTv.price = " + exTv.price);
        System.out.println();

        // 진열 용 Tv10_1 의 색깔을 수정하고 수정된 객체를 참조변수에 저장하겠습니다.
        Tv10_1 exTvThis = exTv.changeColor("파란색");
        // 색깔이 변경된 Tv의 주소가 저장된 참조변수 exTvThis 를 사용하여 변경된 색깔 확인
        System.out.println("색깔이 변경되었는지 확인 exTvThis.color : " + exTvThis.color);
        // 당연히 exTv 이걸로 확인해도 색깔이 변경되어 있습니다.
        System.out.println("exTv.color = " + exTv.color);
    }
}


// 02) 생성자 this()
class Tv10_2 {
    // 속성 : 변수 선언
    boolean power; // 전원상태
    int channel;  // 채널
    String color; // 색깔
    long price; // 가격

    // 위 속성에서 필수로 초기값이 필요한 값들을 초기화 해주는 기본 생성자
    public Tv10_2() {
        this.power = false;
        this.channel = 1;
    }

    //  오버로딩 한 생성자 - 매장 진열 용 일 경우에는 가격과 색깔의 초기화가 필요합니다.
    public Tv10_2(String color, long price) {
        // 아래 초기화 내용은 위에 기본생성자와 완전히 똑같습니다.
        // 이럴 때 this() 를 사용합니다.
        // this.power = false;
        // this.channel = 1;

        this(); // 기본 생성자를 호출합니다.
        // Tv10_2() // 이렇게는 불가능 합니다!

        this.color = color;
        this.price = price;

        // this(); // 생성자 호출은 반드시 첫 줄에서만 가능합니다.
    }

    // 기능 : 메서드 선언
    void power() {  // 전원 기능
        this.power = !power;
        if (this.power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    void channelUp() { // 채널 증가
        this.channel++;
        System.out.println("채널 증가");
    }

    void channelDown() { // 채널 감소
        this.channel--;
        System.out.println("채널 감소");
    }

    // 색깔을 수정하고 자기 자신을 반환하는 메서드
    Tv10_2 changeColor(String color) { // 반환 타입으로 자기자신인 Tv 선언
        this.color = color;
        System.out.println("색깔 변경 완료!");
        return this; // this 는 자기 자신을 가리키는 참조변수!
    }

}

class Tv10_2Main {
    public static void main(String[] args) {
        // 기본 초기화된 Tv10_2 생성
        Tv10_2 tv = new Tv10_2();
        System.out.print("기본 생성자 Tv10_2: ");
        tv.power();

        // 진열 용 Tv10_2 생성
        Tv10_2 exTv = new Tv10_2("보라색", 3456789);
        System.out.print("오버로딩 생성자 Tv10_2: ");
        exTv.power();
        System.out.println("exTv.color = " + exTv.color);
        System.out.println("exTv.price = " + exTv.price);
        System.out.println();

        // 진열 용 Tv10_2 의 색깔을 수정하고 수정된 객체를 참조변수에 저장하겠습니다.
        Tv10_2 exTvThis = exTv.changeColor("파란색");
        // 색깔이 변경된 Tv의 주소가 저장된 참조변수 exTvThis 를 사용하여 변경된 색깔 확인
        System.out.println("색깔이 변경되었는지 확인 exTvThis.color : " + exTvThis.color);
        // 당연히 exTv 이걸로 확인해도 색깔이 변경되어 있습니다.
        System.out.println("exTv.color = " + exTv.color);
    }
}