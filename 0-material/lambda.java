package com.emotional.study;

public class LambdaDemo1 {

    interface Printer{
        void Printer(String val);
    }

    public void printSomething(String something, Printer printer){

        printer.Printer(something);

    }

    public static void main(String[] args) {
        LambdaDemo1 lambdaDemo1 = new LambdaDemo1();
        String some = "sdsdsdsd";

//        Printer printer = new Printer() {
//            @Override
//            public void Printer(String val) {
//                System.out.printf("======" + val);
//            }
//        };

//        Printer printer = (String val) -> {
//            System.out.println(val);
//        };
//
//        Printer printer2 = (val) -> {
//            System.out.println(val);
//        };
//
//        Printer printer0 = val -> {
//            System.out.println(val);
//        };
//
//        Printer printer1 = val -> System.out.println(val);
//       测试中，哈哈哈哈，主板和自大打发打发打发跌幅达
//       123343434
//       we are family 
//       nuisance 啊发放大镜安抚，对面的傻叉好烦人，傻叉叉

        lambdaDemo1.printSomething(some, val -> System.out.println(val));
    }

}
