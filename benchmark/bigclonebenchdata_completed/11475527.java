


class c11475527 {

    void addDataFromURL(URL theurl) {
        String line;
        InputStream in = null;
        try {
            in =(InputStream)(Object) theurl.openStream();
            BufferedReader data = new BufferedReader(new InputStreamReader(in));
            while ((line =(String)(Object) data.readLine()) != null) {
                MyHelperClass thetext = new MyHelperClass();
                thetext.append(line + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            MyHelperClass thetext = new MyHelperClass();
            thetext.append(theurl.toString());
        }
        try {
            in.close();
        } catch (Exception e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass append(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
