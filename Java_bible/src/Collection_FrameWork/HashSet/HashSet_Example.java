package Collection_FrameWork.HashSet;
import java.util.*;


// 1. 생성
class Example1{
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        HashSet <Integer> set = new HashSet<>();
        for(int i: nums)
        {
            set.add(i);
        }
        System.out.println("set = " + set);
   }
}

