package com.resources;

import com.lac.annotations.Resource;

@Resource
public class R2 extends Robot{
	//Resource stuff
	private I2 i2 = new I2();
	private M4 m4 = new M4();
	private M3 m3 = new M3();
	private M1 m1 = new M1();
	private M2 m2 = new M2();
	private O2 o2 = new O2();
	
	public R2(){
		super("R2");
	}
	
	public void moveFromI4ToM3() throws InterruptedException {
		this.move(m4, m3, "from M4 to M3");
	}
	
	public void moveFromM3ToM4() throws InterruptedException {
		this.move(m3, m4, "from M3 to M4");
	}
	
	public void moveFromM1ToM2() throws InterruptedException {
		this.move(m1, m2, "from M1 to M2");
	}
	
	public void moveFromM3ToO2() throws InterruptedException {
		this.move(m2, o2, "from M2 to O2");
	}
	
	public void moveFromI2ToM2() throws InterruptedException {
		this.move(i2, m2, "from I2 to M2");
	}
}
