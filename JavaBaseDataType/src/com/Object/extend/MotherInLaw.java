package com.Object.extend;

public class MotherInLaw {
	public int laLevel = 9; // 辣的级别
	public int introdece() {
		return this.laLevel;
	}
	
	public static void main(String[] args) {
		
		MotherInLaw mon = new MotherInLaw();
		System.out.println("mon:"+mon.introdece());
		
		SonInLaw son = new SonInLaw();
		System.out.println("son:"+son.introduction());
	}
}
