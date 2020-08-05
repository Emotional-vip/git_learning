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

        lambdaDemo1.printSomething(some, val -> System.out.println(val));
    }

}
