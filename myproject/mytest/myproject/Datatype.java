package myproject;

import java.io.*;


public class Datatype {

	public static void main(String args[])
	{
		/*
		 * author: zq
		 * brief : 练习java输出
		 * date  ： 2018-09-25 
		 * */
		/**
		System.out.print("姓名： ");
		System.out.print("shen ");
		System.out.print("昕");
		System.out.println();
		System.out.print("性别：");
		System.out.println('F');
		System.out.print("年龄： ");
		System.out.print(20);
		System.out.print("身高: ");
		System.out.println(1.62);
		System.out.print("婚否:");
		System.out.println(true);
		
		 **/
		/*
		 * author: zq
		 * brief : 练习类型转换
		 * date  ： 2018-09-25 
		 * */
		/**
		int num1, num2, num3, num4;
		num1 = (int)(Math.random() * 100 )+ 1;
		num2 = (int)(Math.random() * 100 )+ 1;
		num3 = (int)(Math.random() * 100 )+ 1;
		num4 = (int)(Math.random() * 100 )+ 1;
		System.out.println( "请计算下面的题目：" );
		System.out.println( num1 + "+" + num2 + "*" + "(" + num3 + "-" + num4 + ")" );
		**/
		/*
		 * author: zq
		 * brief : 练习键盘输入
		 * date  ： 2018-09-25 
		
		/**
		int i =0;
		System.out.println("请输入一个字符:");
		try 
		{
			i = System.in.read();
		}
		catch(IOException e)
		{
			System.out.println("异常");
		}
		
		System.out.println("该字符的Ascii码为:" + i);
		 **/
		
		/*
		 * author: Zq
		 * brief : 占位符的使用
		 * date  : 2018-09-25
		 * */
		/**
		String str = null;
		str = String.format("hello , %s , %s ", "王楠", "java");
		System.out.print(str);
		
		**/
		 /* author : Zq
		 * brief  : 字符串的输入
		 * date   : 2018-09-27
		 * */
		String s ="";
		System.out.print("请键入一个字符串:");
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			s = in.readLine();
		}
		catch(IOException e) {}
		System.out.println("键入的字符串为："+s);
		
		
	}
}
