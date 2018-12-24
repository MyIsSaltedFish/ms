package com.qf.miaoshiti;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class StrRepetitions {

	@Test
	public void test() {
		String[] arr1 = { "112", "wqw", "2121" };
		String[] arr2 = { "112", "aad", "ewqw" };
		String[] result = StringIntersection(arr1,arr2);
		for (String string : result) {
			System.out.println(string);
		}
	}

	// 去两个数组的交集
	public String[] StringIntersection(String[] arr1, String[] arr2) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		List<String> list = new LinkedList<String>();
		// 取出 str1 数组的值存放到 map 集合中，将值作为 key，所以的 value 都设置为 false
		for (String str1 : arr1) {
			if (!map.containsKey(str1)) {
				map.put(str1, Boolean.FALSE);
			}
		}
		// 取出 str2 数组的值循环判断是否有重复的 key，如果有就将 value 设置为 true
		for (String str2 : arr2) {
			if (map.containsKey(str2)) {
				map.put(str2, Boolean.TRUE);
			}
		}
		// 取出 map 中所有 value 为 true 的 key 值，存放到 list 中
		for (Map.Entry<String, Boolean> entry : map.entrySet()) {
			if (entry.getValue().equals(Boolean.TRUE)) {
				list.add(entry.getKey());
			}
		}
		// 声明 String 数组存储交集
		String[] result = {};
		return list.toArray(result);

	}
}
