


class c12915753 {

    private String readDataFromUrl(URL url) throws IOException {
        InputStream inputStream = null;
        InputStreamReader streamReader = null;
        BufferedReader in = null;
        StringBuffer data = new StringBuffer();
        try {
            inputStream =(InputStream)(Object) url.openStream();
            streamReader = new InputStreamReader(inputStream);
            in = new BufferedReader(streamReader);
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) data.append(inputLine);
        } finally {
            if (in != null) {
                in.close();
            }
            if (streamReader != null) {
                streamReader.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return data.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}
