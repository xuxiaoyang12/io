package com.mxiaixy.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.mxiaixy.entity.Student;

/**
 * 序列化
 * 将对象写入流的过程称为序列化  反之将流转换成对象的过程称为反序列化
 * 
 * @author Mxia
 *
 * 使用ObjectInputStream 和 ObjectOutputStream 类
 */
public class Serializable {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.setCode(100);
		stu.setName("tom");
		stu.setAddress("北京");
		
		try {
			//将对象写入 文件中
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("F:/a.txt"));
			
			//写入数据         根据数据的不同 可以使用不同的write方法
			out.writeObject(stu);
			
			//关闭输出流
			out.flush();
			out.close();
			//！！！！！！输出流重复在一个文件上输出 下一个文件会把上一个文件覆盖
			
			//将文件中的对象读出
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("F:/a.txt"));
			
			//读数据    根据数据不同可以使用不同的read方法
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
