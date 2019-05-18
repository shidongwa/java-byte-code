package com.stone.bytecode;

/**
 * @Description:
 * 参考：https://blog.csdn.net/boling_cavalry/article/details/76384425
 * @author: donghua
 * @date: 2019-05-17
 */
public class ByteCodeTest implements Action {

    private int add(int a, int b){
        return a+b;
    }

    public String getValue(int a, int b){
        return String.valueOf(add(a,b));
    }

    public static void output(String str){
        System.out.println(str);
    }

    @Override
    public void doAction() {
        System.out.println("123");
    }

    public static void main(String[] args){
        ByteCodeTest t = new ByteCodeTest();
        Action a = t;
        String str = t.getValue(1,2);
        t.output(str);
        t.doAction();
        a.doAction();
    }

    public void createThread(){
        Runnable r = () -> System.out.println("123");
    }
}
