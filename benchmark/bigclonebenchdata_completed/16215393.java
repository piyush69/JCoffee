import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16215393 {
public MyHelperClass NULL;
public MyHelperClass urlComboBox;

    public void importSequences()  throws Throwable {
        ArrayList<String> names =(ArrayList<String>)(Object) NULL; //new ArrayList<String>();
        names = new ArrayList<String>();
        ArrayList<String> sequences =(ArrayList<String>)(Object) NULL; //new ArrayList<String>();
        sequences = new ArrayList<String>();
        try {
MyHelperClass[] urls = new MyHelperClass[5];
            InputStream is =(InputStream)(Object) urls[(int)(Object)urlComboBox.getSelectedIndex()].openStream();
            ImportHelper helper = new ImportHelper(new InputStreamReader(is));
            int ch =(int)(Object) helper.read();
            while (ch != '>') {
                ch =(int)(Object) helper.read();
            }
            do {
                String line =(String)(Object) helper.readLine();
                StringTokenizer tokenizer = new StringTokenizer(line, " \t");
                String name = tokenizer.nextToken();
                StringBuffer seq = new StringBuffer();
                helper.readSequence(seq, ">", Integer.MAX_VALUE, "-", "?", "", null);
                ch =(int)(Object) helper.getLastDelimiter();
//                MyHelperClass names = new MyHelperClass();
                names.add(name);
//                MyHelperClass sequences = new MyHelperClass();
                sequences.add(seq.toString());
            } while (ch == '>');
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
        } catch (ArrayStoreException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] urls;
public MyHelperClass add(String o0){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass getSelectedIndex(){ return null; }}

class ImportHelper {

ImportHelper(){}
	ImportHelper(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass getLastDelimiter(){ return null; }
	public MyHelperClass readSequence(StringBuffer o0, String o1, int o2, String o3, String o4, String o5, Object o6){ return null; }
	public MyHelperClass read(){ return null; }}
