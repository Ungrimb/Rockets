import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Models.Propulsor;
import Models.Rocket3;

public class Main3 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		List<Propulsor> propulsores1;
		List<Propulsor> propulsores2;
		Rocket3 coet1;
		Rocket3 coet2;
		
		Propulsor propulsor1 = new Propulsor (1,0,10);
		Propulsor propulsor2 = new Propulsor (2,0,30);
		Propulsor propulsor3 = new Propulsor (3,0,80);
		Propulsor propulsor4 = new Propulsor (4,0,30);
		Propulsor propulsor5 = new Propulsor (5,0,40);
		Propulsor propulsor6 = new Propulsor (6,0,50);
		Propulsor propulsor7 = new Propulsor (7,0,50);
		Propulsor propulsor8 = new Propulsor (8,0,30);
		Propulsor propulsor9 = new Propulsor (9,0,10);
		
		propulsores1 = new ArrayList(3);
		propulsores1.add(propulsor1);
		propulsores1.add(propulsor2);
		propulsores1.add(propulsor3);
		propulsores2 = new ArrayList(6);
		propulsores2.add(propulsor4);
		propulsores2.add(propulsor5);
		propulsores2.add(propulsor6);
		propulsores2.add(propulsor7);
		propulsores2.add(propulsor8);
		propulsores2.add(propulsor9);
		
		coet1 = new Rocket3 ("32WESSDS",propulsores1);
		coet2 = new Rocket3 ("LDSFJA32",propulsores2);
		
		System.out.println(coet1);
		System.out.println(coet2);
		
		coet1.setVelocidad_actual(coet1.vAct(0.0));
		coet2.setVelocidad_actual(coet2.vAct(0.0));
		System.out.println("Velocidad actual coet1 " + coet1.getVelocidad_actual());
		System.out.println("Velocidad actual coet2 " + coet2.getVelocidad_actual());
		
		Runnable r1 = ()-> {
			for (int i = 0; i < 3; i++) {
				propulsor1.acelerar();
                propulsor2.acelerar();
                propulsor3.acelerar();
                propulsor4.acelerar();
                propulsor5.acelerar();
                propulsor6.acelerar();
                propulsor7.acelerar();
                propulsor8.acelerar();
                propulsor9.acelerar();
			}
			System.out.println("Velocidad actual coet1 "  + Thread.currentThread().getName() + " " + (coet1.vAct(coet1.getVelocidad_actual())));
			System.out.println("Velocidad actual coet2 "  + Thread.currentThread().getName() + " " + (coet2.vAct(coet2.getVelocidad_actual())));
		};
		
		Thread evento1 = new Thread(r1,"Acelerar 3 veces");
		
		Thread r2 = new Thread("Frenar 5 veces y acelerar 7") {
			public void run(){
				for (int i = 0; i < 5; i++) {
					propulsor1.frenar();
	                propulsor2.frenar();
	                propulsor3.frenar();
				}
				for (int i = 0; i < 7; i++) {
	                propulsor4.acelerar();
	                propulsor5.acelerar();
	                propulsor6.acelerar();
	                propulsor7.acelerar();
	                propulsor8.acelerar();
	                propulsor9.acelerar();
				}
				System.out.println("Velocidad actual coet1 "  + Thread.currentThread().getName() + " " + (coet1.vAct(coet1.getVelocidad_actual())));
				System.out.println("Velocidad actual coet2 "  + Thread.currentThread().getName() + " " + (coet2.vAct(coet2.getVelocidad_actual())));
            }
		};
		
		Thread r3 = new Thread("Acelerar 15 veces") {
			public void run(){
				for (int i = 0; i < 15; i++) {
					propulsor1.acelerar();
	                propulsor2.acelerar();
	                propulsor3.acelerar();
	                propulsor4.acelerar();
	                propulsor5.acelerar();
	                propulsor6.acelerar();
	                propulsor7.acelerar();
	                propulsor8.acelerar();
	                propulsor9.acelerar();
				}
				System.out.println("Velocidad actual coet1 "  + Thread.currentThread().getName() + " " + (coet1.vAct(coet1.getVelocidad_actual())));
				System.out.println("Velocidad actual coet2 "  + Thread.currentThread().getName() + " " + (coet2.vAct(coet2.getVelocidad_actual())));
            }
		};
		
		evento1.start();
		r2.start();
		r3.start();

	}

}
