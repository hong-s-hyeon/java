package com.lec.java.inherit06;

import com.lec.java.inherit05.Test01;

public class Test02 extends Test01 {
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(protectedNum);
        System.out.println(publicNum);
        System.out.println(super.publicNum);
//        System.out.println(super.defaultNum);
    }
} // end class Test02












