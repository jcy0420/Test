package com.atguigu.java;

import java.util.ArrayList;

/**
 * @author jcy
 * @data 2021/1/4 - 20:39
 * idea中代碼模板所在的位置settings-Editor-live templates/postfix Complates
 * 2.常用的模板
 */
public class TemplatesTest {
    //模板6：prsf可以生成private static final
    //模板7：psfi可以生成public static final int  = ;
    /*
    *haha
    */
    private int num = 10;
    /*
    *hehe
    */
    private String username;

    //模板1：psvm
    public static void main(String[] args) {
        //模板2：sout
        System.out.println();
        int num1 = 10;
        int num2 = 20;
        //soutv 显示的是就近的那个变量
        System.out.println("num2 = " + num2);
        //模板3：fori
        String[] arr = new String[]{"tom", "jerry", "hanmeimei", "lilei"};
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
//变形iter,增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
//模板4:list.for
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(13);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形 list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
        }
        //变形 list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list);
        }
        
    }
}
