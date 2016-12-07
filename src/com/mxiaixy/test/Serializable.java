package com.mxiaixy.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.mxiaixy.entity.Student;

/**
 * ���л�
 * ������д�����Ĺ��̳�Ϊ���л�  ��֮����ת���ɶ���Ĺ��̳�Ϊ�����л�
 * 
 * @author Mxia
 *
 * ʹ��ObjectInputStream �� ObjectOutputStream ��
 */
public class Serializable {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.setCode(100);
		stu.setName("tom");
		stu.setAddress("����");
		
		try {
			//������д�� �ļ���
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("F:/a.txt"));
			
			//д������         �������ݵĲ�ͬ ����ʹ�ò�ͬ��write����
			out.writeObject(stu);
			
			//�ر������
			out.flush();
			out.close();
			//������������������ظ���һ���ļ������ ��һ���ļ������һ���ļ�����
			
			//���ļ��еĶ������
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("F:/a.txt"));
			
			//������    �������ݲ�ͬ����ʹ�ò�ͬ��read����
			Student student = (Student)input.readObject();
			
			System.out.println(student.getCode());
			System.out.println(student.getName());
			System.out.println(student.getAddress());
			
			input.close();
			
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
