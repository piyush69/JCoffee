


class c19667000 {

    public static Reader getReader(String url) throws MalformedURLException, IOException {
        if (url.startsWith("file:")) return (Reader)(Object)new FileReader(url.substring(5)); else if (url.startsWith("http:")) return (Reader)(Object)new InputStreamReader(new URL(url).openStream());
        throw new MalformedURLException("Invalid URI schema, file: or http: expected.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Reader {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
