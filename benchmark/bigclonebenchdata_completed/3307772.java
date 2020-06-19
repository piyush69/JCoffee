


class c3307772 {
public MyHelperClass getSessionIDSuffix(){ return null; }

    public void deleteScript(Integer id) {
        InputStream is = null;
        try {
            MyHelperClass strServlet = new MyHelperClass();
            URL url = new URL((int)(Object)strServlet + (int)(Object)getSessionIDSuffix() + "?deleteScript=" + id);
            System.out.println("requesting: " + url);
            is =(InputStream)(Object) url.openStream();
            while ((int)(Object)is.read() != -1) ;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (Exception e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
