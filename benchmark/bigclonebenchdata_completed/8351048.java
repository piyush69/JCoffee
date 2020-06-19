


class c8351048 {

    public InputStream getResourceStream(String resource) {
        try {
            URL url =(URL)(Object) getClass().getResource(resource);
            System.out.println("URL: " + url);
            System.out.println("Read ROM " + resource);
            MyHelperClass codebase = new MyHelperClass();
            if (url == null) url = new URL(codebase + resource);
            return(InputStream)(Object) url.openConnection().getInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
