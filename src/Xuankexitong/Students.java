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
	return"Students(学生信息):  姓名：" + Name
    + "    学号：" + Num + "   性别：" + Sex + "     所选课程：" + a;
	}
	publicvoid setName(String name){
		Name = name;
	}
//自定义set函数，设置修改名字的方法
	publicvoid setCourse(Majorattribute b){
		a = b;
	}

	

}
