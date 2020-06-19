


class c18417069 {

    public static int getUrl(final String s) {
        try {
            final URL url = new URL(s);
            final BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            int count = 0;
            String data = null;
            while ((data =(String)(Object) reader.readLine()) != null) {
                System.out.printf("Results(%3d) of data: %s\n", count, data);
                ++count;
            }
            return count;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
