


class c2238218 {

    public void includeCss(Group group, Writer out, PageContext pageContext) throws IOException {
        ByteArrayOutputStream outtmp = new ByteArrayOutputStream();
        MyHelperClass AbstractGroupBuilder = new MyHelperClass();
        if ((boolean)(Object)AbstractGroupBuilder.getInstance().buildGroupJsIfNeeded(group, outtmp, pageContext.getServletContext())) {
            FileOutputStream fileStream = null;
            try {
                MyHelperClass RetentionHelper = new MyHelperClass();
                fileStream = new FileOutputStream(new File(RetentionHelper.buildFullRetentionFilePath(group, ".css")));
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(new ByteArrayInputStream(outtmp.toByteArray()), fileStream);
            } finally {
                if (fileStream != null) fileStream.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(ByteArrayInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass buildFullRetentionFilePath(Group o0, String o1){ return null; }
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
