package com.company;

import A001_���һ����getMin���ܵ�ջ.MyStack1;

public class Main {


    public static void main(String[] args) {
	// write your code here
        MyStack1 sk = new MyStack1();
        for (int i=0;i<6;i++) {
            sk.push(i);
        }
        System.out.println("ddddddddddddd");
        System.out.println(sk);
        System.out.println(sk.getMin());

    }
}
