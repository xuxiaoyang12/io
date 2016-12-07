package com.mxiaixy.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO流
 * 
 * 字节流
 * 使用输出输入流拷贝文件
 * 
 * @author sunny
 *
 */
public class CopyFIle {
	//设置主方法
	public static void main(String[] args){
		
		//文件所在位置
		File file = new File("F:/1.jpg");
		try {
			//创建输出输入流对象
			//输入流 文件位置
			FileInputStream inputStream = new FileInputStream(file);
			//输出流 文件位置
			FileOutputStream outputStream = new FileOutputStream("F:/x.jpg");
			
			
			int len = -1;
			//加上buffer 数组 可以提升写入速度  俗称增加缓冲区
			byte[] buffer = new byte[521];
			//拷贝写入图片
			while((len = inputStream.read(buffer))!=-1){
				//写入输出流
				outputStream.write(buffer,0,len);
			}
			//关闭输入输出流
				//最好flush一下 确保文件全部写入
			outputStream.flush();
			outputStream.close();
			
			inputStream.close();
			
		} catch (FileNotFoundException e) {
			 //如果文件输入流找不到文件会报异常
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
