package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.io.File;
import java.lang.reflect.Method;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.sax.SAXResult;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;




public class TestClassLoad {
	 public static void main(String[] args) throws Exception {
       
         System.out.println(sss.class.getDeclaredMethods()[0]);
         System.out.println(sss.class.getDeclaredFields()[0]);
      sss.class.getMethod("foo", String.class).invoke(sss.class.newInstance(),"啊");
      //sss a =  (sss) Class.forName("sss").newInstance();   
      sss s = new sss();
      s.foo("啊");
      	 File file = new File("xsss.xml");
	     DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 
	     DocumentBuilder db = dbf.newDocumentBuilder();
	     Document doc = db.parse(file);
	     org.w3c.dom.Element e = doc.getDocumentElement();
	     System.out.println(e.getChildNodes());
	     NodeList nod = doc.getElementsByTagName("value");
	     for(int i=0;i<nod.getLength();i++){
	    	 System.out.println(nod.item(i).getTextContent());
	    	 System.out.println(nod.item(i).getChildNodes());
	    	 System.out.println(nod.item(i).getNodeName());
	    	 System.out.println(nod.item(i).getNodeValue());
	     }
           }
	 }

 class sss{
	 int a;
	 public void foo(String name) {
	  System.out.println("s"+name);
		   
	  }
}


