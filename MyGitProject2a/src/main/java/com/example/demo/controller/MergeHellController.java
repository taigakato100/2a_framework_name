package com.example.demo.controller;

<<<<<<< HEAD
public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
		kadaiC();
	}

	static void kadaiA() {

		for (int i = 0; i < 10; i++) {
			System.out.println("現在" + i + "回目のループです");
		}
=======
import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
		kadaiC();
	}

	void kadaiB() {
		Random rand = new Random();
		int kasu = (rand.nextInt() + 1) % 100;
		System.out.println(kasu + "が出ました");
>>>>>>> branch 'master' of https://github.com/taigakato100/2a_framework_10.git
	}
}