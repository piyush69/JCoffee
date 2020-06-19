


class c19027042 {

    public boolean refreshRequired() {
        boolean status = false;
        MyHelperClass lastModifiedDates = new MyHelperClass();
        Set urls =(Set)(Object) lastModifiedDates.keySet();
        try {
            for (String urlPath :(String[])(Object) (Object[])(Object)urls) {
//                MyHelperClass lastModifiedDates = new MyHelperClass();
                Long lastModifiedDate =(Long)(Object) lastModifiedDates.get(urlPath);
                URL url = new URL(urlPath);
                URLConnection connection =(URLConnection)(Object) url.openConnection();
                connection.connect();
                long newModDate =(long)(Object) connection.getLastModified();
                if (newModDate != lastModifiedDate) {
                    status = true;
                    break;
                }
            }
        } catch (Exception e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.warn("Exception while monitoring update times.", e);
            return true;
        }
        return status;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass warn(String o0, Exception o1){ return null; }
	public MyHelperClass keySet(){ return null; }}

class Set {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass connect(){ return null; }}
