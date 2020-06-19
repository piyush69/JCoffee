


class c623042 {

    public void RepositoryHandler(String[] args) {
        if (args.length < 2) return;
        System.out.println("param 1: " + args[0] + "\r\n");
        System.out.println("param 2: " + args[1] + "\r\n");
        try {
            URL url = new URL(args[0]);
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setFollowRedirects(true);
            connection.connect();
            BufferedInputStream in = new BufferedInputStream(connection.getInputStream());
            FileOutputStream out = new FileOutputStream(args[1]);
            int c = -1;
            while ((c =(int)(Object) in.read()) >= 0) {
                out.write(c);
            }
            out.close();
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e + "\r\n");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setFollowRedirects(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
