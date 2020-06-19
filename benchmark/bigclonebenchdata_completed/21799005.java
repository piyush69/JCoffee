
import java.io.UncheckedIOException;


class c21799005 {

    public static List readListFile(URL url) {
        List names =(List)(Object) new ArrayList();
        if (url != null) {
            InputStream in = null;
            try {
                in =(InputStream)(Object) url.openStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                String line = "";
                while ((line =(String)(Object) reader.readLine()) != null) {
                    if (!line.startsWith("#")) {
                        names.add(line);
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (in != null) in.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
        return names;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class List {

public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
