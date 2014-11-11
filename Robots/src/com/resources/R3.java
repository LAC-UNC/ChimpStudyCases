package com.resources;

import com.lac.annotations.Resource;

@Resource
public class R3 extends Robot{
	//Resource stuff
	private I3 i3 = new I3();
	private M4 m4 = new M4();
	private M2 m2 = new M2();
	private O1 o1 = new O1();
	
	public R3(){
		super("R3");
	}
	
	public void moveFromI3ToM4() throws InterruptedException {
		this.move(i3, m4, "from I3 to M4");
	}
	
	public void moveFromM4ToO1() throws InterruptedException {
		this.move(m4, o1, "from M4 to O1");
	}
	
	public void moveFromM2ToO1() throws InterruptedException {
		this.move(m2, o1, "from M2 to O1");
	}
}
