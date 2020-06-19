


class c708047 {

    public static void main(String args[]) {
        try {
            URL url = new URL("http://www.hungry.com/");
            InputStream stream =(InputStream)(Object) url.openStream();
            int size = 0;
            while (-1 != (int)(Object)stream.read()) {
                size++;
            }
            stream.close();
            System.out.println("PASSED: new URL() size=" + size);
        } catch (Exception e) {
            System.out.println("FAILED: " + e);
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

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}
