import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9183056 {
public MyHelperClass assertTrue(String o0, MyHelperClass o1){ return null; }
public MyHelperClass fail(){ return null; }
	public MyHelperClass fail(String o0){ return null; }

    public void testHandler() throws MalformedURLException, IOException {
        MyHelperClass imageHasNotBeenInstalledInThisJVM = new MyHelperClass();
        assertTrue("This test can only be run once in a single JVM", imageHasNotBeenInstalledInThisJVM);
        URL url;
        MyHelperClass Handler = new MyHelperClass();
        Handler.installImageUrlHandler((ImageSource) (ImageSource)(Object)new ClassPathXmlApplicationContext("org/springframework/richclient/image/application-context.xml").getBean("imageSource"));
        try {
            url = new URL("image:test");
//            MyHelperClass imageHasNotBeenInstalledInThisJVM = new MyHelperClass();
            imageHasNotBeenInstalledInThisJVM =(MyHelperClass)(Object) false;
        } catch (MalformedURLException e) {
            fail("protocol was not installed");
        }
        url = new URL("image:image.that.does.not.exist");
        try {
            url.openConnection();
            fail();
        } catch (UncheckedIOException e) {
        }
        url = new URL("image:test.image.key");
        url.openConnection();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass installImageUrlHandler(ImageSource o0){ return null; }}

class ImageSource {

}

class ClassPathXmlApplicationContext {

ClassPathXmlApplicationContext(String o0){}
	ClassPathXmlApplicationContext(){}
	public MyHelperClass getBean(String o0){ return null; }}

class NoSuchImageResourceException extends Exception{
	public NoSuchImageResourceException(String errorMessage) { super(errorMessage); }
}
