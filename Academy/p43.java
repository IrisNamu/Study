import java.util.StringTokenizer;

public class p43 {
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		
		// '/'�������͸� �̿��ؼ� �ڸ�
		StringTokenizer st = new StringTokenizer(text, "/"); 
		
		//countTokens ��ū�� ������ ���� ��������.
		int countTokens = st.countTokens();
		
		//���� ����Ű�� �ִ� ���ڿ� 'ȫ�浿'��½�Ű�� �ݺ��ؼ� nextToken�� ȣ��
       //�̹����� '�̼�ȫ'�̶�� ��Ʈ��Ÿ���� �������� ȣ��. nextToken ȣ��..�ݺ�.. 
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken(); //nextToken ���� ��ū�� ����Ų��.
			System.out.println(token);
		}
		
		System.out.println();

		st = new StringTokenizer(text, "/"); 
		
		//������ T...������ F 
		//'/'�� ������ Ʈ�� �߶��ش�. F�� �׳� ���
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
