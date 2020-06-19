
import java.io.UncheckedIOException;


class c7670003 {

//    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        URL url;
        try {
            url = new URL("platform:/plugin/de.vogella.rcp.plugin.filereader/files/test.txt");
            InputStream inputStream =(InputStream)(Object) url.openConnection().getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }}

class ExecutionEvent {

}

class ExecutionException extends Exception{
	public ExecutionException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
