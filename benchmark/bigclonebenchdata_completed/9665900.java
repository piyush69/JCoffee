


class c9665900 {
public MyHelperClass logger;

    @SuppressWarnings("static-access")
    public FastCollection load(Link link) {
        URL url = null;
        FastCollection links =(FastCollection)(Object) new FastList();
        FTPClient ftp = null;
        try {
            String address =(String)(Object) link.getURI();
            MyHelperClass JGetFileUtils = new MyHelperClass();
            address =(String)(Object) JGetFileUtils.removeTrailingString(address, "/");
            url = new URL(address);
            MyHelperClass host = new MyHelperClass();
            host = url.getHost();
            String folder =(String)(Object) url.getPath();
            MyHelperClass logger = new MyHelperClass();
            logger.info("Traversing: " + address);
//            MyHelperClass host = new MyHelperClass();
            ftp = new FTPClient(host);
            if (!(Boolean)(Object)ftp.connected()) {
                ftp.connect();
            }
            ftp.login("anonymous", "me@mymail.com");
//            MyHelperClass host = new MyHelperClass();
            logger.info("Connected to " + host + ".");
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("changing dir to " + folder);
            ftp.chdir(folder);
            String[] files =(String[])(Object) ftp.dir();
            for (String file : files) {
                links.add(address + "/" + file);
            }
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(e.getMessage());
//            MyHelperClass logger = new MyHelperClass();
            logger.debug(e.getStackTrace());
        } finally {
            try {
                ftp.quit();
            } catch (Exception e) {
                MyHelperClass host = new MyHelperClass();
                logger.error("Failed to logout or disconnect from the ftp server: ftp://" + host);
            }
        }
        return links;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass removeTrailingString(String o0, String o1){ return null; }
	public MyHelperClass debug(StackTraceElement[] o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class Link {

public MyHelperClass getURI(){ return null; }}

class FastCollection {

public MyHelperClass add(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class FastList {

}

class FTPClient {

FTPClient(){}
	FTPClient(MyHelperClass o0){}
	public MyHelperClass connected(){ return null; }
	public MyHelperClass quit(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass dir(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass chdir(String o0){ return null; }}
