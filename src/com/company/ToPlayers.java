package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by konrad on 21.10.15.
 */
public class ToPlayers {
    //metoda do ustawienia ilosci kart i ilosci graczy
    public void giveCard(List<String> list, int players, int chosencards){
        if(chosencards<2 || players<2){
            System.out.print("Zbyt mala liczba kart lub graczy\n");
        }
        else if(chosencards>52 || players>10){
            System.out.print("Wybrano zbyt duza ilosc kart lub graczy\n");
        }
        else {
            if (chosencards % players != 0) {
                int chosencardscorrected = chosencards - chosencards % players;
                System.out.print("Nie mozna rozdac " + chosencards + " kart dla " + players + " graczy. Rozdano " + chosencardscorrected + " kart." + "\n");
                rozdajo(list,players,chosencardscorrected);
            }
            else{
                System.out.print("Rozdano "+chosencards+" kart "+players+" graczom.\n");
                rozdajo(list,players, chosencards);
            }
        }

        return;
    }
    //przypisanie kard do graczy, wg ilosci kart oraz graczy
    public void rozdajo(List<String> stringList,int playersondeck, int cardsinstock){
        List<String> one= new ArrayList<>();
        List<String> two= new ArrayList<>();
        List<String> three= new ArrayList<>();
        List<String> four= new ArrayList<>();
        List<String> five= new ArrayList<>();
        List<String> six= new ArrayList<>();
        List<String> seven= new ArrayList<>();
        List<String> eight= new ArrayList<>();
        List<String> nine= new ArrayList<>();
        List<String> ten= new ArrayList<>();

        switch (playersondeck){
            case 2:
                for(int count=0; count<cardsinstock; count=count+2){
                    one.add(stringList.get(count));
                    two.add(stringList.get(count + 1));
                }
                System.out.print("Gracz 1: "+one+"\n"+"Gracz 2: "+two+"\n");
                return;
            case 3:
                for(int count=0; count<cardsinstock; count=count+3){
                    one.add(stringList.get(count));
                    two.add(stringList.get(count+1));
                    three.add(stringList.get(count + 2));
                }
                System.out.print("Gracz 1: "+one+"\n"+"Gracz 2: "+two+"\n"+"Gracz 3: "+three+"\n");
                return;
            case 4:
                for(int count=0; count<cardsinstock; count=count+4){
                    one.add(stringList.get(count));
                    two.add(stringList.get(count+1));
                    three.add(stringList.get(count+2));
                    four.add(stringList.get(count+3));
                }
                System.out.print("Gracz 1: "+one+"\n"+"Gracz 2: "+two+"\n"+"Gracz 3: "+three+"\n"
                        +"Gracz 4: "+four+"\n");
                return;
            case 5:
                for(int count=0; count<cardsinstock; count=count+5){
                    one.add(stringList.get(count));
                    two.add(stringList.get(count+1));
                    three.add(stringList.get(count+2));
                    four.add(stringList.get(count+3));
                    five.add(stringList.get(count+4));
                }
                System.out.print("Gracz 1: "+one+"\n"+"Gracz 2: "+two+"\n"+"Gracz 3: "+three+"\n"
                        +"Gracz 4: "+four+"\n"+"Gracz 5: "+five+"\n");
                return;
            case 6:
                for(int count=0; count<cardsinstock; count=count+6){
                    one.add(stringList.get(count));
                    two.add(stringList.get(count+1));
                    three.add(stringList.get(count+2));
                    four.add(stringList.get(count+3));
                    five.add(stringList.get(count+4));
                    six.add(stringList.get(count+5));
                }
                System.out.print("Gracz 1: "+one+"\n"+"Gracz 2: "+two+"\n"+"Gracz 3: "+three+"\n"
                        +"Gracz 4: "+four+"\n"+"Gracz 5: "+five+"\n"+"Gracz 6: "+six+"\n");
                return;
            case 7:
                for(int count=0; count<cardsinstock; count=count+7){
                    one.add(stringList.get(count));
                    two.add(stringList.get(count+1));
                    three.add(stringList.get(count+2));
                    four.add(stringList.get(count+3));
                    five.add(stringList.get(count+4));
                    six.add(stringList.get(count+5));
                    seven.add(stringList.get(count+6));
                }
                System.out.print("Gracz 1: "+one+"\n"+"Gracz 2: "+two+"\n"+"Gracz 3: "+three+"\n"
                        +"Gracz 4: "+four+"\n"+"Gracz 5: "+five+"\n"+"Gracz 6: "+six+"\n"
                        +"Gracz 7: "+seven+"\n");
                return;
            case 8:
                for(int count=0; count<cardsinstock; count=count+8){
                    one.add(stringList.get(count));
                    two.add(stringList.get(count+1));
                    three.add(stringList.get(count+2));
                    four.add(stringList.get(count+3));
                    five.add(stringList.get(count+4));
                    six.add(stringList.get(count+5));
                    seven.add(stringList.get(count+6));
                    eight.add(stringList.get(count+7));
                }
                System.out.print("Gracz 1: "+one+"\n"+"Gracz 2: "+two+"\n"+"Gracz 3: "+three+"\n"
                        +"Gracz 4: "+four+"\n"+"Gracz 5: "+five+"\n"+"Gracz 6: "+six+"\n"
                        +"Gracz 7: "+seven+"\n"+"Gracz 8: "+eight+"\n");
                return;
            case 9:
                for(int count=0; count<cardsinstock; count=count+9){
                    one.add(stringList.get(count));
                    two.add(stringList.get(count+1));
                    three.add(stringList.get(count+2));
                    four.add(stringList.get(count+3));
                    five.add(stringList.get(count+4));
                    six.add(stringList.get(count+5));
                    seven.add(stringList.get(count+6));
                    eight.add(stringList.get(count+7));
                    nine.add(stringList.get(count+8));
                }
                System.out.print("Gracz 1: "+one+"\n"+"Gracz 2: "+two+"\n"+"Gracz 3: "+three+"\n"
                        +"Gracz 4: "+four+"\n"+"Gracz 5: "+five+"\n"+"Gracz 6: "+six+"\n"
                        +"Gracz 7: "+seven+"\n"+"Gracz 8: "+eight+"\n"+"Gracz 9: "+nine+"\n");
                return;
            case 10:
                for(int count=0; count<cardsinstock; count=count+10){
                    one.add(stringList.get(count));
                    two.add(stringList.get(count+1));
                    three.add(stringList.get(count+2));
                    four.add(stringList.get(count+3));
                    five.add(stringList.get(count+4));
                    six.add(stringList.get(count+5));
                    seven.add(stringList.get(count+6));
                    eight.add(stringList.get(count+7));
                    nine.add(stringList.get(count+8));
                    ten.add(stringList.get(count+9));
                }
                System.out.print("Gracz 1: "+one+"\n"+"Gracz 2: "+two+"\n"+"Gracz 3: "+three+"\n"
                        +"Gracz 4: "+four+"\n"+"Gracz 5: "+five+"\n"+"Gracz 6: "+six+"\n"
                        +"Gracz 7: "+seven+"\n"+"Gracz 8: "+eight+"\n"+"Gracz 9: "+nine+"\n"
                        +"Gracz 10: "+ten+"\n");
                return;
        }

        return;
    }
}
