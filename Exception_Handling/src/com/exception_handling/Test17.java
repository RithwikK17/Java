package com.exception_handling;

class AgeVerificationFailedException extends RuntimeException {
	private String msg;

	public AgeVerificationFailedException(String msg) {
		super();
		this.msg = msg;
	}

	public String getCustomMsg() {
		return this.msg;
	}
}

public class Test17 {
	public static void ageVerification(int a) {
		if (a < 18) {
			try {
				throw new AgeVerificationFailedException("Age verification failed");
			} catch (AgeVerificationFailedException e) {
				System.out.println(e.getCustomMsg());
			}

		} else {
			System.out.println("Welcome to online voting");
		}
	}

	public static void main(String[] args) {
		ageVerification(1);
	}
}
