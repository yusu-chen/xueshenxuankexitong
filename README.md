# xueshenxuankexitong
![流程图](https://github.com/yusu-chen/xueshenxuankexitong/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191208132258.png?raw=true)
![结果图](https://github.com/yusu-chen/xueshenxuankexitong/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191208131752.png?raw=true)
####  陈昱夙    大数据181     2018310483  
##  一、实验目的  
```  分析学生选课系统。使用GUI窗体及其组件设计窗体界面。完成学生选课过程业务逻辑编程。基于文件保存并读取数据。处理异常。```    
##  二、实验要求  
###  1、设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。  
###  2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。  
###  3、针对操作过程中可能会出现的各种异常，做异常处理。   
###  4、基于输入/输出编程，支持学生、课程、教师等数据的读写操作。  
###  5、基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。  
##  三、实验过程  
```  运用gui编程，建立起一个窗口，供用户输入，选择，在建立学生函数，课程函数，老师函数来实现选课打印的功能，在gui中把课程的内容从文件中提取出来，根据用户的选择写到另一个文件中。 建立可行GUI窗口有学生注册、课程新加、学生选课、学生退课、打印学生选课列表等功能，基于输入/输出编程，支持学生、课程、教师等数据的读写操作。```  
## 四、实验流程图 
  ![流程图]()  
##  五、核心代码注释    
```  JLabel label1//定义标签 JButton button1//定义按钮 TextArea ta1//定义文本框 JTextField t1//定义输入文本框 CheckboxGroup cg//定义复选框 JCheckBox c1//定义选择项 label1=new JLabel("请输入个人信息和所选课程，完成后单击确定，退出请按取消 ");//给标签1赋值 setBounds(600,300,625,620);//设置窗口出现的位置和窗口的大小;combobox;//下拉菜单;c=getContentPane();	//获得JFrame的内容版面c.setLayout(new FlowLayout(FlowLayout.LEFT));//窗口布局方法;c.add(label1);//添加各种组件;button1.addActionListener(this);//监听器监听按钮;```  
```  public void actionPerformed(ActionEvent e){```  
```  	    	Majorattribute p = null;```    
``` 	    	Majorattribute q = null;```  
```  	    	Majorattribute r = null;```   
```   	    	Students students = null;```   
```  	    	Majorattribute majorattribute = null;```   
```  		    String str="";```   
```   File file=new File("C:\\Users\\18301\\Desktop\\课程信息.txt");//实例化```  
 ```         if(e.getSource()==button1)```  
```  				ta1.append("姓名："+t1.getText()+"\n"+```  
```  				"学号："+t2.getText()+"\n"+"性别："```   
```   				+cbg.getSelectedCheckbox().getLabel()+```  
```  				"\n"+"生日："+b1.getSelectedItem()+b2.getSelectedItem()```  
```  				+b3.getSelectedItem()+"\n")```  
```           if(c1.isSelected() && e.getSource()==button1)//如果按下第一个按钮```  
```          ta1.append( "课程：" + c1.getLabel()+" "+p.toString()+"\n");```  
```           students = new Students(t1.getText(),t2.getText(),cbg.getSelectedCheckbox().getLabel(),p);```  
```  					StringBuffer s1=new StringBuffer();```  
```  				s1.append(students);```  
```  					s1.append(p);```  
```  					try {```  
```  						FileWriter fw=new FileWriter("C:\\Users\\18301\\Desktop\\test.txt");```  
```  						fw.write(s1.toString());```  
```  						fw.close();```  
```  						} ```  
```  					catch (IOException n) ```  
```  						{```  
```  						n.printStackTrace();```  
```  						};//进行对各个输入框中的内容的获取```  
```  if(e.getSource()==button4){```  
```  				System.exit(0);//如果按下第四个按钮就会退出。```  
```          if(e.getSource()==button3)```  
```  				ta2.append("教师姓名："+t3.getText()+"\n"+```  
```  				"课程名称："+t4.getText()+"\n"+"上课地点："+t6.getText()```  
```  				+"\n"+"课程编号："+t5.getText()+"\n"+"课时："+b4.getSelectedItem()```  
```  				+"\n"+"学分："+b5.getSelectedItem()+"\n");//获取输入框中的各种信息并在文本框中显示```  
## 五、实验运行结果
![结果图]()
## 六、编程感想  
```  这次的GUI窗体设计比以前的更加完善，通过越来越多的练习，对窗口组件的排列按键的功能有了进一步的了解。学生选课系统的实现也更加完善，能够实现学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。对于Github的编辑也更加熟练。这几次的实验让我对学生选课系统的实现印象深刻，在不断的学习过程中，学到了很多有用的编程知识收获很大。```  
