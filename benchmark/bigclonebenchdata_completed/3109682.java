import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3109682 {
public MyHelperClass mTestData;
	public MyHelperClass encodeHex(byte[] o0){ return null; }

//    @SmallTest
    public void testSha1() throws Throwable, Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-1");
        MyHelperClass mTestData = new MyHelperClass();
        int numTests = mTestData.length;
        for (int i = 0; i < numTests; i++) {
            MyHelperClass mTestData = new MyHelperClass();
            digest.update(mTestData[i].input.getBytes());
            byte[] hash = digest.digest();
            String encodedHash = encodeHex(hash);
            assertEquals(encodedHash, mTestData[i].result);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SmallTest {

}
