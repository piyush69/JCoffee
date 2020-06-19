import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5053350 {
public MyHelperClass LicenseUtils;
	public MyHelperClass assertThat(String o0, String o1, MyHelperClass o2){ return null; }
public MyHelperClass context;
	public MyHelperClass equalTo(String o0){ return null; }

//    @Test
    public void testGrantLicense() throws Throwable, Exception {
        MyHelperClass context = new MyHelperClass();
        context.turnOffAuthorisationSystem();
//        MyHelperClass context = new MyHelperClass();
        Item item = Item.create(context);
        MyHelperClass ConfigurationManager = new MyHelperClass();
        String defaultLicense = ConfigurationManager.getDefaultSubmissionLicense();
//        MyHelperClass context = new MyHelperClass();
        LicenseUtils.grantLicense(context, item, defaultLicense);
        StringWriter writer = new StringWriter();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(item.getBundles("LICENSE")[0].getBitstreams()[0].retrieve(), writer);
        String license = writer.toString();
        assertThat("testGrantLicense 0", license, equalTo(defaultLicense));
        context.restoreAuthSystemState();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass turnOffAuthorisationSystem(){ return null; }
	public MyHelperClass getDefaultSubmissionLicense(){ return null; }
	public MyHelperClass restoreAuthSystemState(){ return null; }}

class Test {

}

class Item {

public MyHelperClass create(MyHelperClass o0){ return null; }
	public MyHelperClass getBundles(String o0){ return null; }}
