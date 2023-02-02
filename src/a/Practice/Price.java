package a.Practice;

import java.util.HashSet;
import java.util.List;

class My_price {
    // iv 선언
    int income;
    int count;
    // cv 선언
    public static int total_income = 0;

    // 생성자
    My_price() {
        income = 0;
        count = 0;
    }

    public void setTotal_income(int new_income) {
        My_price.total_income += new_income;
    }

    // 총 이득값 반환
    public int getTotal_income() {
        return total_income;
    }

    // 총 이득값 업데이트


}


class Marketing{
    // total Price 요구
    int p;
    Marketing()
    {
        this.p = My_price.total_income;
    }

}


public class Price {

    public static void main(String[] args) {
        // 객체를 선언하고 공간까지 만든거
        My_price p1 = new My_price();
        My_price p2 = new My_price();

        // p1 인스턴스 객체에 이득이 생겨서 income 증가
        p1.income = 200;

        // 총 이득에도 여거를 더하고싶다.
        //My_price.total_income += p1.income;
        p1.setTotal_income(p1.income);

        // p2 인스턴스 객체에 이득이 생겨서 income 증가
        p2.income = 300;

        // 총 이득에도 여거를 더하고싶다.
        // My_price.total_income += p2.income;
        p1.setTotal_income(p1.income);


        // 구하고 싶은거? => total 이득이 얼마인가?


        // 참조변수를 통해서 getTotal_price 를 불러오는 건데
        // 아까 말씀하셨다 시피, 만약 static 이였다면,

        // static 멤버를 쓰고싶다.
        // 저 Instatnce method 토탈1 을 쓰는 대신에
        // My_price.total_price
        //My_price

        //총 수입 출력해줘

        // Class 에 직접 침투는 위험함으로 그냥 메서드를 통해서 불러온다.
        System.out.println(My_price.total_income);
        System.out.println(p1.getTotal_income());


    }

}



// set 개념
class Solution2 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;


        String[] s3 = new String[]{"a","b","c","a"};
        HashSet<String> set = new HashSet<>(List.of(s3));
        System.out.println(set);


        for (String string : s2) {
            if (set.contains(string))
                answer++;
        }

        return answer;
    }
}