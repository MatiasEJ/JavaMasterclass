package sets;
//SETS CANT HAVE DUPS
//cant retrieve elements


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainSets {
    private static Map<String,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);


        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moo", 27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        planets.add(tempMoon);




    }
}
