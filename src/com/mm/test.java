package com.mm;

import com.li.HelloWorldImpl;
import com.lichunchuan.HelloWorld;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.FilterGenerator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Filter;


public class test {
    @Test
    public void testJdkProxy(){
//        JDKProxyExample jdk=new JDKProxyExample();
//        //绑定关系，因为挂在接口helloworld下，所以声明helloworld proxy,bind方法内的target对象就是helloworldimpl
//        HelloWorld proxy=(HelloWorld) jdk.bind(new HelloWorldImpl());
//        proxy.sayHelloWorld();
//        for(int i=1; i<=9;i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(i+" * "+j+ " = "+(i*j) +" ");
//            }
//            System.out.println();
//        }
//        ArrayList<Integer> list=new ArrayList<Integer>();
//        list.add();
        List<String> stringList = Arrays.asList("1", "2", "3","4","5","6","7","8","9","10");
        ArrayList<String> otherList=new ArrayList<String>();
        otherList.addAll(stringList);
        System.out.println(otherList);
        for(int i=1;i<10;i++){
            if(i%5==0){
                otherList.remove(i);
//                System.out.println(i);
            }else{
                System.out.println("null");
            }
        }

    }
}
