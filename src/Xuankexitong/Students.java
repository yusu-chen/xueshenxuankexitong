package Xuankexitong;

public class Students extends father{

	Majorattribute a ;
	Majorattribute major;
	public Students(String name,String num,String sex,Majorattribute a) {
		Name = name;
		Num = num;
		Sex = sex;
		major = a;

		}

	public String toString() {
	return"Students(ѧ����Ϣ):  ������" + Name
    + "    ѧ�ţ�" + Num + "   �Ա�" + Sex + "     ��ѡ�γ̣�" + a;
	}
	publicvoid setName(String name){
		Name = name;
	}
//�Զ���set�����������޸����ֵķ���
	publicvoid setCourse(Majorattribute b){
		a = b;
	}

	

}
