import java.io.*;
import java.lang.*;
import java.util.*;



class c3338750 {

    public void sortPlayersTurn() {
        Token tempT = new Token();
        Player tempP = new Player("test name", tempT);
        int tempN = 0;
        boolean exchangeMade = true;
        MyHelperClass playerNum = new MyHelperClass();
        for (int i = 0; i <(int)(Object) playerNum - 1 && exchangeMade; i++) {
            exchangeMade = false;
//            MyHelperClass playerNum = new MyHelperClass();
            for (int j = 0; j <(int)(Object) playerNum - 1 - i; j++) {
MyHelperClass[] diceSum = new MyHelperClass[5];
                if ((int)(Object)diceSum[j] < (int)(Object)diceSum[j + 1]) {
MyHelperClass[] players = new MyHelperClass[5];
                    tempP =(Player)(Object) players[j];
//                    MyHelperClass diceSum = new MyHelperClass();
                    tempN =(int)(Object) diceSum[j];
//                    MyHelperClass players = new MyHelperClass();
                    players[j] = players[j + 1];
//                    MyHelperClass diceSum = new MyHelperClass();
                    diceSum[j] = diceSum[j + 1];
//                    MyHelperClass players = new MyHelperClass();
                    players[j + 1] =(MyHelperClass)(Object) tempP;
//                    MyHelperClass diceSum = new MyHelperClass();
                    diceSum[j + 1] =(MyHelperClass)(Object) tempN;
                    exchangeMade = true;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] players;
	public MyHelperClass[] diceSum;
}

class Token {

}

class Player {

Player(){}
	Player(String o0, Token o1){}}
