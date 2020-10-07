package com.liming.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHashMap1 {
  public static void main(String[] args) {
    Map<String,String> stu1Map = new HashMap<String,String>();
    Map<String, Map> stuMap = new HashMap<String, Map>();
    stu1Map.put("yuwen", "80");
    stu1Map.put("shuxue", "180");
    stu1Map.put("lishi", "712");
    Map<String,String> stu2Map = new HashMap<String,String>();
    stu2Map.put("yuwen", "810");
    stu2Map.put("shuxue", "380");
    stu2Map.put("lishi", "722");
    Map<String,String> stu3Map = new HashMap<String,String>();
    stu3Map.put("yuwen", "380");
    stu3Map.put("shuxue", "580");
    stu3Map.put("lishi", "722");
    Map<String,String> stu4Map = new HashMap<String,String>();
    stu4Map.put("yuwen", "810");
    stu4Map.put("shuxue", "830");
    stu4Map.put("lishi", "724");
    Map<String,String> stu5Map = new HashMap<String,String>();
    stu5Map.put("yuwen", "805");
    stu5Map.put("shuxue", "860");
    stu5Map.put("lishi", "728");
    stuMap.put("zhang1", stu1Map);
    stuMap.put("zhang2", stu2Map);
    stuMap.put("zhang3", stu3Map);
    stuMap.put("zhang4", stu4Map);
    stuMap.put("zhang5", stu5Map);
    stuMap.forEach((key, value)->{
      System.out.printf(key+""+value);
    });
//    System.out.println(""+stuMap);
    List<Map<String, String>> list = new ArrayList<Map<String, String>>();
    list.add(stu1Map);
    list.add(stu2Map);
    list.add(stu3Map);
    list.add(stu4Map);
    list.add(stu5Map);
//    System.out.println(""+list);

  }
}
