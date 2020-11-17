package com.codingdojo.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human a = new Human();
		Human b = new Human();
		Ninja turtle = new Ninja();
		Wizard harry = new Wizard();
		Samurai jack = new Samurai();
		
		a.attack(b);
		System.out.println(b.health);
		
		turtle.steal(harry);
		turtle.runAway();
		System.out.println(turtle.health);
		System.out.println(harry.health);
		
		harry.fireball(turtle);
		harry.heal(jack);
		System.out.println(turtle.health);
		System.out.println(jack.health);
		
		jack.deathBlow(turtle);
		jack.meditate();
		int s = jack.howMany();
		System.out.println(turtle.health);
		System.out.println(jack.health);
		System.out.println(s);

	}

}
