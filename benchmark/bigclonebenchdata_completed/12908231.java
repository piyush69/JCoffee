import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12908231 {
public MyHelperClass fDrawing;
	public MyHelperClass view(){ return null; }
	public MyHelperClass initDrawing(){ return null; }
	public MyHelperClass showStatus(String o0){ return null; }
	public MyHelperClass getCodeBase(){ return null; }

    private void readFromStorableInput(String filename)  throws Throwable {
        try {
            URL url = new URL((URL)(Object)getCodeBase(), filename);
            InputStream stream = url.openStream();
            StorableInput input = new StorableInput(stream);
            fDrawing.release();
            fDrawing =(MyHelperClass)(Object) (Drawing)(Drawing)(Object) input.readStorable();
            view().setDrawing(fDrawing);
        } catch (IOException e) {
            initDrawing();
            showStatus("Error:" + e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDrawing(MyHelperClass o0){ return null; }
	public MyHelperClass release(){ return null; }}

class StorableInput {

StorableInput(InputStream o0){}
	StorableInput(){}
	public MyHelperClass readStorable(){ return null; }}

class Drawing {

}
