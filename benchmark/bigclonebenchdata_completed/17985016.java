import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17985016 {
public MyHelperClass[] possibleScores;
	public MyHelperClass setPossibleScores(MyHelperClass o0){ return null; }
public MyHelperClass NUM_SCORES;
	public MyHelperClass random;
//	public MyHelperClass possibleScores;

    public void setRandom(boolean random)  throws Throwable {
        this.random =(MyHelperClass)(Object) random;
        if (random) {
            possibleScores =(MyHelperClass[])(Object) new int[(int)(Object)NUM_SCORES];
            for (int i = 0; i <(int)(Object) NUM_SCORES - 1; i++) {
                getRandomScore: while (true) {
                    int score = (int) (Math.random() * 20) + 1;
                    for (int j = 0; j < i; j++) {
                        if (score == (int)(Object)possibleScores[j]) {
                            continue getRandomScore;
                        }
                    }
                    possibleScores[i] =(MyHelperClass)(Object) score;
                    break;
                }
            }
            possibleScores[(int)(Object)NUM_SCORES - 1] =(MyHelperClass)(Object) 25;
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i <(int)(Object) NUM_SCORES - 1; i++) {
                    if ((int)(Object)possibleScores[i] > (int)(Object)possibleScores[i + 1]) {
                        int t =(int)(Object) possibleScores[i];
                        possibleScores[i] = possibleScores[i + 1];
                        possibleScores[i + 1] =(MyHelperClass)(Object) t;
                        sorted = false;
                    }
                }
            }
            setPossibleScores((MyHelperClass)(Object)possibleScores);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
