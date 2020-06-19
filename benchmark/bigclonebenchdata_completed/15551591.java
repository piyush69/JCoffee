


class c15551591 {
public MyHelperClass StringUtils;
	public MyHelperClass isExist(XFile o0, XFile o1){ return null; }

    public void doIt() throws GlobalMapperTileTranslatorException {
        MyHelperClass dstGuid = new MyHelperClass();
        if ((boolean)(Object)StringUtils.isEmpty(dstGuid)) throw new GlobalMapperTileTranslatorException("GUID of destination map is empty");
        MyHelperClass srcDir = new MyHelperClass();
        if (srcDir == null || !(Boolean)(Object)srcDir.isDirectory() || !(Boolean)(Object)srcDir.exists()) throw new GlobalMapperTileTranslatorException("Source directory is invalid");
        try {
            int z;
            MyHelperClass dstParentDir = new MyHelperClass();
            final XFile dstDir = new XFile(dstParentDir, dstGuid);
            dstDir.mkdir();
            int n = 1;
//            MyHelperClass srcDir = new MyHelperClass();
            if ((Boolean)(Object)srcDir.isDirectory() && (Boolean)(Object)srcDir.exists()) {
                for (int i = 0; i < 18; i++) {
//                    MyHelperClass srcDir = new MyHelperClass();
                    XFile zDir = new XFile(srcDir, "z" + i);
//                    MyHelperClass srcDir = new MyHelperClass();
                    if (!(Boolean)(Object)zDir.isDirectory() || !(Boolean)(Object)zDir.exists()) zDir = new XFile(srcDir, "Z" + i);
                    if ((Boolean)(Object)zDir.isDirectory() && (Boolean)(Object)zDir.exists()) {
                        for (String fileName :(String[])(Object) (Object[])(Object)zDir.list()) {
                            XFile file = new XFile(zDir, fileName);
                            if ((Boolean)(Object)file.isFile() && (Boolean)(Object)file.exists() && (boolean)(Object)file.canRead()) {
                                final String[] yx;
                                if (fileName.indexOf('.') > 0) {
                                    String[] fileExt = fileName.split("\\.");
                                    yx = fileExt[0].split("_");
                                } else yx = fileName.split("_");
                                if (yx.length > 1) {
                                    final int x = Integer.valueOf(yx[1]);
                                    final int y = Integer.valueOf(yx[0]);
                                    z = 17 - i;
                                    XFileOutputStream out = null;
                                    XFileInputStream in = null;
                                    try {
                                        final XFile outFile = new XFile(dstDir, x + "_" + y + "_" + z);
                                        MyHelperClass override = new MyHelperClass();
                                        if ((boolean)(Object)override || !(Boolean)(Object)(isExist(outFile, file))) {
                                            out = new XFileOutputStream(outFile);
                                            in = new XFileInputStream(file);
                                            MyHelperClass IOUtils = new MyHelperClass();
                                            IOUtils.copy(in, out);
                                        }
                                        if (n % 999 == 0) {
                                            MyHelperClass logger = new MyHelperClass();
                                            logger.info(i + " tiles were copied from 'incoming'");
                                            synchronized (GlobalMapperTileTranslator.class) {
                                                GlobalMapperTileTranslator.class.wait(300);
                                            }
                                        }
                                        n++;
                                    } finally {
                                        if (out != null) {
                                            out.flush();
                                            out.close();
                                        }
                                        if (in != null) {
                                            in.close();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("map tile importing has failed: ", e);
            throw new GlobalMapperTileTranslatorException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass exists(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass isEmpty(MyHelperClass o0){ return null; }
	public MyHelperClass copy(XFileInputStream o0, XFileOutputStream o1){ return null; }}

class GlobalMapperTileTranslatorException extends Exception{
	public GlobalMapperTileTranslatorException(String errorMessage) { super(errorMessage); }
}

class XFile {

XFile(){}
	XFile(MyHelperClass o0, String o1){}
	XFile(MyHelperClass o0, MyHelperClass o1){}
	XFile(XFile o0, String o1){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass list(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class XFileOutputStream {

XFileOutputStream(){}
	XFileOutputStream(XFile o0){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass close(){ return null; }}

class XFileInputStream {

XFileInputStream(){}
	XFileInputStream(XFile o0){}
	public MyHelperClass close(){ return null; }}

class GlobalMapperTileTranslator {

}
