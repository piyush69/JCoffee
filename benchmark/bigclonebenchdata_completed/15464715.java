
import java.io.UncheckedIOException;


class c15464715 {

    private String sendQuery(String query) {
        File xmlServerResponse = null;
        String serverResponse = "";
        try {
            MyHelperClass Calendar = new MyHelperClass();
            long start =(long)(Object) Calendar.getInstance().getTimeInMillis();
            System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("    consulta de busqueda -> " + query);
            URL url = new URL(query);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            while ((line =(String)(Object) in.readLine()) != null) {
                serverResponse += line;
            }
//            MyHelperClass Calendar = new MyHelperClass();
            long ahora = ((long)(Object)Calendar.getInstance().getTimeInMillis() - start);
            System.out.println(" Tiempo transcurrido en la consulta (en milesimas) -> " + ahora);
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return serverResponse;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getTimeInMillis(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class File {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
