package com.huawei;

import java.util.ArrayList;
import java.util.Arrays;

//单行注释
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("args = " + Arrays.deepToString(args));
        int num1 = 1;
        System.out.println("num1 = " + num1);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        for (String arg : args) {
            System.out.println(arg);
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println(arg);
        }

        ArrayList nums = new ArrayList();
        nums.add(123);
        nums.add(456);
        for (Object num : nums) {
            System.out.println("HelloWorld.main");
            System.out.println("args = " + Arrays.deepToString(args));
            System.out.println("num = " + num);
            System.out.println(num);
            System.out.println("num = " + num);

        }

        if (nums == null) {

        }

        if (nums != null) {

        }
        if (nums != null) {

        }

        if (nums == null) {

        }
    }



    /*
    * 多行注释
    * */

    private void hello(){
//        String

    }

}
