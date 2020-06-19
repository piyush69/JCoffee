import java.io.*;
import java.lang.*;
import java.util.*;



class c22258300 {
public MyHelperClass NULL;
public MyHelperClass IMGTEMPLATE;
	public MyHelperClass ORIGINAL_WMF;
	public MyHelperClass setTop(MyHelperClass o0){ return null; }
	public MyHelperClass getHeight(){ return null; }
	public MyHelperClass getWidth(){ return null; }
	public MyHelperClass setRight(MyHelperClass o0){ return null; }

    private void processParameters() throws BadElementException, IOException {
        MyHelperClass type = new MyHelperClass();
        type = IMGTEMPLATE;
        MyHelperClass originalType = new MyHelperClass();
        originalType = ORIGINAL_WMF;
        InputStream is = null;
        try {
            String errorID;
            MyHelperClass rawData = new MyHelperClass();
            if (rawData == null) {
                MyHelperClass url = new MyHelperClass();
                is =(InputStream)(Object) url.openStream();
//                MyHelperClass url = new MyHelperClass();
                errorID = url.toString();
            } else {
//                MyHelperClass rawData = new MyHelperClass();
                is = new java.io.ByteArrayInputStream((byte[])(Object)rawData);
                errorID = "Byte array";
            }
            InputMeta in = new InputMeta(is);
            if ((int)(Object)in.readInt() != 0x9AC6CDD7) {
                MyHelperClass MessageLocalization = new MyHelperClass();
                throw new BadElementException((String)(Object)MessageLocalization.getComposedMessage("1.is.not.a.valid.placeable.windows.metafile", errorID));
            }
            in.readWord();
            int left =(int)(Object) in.readShort();
            int top =(int)(Object) in.readShort();
            int right =(int)(Object) in.readShort();
            int bottom =(int)(Object) in.readShort();
            int inch =(int)(Object) in.readWord();
            int dpiX =(int)(Object) NULL; //new int();
            dpiX = 72;
            int dpiY =(int)(Object) NULL; //new int();
            dpiY = 72;
            float scaledHeight =(float)(Object) NULL; //new float();
            scaledHeight = (float) (bottom - top) / inch * 72f;
//            MyHelperClass scaledHeight = new MyHelperClass();
            setTop((MyHelperClass)(Object)scaledHeight);
            float scaledWidth =(float)(Object) NULL; //new float();
            scaledWidth = (float) (right - left) / inch * 72f;
//            MyHelperClass scaledWidth = new MyHelperClass();
            setRight((MyHelperClass)(Object)scaledWidth);
        } finally {
            if (is != null) {
                is.close();
            }
            MyHelperClass plainWidth = new MyHelperClass();
            plainWidth = getWidth();
            MyHelperClass plainHeight = new MyHelperClass();
            plainHeight = getHeight();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getComposedMessage(String o0, String o1){ return null; }
	public MyHelperClass openStream(){ return null; }}

class BadElementException extends Exception{
	public BadElementException(String errorMessage) { super(errorMessage); }
}

class InputMeta {

InputMeta(InputStream o0){}
	InputMeta(){}
	public MyHelperClass readWord(){ return null; }
	public MyHelperClass readShort(){ return null; }
	public MyHelperClass readInt(){ return null; }}
