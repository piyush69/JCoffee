import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2750606 {
public MyHelperClass data;
	public MyHelperClass getAttachmentUrl(){ return null; }

    private void fetch() throws Throwable, IOException {
        if (getAttachmentUrl() != null && (!(Boolean)(Object)getAttachmentUrl().isEmpty())) {
            InputStream input = null;
            ByteArrayOutputStream output = null;
            try {
                URL url = new URL((String)(Object)getAttachmentUrl());
                input = url.openStream();
                output = new ByteArrayOutputStream();
                int i;
                while ((i = input.read()) != -1) {
                    output.write(i);
                }
                this.data =(MyHelperClass)(Object) output.toByteArray();
            } finally {
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isEmpty(){ return null; }}
