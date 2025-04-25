package com.polymorphism;

// interface is used to achieve loose coupling(advantage of interface over the class objects)

interface BroadBandService {
	void getNetworkName();
}

class Airtel implements BroadBandService {
	public void getNetworkName() {
		System.out.println("Airtel");
	}
}

class Vodafone implements BroadBandService {
	public void getNetworkName() {
		System.out.println("Vodafone");
	}
}

class Mobile {
	private BroadBandService obj;

	Mobile(BroadBandService obj) {
		this.obj = obj;
	}

	public void getName() {
		this.obj.getNetworkName();
	}
}

public class Test4 {
	public static void main(String[] args) {
		Mobile m = new Mobile(new Airtel());
		m.getName();
	}
}
