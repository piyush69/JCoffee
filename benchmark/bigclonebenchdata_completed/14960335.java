


class c14960335 {

    private String readData(URL url) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer responseBuffer = new StringBuffer();
            String line;
            while ((line =(String)(Object) in.readLine()) != null) {
                responseBuffer.append(line);
            }
            in.close();
            return new String(responseBuffer);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
