import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6513769 {
public MyHelperClass NULL;

//    @Before
    public void BeforeTheTest() throws Throwable, Exception {
        URL url = ProfileParserTest.class.getClassLoader().getResource("ca/uhn/hl7v2/conf/parser/tests/example_ack.xml");
        URLConnection conn = url.openConnection();
        InputStream instream = conn.getInputStream();
        if (instream == null) throw new Exception("can't find the xml file");
        BufferedReader in = new BufferedReader(new InputStreamReader(instream));
        int tmp = 0;
        StringBuffer buf = new StringBuffer();
        while ((tmp = in.read()) != -1) {
            buf.append((char) tmp);
        }
        String profileString =(String)(Object) NULL; //new String();
        profileString = buf.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Before {

}

class ProfileParserTest {

}
