package Object_Oriented;
// Ex06) 기본형 매개변수와 참조형 매개변수

// 01) 기본형 매개변수
class Data6_1 {
    int x; // 기본형
    int y; // 기본형
}

class Data6_1Main {
    public static void main(String[] args) {

        Data6_1 data  = new Data6_1();
        data.x = 10;
        data.y = 20;

        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수 x, y 값 확인");
        System.out.println("data 인스턴스 변수 x = " + data.x);
        System.out.println("data 인스턴스 변수 y = " + data.y);
        System.out.println();

        // changeParameter 메서드 의 매개변수에 Data 클래스의 인스턴스 변수를 입력한다.
        System.out.println("입력받은 매개변수의 값을 바꾸는 메서드 수행");
        changeParameter(data.x, data.y);
        System.out.println();

        // changeParameter(data.x, data.y); 여기서의 data.x 와 data.y 는
        // data 의 인스턴스 변수의 값 그자체가 복사되어 넘어갑니다.
        // 따라서 changeParameter 메서드에서 입력받은 매개변수의 값을 바꿔도
        // 영향을 받지 않습니다.
        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수의 값이 변경되었는지 확인");
        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 x = " + data.x);
        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 y = " + data.y);
    }

    static void changeParameter(int x, int y) {
        System.out.println();
        System.out.println("changeParameter 메서드 시작");
        System.out.println("입력 받은 매개변수 x 와 y의 값 확인");
        System.out.println("입력 받은 매개변수 x = " + x);
        System.out.println("입력 받은 매개변수 y = " + y);

        System.out.println();
        System.out.println("입력 받은 매개변수 x 와 y의 값을 변경 한 후 확인");
        x = 100;
        y = 200;
        System.out.println("변경 한 후 x = " + x);
        System.out.println("변경 한 후 y = " + y);
        System.out.println("changeParameter 메서드 끝");
    }
}


// 02) 참조형 매개변수
class Data6_2 {
    Data6_3  data2 = new Data6_3(); // 참조형
}

class Data6_3 {
    int x; // 기본형
    int y; // 기본형
}

class Data6_2Main {
    public static void main(String[] args) {

        Data6_2 data  = new Data6_2();
        data.data2.x = 10;
        data.data2.y = 20;

        System.out.println("Data6_2 클래스로 만든 data 인스턴스의 data2인스턴스의 인스턴스 변수 값 확인");
        System.out.println("참조변수 data2의 인스턴스 변수 x = " + data.data2.x);
        System.out.println("참조변수 data2의 인스턴스 변수 y = " + data.data2.y);
        System.out.println();

        // changeParameter 메서드 의 매개변수에 Data6_2 클래스의 참조형 변수인 data2 를 입력
        System.out.println("입력받은 매개변수의 값을 바꾸는 메서드 수행");
        changeParameter(data.data2);
        System.out.println();

        // changeParameter(Data6_3 data2); 여기서 data.data2 는
        // data 인스턴스의 참조형 변수 data2의 주소값이 넘어 갑니다.
        // 따라서 changeParameter 메서드에서 입력받은 data2의 주소값을 통해
        // data2 의 인스턴스에 접근하여 인스턴스 변수를 바꾸기 때문에 영향을 받습니다.
        System.out.println("Data6_3 클래스로 만든 data 인스턴스의 참조변수 data2의 인스턴스 변수 값이 변경되었는지 확인");
        System.out.println("changeParameter 메서드 수행 후 data2의 인스턴스 변수 x = " + data.data2.x);
        System.out.println("changeParameter 메서드 수행 후 data2의 인스턴스 변수 y = " + data.data2.y);
    }

    static void changeParameter(Data6_3 data2) {
        System.out.println();
        System.out.println("changeParameter 메서드 시작");
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x 와 y의 값 확인");
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x = " + data2.x);
        System.out.println("입력 받은 매개변수 data2의 인스턴스 y = " + data2.y);

        System.out.println();
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x 와 y의 값을 변경 한 후 확인");
        data2.x = 100;
        data2.y = 200;
        System.out.println("변경 한 후 data2의 인스턴스 x = " + data2.x);
        System.out.println("변경 한 후 data2의 인스턴스 y = " + data2.y);
        System.out.println("changeParameter 메서드 끝");
    }
}