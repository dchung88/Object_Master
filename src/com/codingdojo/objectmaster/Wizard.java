package com.codingdojo.objectmaster;

public class Wizard extends Human {
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	public void heal(Human a) {
		a.health += this.intelligence;
	}
	public void fireball(Human a) {
		a.health -= this.intelligence * 3;
	}
}
