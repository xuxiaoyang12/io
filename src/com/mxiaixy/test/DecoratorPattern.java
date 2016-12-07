package com.mxiaixy.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 装饰者模式
 * 例   ：		人  r = new 人();
 * 	装饰者	超人  cr = new 超人(r);
 * 这样 人就拥有了超人的能力
 * @author Mxia
 *
 */
public class DecoratorPattern {
	public static void main(String[] args){
		try {
			//创建输出输入流
			FileInputStream  inputStream = new FileInputStream("F:/1.jpg");
			FileOutputStream outputStream = new FileOutputStream("F:/y.jpg");
			
			//加入装饰者模式    BufferedInput（output）Stream 天生具有缓冲区的输入输出流
			BufferedInputStream  bufferInput = new BufferedInputStream(inputStream);
			BufferedOutputStream bufferOutputStream = new BufferedOutputStream(outputStream);
			
			int len = -1;
			while((len=bufferInput.read())!=-1){
				bufferOutputStream.write(len);
			}
			//关闭输入输出流
			bufferOutputStream.flush();
			bufferOutputStream.close();
			bufferInput.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	

}
