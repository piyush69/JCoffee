


class c720361 {

    public static void main(String[] args) throws Exception {
        int result = 20;
        if (args.length == 1) {
            StringBuffer urlString = new StringBuffer(args[0]);
            if (urlString.lastIndexOf("/") != urlString.length() - 1) {
                urlString.append('/');
            }
            urlString.append("GetConfig.jsp");
            URLConnection conn =(URLConnection)(Object) (new URL(urlString.toString()).openConnection());
            MyHelperClass Configuration = new MyHelperClass();
            System.out.println(Configuration.readObject(conn.getInputStream()));
            result = 0;
        } else {
            System.err.println("usage: GetConfig <URL>");
        }
        System.exit(result);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readObject(MyHelperClass o0){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
