import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c12039034 {

    public static ArrayList<RoleName> importRoles(String urlString) {
        ArrayList<RoleName> results = new ArrayList<RoleName>();
        try {
            URL url = new URL(urlString);
            BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
            StringBuffer buff = new StringBuffer();
            String line;
            while ((line = in.readLine()) != null) {
                buff.append(line);
                if (line.equals("</RoleName>")) {
                    MyHelperClass ProfileParser = new MyHelperClass();
                    RoleName name =(RoleName)(Object) ProfileParser.parseRoleName(buff.toString());
                    results.add(name);
                    buff = new StringBuffer();
                } else {
                    MyHelperClass NL = new MyHelperClass();
                    buff.append(NL);
                }
            }
        } catch (UncheckedIOException e) {
        } catch (IOException e) {
        } catch (ArithmeticException e) {
        }
        return results;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parseRoleName(String o0){ return null; }}

class RoleName {

}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class ParsingException extends Exception{
	public ParsingException(String errorMessage) { super(errorMessage); }
}
