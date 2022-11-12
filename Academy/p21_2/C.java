package p21_2;

import p21_1.A;

public class C {
A a = new A(); //A클래스의 존재 자체를 모름
//The constructor A() is not visible
//생성자가 비어있다. 안보인다.
//A생성자 앞에 protected라고 써있기 때문

a.field = "value";
a.method();
}
