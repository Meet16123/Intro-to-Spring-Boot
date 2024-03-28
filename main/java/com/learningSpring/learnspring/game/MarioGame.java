package com.learningSpring.learnspring.game;

public class MarioGame implements GameConsole {
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Go into Hole");
	}
	
	public void left() {
		System.out.println("Go Back");
	}
	
	public void right() {
		System.out.println("Runn");
	}
}
