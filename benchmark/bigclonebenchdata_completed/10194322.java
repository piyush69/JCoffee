import java.io.*;
import java.lang.*;
import java.util.*;



class c10194322 {

    public static void publish(String server, String id, String passwd, String path, String html) throws SocketException, IOException, LoginFailException {
        MyHelperClass logger = new MyHelperClass();
        logger.info("Connect to FTP Server " + server);
        FTPClient f = new FTPClient();
        f.connect(server);
        if ((boolean)(Object)f.login(id, passwd) == false) {
//            MyHelperClass logger = new MyHelperClass();
            logger.info("Fail to login with id=" + id);
            throw new LoginFailException(id, passwd);
        }
        f.changeWorkingDirectory(path);
//        MyHelperClass logger = new MyHelperClass();
        logger.info("Start to upload");
        f.storeFile("index.html", new ByteArrayInputStream(html.getBytes("utf-8")));
//        MyHelperClass logger = new MyHelperClass();
        logger.info("Upload index.html");
        f.storeFile("main.css", new FileInputStream("web/main.css"));
//        MyHelperClass logger = new MyHelperClass();
        logger.info("Upload main.css");
        f.storeFile("cafelibrary.js", new FileInputStream("web/cafelibrary.js"));
//        MyHelperClass logger = new MyHelperClass();
        logger.info("Upload cafelibrary.js");
        f.makeDirectory("img");
        f.changeWorkingDirectory("img");
        for (int i = 0; i <= 5; i++) {
            String fileName = "favorite_star_" + i + ".png";
            f.storeFile(fileName, new FileInputStream("web/img/" + fileName));
//            MyHelperClass logger = new MyHelperClass();
            logger.info("Upload " + fileName);
        }
        f.logout();
        f.disconnect();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class LoginFailException extends Exception{
	public LoginFailException(String errorMessage) { super(errorMessage); }
	LoginFailException(String o0, String o1){}
	LoginFailException(){}
}

class FTPClient {

public MyHelperClass logout(){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass storeFile(String o0, ByteArrayInputStream o1){ return null; }
	public MyHelperClass makeDirectory(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass storeFile(String o0, FileInputStream o1){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}
