import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14950969 {
public MyHelperClass NULL;
public MyHelperClass name;
	public MyHelperClass createLink(MyHelperClass o0, Date o1){ return null; }
public MyHelperClass from;
	public MyHelperClass to;
	public MyHelperClass list;
	public MyHelperClass log;
	public MyHelperClass setChanged(){ return null; }
	public MyHelperClass parse(String o0){ return null; }
	public MyHelperClass notifyObservers(){ return null; }

    public void run()  throws Throwable {
        BufferedReader reader = null;
        String log =(String)(Object) NULL; //new String();
        log = "Downloading... " + name;
        setChanged();
        notifyObservers();
        try {
            Date marker =(Date)(Object) to;
            int previousSize = 0;
            list.clear();
            do {
                previousSize =(int)(Object) list.size();
                URL url = new URL((String)(Object)createLink(from, marker));
                reader = new BufferedReader(new InputStreamReader(url.openStream()));
                String line = "";
                while ((line = reader.readLine()) != null) {
                    try {
                        IQuoteHistorical quote =(IQuoteHistorical)(Object) parse(line + ",");
                        if (quote != null && !(Boolean)(Object)list.contains(quote)) list.add(quote); else System.err.println(line);
                    } catch (ArithmeticException e) {
                        e.printStackTrace();
                    }
                }
                if ((int)(Object)list.size() > 0) marker =(Date)(Object) list.get((int)(Object)list.size() - 1).getData();
            } while (marker.after((Date)(Object)from) && previousSize != (int)(Object)list.size());
            log =(String)(Object)(MyHelperClass)(Object) "download Completed!";
        } catch (MalformedURLException e) {
            e.printStackTrace();
            log =(String)(Object)(MyHelperClass)(Object) e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
            log =(String)(Object)(MyHelperClass)(Object) e.getMessage();
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
                log =(String)(Object)(MyHelperClass)(Object) e.getMessage();
            }
        }
        setChanged();
        notifyObservers();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass add(IQuoteHistorical o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass contains(IQuoteHistorical o0){ return null; }
	public MyHelperClass getData(){ return null; }
	public MyHelperClass clear(){ return null; }}

class IQuoteHistorical {

}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}
