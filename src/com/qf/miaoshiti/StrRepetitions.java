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

	// ȥ��������Ľ���
	public String[] StringIntersection(String[] arr1, String[] arr2) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		List<String> list = new LinkedList<String>();
		// ȡ�� str1 �����ֵ��ŵ� map �����У���ֵ��Ϊ key�����Ե� value ������Ϊ false
		for (String str1 : arr1) {
			if (!map.containsKey(str1)) {
				map.put(str1, Boolean.FALSE);
			}
		}
		// ȡ�� str2 �����ֵѭ���ж��Ƿ����ظ��� key������оͽ� value ����Ϊ true
		for (String str2 : arr2) {
			if (map.containsKey(str2)) {
				map.put(str2, Boolean.TRUE);
			}
		}
		// ȡ�� map ������ value Ϊ true �� key ֵ����ŵ� list ��
		for (Map.Entry<String, Boolean> entry : map.entrySet()) {
			if (entry.getValue().equals(Boolean.TRUE)) {
				list.add(entry.getKey());
			}
		}
		// ���� String ����洢����
		String[] result = {};
		return list.toArray(result);

	}
}
