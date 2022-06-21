package study;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now)); // Console : 2022-06-21
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println(sdf.format(now)); // Console :2022�� 06�� 21��
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now)); // Console : 2022.06.21 ���� 10:55:21
		
		sdf = new SimpleDateFormat("������ E����");
		System.out.println(sdf.format(now)); // Console : ������ ȭ����
		
		sdf = new SimpleDateFormat("������ D��° ��");
		System.out.println(sdf.format(now)); // Console : ������ 172��° ��
		
		sdf = new SimpleDateFormat("�� ���� d��° ��");
		System.out.println(sdf.format(now)); // Console : �� ���� 21��° ��
		

	}

}
