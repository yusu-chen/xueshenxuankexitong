package Xuankexitong ;
import  Xuankexitong.*;
import java.io.*;
import java.util.*;
import java.util.List;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener{

	Majorattribute majorattribute;

	Container c;
	JLabel label1;JLabel label2;JLabel label3;JLabel label4,label5;JLabel label6;
	JLabel label7;JLabel label8;JLabel label9;JLabel label10,label11;JLabel label12;JLabel label13;

	JButton button1,button2;
	JButton button3,button4;
	TextArea ta1,ta2;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	CheckboxGroup cbg;
	JComboBox b1;JComboBox b2;JComboBox b3;JComboBox b4;JComboBox b5;
	JCheckBox c1,c2,c3;
	String year[]={"1998��","1999��","2000��","2001��"};
	String month[]={"1��","2��","3��","4��","5��","6��","1��",
			"7��","8��","9��","10��","11��","12��"};
	String day[]={"1��","2��","3��","4��","5��","6��","7��","8��","9��",
			"10��","11��","12��","13��",
			"14��","15��","16��","17��",
			"18��","19��","20��","21��",
			"22��","23��","24��","25��",
			"26��","27��","28��","29��",
			"30��","31��"};
	String time[]={"0.5","1.0","1.5","2.0","2.5","3.0"};
	String score[]={"0.5","1.0","1.5","2.0","2.5","3.0",
			"3.5","4.0","4.5","5.0","5.5","6.0"};

	public Gui(){
		super("ѡ��ϵͳ");
		label1=new JLabel("�����������Ϣ����ѡ�γ̣���ɺ󵥻�ȷ����           ");
		label7=new JLabel("�����뿪��Ŀγ̺���Ϣ����ɺ󵥻�ȷ����        ");
		b1=new JComboBox(year);
		b2=new JComboBox(month);
		b3=new JComboBox(day);
		b4=new JComboBox(time);
		b5=new JComboBox(score);
		label2=new JLabel("ѧ��������");
		label8=new JLabel("��ʦ������");
		label3=new JLabel("�Ա�:");
		cbg = new CheckboxGroup(); 
		label9=new JLabel("�γ����ƣ�");
		label6=new JLabel("ѧ�ţ�");
		label4=new JLabel("���գ�");
		label10=new JLabel("�γ̱�ţ�");
		label5=new JLabel("�γ̣�");
		label11=new JLabel("�Ͽεص㣺");
		label12=new JLabel("��ʱ��");
		label13=new JLabel("ѧ�֣�");

		c1=new JCheckBox("�ߴ�");
		c2=new JCheckBox("����");
		c3=new JCheckBox("Java");
		ta1=new TextArea(17,35);
		ta2=new TextArea(17,35);
		button1=new JButton("ȷ��");
		button2=new JButton("ȡ��");
		button3=new JButton("ȷ��");
		button4=new JButton("ȡ��");
		t1=new JTextField("",5);
		t2=new JTextField("",10);
		t3=new JTextField("",5);
		t4=new JTextField("",5);
		t5=new JTextField("",5);
		t6=new JTextField("",5);
		t7=new JTextField("",5);
		t8=new JTextField("",5);
		setBounds(600,300,625,620);
		try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e){}
		c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		c.add(label1);
		c.add(label7);
		c.add(label2);
		c.add(t1);
		c.add(label3);
		c.add(new Checkbox("��", cbg, true)); 
		c.add(new Checkbox("Ů", cbg, false));
		c.add(new JLabel("           "));
		c.add(label8);
		c.add(t3);
		c.add(new JLabel("                          "));
		c.add(label6);
		c.add(t2);

		c.add(new JLabel("                        "));
		c.add(label9);
		c.add(t4);
		c.add(new JLabel("                          "));
		c.add(label4);
		c.add(b1);c.add(b2);c.add(b3);
		c.add(new JLabel("           "));

		c.add(label11);
		c.add(t6);
		c.add(new JLabel("                         "));
		c.add(label5);c.add(c1);c.add(c2);c.add(c3);
		c.add(new JLabel("               "));
		c.add(label10);
		c.add(t5);
		c.add(new JLabel("                                                   "));
		c.add(label12);
		c.add(b4);
		c.add(new JLabel("                                                   "));
		c.add(label13);
		c.add(b5);
	

		c.add(new JLabel("                      "));
		c.add(ta1);
		c.add(new JLabel("     "));
		c.add(ta2);
		c.add(new JLabel("                               "));
		c.add(button1);

		c.add(new JLabel("                                        "));
		c.add(button3);
		c.add(new JLabel("                                        "));
		c.add(new JLabel("                                          "));
		c.add(button4);
		setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		}
	public void actionPerformed(ActionEvent e){
	    	Majorattribute p = null;
	    	Majorattribute q = null;
	    	Majorattribute r = null;
	    	Students students = null;
	    	Majorattribute majorattribute = null;
		    String str="";

		    File file=new File("C:\\Users\\18301\\Desktop\\�γ���Ϣ.txt");

		    try {

		        FileInputStream in=new FileInputStream(file);

		        // size  Ϊ�ִ��ĳ��� ������һ���Զ���

		        int size=in.available();

		        byte[] buffer=new byte[size];

		        in.read(buffer);

		        in.close();

		        str=new String(buffer,"GB2312");

		    } catch (IOException e1) {

		        // TODO Auto-generated catch block


		        e1.printStackTrace();

		    }
			String b[] = str.split(",");
	    	p  = new Majorattribute(b[0],b[1],b[2],b[3],b[4]);
	    	q  = new Majorattribute(b[5],b[6],b[7],b[8],b[9]);
	    	r  = new Majorattribute(b[10],b[11],b[12],b[13],b[14]);

	    	
	    	if(e.getSource()==button1)
				ta1.append("������"+t1.getText()+"\n"+
				"ѧ�ţ�"+t2.getText()+"\n"+"�Ա�"
				+cbg.getSelectedCheckbox().getLabel()+
				"\n"+"���գ�"+b1.getSelectedItem()+b2.getSelectedItem()
				+b3.getSelectedItem()+"\n");

			
	    	
	    			if(c1.isSelected() && e.getSource()==button1)
					ta1.append( "�γ̣�" + c1.getLabel()+" "+p.toString()+"\n");

					students = new Students(t1.getText(),t2.getText(),cbg.getSelectedCheckbox().getLabel(),p);
					StringBuffer s1=new StringBuffer();
					s1.append(students);
					s1.append(p);
					try {
						FileWriter fw=new FileWriter("C:\\Users\\18301\\Desktop\\test.txt");
						fw.write(s1.toString());
						fw.close();
						} 
					catch (IOException n) 
						{
						n.printStackTrace();
						}
					
					if(c2.isSelected() && e.getSource()==button1)
					ta1.append( "�γ̣�" + c2.getLabel()+" "+q.toString()+"\n");
					students = new Students(t1.getText(),t2.getText(),cbg.getSelectedCheckbox().getLabel(),q);
					StringBuffer s_1=new StringBuffer();
					s_1.append(students);
					s_1.append(p);
					try {
						FileWriter fw=new FileWriter("C:\\Users\\18301\\Desktop\\test.txt");
						fw.write(s_1.toString());
						fw.close();
						} 
					catch (IOException n) 
						{
						n.printStackTrace();
						}
					
					
					if(c3.isSelected() && e.getSource()==button1)
					ta1.append( "�γ̣�" + c3.getLabel()+" "+r.toString()+"\n");

					students = new Students(t1.getText(),t2.getText(),cbg.getSelectedCheckbox().getLabel(),r);


					
					StringBuffer s_2=new StringBuffer();
					s_2.append(students);
					s_2.append(p);
					try {
						FileWriter fw=new FileWriter("C:\\Users\\18301\\Desktop\\test.txt");
						fw.write(s_2.toString());
						fw.close();
						} 
					catch (IOException n) 
						{
						n.printStackTrace();
						}
					
					
					if(e.getSource()==button1)
					ta1.append("\n");
			if(e.getSource()==button4){
				System.exit(0);
			}

			if(e.getSource()==button3)
				ta2.append("��ʦ������"+t3.getText()+"\n"+
				"�γ����ƣ�"+t4.getText()+"\n"+"�Ͽεص㣺"+t6.getText()
				+"\n"+"�γ̱�ţ�"+t5.getText()+"\n"+"��ʱ��"+b4.getSelectedItem()
				+"\n"+"ѧ�֣�"+b5.getSelectedItem()+"\n");
			if(e.getSource()==button3)
				ta2.append("\n");
				majorattribute = new Majorattribute(t4.getText(),t5.getText(),
						t6.getText(),t7.getText(),t8.getText());


		}
	public static void main(String args[]) 
	{
			
			Gui d =new Gui();
			
	}
	
};
 