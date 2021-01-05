package setsIntersection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsMain {
	public static void main(String[] args) {
		Set<Integer> squares = new HashSet<>();
		Set<Integer> cubes = new HashSet<>();

		for(int i = 0;i<=30;i= i+2){

			squares.add(i);
		}
		for(int j = 0; j<=30;j = j+3){
		cubes.add(j);

		}


		System.out.println("Squares: " + squares);
		System.out.println("Cubes: " + cubes);

		Set<Integer> union = new HashSet<>(squares);
		union.addAll(cubes);

		System.out.println("union contains:" + union);

		Set<Integer> intersection = new HashSet<>(squares);
		intersection.retainAll(cubes);
		System.out.println("intersection contains: " + intersection);

		Set<String> nature = new HashSet<>();
		Set<String> divine = new HashSet<>();
		String arrayNatureWords = "all nature is but art unknown to thee";
		String arrayDivineWords = "to err is human to forgive divine";
		String[] arrNat = arrayNatureWords.split(" ");
		String[] arrDivi = arrayDivineWords.split(" ");
		nature.addAll(Arrays.asList(arrNat));
		divine.addAll(Arrays.asList(arrDivi));
		System.out.println(nature);
		System.out.println(divine);

		Set<String> unionStr = new HashSet<>(nature);
		unionStr.retainAll(divine);
		System.out.println("Union natu-divine \n" +
				unionStr);

		Set<String> excluir = new HashSet<>(nature);
		excluir.removeAll(divine);
		System.out.println("Excluir natu-divi  \n"+excluir);




	}
}
