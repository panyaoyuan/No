package com.test;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;


 class A{	  
}

class B extends A{
	
}


public class C {
	

	static Logger logger = Logger.getLogger(C.class.getName());  
	
	/**
	 * @author pyy
	 * @date 2016年9月29日
	 * @param args
	 */
	public static void main(String[] args) {

//		   System.out.println(B.LF("10"));
//			System.out.println(B.SOL("10"));
//			System.out.println(B.SOL(B.LF("10")));
		Set<Integer> l = new HashSet<Integer>();
		for(int i = 0;i<1000;i++){
			l.add((int)(Math.random()*100+1));
		}
	String type = null;
	if(type==null){
		double a = 1;
		double b = 10;
		System.out.println(a/b);
		List<String> resuleList = new ArrayList<String>();
		resuleList.add("0.05");
		resuleList.add("0");
		System.out.println(l);
		logger.setLevel(Level.ALL);
		logger.info("ssss");
	}
	   	 long start1 = System.currentTimeMillis();
	   	 for(int i = 0;i<1000;i++){
	   		 for(int j =0;j<5;j++){
	   			 System.out.println(System.class.getClass());
	   		 }
	   	 }
	   	 	long end1 = System.currentTimeMillis();
	   	 long start2 = System.currentTimeMillis();
	   	 for(int i = 0;i<5;i++){
	   		 for(int j =0;j<1000;j++){
	   			 System.out.println(System.class.getClass());
	   		 }
	   	 }
	   	 	long end2 = System.currentTimeMillis();
	  System.out.println(end1-start1);
	  System.out.println(end2-start2);
	
	 System.out.println(Double.parseDouble("068")==Double.parseDouble("058"));
	 float a = 4.6f;
	 System.out.println( a);
	 System.out.println(12.5%1+"sssssssssssss");
	 System.out.println(1-0.9);
	 	}

		
		

	}
 class Test{
	void test(){}
}
	
	
        
	

