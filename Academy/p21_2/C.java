package p21_2;

import p21_1.A;

public class C {
A a = new A(); //AŬ������ ���� ��ü�� ��
//The constructor A() is not visible
//�����ڰ� ����ִ�. �Ⱥ��δ�.
//A������ �տ� protected��� ���ֱ� ����

a.field = "value";
a.method();
}
