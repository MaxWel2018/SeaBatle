package com.company;
public class Ships {
   int sizeShips;
   int typeShips;
    static final int SIZE_ONE_TYPE = 1;
    static final int SIZE_TWO_TYPE = 2;
    static final int SIZE_THREE_TYPE = 3;
    static final int SIZE_FOR_TYPE = 4;
    static final int ONE_TYPE = 4;
    static final int TWO_TYPE = 3;
    static final int THREE_TYPE = 2;
    static final int FOR_TYPE = 1;
    static final int ALL_TYPE = 4;
    static final int ALL_SHIPS = ONE_TYPE + THREE_TYPE + TWO_TYPE + FOR_TYPE;



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



    Ships(){
       System.out.println("Ship Create!");
   }





}
