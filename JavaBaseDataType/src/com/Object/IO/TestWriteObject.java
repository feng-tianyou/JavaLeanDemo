package com.Object.IO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TestWriteObject implements Serializable{
//	private static String name;
	// 静态属性不能序列化，不然无法写入文件中
	private String name;
	private int age;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public TestWriteObject(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public TestWriteObject() {
		super();
	}
	
	
	
	
}
