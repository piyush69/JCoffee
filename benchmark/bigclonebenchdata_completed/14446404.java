import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c14446404 {
public MyHelperClass id;
	public MyHelperClass Qmrf2Qdb;
	public MyHelperClass QmrfUtil;
	public MyHelperClass getQdb(){ return null; }

//    @Override
    public void convert() throws Exception {
        URL url = new URL("http://qsardb.jrc.it/qmrf/download.jsp?filetype=xml&id=" + Integer.parseInt((String)(Object)this.id));
        InputStream is = url.openStream();
        try {
            QMRF qmrf =(QMRF)(Object) QmrfUtil.loadQmrf(is);
            Qmrf2Qdb.convert(getQdb(), qmrf);
        } finally {
            is.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass convert(MyHelperClass o0, QMRF o1){ return null; }
	public MyHelperClass loadQmrf(InputStream o0){ return null; }}

class QMRF {

}
