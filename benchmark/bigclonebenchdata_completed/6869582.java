
import java.io.UncheckedIOException;


class c6869582 {

    private void createPolicy(String policyName) throws SPLException {
        URL url =(URL)(Object) getClass().getResource(policyName + ".spl");
        StringBuffer contents = new StringBuffer();
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = null;
            while ((line =(String)(Object) input.readLine()) != null) {
                contents.append(line);
                contents.append(System.getProperty("line.separator"));
            }
            input.close();
            System.out.println(policyName);
            System.out.println(contents.toString());
            MyHelperClass jspl = new MyHelperClass();
            boolean createReturn =(boolean)(Object) jspl.createPolicy(policyName, contents.toString());
            System.out.println("Policy Created : " + policyName + " - " + createReturn);
            System.out.println("");
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createPolicy(String o0, String o1){ return null; }}

class SPLException extends Exception{
	public SPLException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
