import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11622990 {
public MyHelperClass terms;
	public MyHelperClass modelMean;
	public MyHelperClass modelStddev;
	public MyHelperClass parseAndAdd(List o0, String o1){ return null; }

    public  void ContourGenerator(URL url, float modelMean, float modelStddev) throws Throwable, IOException {
        this.modelMean =(MyHelperClass)(Object) modelMean;
        this.modelStddev =(MyHelperClass)(Object) modelStddev;
        List termsList = new ArrayList();
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        line = reader.readLine();
        while (line != null) {
            if (!line.startsWith("***")) {
                parseAndAdd(termsList, line);
            }
            line = reader.readLine();
        }
        terms =(MyHelperClass)(Object) (F0ModelTerm[]) termsList.toArray((Object[])(Object)terms);
        reader.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class F0ModelTerm {

}
