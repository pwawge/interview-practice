package com.practice.version8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;


public class JavaForEach{

  public static void main(String[] args){
      List<Integer> numberList = new ArrayList<Integer>();
      for(int i=0;i<=10;i++){
        numberList.add(i);
      }
      System.out.println("Iterator");

      Iterator listIterator = numberList.iterator();
      while(listIterator.hasNext()){
        Integer i = (Integer) listIterator.next();
        System.out.println("number "+i);  
      }

      System.out.println("forEach");
      
      numberList.forEach(new Consumer<Integer>(){
        public void accept(Integer t){
          System.out.println("number "+t);
          
        }
      });

      System.out.println("Using Interface ");
      MyConsumer action = new MyConsumer();
      numberList.forEach(action);
     
  }
  
}

class MyConsumer implements Consumer<Integer>{
  
  public void accept(Integer t){
    System.out.println("number "+t);
    
  }
  
}