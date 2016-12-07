package com.mxiaixy.entity;

import java.io.Serializable;
/**
 * ��������л� ����Ҫʵ��java.io.Serializable�ӿ� �ýӿ�û��ʵ����ֻ�ǽ������ǳ�һ�������л���
 * �����л��������Ҳ�����ǿ����л���
 * @author Mxia
 *
 */
public class Student  implements Serializable {
	
	//���л�    ��Ҫ���䵼�뵽�������
	private static final long serialVersionUID = 1L;
	
	private int code ;
	private String name;
	private transient String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
