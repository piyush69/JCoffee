import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c11655351 {
public MyHelperClass m_detector;
	public MyHelperClass Assert;

//    @Test
    public void testMark() throws IllegalArgumentException, IOException {
        Assert.assertNotNull(this.m_detector);
        File f = new File("testdocuments/voiddocument/Voiderror.htm");
        Assert.assertTrue("Test file " + f.getAbsolutePath() + " does not exist. ", f.exists());
        URL url = f.toURL();
        this.m_detector.detectCodepage(url.openStream(), 200);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass assertNotNull(MyHelperClass o0){ return null; }
	public MyHelperClass detectCodepage(InputStream o0, int o1){ return null; }
	public MyHelperClass assertTrue(String o0, boolean o1){ return null; }}

class Test {

}
