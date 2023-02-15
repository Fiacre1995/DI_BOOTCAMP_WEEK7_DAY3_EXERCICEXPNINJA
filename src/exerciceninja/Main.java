package exerciceninja;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);

        ExerciceXPNinja exo =  new ExerciceXPNinja(); 
        exo.findFirst( list, 0, list.size(), ()->{});
    }

	}


