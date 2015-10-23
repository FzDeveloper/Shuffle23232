package com.company;

import java.util.List;
import java.util.Collections;

public class Main {
    private static CreateCards cards= new CreateCards();
    private static ToPlayers howMany= new ToPlayers();

    public static void main(String[] args) {
        List<String> shuffleit;
	    try{
            shuffleit=cards.initialize();
            Collections.shuffle(shuffleit);
            howMany.giveCard(shuffleit,10,35);
        }catch (NullPointerException ex){
            System.err.print("nullpointexception");
        }


    }
}
