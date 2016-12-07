package com.mxiaixy.entity;

import java.io.Serializable;
/**
 * 类参与序列化 必须要实现java.io.Serializable接口 该接口没有实现类只是将该类标记成一个可序列化类
 * 可序列化类的属性也必须是可序列化的
 * @author Mxia
 *
 */
public class Student  implements Serializable {
	
	//序列化    需要将其导入到输出流中
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
