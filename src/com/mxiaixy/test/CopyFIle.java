package com.mxiaixy.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO��
 * 
 * �ֽ���
 * ʹ����������������ļ�
 * 
 * @author sunny
 *
 */
public class CopyFIle {
	//����������
	public static void main(String[] args){
		
		//�ļ�����λ��
		File file = new File("F:/1.jpg");
		try {
			//�����������������
			//������ �ļ�λ��
			FileInputStream inputStream = new FileInputStream(file);
			//����� �ļ�λ��
			FileOutputStream outputStream = new FileOutputStream("F:/x.jpg");
			
			
			int len = -1;
			//����buffer ���� ��������д���ٶ�  �׳����ӻ�����
			byte[] buffer = new byte[521];
			//����д��ͼƬ
			while((len = inputStream.read(buffer))!=-1){
				//д�������
				outputStream.write(buffer,0,len);
			}
			//�ر����������
				//���flushһ�� ȷ���ļ�ȫ��д��
			outputStream.flush();
			outputStream.close();
			
			inputStream.close();
			
		} catch (FileNotFoundException e) {
			 //����ļ��������Ҳ����ļ��ᱨ�쳣
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
