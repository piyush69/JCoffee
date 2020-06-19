import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6182434 {

    private static String calculateScenarioMD5(Scenario scenario) throws Throwable, Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        Vector<JTest> allTests =(Vector<JTest>)(Object) scenario.getTests();
        for (JTest t : allTests) {
            String name =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) t.getTestName() + (int)(Object)t.getTestId();
            String parameters = "";
            if ((RunnerTest)(Object)t instanceof RunnerTest) {
                parameters =(String)(Object) ((RunnerTest)(RunnerTest)(Object) t).getPropertiesAsString();
            }
            md.update(name.getBytes());
            md.update(parameters.getBytes());
        }
        byte[] hash = md.digest();
        BigInteger result = new BigInteger(hash);
        String rc = result.toString(16);
        return rc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Scenario {

public MyHelperClass getTests(){ return null; }}

class JTest {

public MyHelperClass getTestId(){ return null; }
	public MyHelperClass getTestName(){ return null; }}

class RunnerTest {

public MyHelperClass getPropertiesAsString(){ return null; }}
