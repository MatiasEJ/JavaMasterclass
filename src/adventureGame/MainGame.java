package adventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainGame {
    private static Map<Integer, Location> location = new HashMap<Integer, Location>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        location.put(0, new Location(0,"You are sitting in front of a toilet"));
        location.put(1, new Location(1,"You are sitting in front of a computer"));
        location.put(2, new Location(2,"You are sitting in front of a computer2"));
        location.put(3, new Location(3,"You are sitting in front of a computer3"));
        location.put(4, new Location(4,"You are sitting in front of a computer4"));
        location.put(5, new Location(5,"You are sitting in front of a computer5"));

        location.get(1).addExit("W",2);
        location.get(1).addExit("E",3);
        location.get(1).addExit("S",4);
        location.get(1).addExit("N",5);

        location.get(2).addExit("N",5);

        location.get(3).addExit("W",1);
        location.get(3).addExit("Q",0);

        location.get(4).addExit("N",1);
        location.get(4).addExit("W",2);

        location.get(5).addExit("S",1);
        location.get(5).addExit("W",2);


        int loc = 1;
        while (true){
            System.out.println(location.get(loc).getDescription());
            if (loc == 0){
                break;
            }
           Map<String,Integer> exits = location.get(loc).getExits();
           System.out.println("Available exits are (Q to quit): ");

           for(String exit: exits.keySet()){
               System.out.print(exit + ", ");
           }
           System.out.println();


           String direction = scanner.nextLine().toUpperCase();

           if(exits.containsKey(direction)){
               loc = exits.get(direction);
           }else{
               System.out.println("you cant log in that direction");
           }

        }
    }
}