import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3761653 {
public MyHelperClass assertEquals(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass executePost(String o0, StringEntity o1){ return null; }
public MyHelperClass EntityUtils;
	public MyHelperClass executeGet(String o0){ return null; }

//    @Test
    public void shouldSetAlias() throws Throwable, Exception {
        MyHelperClass VERSION_1 = new MyHelperClass();
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) executePost("/yum/alias/snapshots/testAlias", new StringEntity(VERSION_1));
//        MyHelperClass VERSION_1 = new MyHelperClass();
        assertEquals(VERSION_1, EntityUtils.toString(response.getEntity()));
//        MyHelperClass VERSION_1 = new MyHelperClass();
        assertEquals(VERSION_1, executeGet("/yum/alias/snapshots/testAlias"));
        MyHelperClass VERSION_2 = new MyHelperClass();
        response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) executePost("/yum/alias/snapshots/testAlias", new StringEntity(VERSION_2));
//        MyHelperClass VERSION_2 = new MyHelperClass();
        assertEquals(VERSION_2, EntityUtils.toString(response.getEntity()));
//        MyHelperClass VERSION_2 = new MyHelperClass();
        assertEquals(VERSION_2, executeGet("/yum/alias/snapshots/testAlias"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Test {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class StringEntity {

StringEntity(MyHelperClass o0){}
	StringEntity(){}}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
