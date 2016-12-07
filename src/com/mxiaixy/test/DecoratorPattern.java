package com.mxiaixy.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * װ����ģʽ
 * ��   ��		��  r = new ��();
 * 	װ����	����  cr = new ����(r);
 * ���� �˾�ӵ���˳��˵�����
 * @author Mxia
 *
 */
public class DecoratorPattern {
	public static void main(String[] args){
		try {
			//�������������
			FileInputStream  inputStream = new FileInputStream("F:/1.jpg");
			FileOutputStream outputStream = new FileOutputStream("F:/y.jpg");
			
			//����װ����ģʽ    BufferedInput��output��Stream �������л����������������
			BufferedInputStream  bufferInput = new BufferedInputStream(inputStream);
			BufferedOutputStream bufferOutputStream = new BufferedOutputStream(outputStream);
			
			int len = -1;
			while((len=bufferInput.read())!=-1){
				bufferOutputStream.write(len);
			}
			//�ر����������
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
