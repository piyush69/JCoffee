
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18315736 {

    private List getTaxaList() {
        List taxa =(List)(Object) new Vector();
        MyHelperClass m_domain = new MyHelperClass();
        String domain =(String)(Object) m_domain.getStringValue();
        String id = "";
        if (domain.equalsIgnoreCase("Eukaryota")) id = "eukaryota";
        try {
            URL url = new URL("http://www.ebi.ac.uk/genomes/" + id + ".details.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String link = "";
            String key = "";
            String name = "";
            int counter = 0;
            String line = "";
            reader.readLine();
            while ((line =(String)(Object) reader.readLine()) != null) {
                String[] st = line.split("\t");
                ena_details ena = new ena_details(st[0], st[1], st[2], st[3], st[4]);
                MyHelperClass ENADataHolder = new MyHelperClass();
                ENADataHolder.instance().put(ena.desc, ena);
                taxa.add(ena.desc);
            }
            reader.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return taxa;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass instance(){ return null; }
	public MyHelperClass put(MyHelperClass o0, ena_details o1){ return null; }
	public MyHelperClass getStringValue(){ return null; }}

class List {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class Vector {

}

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

class ena_details {
public MyHelperClass desc;
ena_details(){}
	ena_details(String o0, String o1, String o2, String o3, String o4){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
