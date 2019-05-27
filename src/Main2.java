import java.util.ArrayList;
import java.util.List;

import Models.Propulsores;
import Models.Rocket2;

public class Main2 {

	public static void main(String[] args) {
		
		List<Integer> potencia1;
		List<Integer> potencia2;
		Propulsores propulsor1;
		Propulsores propulsor2;
		Rocket2 coet1;
		Rocket2 coet2;
		
		potencia1 = new ArrayList(3);
		potencia1.add(10);
		potencia1.add(30);
		potencia1.add(80);
		potencia2 = new ArrayList(6);
		potencia2.add(30);
		potencia2.add(40);
		potencia2.add(50);
		potencia2.add(50);
		potencia2.add(30);
		potencia2.add(10);
		propulsor1 = new Propulsores (3,potencia1);
		propulsor2 = new Propulsores (6,potencia2);
		
		coet1 = new Rocket2 ("32WESSDS",propulsor1);
		coet2 = new Rocket2 ("LDSFJA32",propulsor2);
		
		System.out.println(coet1);
		System.out.println(coet2);

	}

}
