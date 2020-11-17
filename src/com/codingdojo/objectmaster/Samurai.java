package com.codingdojo.objectmaster;

public class Samurai extends Human {
	int samuraiCount = 0;
	public Samurai() {
		this.health = 200;
		samuraiCount ++;
	}
	public void deathBlow(Human a) {
		a.health -= a.health;
		this.health = this.health / 2;
	}
	public void meditate() {
		this.health += this.health / 2;
	}
	public int howMany() {
		return samuraiCount;
	}
}
