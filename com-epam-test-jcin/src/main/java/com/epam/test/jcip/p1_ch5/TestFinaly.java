package com.epam.test.jcip.p1_ch5;

public class TestFinaly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("status=" + getState());
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public static int getState() throws Exception {
		try {
			throw new Exception("some ex 1");
		} finally {
			return 2;
		}
	}

}
