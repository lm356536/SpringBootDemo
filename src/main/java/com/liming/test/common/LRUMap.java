package com.liming.test.common;

import java.util.LinkedHashMap;
import java.util.Map;

public class  LRUMap<K, V> extends LinkedHashMap<K, V> {
  private int maxSize;
  public LRUMap(int maxSize){
    super(16, 0.75f, true);
    this.maxSize = maxSize;
  }
  @Override
  protected  boolean removeEldestEntry(Map.Entry eldest){
    return  size() > this.maxSize;
  }

}
