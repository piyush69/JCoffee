


class c4562924 {

    public static void readTestData(String getDkpUrl) throws Exception {
        final URL url = new URL(getDkpUrl);
        final InputStream is =(InputStream)(Object) url.openStream();
        try {
            final LineNumberReader rd = new LineNumberReader(new BufferedReader(new InputStreamReader(is)));
            String line =(String)(Object) rd.readLine();
            while (line != null) {
                System.out.println(line);
                line =(String)(Object) rd.readLine();
            }
        } finally {
            is.close();
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

class InputStream {

public MyHelperClass close(){ return null; }}

class LineNumberReader {

LineNumberReader(BufferedReader o0){}
	LineNumberReader(){}
	public MyHelperClass readLine(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
