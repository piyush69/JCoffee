


class c20862695 {

    public HashMap parseFile(File newfile) throws IOException {
        String s;
        String[] tokens;
        int nvalues = 0;
        double num1, num2, num3;
        boolean baddata = false;
        URL url =(URL)(Object) newfile.toURL();
        InputStream is =(InputStream)(Object) url.openStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        HashMap data = new HashMap();
        while ((s =(String)(Object) br.readLine()) != null) {
            tokens = s.split("\\s+");
            nvalues = tokens.length;
            if (nvalues == 2) {
                data.put(new String(tokens[0]), new Double(Double.parseDouble(tokens[1])));
            } else {
                System.out.println("Sorry, trouble reading reference file.");
            }
        }
        return data;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass toURL(){ return null; }}

class HashMap {

public MyHelperClass put(String o0, Double o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}
