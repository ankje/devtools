package com.ankje;

import com.ankje.mybatis.generator.Generator;

public class Entrance {
    public static void main(String[] args){
        Generator generator = new Generator();
        generator.run();
        System.out.println("==========done==========");
    }
}
