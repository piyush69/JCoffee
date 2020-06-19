import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7550876 {
public MyHelperClass NULL;

    public void test(TestHarness harness)  throws Throwable {
        harness.checkPoint("TestOfMD4");
        try {
            Security.addProvider((Provider)(Object)new JarsyncProvider());
            MessageDigest algorithm =(MessageDigest)(Object) NULL; //new MessageDigest();
            algorithm = MessageDigest.getInstance("MD4", "JARSYNC");
        } catch (Exception x) {
            harness.debug(x);
            harness.fail("TestOfMD4.provider");
            throw new Error(x);
        }
        try {
            MyHelperClass algorithm = new MyHelperClass();
            for (int i = 0; i < 64; i++) algorithm.update((byte) 'a');
//            MyHelperClass algorithm = new MyHelperClass();
            byte[] md =(byte[])(Object) algorithm.digest();
            String exp = "52f5076fabd22680234a3fa9f9dc5732";
            MyHelperClass Util = new MyHelperClass();
            harness.check(exp.equals(Util.toHexString(md)), "testSixtyFourA");
        } catch (Exception x) {
            harness.debug(x);
            harness.fail("TestOfMD4.provider");
        }
        try {
            harness.verbose("NOTE: This test may take a while.");
            MyHelperClass algorithm = new MyHelperClass();
            for (int i = 0; i < 536870913; i++) algorithm.update((byte) 'a');
//            MyHelperClass algorithm = new MyHelperClass();
            byte[] md =(byte[])(Object) algorithm.digest();
            String exp = "47d01fa6657f903280232d30b98da482";
            MyHelperClass Util = new MyHelperClass();
            harness.check(exp.equals(Util.toHexString(md)), "test536870913A");
        } catch (Exception x) {
            harness.debug(x);
            harness.fail("TestOfMD4.provider");
        }
        try {
            MyHelperClass algorithm = new MyHelperClass();
            byte[] md =(byte[])(Object) algorithm.digest("a".getBytes());
            String exp = "bde52cb31de33e46245e05fbdbd6fb24";
            MyHelperClass Util = new MyHelperClass();
            harness.check(exp.equals(Util.toHexString(md)), "testA");
        } catch (Exception x) {
            harness.debug(x);
            harness.fail("TestOfMD4.testA");
        }
        try {
            MyHelperClass algorithm = new MyHelperClass();
            byte[] md =(byte[])(Object) algorithm.digest("abc".getBytes());
            String exp = "a448017aaf21d8525fc10ae87aa6729d";
            MyHelperClass Util = new MyHelperClass();
            harness.check(exp.equals(Util.toHexString(md)), "testABC");
        } catch (Exception x) {
            harness.debug(x);
            harness.fail("TestOfMD4.testABC");
        }
        try {
            MyHelperClass algorithm = new MyHelperClass();
            byte[] md =(byte[])(Object) algorithm.digest("message digest".getBytes());
            String exp = "d9130a8164549fe818874806e1c7014b";
            MyHelperClass Util = new MyHelperClass();
            harness.check(exp.equals(Util.toHexString(md)), "testMessageDigest");
        } catch (Exception x) {
            harness.debug(x);
            harness.fail("TestOfMD4.testMessageDigest");
        }
        try {
            MyHelperClass algorithm = new MyHelperClass();
            byte[] md =(byte[])(Object) algorithm.digest("abcdefghijklmnopqrstuvwxyz".getBytes());
            String exp = "d79e1c308aa5bbcdeea8ed63df412da9";
            MyHelperClass Util = new MyHelperClass();
            harness.check(exp.equals(Util.toHexString(md)), "testAlphabet");
        } catch (Exception x) {
            harness.debug(x);
            harness.fail("TestOfMD4.testAlphabet");
        }
        try {
            MyHelperClass algorithm = new MyHelperClass();
            byte[] md =(byte[])(Object) algorithm.digest("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".getBytes());
            String exp = "043f8582f241db351ce627e153e7f0e4";
            MyHelperClass Util = new MyHelperClass();
            harness.check(exp.equals(Util.toHexString(md)), "testAsciiSubset");
        } catch (Exception x) {
            harness.debug(x);
            harness.fail("TestOfMD4.testAsciiSubset");
        }
        try {
            MyHelperClass algorithm = new MyHelperClass();
            byte[] md =(byte[])(Object) algorithm.digest("12345678901234567890123456789012345678901234567890123456789012345678901234567890".getBytes());
            String exp = "e33b4ddc9c38f2199c3e7b164fcc0536";
            MyHelperClass Util = new MyHelperClass();
            harness.check(exp.equals(Util.toHexString(md)), "testEightyNumerics");
        } catch (Exception x) {
            harness.debug(x);
            harness.fail("TestOfMD4.testEightyNumerics");
        }
        try {
            MyHelperClass algorithm = new MyHelperClass();
            algorithm.update("a".getBytes(), 0, 1);
            MessageDigest clone =(MessageDigest)(Object) NULL; //new MessageDigest();
            clone = (MessageDigest) algorithm.clone();
//            MyHelperClass algorithm = new MyHelperClass();
            byte[] md =(byte[])(Object) algorithm.digest();
            String exp = "bde52cb31de33e46245e05fbdbd6fb24";
            MyHelperClass Util = new MyHelperClass();
            harness.check(exp.equals(Util.toHexString(md)), "testCloning #1");
//            MyHelperClass clone = new MyHelperClass();
            clone.update("bc".getBytes(), 0, 2);
//            MyHelperClass clone = new MyHelperClass();
            md = clone.digest();
            exp = "a448017aaf21d8525fc10ae87aa6729d";
//            MyHelperClass Util = new MyHelperClass();
            harness.check(exp.equals(Util.toHexString(md)), "testCloning #2");
        } catch (Exception x) {
            harness.debug(x);
            harness.fail("TestOfMD4.testCloning");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass update(byte o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass toHexString(byte[] o0){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}

class TestHarness {

public MyHelperClass checkPoint(String o0){ return null; }
	public MyHelperClass verbose(String o0){ return null; }
	public MyHelperClass fail(String o0){ return null; }
	public MyHelperClass check(boolean o0, String o1){ return null; }
	public MyHelperClass debug(Exception o0){ return null; }}

class JarsyncProvider {

}
