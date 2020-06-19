import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11353263 {
public MyHelperClass IOUtils;
	public MyHelperClass createTestData(int o0){ return null; }

//    @Test
//    @Ignore
    public void testToJson() throws Throwable, IOException {
        JsonSerializer js =(JsonSerializer)(Object) new StreamingJsonSerializer(new ObjectMapper());
        BulkOperation op =(BulkOperation)(Object) js.createBulkOperation(createTestData(10000), false);
        IOUtils.copy(op.getData(), System.out);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, PrintStream o1){ return null; }}

class Test {

}

class Ignore {

}

class JsonSerializer {

public MyHelperClass createBulkOperation(MyHelperClass o0, boolean o1){ return null; }}

class StreamingJsonSerializer {

StreamingJsonSerializer(ObjectMapper o0){}
	StreamingJsonSerializer(){}}

class ObjectMapper {

}

class BulkOperation {

public MyHelperClass getData(){ return null; }}
