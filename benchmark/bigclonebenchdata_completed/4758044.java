


class c4758044 {

    private static void readServicesFromUrl(Collection list, URL url) throws IOException {
        InputStream in =(InputStream)(Object) url.openStream();
        try {
            if (in == null) return;
            BufferedReader r = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            while (true) {
                String line =(String)(Object) r.readLine();
                if (line == null) break;
                int idx = line.indexOf('#');
                if (idx != -1) line = line.substring(0, idx);
                line = line.trim();
                if (line.length() == 0) continue;
                list.add(line);
            }
        } finally {
            try {
                if (in != null) in.close();
            } catch (Throwable ignore) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Collection {

public MyHelperClass add(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}
