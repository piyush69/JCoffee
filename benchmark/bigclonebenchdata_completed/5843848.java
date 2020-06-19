import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5843848 {
public static MyHelperClass NULL;
//public MyHelperClass NULL;
	public static MyHelperClass _(String o0){ return null; }
//public MyHelperClass _(String o0){ return null; }

    private static void loadListFromRecouces(String category, URL url, DataSetArray list, final StatusLineManager slm)  throws Throwable {
        int i =(int)(Object) NULL; //new int();
        i = 0;
        try {
            if (url == null) return;
            InputStream in = url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF8"));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                strLine = strLine.trim();
//                MyHelperClass i = new MyHelperClass();
                i++;
                if (slm != null) {
                    MyHelperClass Display = new MyHelperClass();
                    Display.getDefault().syncExec(new Runnable() {

                        public void run() {
                            MyHelperClass i = new MyHelperClass();
                            slm.setMessage(_("Importing country code " + i));
                        }
                    });
                }
                if (!strLine.isEmpty() && !strLine.startsWith("#")) {
                    String parts[] = strLine.split("=", 2);
                    if (parts.length == 2) {
                        String key = parts[0].trim();
                        String value = parts[1].trim();
                        MyHelperClass DataUtils = new MyHelperClass();
                        key =(String)(Object) DataUtils.replaceAllAccentedChars(key).toUpperCase();
                        DataSetList newListEntry = new DataSetList(category, key, value);
                        list.addNewDataSetIfNew(newListEntry);
                    }
                }
            }
            in.close();
        } catch (IOException e) {
            MyHelperClass Logger = new MyHelperClass();
            Logger.logError(e, "Error loading " + url.getFile());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int i;
public MyHelperClass syncExec( Runnable o0){ return null; }
	public MyHelperClass syncExec(){ return null; }
	public MyHelperClass toUpperCase(){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass logError(IOException o0, String o1){ return null; }
	public MyHelperClass replaceAllAccentedChars(String o0){ return null; }}

class DataSetArray {

public MyHelperClass addNewDataSetIfNew(DataSetList o0){ return null; }}

class DataSetList {

DataSetList(){}
	DataSetList(String o0, String o1, String o2){}}

class StatusLineManager {

public MyHelperClass setMessage(MyHelperClass o0){ return null; }}
