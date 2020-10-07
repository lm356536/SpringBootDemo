package com.liming.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHashMap {
  public static void main(String[] args) {
    Map map1 = inputMap();
    //    System.out.println(map1);
    showMap1(map1);
    showMap2(map1);
    showMap3(map1);
    showMap4(map1);
  }
  // keySet遍历 先获取 key ,再通过 key 获取 value
  public  static void  showMap1(Map<String, Integer> userMap){
    Long start = System.currentTimeMillis();
    Integer value;
    for(String key:userMap.keySet()){
//      System.out.println(key+"*****"+userMap.get(key));
      value = userMap.get(key);
    }
    Long end = System.currentTimeMillis();
    System.out.println("keySet遍历:" + (end-start));
  }
  // values遍历 只获取 value
  public static  void  showMap2(Map<String, Integer> userMap){
    Long start = System.currentTimeMillis();
    Integer value;
    for(Integer val:userMap.values()){
//      System.out.println(val);
      value = val;
    }
    Long end = System.currentTimeMillis();
    System.out.println("values遍历:" + (end-start));
  }
  // entrySet遍历, 获取每个 entry
  public static  void  showMap3(Map<String, Integer> userMap){
    Long start = System.currentTimeMillis();
    Integer value;
    for(Map.Entry<String, Integer> entry:userMap.entrySet()){
//      System.out.println(entry.getKey()+"---"+entry.getValue());
      value = entry.getValue();
    }
    Long end = System.currentTimeMillis();
    System.out.println("entrySet遍历:" + (end-start));
  }
  // Iterator遍历, 获取每个 entry
  public static  void  showMap4(Map<String, Integer> userMap){
    Long start = System.currentTimeMillis();
    Integer value;
    Iterator<Map.Entry<String, Integer>> iter = userMap.entrySet().iterator();
    while (iter.hasNext()){
      Map.Entry<String, Integer> entry = iter.next();
      value = entry.getValue();
//      System.out.println("Iterator:-----"+entry);
    }
    Long end = System.currentTimeMillis();
    System.out.println("Iterator遍历:" + (end-start));
  }
  public  static  Map inputMap() {
    Map<String,Integer> userMap = new HashMap<String, Integer>();
    String str[] = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j","k", "l"};
    String key;
    Integer value;
    for (int i = 0; i <=500000; i++){
      int m = (int)(Math.random()*10);
      key = String.valueOf(str[m]+i*100);
      value = i;
      userMap.put(key,value);
    }
    return  userMap;
  }
}
