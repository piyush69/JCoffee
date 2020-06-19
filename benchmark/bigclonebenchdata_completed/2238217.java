


class c2238217 {
public MyHelperClass includeResource(PageContext o0, Writer o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4){ return null; }
public MyHelperClass JS_BEGIN_TAG;
	public MyHelperClass JS_END_TAG;

    public void includeJs(Group group, Writer out, PageContext pageContext) throws IOException {
        MyHelperClass RetentionHelper = new MyHelperClass();
        includeResource(pageContext, out, RetentionHelper.buildRootRetentionFilePath(group, ".js"), JS_BEGIN_TAG, JS_END_TAG);
        ByteArrayOutputStream outtmp = new ByteArrayOutputStream();
        MyHelperClass AbstractGroupBuilder = new MyHelperClass();
        if ((boolean)(Object)AbstractGroupBuilder.getInstance().buildGroupJsIfNeeded(group, outtmp, pageContext.getServletContext())) {
//            MyHelperClass RetentionHelper = new MyHelperClass();
            FileOutputStream fileStream = new FileOutputStream(new File(RetentionHelper.buildFullRetentionFilePath(group, ".js")));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(new ByteArrayInputStream(outtmp.toByteArray()), fileStream);
            fileStream.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(ByteArrayInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass buildFullRetentionFilePath(Group o0, String o1){ return null; }
	public MyHelperClass buildRootRetentionFilePath(Group o0, String o1){ return null; }
	public MyHelperClass buildGroupJsIfNeeded(Group o0, ByteArrayOutputStream o1, MyHelperClass o2){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Group {

}

class Writer {

}

class PageContext {

public MyHelperClass getServletContext(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}
