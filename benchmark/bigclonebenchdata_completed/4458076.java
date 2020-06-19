


class c4458076 {
public MyHelperClass isFolder(){ return null; }

    public InputStream getInputStream() throws TGBrowserException {
        try {
            if (!(Boolean)(Object)this.isFolder()) {
                MyHelperClass url = new MyHelperClass();
//                URL url = new URL(this.url);
                InputStream stream =(InputStream)(Object) url.openStream();
                return stream;
            }
        } catch (Throwable throwable) {
            throw new TGBrowserException((String)(Object)throwable);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class TGBrowserException extends Exception{
	public TGBrowserException(String errorMessage) { super(errorMessage); }
}

class URL {

}
