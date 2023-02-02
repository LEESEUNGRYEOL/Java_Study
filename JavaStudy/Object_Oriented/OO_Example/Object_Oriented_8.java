package Object_Oriented.OO_Example;
// Ex08) 오버로딩


class Overloading8_1 {

    int add(int a, int b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }

//    void add(int a, int b) { // 반환 타입이 다르다고 오버로딩이 성립되지는 않음
//        System.out.println("void add(int a, int b)");
//        System.out.println("a + b = " + a + b);
//    }

    long add(long a, long b) {
        System.out.println("long add(long a, long b)");
        return a + b;
    }

    long add(long a, int b) {
        System.out.println("long add(long a, int b)");
        return a + b;
    }

    long add(int a, long b) {
        System.out.println("long add(int a, long b)");
        return a + b;
    }

}

class Overloading8_1Main {
    public static void main(String[] args) {
        Overloading8_1 test = new Overloading8_1();
        System.out.println(test.add(10, 20));
        System.out.println(test.add(13L, 17L));
        System.out.println(test.add(5L, 10));
        System.out.println(test.add(12, 23L));

        System.out.println();

        // 그런데 이때 위에 int add(int a, int b)  를 주석한다면
        test.add(10, 20); // 여기에 Ambiguous method call Error 가 발생합니다.
        // int, int 는 (long, int) , (int, long) 2개의 메서드 모두 가능하기 때문에 컴퓨터가 하나를
        // 마음대로 선택할 수가 없어서 발생하는 오류입니다.

    }
}
