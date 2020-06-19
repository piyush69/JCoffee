
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13556011 {

    public static String[] getHints(String query) {
        try {
            URL url = new URL("http://www.ebi.ac.uk/integr8/OrganismSearch.do?action=orgNames&orgName=" + query);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            String dest = new String();
            while ((inputLine =(String)(Object) in.readLine()) != null) dest = dest.concat(inputLine);
            in.close();
            MyHelperClass taxonPattern = new MyHelperClass();
            Matcher m =(Matcher)(Object) taxonPattern.matcher(dest);
            ArrayList strings = new ArrayList();
            while ((boolean)(Object)m.find()) {
                strings.add(m.group(1));
            }
            return(String[])(Object) strings.toArray(new String[] {});
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return new String[0];
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass matcher(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass group(int o0){ return null; }}

class ArrayList {

public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass toArray(String[] o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
