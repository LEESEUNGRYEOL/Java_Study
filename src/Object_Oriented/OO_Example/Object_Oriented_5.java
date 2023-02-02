package Object_Oriented.OO_Example;
// Ex05) 메서드


// 1) 메서드 호출하는 방법
class Method5_1 {
    int add(int x, int y) {
        int result = x + y;
        return result; // 값을 반환
    }
}

class Method5_1Main {
    public static void main(String[] args) {
        Method5_1 method = new Method5_1(); // Method5_1 클래스에 만든 메서드 add 를 사용하기 위해 객체 생성

        int result = method.add(3, 5); // add 메서드를 사용해서 입력한 값(3,5)으로 처리된 값을 반환받아 result 변수에 저장
        System.out.println("result = " + result);
    }
}


// 2) Return 예제 연습하는 방법
class Method5_2 {
    void gugudan(int dan) {
        if (!(dan >= 2 && dan <= 9)) {
            System.out.println(dan + "단은 없습니다.");
            return;
        }
        System.out.println(dan + "단 시작!");
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "*" + i + " = " + dan * i);
        }
        System.out.println();
    }

    boolean checkMax(int x, int y) {
        if (x > y) {
            return true;
        } else {
            return false;
            // return 반드시 필요합니다. 만약 없으면 조건문이 false 일 경우, void 가 아닌데 return 문이 없음으로 Error
        }
    }

}

class Method5_2Main {
    public static void main(String[] args) {
        Method5_2 method = new Method5_2();

        method.gugudan(2);
        method.gugudan(5);
        method.gugudan(10);
        method.gugudan(9);

        System.out.println("method.checkMax(10, 8) = " + method.checkMax(10, 8));
        System.out.println("method.checkMax(5, 9) = " + method.checkMax(5, 9));
    }
}


// 3) 메서드는 문장들의 묶음이다.

class Time5_1 {
    int hour;
    int minute;
    int second;
}

class Method5_3 {
    static void initObj(Time5_1 time, int hour, int minute, int second) {
        time.hour = hour;
        time.minute = minute;
        time.second = second;
    }
}

class Method5_3Main {
    public static void main(String[] args) {
        Time5_1 t1 = new Time5_1();
        t1.hour = 100;
        t1.minute = 20;
        t1.second = 43;

        Time5_1 t2 = new Time5_1();
        t2.hour = 22;
        t2.minute = 30;
        t2.second = 23;

        Time5_1 t3 = new Time5_1();
        t3.hour = 45;
        t3.minute = 40;
        t3.second = 52;

        System.out.println("t1.hour = " + t1.hour);
        System.out.println("t2.hour = " + t2.hour);
        System.out.println("t3.hour = " + t3.hour);
        System.out.println();

        // 하나하나 인스턴스를 만들고 위처럼 인스턴스 변수를 초기화 하려니 매우 귀찮지 않나요?
        // 물론 '생성자' 라는 개념이 뒤에 나오지만 일단은 메서드를 사용하여 코드의 수를 확 줄여 보겠습니다.

        Time5_1 t4 = new Time5_1();
        Time5_1 t5 = new Time5_1();
        Time5_1 t6 = new Time5_1();

        Method5_3.initObj(t4, 100, 20, 43);
        Method5_3.initObj(t5, 22, 30, 23);
        Method5_3.initObj(t6, 45, 40, 52);

        System.out.println("t4.hour = " + t4.hour);
        System.out.println("t5.hour = " + t5.hour);
        System.out.println("t6.hour = " + t6.hour);

        // 이처럼 메서드를 사용하니 코드의 수가 굉장히 많이 줄어 가독성이 좋아졌습니다.
    }
}

// 4) 호출스택
class CallStack5_1 {

    static void firstMethod() {
        System.out.println("firstMethod()");
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod()");
        thirdMethod();
    }

    static void thirdMethod() {
        System.out.println("thirdMethod()");
        finalMethod();
    }

    static void finalMethod(){
        System.out.println("finalMethod()");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}
class CallStack5_2 {

    static void firstMethod() {
        secondMethod();
        System.out.println("firstMethod()");
    }

    static void secondMethod() {
        thirdMethod();
        System.out.println("secondMethod()");
    }

    static void thirdMethod() {
        finalMethod();
        System.out.println("thirdMethod()");
    }

    static void finalMethod(){
        System.out.println("finalMethod()");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}