
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18248689 {
public MyHelperClass Configurator;

    @SuppressWarnings("unchecked")
    private List getWordList() {
        MyHelperClass CONFIG_ID = new MyHelperClass();
        IConfiguration config =(IConfiguration)(Object) Configurator.getDefaultConfigurator().getConfig(CONFIG_ID);
        List wList = (List)(List)(Object) config.getObject("word_list");
        if (wList == null) {
            wList =(List)(Object) new ArrayList();
            InputStream resrc = null;
            try {
                MyHelperClass list_url = new MyHelperClass();
                resrc =(InputStream)(Object) (new URL(list_url).openStream());
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (resrc != null) {
                BufferedReader br = new BufferedReader(new InputStreamReader(resrc));
                String line;
                try {
                    while ((line =(String)(Object) br.readLine()) != null) {
                        line = line.trim();
                        if (line.length() != 0) {
                            wList.add(line);
                        }
                    }
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                } finally {
                    if (br != null) {
                        try {
                            br.close();
                        } catch (UncheckedIOException e) {
                        }
                    }
                }
            }
        }
        return wList;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDefaultConfigurator(){ return null; }
	public MyHelperClass getConfig(MyHelperClass o0){ return null; }}

class List {

public MyHelperClass add(String o0){ return null; }}

class IConfiguration {

public MyHelperClass getObject(String o0){ return null; }}

class ArrayList {

}

class InputStream {

}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
