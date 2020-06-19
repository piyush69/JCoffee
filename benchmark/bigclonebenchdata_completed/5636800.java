


class c5636800 {
public static MyHelperClass StringUtils;
	public static MyHelperClass IOUtils;
	public static MyHelperClass getParameter(String[] o0, int o1){ return null; }
	public static MyHelperClass getParameter(String[] o0, int o1, Object o2){ return null; }
	public static MyHelperClass usage(){ return null; }
//public MyHelperClass IOUtils;
//	public MyHelperClass StringUtils;
//	public MyHelperClass getParameter(String[] o0, int o1){ return null; }
//	public MyHelperClass getParameter(String[] o0, int o1, Object o2){ return null; }
//	public MyHelperClass usage(){ return null; }

    public static void main(String[] args) throws IOException {
        System.setProperty("java.protocol.xfile", "com.luzan.common.nfs");
        if (args.length < 1) usage();
        final String cmd = args[0];
        if ("delete".equalsIgnoreCase(cmd)) {
            final String path =(String)(Object) getParameter(args, 1);
            XFile xfile = new XFile(path);
            if (!(Boolean)(Object)xfile.exists()) {
                System.out.print("File doean't exist.\n");
                System.exit(1);
            }
            xfile.delete();
        } else if ("copy".equalsIgnoreCase(cmd)) {
            final String pathFrom =(String)(Object) getParameter(args, 1);
            final String pathTo =(String)(Object) getParameter(args, 2);
            final XFile xfileFrom = new XFile(pathFrom);
            final XFile xfileTo = new XFile(pathTo);
            if (!(Boolean)(Object)xfileFrom.exists()) {
                System.out.print("File doesn't exist.\n");
                System.exit(1);
            }
            final String mime =(String)(Object) getParameter(args, 3, null);
            final XFileInputStream in = new XFileInputStream(xfileFrom);
            final XFileOutputStream xout = new XFileOutputStream(xfileTo);
            if (!(Boolean)(Object)StringUtils.isEmpty(mime)) {
                final XFileExtensionAccessor xfa = ((XFileExtensionAccessor)(XFileExtensionAccessor)(Object) xfileTo.getExtensionAccessor());
                if (xfa != null) {
                    xfa.setMimeType(mime);
                    xfa.setContentLength(xfileFrom.length());
                }
            }
            IOUtils.copy(in, xout);
            xout.flush();
            xout.close();
            in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(XFileInputStream o0, XFileOutputStream o1){ return null; }
	public MyHelperClass isEmpty(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class XFile {

XFile(){}
	XFile(String o0){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getExtensionAccessor(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass length(){ return null; }}

class XFileInputStream {

XFileInputStream(){}
	XFileInputStream(XFile o0){}
	public MyHelperClass close(){ return null; }}

class XFileOutputStream {

XFileOutputStream(){}
	XFileOutputStream(XFile o0){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass close(){ return null; }}

class XFileExtensionAccessor {

public MyHelperClass setMimeType(String o0){ return null; }
	public MyHelperClass setContentLength(MyHelperClass o0){ return null; }}
