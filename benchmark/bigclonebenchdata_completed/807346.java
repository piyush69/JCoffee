


class c807346 {
public MyHelperClass getCodeBase(){ return null; }

    String runScript(String scriptName) {
        String data = "";
        try {
            URL url = new URL(getCodeBase().toString() + scriptName);
            InputStream in =(InputStream)(Object) url.openStream();
            BufferedInputStream buffIn = new BufferedInputStream(in);
            do {
                int temp =(int)(Object) buffIn.read();
                if (temp == -1) break;
                data = data + (char) temp;
            } while (true);
        } catch (Exception e) {
            data = "error!";
        }
        return data;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }}
