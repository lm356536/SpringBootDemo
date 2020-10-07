package com.liming.test;

import com.liming.test.common.LRUMap;

import java.util.Map;

public class TestLinkedHashMap {
  public static void main(String[] args) {
    Map<String, String> LRU = new LRUMap<String, String>(3);
    LRU.put("x1","00");
    LRU.put("x2","00");
    LRU.put("x3","00");
    LRU.put("x4","00");
    LRU.put("x5","00");
    System.out.println(LRU);
  }
}
