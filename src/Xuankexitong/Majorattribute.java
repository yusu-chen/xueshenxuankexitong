package Xuankexitong;

public class Majorattribute {
	String Num;
	String Name;
	String Place;
	String getPlace() {
	return Place;
	  }
	String getNum() {
	return Num;
	  }
	String getName() {
	return Name;
	  }
	String Time;
	String getTime() {
	return Time;
	  }
	String Score;
	String getScore() {
	return Score;
	  }
	public Majorattribute(String name,String num,String place,String time,String score) {
		Name = name;
		Num = num;
		Place = place;
		Time = time;
		Score = score;
		}
	public void setNEW(String name,String num,String place,String time,String score){
		Name = name;
		Num = num;
		Place = place;
		Time = time;
		Score = score;
	}
	public String toString() {
	return"\n"+"     �γ̸�����" + Name
			+"\n"+ "     �γ̱�ţ�" + Num +"\n"+ "     �Ͽεص㣺" + Place+"\n" + "     �γ�ʱ�䣺" + Time + "Сʱ"+"\n"
	+ "     �γ�ѧ�֣�" +  Score + "��" ;
	}
}
