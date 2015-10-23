package com.company;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by konrad on 21.10.15.
 */
public class CreateCards {
    private final String[] suite={ "HEART", "DIAMOND", "CLUB", "SPADE"};
    private final String[] rank={"TWO", "THREE","FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE",
            "TEN", "JACK", "QUEEN", "KING", "ACE"};
    List<String> listOfCards= new ArrayList<>();
    public List<String> initialize(){
        for (int countofsuites=0;countofsuites<suite.length;countofsuites++) {
            for (int countofranks=0; countofranks<rank.length;countofranks++) {
                listOfCards.add(suite[countofsuites]+" " +rank[countofranks]);
            }
        }
        return listOfCards;
    }
}
