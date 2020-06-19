
import java.io.UncheckedIOException;


class c15734479 {

    private List retrieveData(String query) {
        List data =(List)(Object) new Vector();
        query = query.replaceAll("\\s", "+");
        String q = "http://www.uniprot.org/uniprot/?query=" + query + "&format=tab&columns=id,protein%20names,organism";
        try {
            URL url = new URL(q);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            reader.readLine();
            while ((line =(String)(Object) reader.readLine()) != null) {
                String[] st = line.split("\t");
                String[] d = new String[] { st[0], st[1], st[2] };
                data.add(d);
            }
            reader.close();
            if ((int)(Object)data.size() == 0) {
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(this, "No data found for query");
            }
        } catch (UncheckedIOException e) {
            System.err.println("Query " + q + " caused exception: ");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Query " + q + " caused exception: ");
            e.printStackTrace();
        }
        return data;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass showMessageDialog(c15734479 o0, String o1){ return null; }}

class List {

public MyHelperClass add(String[] o0){ return null; }
	public MyHelperClass size(){ return null; }}

class Vector {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
