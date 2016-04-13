package com.toby;

public class FloppyWriter implements IDeviceWriter {

	@Override
	public void saveToDevice() {
		System.out.println("储存至软盘");
	}

}
