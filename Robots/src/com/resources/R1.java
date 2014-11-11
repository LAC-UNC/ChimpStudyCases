package com.resources;

import com.lac.annotations.Resource;

@Resource
public class R1 extends Robot{
	//Resource stuff
	private I1 i1 = new I1();
	private M1 m1 = new M1();
	private M3 m3 = new M3();
	private O3 o3 = new O3();
	
	public R1(){
		super("R1");
	}
	
	public void moveFromI1ToM1() throws InterruptedException {
		this.move(i1, m1, "from I1 to M1");
	}
	
	public void moveFromI1ToM3() throws InterruptedException {
		this.move(i1, m3, "from I1 to M3");
	}
	
	public void moveFromM3ToO3() throws InterruptedException {
		this.move(m3, o3, "from M3 to O3");
	}
}
