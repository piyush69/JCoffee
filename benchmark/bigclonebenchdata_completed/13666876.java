import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13666876 {
public MyHelperClass instance;

//    @Override
    public String transformSingleFile(X3dEditor xed)  throws Throwable {
        Node[] node =(Node[])(Object) xed.getActivatedNodes();
        X3DDataObject dob = (X3DDataObject)(X3DDataObject)(Object) xed.getX3dEditorSupport().getDataObject();
        FileObject mySrc =(FileObject)(Object) dob.getPrimaryFile();
        MyHelperClass FileUtil = new MyHelperClass();
        File mySrcF =(File)(Object) FileUtil.toFile(mySrc);
        File myOutF = new File(mySrcF.getParentFile(), mySrc.getName() + ".x3dv.gz");
        MyHelperClass TransformListener = new MyHelperClass();
        TransformListener co =(TransformListener)(Object) TransformListener.getInstance();
        MyHelperClass NbBundle = new MyHelperClass();
        co.message(NbBundle.getMessage(getClass(), "Gzip_compression_starting"));
//        MyHelperClass NbBundle = new MyHelperClass();
        co.message(NbBundle.getMessage(getClass(), "Saving_as_") + myOutF.getAbsolutePath());
        co.moveToFront();
        co.setNode(node[0]);
        try {
            String x3dvFile =(String)(Object) instance.transformSingleFile(xed);
            FileInputStream fis = new FileInputStream(new File(x3dvFile));
            GZIPOutputStream gzos = new GZIPOutputStream(new FileOutputStream(myOutF));
            byte[] buf = new byte[4096];
            int ret;
            while ((ret = fis.read(buf)) > 0) gzos.write(buf, 0, ret);
            gzos.close();
        } catch (Exception ex) {
//            MyHelperClass NbBundle = new MyHelperClass();
            co.message(NbBundle.getMessage(getClass(), "Exception:__") + ex.getLocalizedMessage());
            return null;
        }
//        MyHelperClass NbBundle = new MyHelperClass();
        co.message(NbBundle.getMessage(getClass(), "Gzip_compression_complete"));
        return myOutF.getAbsolutePath();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getDataObject(){ return null; }
	public MyHelperClass toFile(FileObject o0){ return null; }
	public MyHelperClass getMessage(Class o0, String o1){ return null; }
	public MyHelperClass transformSingleFile(X3dEditor o0){ return null; }}

class Node {

}

class X3DDataObject {

public MyHelperClass getPrimaryFile(){ return null; }}

class FileObject {

public MyHelperClass getName(){ return null; }}

class TransformListener {

public MyHelperClass setNode(Node o0){ return null; }
	public MyHelperClass message(MyHelperClass o0){ return null; }
	public MyHelperClass message(String o0){ return null; }
	public MyHelperClass moveToFront(){ return null; }}

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class X3dEditor {

public MyHelperClass getX3dEditorSupport(){ return null; }
	public MyHelperClass getActivatedNodes(){ return null; }}
