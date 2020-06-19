import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c17583193 {
public MyHelperClass bluetoothStack;

    public boolean populateRecord(int[] attrIDs) throws IOException {
        MyHelperClass device = new MyHelperClass();
        if (device == null) {
            throw new RuntimeException("This is local device service record");
        }
        if (attrIDs == null) {
            throw new NullPointerException("attrIDs is null");
        }
        if (attrIDs.length == 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < attrIDs.length; i++) {
            if (attrIDs[i] < 0x0000 || attrIDs[i] > 0xffff) {
                throw new IllegalArgumentException();
            }
        }
        int[] sortIDs = new int[attrIDs.length];
        System.arraycopy(attrIDs, 0, sortIDs, 0, attrIDs.length);
        for (int i = 0; i < sortIDs.length; i++) {
            for (int j = 0; j < sortIDs.length - i - 1; j++) {
                if (sortIDs[j] > sortIDs[j + 1]) {
                    int temp = sortIDs[j];
                    sortIDs[j] = sortIDs[j + 1];
                    sortIDs[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < sortIDs.length - 1; i++) {
            if (sortIDs[i] == sortIDs[i + 1]) {
                throw new IllegalArgumentException();
            }
            MyHelperClass DebugLog = new MyHelperClass();
            DebugLog.debug0x("query for ", sortIDs[i]);
        }
        MyHelperClass DebugLog = new MyHelperClass();
        DebugLog.debug0x("query for ", sortIDs[sortIDs.length - 1]);
        return(boolean)(Object) this.bluetoothStack.populateServicesRecordAttributeValues(this, sortIDs);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass populateServicesRecordAttributeValues(c17583193 o0, int[] o1){ return null; }
	public MyHelperClass debug0x(String o0, int o1){ return null; }}
