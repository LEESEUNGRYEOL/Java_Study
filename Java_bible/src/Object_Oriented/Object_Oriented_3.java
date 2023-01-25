package Object_Oriented;

// Ex3) 클래스의 정의

// 1) 클래스를 사용하지 않고 관리했을 경우
class NoneClassTime {
    public static void main(String[] args) {
        // 총 3명 의 시간을 변수로 관리
        int hour1, hour2, hour3;
        int minute1, minute2, minute3;
        int second1, second2, second3;

        // 총 3명 의 시간을 배열로 관리
        int[] hour = new int[3];
        int[] minute = new int[3];
        int[] second = new int[3];
    }
}

// 2) 클래스를 사용해서 관리했을 경우
class Time3_1 {
    int hour;
    int minute;
    int second;
}
class Time3_1Main {
    public static void main(String[] args) {
        // 총 3명 의 시간을 객체로 관리
        Time3_1 t1 = new Time3_1();
        Time3_1 t2 = new Time3_1();
        Time3_1 t3 = new Time3_1();

        // 총 3명 의 시간을 객체 배열로 관리
        Time3_1[] timeArr = new Time3_1[3];
        timeArr[0] = new Time3_1();
        timeArr[1] = new Time3_1();
        timeArr[2] = new Time3_1();
    }
}