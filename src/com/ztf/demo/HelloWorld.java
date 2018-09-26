package com.ztf.demo;

import sun.security.x509.AVA;

public class HelloWorld {
    public static  void main(String[] args){
        int temp1 = 100;
        int temp2 = 50;
        int temp3 = addNum(temp1, temp2);
        //region Description
        System.out.print("result：tmep3 = " + temp3 + ", ");
        System.out.print("result：tmep3 = " + temp2 + ", ");
        System.out.print("result：tmep3 = " + temp1 + ", ");

        //endregion
    }
    public static Integer addNum(Integer temp1, Integer temp2){
        int temp3 = temp1 + temp2;
        return temp3;

    }

}
