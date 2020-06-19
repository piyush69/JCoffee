import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9385633 {
public MyHelperClass values;
	public MyHelperClass rankOrder;

    protected void setRankOrder()  throws Throwable {
        this.rankOrder = new int[values.length];
        for (int i = 0; i < rankOrder.length; i++) {
            rankOrder[i] = i;
            assert (!Double.isNaN(values[i]));
        }
        for (int i = rankOrder.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) if (values[rankOrder[j]] < values[rankOrder[j + 1]]) {
                int r = rankOrder[j];
                rankOrder[j] = rankOrder[j + 1];
                rankOrder[j + 1] = r;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
