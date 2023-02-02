package Collection_FrameWork.ArrayList.ArrayList_Method;

// Collection_FrameWork.ArrayList 의 메소드

import java.util.ArrayList;

// 01) add 메서드: 리스트에 값을 추가하는 메서드.
class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();

        // case1. 삽입할 위치를 지정해주지 않았을때.
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        // case2. 삽입할 위치를 지정해주었을때.
        pitches.add(0, "133");//
    }
}


// 02) get 메서드: 특정한 인덱스의 값을 추출할때 사용.

class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        // case1. 삽입할 위치를 지정해주지 않았을때.
        pitches.add("138");

        // case2. 삽입할 위치를 지정해주었을때.
        pitches.add(0, "133");
        System.out.println(pitches.get(1));
    }
}

// 03) size 메서드: ArrayList의 갯수를 리턴하는 메서드

class ArrayList_3 {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        // add 메서드
        pitches.add("138");
        pitches.add(0, "133");
        // get 메서드
        System.out.println(pitches.get(1));
        // size 메서드
        System.out.println(pitches.size());

    }
}

// 04) contains 메서드: 리스트안에 해당항목이 있는지를 판별해서 그 결과를 리턴
class ArrayList_4 {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        // add 메서드
        pitches.add("138");
        pitches.add(0, "133");
        // get 메서드
        System.out.println(pitches.get(1));
        // size 메서드
        System.out.println(pitches.size());

        // contains 메서드
        System.out.println(pitches.contains("142"));
    }
}

// 05) remove 메서드: 2가지의 방법이 있다. 이름은 같지만 파라미터가 다르다.
// 1. remove (객체), 2. remove (인덱스)

class ArrayList_5 {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        //테 add 메서드
        pitches.add("138");
        pitches.add(0, "133");
        // get 메서드
        System.out.println(pitches.get(1));
        // size 메서드
        System.out.println(pitches.size());

        // contains 메서드
        System.out.println(pitches.contains("142"));
    }
}