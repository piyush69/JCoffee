import java.io.*;
import java.lang.*;
import java.util.*;



class c2169065 {

    public String getSummaryText() {
        MyHelperClass summaryText = new MyHelperClass();
        if (summaryText == null) {
            MyHelperClass xdcSources = new MyHelperClass();
            for (Iterator iter =(Iterator)(Object) xdcSources.values().iterator(); iter.hasNext(); ) {
                XdcSource source = (XdcSource) iter.next();
                File packageFile = new File((String)(Object)source.getFile().getParentFile(), "xdc-package.html");
                if (packageFile.exists()) {
                    Reader in = null;
                    try {
                        in = new FileReader(packageFile);
                        StringWriter out = new StringWriter();
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(in, out);
                        StringBuffer buf = out.getBuffer();
                        int pos1 = buf.indexOf("<body>");
                        int pos2 = buf.lastIndexOf("</body>");
                        if (pos1 >= 0 && pos1 < pos2) {
//                            MyHelperClass summaryText = new MyHelperClass();
                            summaryText =(MyHelperClass)(Object) buf.substring(pos1 + 6, pos2);
                        } else {
//                            MyHelperClass summaryText = new MyHelperClass();
                            summaryText =(MyHelperClass)(Object) "";
                        }
                    } catch (FileNotFoundException e) {
                        MyHelperClass LOG = new MyHelperClass();
                        LOG.error(e.getMessage(), e);
//                        MyHelperClass summaryText = new MyHelperClass();
                        summaryText =(MyHelperClass)(Object) "";
                    } catch (IOException e) {
                        MyHelperClass LOG = new MyHelperClass();
                        LOG.error(e.getMessage(), e);
//                        MyHelperClass summaryText = new MyHelperClass();
                        summaryText =(MyHelperClass)(Object) "";
                    } finally {
                        if (in != null) {
                            try {
                                in.close();
                            } catch (IOException e) {
                                MyHelperClass LOG = new MyHelperClass();
                                LOG.error(e.getMessage(), e);
                            }
                        }
                    }
                    break;
                } else {
//                    MyHelperClass summaryText = new MyHelperClass();
                    summaryText =(MyHelperClass)(Object) "";
                }
            }
        }
//        MyHelperClass summaryText = new MyHelperClass();
        return (String)(Object)summaryText;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass values(){ return null; }
	public MyHelperClass error(String o0, FileNotFoundException o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass copy(Reader o0, StringWriter o1){ return null; }}

class XdcSource {

public MyHelperClass getFile(){ return null; }}
