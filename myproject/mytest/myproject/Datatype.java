package myproject;

import java.io.*;


public class Datatype {

	public static void main(String args[])
	{
		/*
		 * author: zq
		 * brief : ��ϰjava���
		 * date  �� 2018-09-25 
		 * */
		/**
		System.out.print("������ ");
		System.out.print("shen ");
		System.out.print("�");
		System.out.println();
		System.out.print("�Ա�");
		System.out.println('F');
		System.out.print("���䣺 ");
		System.out.print(20);
		System.out.print("���: ");
		System.out.println(1.62);
		System.out.print("���:");
		System.out.println(true);
		
		 **/
		/*
		 * author: zq
		 * brief : ��ϰ����ת��
		 * date  �� 2018-09-25 
		 * */
		/**
		int num1, num2, num3, num4;
		num1 = (int)(Math.random() * 100 )+ 1;
		num2 = (int)(Math.random() * 100 )+ 1;
		num3 = (int)(Math.random() * 100 )+ 1;
		num4 = (int)(Math.random() * 100 )+ 1;
		System.out.println( "������������Ŀ��" );
		System.out.println( num1 + "+" + num2 + "*" + "(" + num3 + "-" + num4 + ")" );
		**/
		/*
		 * author: zq
		 * brief : ��ϰ��������
		 * date  �� 2018-09-25 
		
		/**
		int i =0;
		System.out.println("������һ���ַ�:");
		try 
		{
			i = System.in.read();
		}
		catch(IOException e)
		{
			System.out.println("�쳣");
		}
		
		System.out.println("���ַ���Ascii��Ϊ:" + i);
		 **/
		
		/*
		 * author: Zq
		 * brief : ռλ����ʹ��
		 * date  : 2018-09-25
		 * */
		/**
		String str = null;
		str = String.format("hello , %s , %s ", "���", "java");
		System.out.print(str);
		
		**/
		 /* author : Zq
		 * brief  : �ַ���������
		 * date   : 2018-09-27
		 * */
		String s ="";
		System.out.print("�����һ���ַ���:");
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			s = in.readLine();
		}
		catch(IOException e) {}
		System.out.println("������ַ���Ϊ��"+s);
		
		
	}
}
