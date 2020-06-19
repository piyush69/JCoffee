import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3197876 {

    public ArrayList<String> showTopLetters()  throws Throwable {
        MyHelperClass engCountLetters = new MyHelperClass();
        int[] tempArray = new int[engCountLetters.length];
        MyHelperClass abcEng = new MyHelperClass();
        char[] tempArrayLetters = new char[abcEng.length];
        ArrayList<String> resultTopFiveLetters = new ArrayList<String>();
        MyHelperClass engCountLetters = new MyHelperClass();
        tempArray = engCountLetters.clone();
        MyHelperClass abcEng = new MyHelperClass();
        tempArrayLetters = abcEng.clone();
        int tempCount;
        char tempLetters;
        MyHelperClass abcEng = new MyHelperClass();
        for (int j = 0; j < (abcEng.length * abcEng.length); j++) {
            MyHelperClass abcEng = new MyHelperClass();
            for (int i = 0; i < abcEng.length - 1; i++) {
                if (tempArray[i] > tempArray[i + 1]) {
                    tempCount = tempArray[i];
                    tempLetters = tempArrayLetters[i];
                    tempArray[i] = tempArray[i + 1];
                    tempArrayLetters[i] = tempArrayLetters[i + 1];
                    tempArray[i + 1] = tempCount;
                    tempArrayLetters[i + 1] = tempLetters;
                }
            }
        }
        for (int i = tempArrayLetters.length - 1; i > tempArrayLetters.length - 6; i--) {
            resultTopFiveLetters.add(tempArrayLetters[i] + ":" + tempArray[i]);
        }
        return resultTopFiveLetters;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
