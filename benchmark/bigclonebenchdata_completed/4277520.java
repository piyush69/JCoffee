


class c4277520 {

    private void loadMap(URI uri) throws IOException {
        BufferedReader reader = null;
        InputStream stream = null;
        try {
            URL url =(URL)(Object) uri.toURL();
            stream =(InputStream)(Object) url.openStream();
            if ((boolean)(Object)url.getFile().endsWith(".gz")) {
                stream =(InputStream)(Object) new GZIPInputStream(stream);
            }
            reader = new BufferedReader(new InputStreamReader(stream));
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                line = line.trim();
                if (line.length() > 0) {
                    String[] parts = line.split(" ");
                    if (parts.length == 2) {
                        MyHelperClass pinyinZhuyinMap = new MyHelperClass();
                        pinyinZhuyinMap.put(parts[0], parts[1]);
                        MyHelperClass zhuyinPinyinMap = new MyHelperClass();
                        zhuyinPinyinMap.put(parts[1], parts[0]);
                    }
                }
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }}

class URI {

public MyHelperClass toURL(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
