


class c18539809 {

    private Collection doSearch(final URL url) throws IOException {
        final Collection result =(Collection)(Object) new ArrayList();
        final InputStream is =(InputStream)(Object) url.openStream();
        final ReadHTML parse = new ReadHTML(is);
        final StringBuilder buffer = new StringBuilder();
        boolean capture = false;
        int ch;
        while ((ch =(int)(Object) parse.read()) != -1) {
            if (ch == 0) {
                final Tag tag =(Tag)(Object) parse.getTag();
                if ((boolean)(Object)tag.getName().equalsIgnoreCase("url")) {
                    buffer.setLength(0);
                    capture = true;
                } else if ((boolean)(Object)tag.getName().equalsIgnoreCase("/url")) {
                    result.add(new URL(buffer.toString()));
                    buffer.setLength(0);
                    capture = false;
                }
            } else {
                if (capture) {
                    buffer.append((char) ch);
                }
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass equalsIgnoreCase(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class Collection {

public MyHelperClass add(URL o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

}

class InputStream {

}

class ReadHTML {

ReadHTML(InputStream o0){}
	ReadHTML(){}
	public MyHelperClass getTag(){ return null; }
	public MyHelperClass read(){ return null; }}

class Tag {

public MyHelperClass getName(){ return null; }}
