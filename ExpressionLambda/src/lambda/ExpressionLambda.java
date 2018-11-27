package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ExpressionLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> liste = new ArrayList<Integer> ();
		liste.add(1);
		liste.add(2);
		liste.add(3);
		liste.add(4);
		
		for (int tListe : liste) {
			System.out.println(tListe);
		}
		
		liste.forEach(t -> System.out.println(t));
		
		Consumer<String> consumer = (String param) -> System.out.println(param);
	}

}
