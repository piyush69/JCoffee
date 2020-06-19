


class c22919268 {

    public void parse(String file) throws IOException, URISyntaxException {
        if (file == null) {
            throw new IOException("File '" + file + "' file not found");
        }
        InputStream is = null;
        if (file.startsWith("http://")) {
            URL url = new URL(file);
            is =(InputStream)(Object) url.openStream();
        } else if (file.startsWith("file:/")) {
            is =(InputStream)(Object) new FileInputStream((String)(Object)new File(new URI(file)));
        } else {
            is =(InputStream)(Object) new FileInputStream(file);
        }
        if (file.endsWith(".gz")) {
            is =(InputStream)(Object) new GZIPInputStream(is);
        }
        parse((String)(Object)new InputStreamReader(is));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class File {

File(URI o0){}
	File(){}}

class URI {

URI(String o0){}
	URI(){}}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
