package Object_Oriented.OO_Example;
// Ex 12) 상속

// 01) 자손은 조상의 모든 멤버를 상속받는 예제
class Point {
    int x = 10;
    int y = 20;
}

class Point3D extends Point {
    int z = 30;
}

class PointEx1 {
    public static void main(String[] args) {
        Point point = new Point();
        Point3D point3D = new Point3D();

        System.out.println("point.x = " + point.x);
        System.out.println("point.y = " + point.y + "\n");

        System.out.println("point3D.x = " + point3D.x);
        System.out.println("point3D.y = " + point3D.y);
        System.out.println("point3D.z = " + point3D.z);

        // 조상의 멤버를 상속받아 Point3D 클래스에 자동으로 Point의 멤버변수가 추가됩니다.
    }
}

// 02) 조상의 변경은 자손에게 영향을 미치지만, 자손의 변경은 조상에게 영향을 미치지않음.
class Point2 {
    int x = 10;
}

class myPoint3D extends Point2 {
    int z = 30;
}


class PointEx2 {
    public static void main(String[] args) {
        Point point = new Point();
        myPoint3D point3D = new myPoint3D();

        System.out.println("point.x = " + point.x);
        System.out.println("point.y = " + point.y + "\n");

        System.out.println("point3D.x = " + point3D.x);
        // System.out.println("point3D.y = " + point3D.y); // 에러 (자손의변경!)
        System.out.println("point3D.z = " + point3D.z);

        // 조상 클래스인 Point 클래스의 멤버변수 y가 없어지면서 Point3D 클래스에서도 멤버변수 y를 사용할 수 없게 되었습니다.
    }
}


// 03) 포함관계
class Engine {}
class Door {}
class Car {
    Engine engine = new Engine();
    Door[] doors = new Door[4]; // 자동차 문 4개, Door 클래스 하나로 문 4개 생성
}

// 04) 관계 결정
class Point3 {int x,y;}

// 포함관계 설정...
class Circle2 { // 원은 점을 가지고 있다.
    Point3 point = new Point3();
    int r;
}

// 상속관계 설정..
class Circle3 extends Point3 { // 원은 점이다.
    int r;
}

// 05) 단일 상속