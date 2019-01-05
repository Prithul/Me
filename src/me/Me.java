package me;

public class Me {

    String sign;

    public Me(){}
    public Me(String sign){

        this.sign = sign;
    }
    public static void main(String[] args) {

        System.out.println("Exhausted!");
        System.out.println("ZZZ!!");
        System.out.println("Good Night!!!");

        System.out.println("Life Sucks");

        Me me = new Me(" :-) ");
        me.howIsLife(" :-( ");
    }

    void howIsLife(String str){

        String s = str;
        System.out.println("How is Life ?  " + sign);
        System.out.println("How is Life ? " + s);
    }
}
