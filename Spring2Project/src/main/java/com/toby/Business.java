package com.toby;

public class Business {
	private IDeviceWriter writer;

	public IDeviceWriter getWriter() {
		return writer;
	}

	public void setWriter(IDeviceWriter writer) {
		this.writer = writer;
	}
	
	public void save(){
		if(writer==null)throw new RuntimeException("can't not start!");
	
	this.writer.saveToDevice();
	}
	
	//自定义静态工厂方法，返回静态对象
	public static Business  createNewBusinessFac(){
		System.out.println("use new fac method!");
		return new Business();
	}
	public void initMethod(){
		System.out.println("Initaling……");
	}
	public void destroyMethod(){
		System.out.println("bean has been destroyed!");
	}
}
