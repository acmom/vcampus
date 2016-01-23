package Library;


import javax.swing.*;

import java.awt.*;
import java.util.*;
import java.lang.*;
public class PersonalPanel extends JPanel{
	
//	JButton PERSONAL =new JButton("查询图书信息");
//	JButton personalinf=new JButton("查询个人记录");
//	JButton searchbook=new JButton("搜索图书");
	JButton nextpage=new JButton("下一页");
	JButton previouspage=new JButton("上一页");
//	JButton back=new JButton("返回主选单");
	JLabel changeto=new JLabel("跳转至");
	JLabel page=new JLabel("页");
	JButton confirm=new JButton("确定");
//	JLabel searchname=new JLabel("书名");
//	JTextField nameinput= new JTextField();
//	JTextField authorinput= new JTextField();
//	JLabel searchauthor=new JLabel("作者");
//	JButton search =new JButton("搜索");
//	JLabel message=new JLabel("请输入要搜索的书名或作者");
	JTextField pageinput= new JTextField();
//	JLabel welcome=new JLabel("欢迎进入图书馆系统！");
//	JLabel select= new JLabel("请选择上方功能。");
//	String[][] bookData = new String[30][9];
//	String[][] searchData= new String[30][9];
	String[][] personalData=new String[30][7];
//
	String[] columnNames = {"图书编号","图书名称","作者","出版社","剩余本数","可借本数","备注","所在书架","预约借阅"};
	String[] columnnames={"图书编号","图书名称","作者","出版社","借书时间","还书期限","还书时间"};
//	JTable PERSONAL  = new JTable(bookData, columnNames);
//	JTable BOOKSEACH = new JTable(searchData, columnNames);
//	JScrollPane INFBOOK=new JScrollPane(PERSONAL );
//	JScrollPane SEACHBOOK=new JScrollPane(BOOKSEACH);
	JTable PERSONAL = new JTable(personalData, columnnames);
	JScrollPane pesonal=new JScrollPane(PERSONAL);
	int pagenumber=0;
	int maxpage=0;
	JLabel currentpage=new JLabel(); 
	ArrayList<String[][]> ALLData=new ArrayList();
	public PersonalPanel(){
		this.setLayout(null);
		this.setSize(900, 700);
		PERSONAL.setEnabled(false);
		String[][] testData1=new String[30][7];
		String[][] testData2=new String[30][7];
		for(int i=0;i<=29;i++) for(int j=0;j<=6;j++) testData1[i][j]="4";
		ALLData.add(testData1);
		maxpage++;
		for(int i=0;i<=29;i++) for(int j=0;j<=6;j++) testData2[i][j]="2";
		ALLData.add(testData2);
		maxpage++;
		for(int i=0;i<=29;i++) for(int j=0;j<=6;j++) personalData[i][j]=ALLData.get(0)[i][j];
		
//		INFBOOK.setBounds(0,0,900,503);
		currentpage.setText(pagenumber+1+"/"+maxpage+"页");
		currentpage.setBounds(799,510,60,20);
		previouspage.setBounds(279,510,80,20);
		nextpage.setBounds(369,510,80,20);
		page.setBounds(534,510,80,20);
		pageinput.setBounds(499,511,32,20);
		changeto.setBounds(459,510,80,20);
		confirm.setBounds(554,510,60,20);
		this.add(pesonal);
		this.add(nextpage);
		this.add(previouspage);
		this.add(page);
		this.add(pageinput);
//		this.add(back);
		this.add(changeto);
		this.add(confirm);
		this.add(currentpage);
//		this.add(INFBOOK);
//		this.add(nextpage);
//		this.add(previouspage);
//		this.add(page);
//		this.add(pageinput);
//		this.add(changeto);
//		this.add(confirm);
//		SEACHBOOK.setBounds(0,0,900,503);
		pesonal.setBounds(0,0,900,503);
//		welcome.setBounds(240,60,600,300);
//		welcome.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,40));
//		select.setBounds(285,110,750,300);
//		select.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,40));
//		PERSONAL .setBounds(145,420,170,80);
//		searchbook.setBounds(345,420,170,80);
//		personalinf.setBounds(545,420,170,80);
		nextpage.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {
				pageplus();
	
			}
		});
		previouspage.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {
				pageminus();
	
			}
		});
		confirm.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {
				pageto();
	
			}
		});
//
	}
	void pageplus(){
		if(pagenumber<maxpage-1)
		{pagenumber++;
		for(int i=0;i<=29;i++) for(int j=0;j<=6;j++) personalData[i][j]=ALLData.get(pagenumber)[i][j];
		PERSONAL .setVisible(false);PERSONAL .setVisible(true);
		currentpage.setText(pagenumber+1+"/"+maxpage+"页");

	}}
	void pageminus(){
		if(pagenumber>0)
		{pagenumber--;
		for(int i=0;i<=29;i++) for(int j=0;j<=6;j++) personalData[i][j]=ALLData.get(pagenumber)[i][j];
		PERSONAL .setVisible(false);PERSONAL .setVisible(true);
		currentpage.setText(pagenumber+1+"/"+maxpage+"页");
	}}
	void pageto(){
		pagenumber=Integer.parseInt(pageinput.getText())-1;
		if(pagenumber>=0&&pagenumber<maxpage)
		{for(int i=0;i<=29;i++) for(int j=0;j<=6;j++) personalData[i][j]=ALLData.get(pagenumber)[i][j];
		PERSONAL .setVisible(false);PERSONAL .setVisible(true);
		currentpage.setText(pagenumber+1+"/"+maxpage+"页");
		}
		
	}
	//		this.add(PERSONAL );
//		this.add(searchbook);
////		this.add(personalinf);
//		this.add(welcome);
//		this.add(select);
//		PERSONAL .addActionListener(new java.awt.event.ActionListener() {
//
//			public void actionPerformed(java.awt.event.ActionEvent e) {
//				infbook();
//	
//			}
//
//		});
//		searchbook.addActionListener(new java.awt.event.ActionListener() {
//
//			public void actionPerformed(java.awt.event.ActionEvent e) {
//				booksearch();
//	
//		}
//
//		});
//		back.addActionListener(new java.awt.event.ActionListener() {
//
//			public void actionPerformed(java.awt.event.ActionEvent e) {
//
//				backtomenu();
//	
//		}
//
//		});
//		personalinf.addActionListener(new java.awt.event.ActionListener() {
//
//			public void actionPerformed(java.awt.event.ActionEvent e) {
//
//				infpersonal();
//	
//		}
//
//		});
//		search.addActionListener(new java.awt.event.ActionListener() {
//
//			public void actionPerformed(java.awt.event.ActionEvent e) {
//
//				sousuo();
//	
//		}
//
//		});
//	
//		
//	}
//	
//	
////	public static void main(String[] args) {
////		JFrame frame=new JFrame();
////		Library p=new Library();
////		frame.add(p);
////		frame.setVisible(true);;
////		frame.setSize(900, 700);
////		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////	}
//	void infbook(){
//		
//		this.removeAll();
//		this.add(INFBOOK);
//		this.add(nextpage);
//		this.add(previouspage);
//		this.add(page);
//		this.add(pageinput);
//		this.add(back);
//		this.add(changeto);
//		this.add(confirm);
//		nextpage.setVisible(false);		nextpage.setVisible(true);
//		page.setVisible(false);		page.setVisible(true);
//		previouspage.setVisible(false);		previouspage.setVisible(true);
//		pageinput.setVisible(false);		pageinput.setVisible(true);
//		confirm.setVisible(false);		confirm.setVisible(true);
//		back.setVisible(false);		back.setVisible(true);
//		changeto.setVisible(false);		changeto.setVisible(true);
//		previouspage.setBounds(225,510,80,20);
//		nextpage.setBounds(315,510,80,20);
//		page.setBounds(479,510,80,20);
//		pageinput.setBounds(445,511,32,20);
//		back.setBounds(565,510,100,20);
//		changeto.setBounds(405,510,80,20);
//		confirm.setBounds(500,510,60,20);
//		
//	
//	}
//	public void booksearch(){
//		this.removeAll();
//		this.setVisible(false);
//		this.setVisible(true);
//		this.add(searchname);
//		this.add(searchauthor);
//		this.add(authorinput);
//		this.add(nameinput);
//		this.add(search);
//		this.add(back);
//		this.add(message);
//		message.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,18));
//		message.setBounds(300,150,500,200);
//		searchname.setBounds(300,280,100,20);
//		searchauthor.setBounds(300,320,100,20);
//		authorinput.setBounds(350,322,200,20);
//		nameinput.setBounds(350,282,200,20);
//		search.setBounds(300,350,120,25);
//		back.setBounds(430,350,120,25);
//		
//	}
//	void backtomenu(){
//		this.removeAll();
//		this.setVisible(false);
//		this.setVisible(true);
//		INFBOOK.setBounds(0,0,900,503);
//		welcome.setBounds(145,40,750,300);
//		welcome.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,40));
//		select.setBounds(145,40,750,300);
//		select.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,40));
//		PERSONAL .setBounds(145,420,170,80);
//		searchbook.setBounds(345,420,170,80);
//		personalinf.setBounds(545,420,170,80);
//
//
//		this.add(PERSONAL );
//		this.add(searchbook);
//		this.add(personalinf);
//		this.add(welcome);
//		
//	}
//	void infpersonal(){
//		this.removeAll();
//		this.add(pesonal);
//		this.add(nextpage);
//		this.add(previouspage);
//		this.add(page);
//		this.add(pageinput);
//		this.add(back);
//		this.add(changeto);
//		this.add(confirm);
//		nextpage.setVisible(false);		nextpage.setVisible(true);
//		page.setVisible(false);		page.setVisible(true);
//		previouspage.setVisible(false);		previouspage.setVisible(true);
//		pageinput.setVisible(false);		pageinput.setVisible(true);
//		confirm.setVisible(false);		confirm.setVisible(true);
//		back.setVisible(false);		back.setVisible(true);
//		changeto.setVisible(false);		changeto.setVisible(true);
//		previouspage.setBounds(225,510,80,20);
//		nextpage.setBounds(315,510,80,20);
//		page.setBounds(479,510,80,20);
//		pageinput.setBounds(445,511,32,20);
//		back.setBounds(565,510,100,20);
//		changeto.setBounds(405,510,80,20);
//		confirm.setBounds(500,510,60,20);
//		
//		
//	}
//
//void sousuo(){
//	//String inputname =nameinput.getText();
//	//String inputauthor =authorinput.getText();
//	for(int i=0;i<=29;i++) for(int j=0;j<=7;j++) ;
//	if(  nameinput.getText().isEmpty()&&authorinput.getText().isEmpty()	);
//	
//	else 
//	{
//	this.removeAll();
//	this.add(SEACHBOOK);
//	this.add(nextpage);
//	this.add(previouspage);
//	this.add(page);
//	this.add(pageinput);
//	this.add(back);
//	this.add(changeto);
//	this.add(confirm);
//	nextpage.setVisible(false);		nextpage.setVisible(true);
//	page.setVisible(false);		page.setVisible(true);
//	previouspage.setVisible(false);		previouspage.setVisible(true);
//	pageinput.setVisible(false);		pageinput.setVisible(true);
//	confirm.setVisible(false);		confirm.setVisible(true);
//	back.setVisible(false);		back.setVisible(true);
//	changeto.setVisible(false);		changeto.setVisible(true);
//	previouspage.setBounds(225,510,80,20);
//	nextpage.setBounds(315,510,80,20);
//	page.setBounds(479,510,80,20);
//	pageinput.setBounds(445,511,32,20);
//	back.setBounds(565,510,100,20);
//	changeto.setBounds(405,510,80,20);
//	confirm.setBounds(500,510,60,20);
//	}
//	
//	
//		ArrayList<JButton> jbjb;
//		jbjb.add()

}