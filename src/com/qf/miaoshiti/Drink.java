package com.qf.miaoshiti;

public class Drink {
	public static void main(String[] args) {
		int n = 50; // ��ʼ��������
		int i = 0; // �һ�����
		while (true) {
			n -= 3; // �� 3 ƿ
			n++; // �һ� 1 ƿ
			i++; // �һ�����+1
			if (n < 3) {
				System.out.println("������" + (50 + i) + "ƿ");
				break;
			}
		}

	}
}
