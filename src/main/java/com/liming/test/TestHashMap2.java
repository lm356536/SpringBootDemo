package com.liming.test;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap2 {
  public static void main(String[] args) {
  Long sum = 0L;
  for(int i=0; i<10; i++){
    sum+= new TestHashMap2().inputMap1(10000, 0.75f);
  }
  System.out.println("sum:"+sum/10);
  }
  public Long inputMap1(int initialCapatity, float loadFactor){
    String key, value;
    Map<String, String> map1 = new HashMap<String,String>(initialCapatity, loadFactor);
   Long start =  System.nanoTime();
    for (int i = 0; i < 10000; i++){
      key=String.valueOf(i);
      value = "value";
      map1.put(key,value);
    }
    Long end = System.nanoTime();
    Long time = end -start;
    System.out.println("time:"+time);
    return  time;
  }
}
