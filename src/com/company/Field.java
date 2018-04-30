package com.company;

public class Field extends Ships {

   void fillShips(){
       Ships[] shipsOneType = new Ships[ONE_TYPE];
       Ships[] shipsTwoType = new Ships[TWO_TYPE];
       Ships[] shipsThreeType = new Ships[THREE_TYPE];
       Ships[] shipsForType = new Ships[FOR_TYPE];

       System.out.println("Create oneType ships!");
       for (int i = 0; i < shipsOneType.length; i++) {
           shipsOneType[i] = new Ships();
           shipsOneType[i].typeShips = ONE_TYPE;
           shipsOneType[i].sizeShips = SIZE_ONE_TYPE;
       }
       System.out.println("Create TwoType ships!");

       for (int i = 0; i < shipsTwoType.length; i++) {
           shipsTwoType[i] = new Ships();
           shipsTwoType[i].typeShips = TWO_TYPE;
           shipsTwoType[i].sizeShips = SIZE_TWO_TYPE;
       }
       System.out.println("Create ThreeType ships!");

       for (int i = 0; i < shipsThreeType.length; i++) {
           shipsThreeType[i] = new Ships();
           shipsThreeType[i].typeShips = THREE_TYPE;
           shipsThreeType[i].sizeShips = SIZE_THREE_TYPE;
       }
       System.out.println("Create forType ships!");
       for (int i = 0; i < shipsForType.length; i++) {
           shipsForType[i] = new Ships();
           shipsForType[i].typeShips = FOR_TYPE;
           shipsForType[i].sizeShips = SIZE_FOR_TYPE;
       }
    }




}
