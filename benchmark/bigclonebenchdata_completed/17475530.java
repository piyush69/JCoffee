import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17475530 {
public MyHelperClass IOUtils;

//    @TestProperties(name = "Simple test for adding different image files to report as link")
    public void testAddLinkToImage() throws Throwable, Exception {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("regression/generic/images/splash.jpg");
        MyHelperClass report = new MyHelperClass();
        report.report(report.getCurrentTestFolder() + System.getProperty("file.separator") + "splash.jpg");
//        MyHelperClass report = new MyHelperClass();
        IOUtils.copy(in, new FileOutputStream(new File(report.getCurrentTestFolder() + System.getProperty("file.separator") + "splash.jpg")));
        in = this.getClass().getClassLoader().getResourceAsStream("regression/generic/images/blue.png");
//        MyHelperClass report = new MyHelperClass();
        IOUtils.copy(in, new FileOutputStream(new File(report.getCurrentTestFolder() + System.getProperty("file.separator") + "blue.png")));
        in = this.getClass().getClassLoader().getResourceAsStream("regression/generic/images/classDir.gif");
//        MyHelperClass report = new MyHelperClass();
        IOUtils.copy(in, new FileOutputStream(new File(report.getCurrentTestFolder() + System.getProperty("file.separator") + "classDir.gif")));
//        MyHelperClass report = new MyHelperClass();
        report.addLink("Link to JPG", "splash.jpg");
//        MyHelperClass report = new MyHelperClass();
        report.addLink("Link to PNG", "blue.png");
//        MyHelperClass report = new MyHelperClass();
        report.addLink("Link to GIF", "classDir.gif");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCurrentTestFolder(){ return null; }
	public MyHelperClass report(String o0){ return null; }
	public MyHelperClass addLink(String o0, String o1){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class TestProperties {

}
