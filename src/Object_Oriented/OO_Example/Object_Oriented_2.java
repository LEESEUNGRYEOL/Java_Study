package Object_Oriented.OO_Example;
// ** EX 02) 객체 배열의 생성

class Tv1_2 {
    // 속성 : 변수 선언
    String color; // 색깔
    boolean power = false; // 전원상태 : false 로 초기화
    int channel = 1;  // 채널 : 1 로 초기화
    // 브랜드 이름 속성 추가
    String brand;

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

class Tv1_2Main {
    public static void main(String[] args) {
        Tv1_2[] tvArr = new Tv1_2[3];

        tvArr[0] = new Tv1_2();
        tvArr[1] = new Tv1_2();
        tvArr[2] = new Tv1_2();

        tvArr[0].color = "보라색";
        tvArr[1].color = "주황색";
        tvArr[2].color = "핑크색";

        for (int i = 0; i < tvArr.length; i++) {
            System.out.println(i + 1 + "번째 Tv인스턴스 색깔: " + tvArr[i].color);
        }

        for (int i = 0; i < tvArr.length; i++) {
            System.out.print(i + 1 + "번째 Tv인스턴스 " );
            tvArr[i].power();
        }

        System.out.println();
        // 브랜드명 추가 전 확인
        for (int i = 0; i < tvArr.length; i++) {
            System.out.print(i + 1 + "번째 Tv인스턴스의 브랜드 명: " );
            System.out.println(tvArr[i].brand);
        }
        System.out.println();

        // 새로운 참조변수에 배열 안에 들어있는 객체 주소 값 배정
        Tv1_2 samsung = tvArr[0];
        Tv1_2 lg = tvArr[1];
        Tv1_2 apple = tvArr[2];

        // 참조변수를 사용해서 배열안에 넣어준 객체에 접근해서 각 인스턴스에 브랜드 이름 추가하기
        samsung.brand = "samsung";
        lg.brand = "lg";
        apple.brand = "apple";

        for (int i = 0; i < tvArr.length; i++) {
            System.out.print(i + 1 + "번째 Tv인스턴스의 브랜드 명: " );
            System.out.println(tvArr[i].brand);
        }
    }
}
