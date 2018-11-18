package com.practice.others;

import java.util.HashMap;
import java.util.Map;

public class HashMAPP {

	public static void main(String[] args) {
		Map<String,String> has=new HashMap<>();
		has.put("Hello","ASA");
		for(Map.Entry<String, String> keyValue : has.entrySet()){
			System.out.println(keyValue.getKey()+" "+keyValue.getValue());
		}
		has.put("Hello","AfA");
		for(Map.Entry<String, String> keyValue : has.entrySet()){
			System.out.println(keyValue.getKey()+" "+keyValue.getValue());
		}
		has.put("Hello","ADA");
		
		for(Map.Entry<String, String> keyValue : has.entrySet()){
			System.out.println(keyValue.getKey()+" "+keyValue.getValue());
		}
	}

}
