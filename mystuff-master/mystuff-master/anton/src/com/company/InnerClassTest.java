package com.company;

public class InnerClassTest {
    static class OuterClass {
        int x = 10;

        class InnerClass {
            public int myInnerMethod() {
                int x = 5;
                return x;
            }
        }
    }
    public static void main(String args[]) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        //System.out.println(myInner.myInnerMethod());
        //System.out.println(myOuter.x);
            int num=102; // int number
            while (num > 0) {

                System.out.println( num % 10);

                num = num / 10;

            }

        }
    }