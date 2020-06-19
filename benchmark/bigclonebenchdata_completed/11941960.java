


class c11941960 {

    String[] openUrlAsList(String address) {
        MyHelperClass IJ = new MyHelperClass();
        IJ.showStatus("Connecting to " + IJ.URL);
        Vector v = new Vector();
        try {
            URL url = new URL(address);
            InputStream in =(InputStream)(Object) url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line;
            while (true) {
                line =(String)(Object) br.readLine();
                if (line == null) break;
                if (!line.equals("")) v.addElement(line);
            }
            br.close();
        } catch (Exception e) {
        }
        String[] lines = new String[(int)(Object)v.size()];
        v.copyInto((String[]) lines);
//        MyHelperClass IJ = new MyHelperClass();
        IJ.showStatus("");
        return lines;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass URL;
public MyHelperClass showStatus(String o0){ return null; }}

class Vector {

public MyHelperClass copyInto(String[] o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass addElement(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

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
