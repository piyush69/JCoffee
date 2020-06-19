


class c9385030 {

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        XSLTBuddy buddy = new XSLTBuddy();
        buddy.parseArgs(args);
        XSLTransformer transformer = new XSLTransformer();
        if (buddy.templateDir != null) {
            transformer.setTemplateDir(buddy.templateDir);
        }
        FileReader xslReader = new FileReader(buddy.xsl);
        Templates xslTemplate =(Templates)(Object) transformer.getXSLTemplate(buddy.xsl, xslReader);
        for (Enumeration e =(Enumeration)(Object) buddy.params.keys();(boolean)(Object) e.hasMoreElements(); ) {
            String key = (String)(String)(Object) e.nextElement();
            transformer.addParam(key, buddy.params.get(key));
        }
        Reader reader = null;
        if (buddy.src == null) {
            MyHelperClass XSLTBuddy = new MyHelperClass();
            reader =(Reader)(Object) new StringReader(XSLTBuddy.BLANK_XML);
        } else {
            reader =(Reader)(Object) new FileReader(buddy.src);
        }
        if (buddy.out == null) {
            String result =(String)(Object) transformer.doTransform(reader, xslTemplate, buddy.xsl);
            buddy.getLogger().info("\n\nXSLT Result:\n\n" + result + "\n");
        } else {
            File file = new File(buddy.out);
            File dir =(File)(Object) file.getParentFile();
            if (dir != null) {
                dir.mkdirs();
            }
            FileWriter writer = new FileWriter(buddy.out);
            transformer.doTransform(reader, xslTemplate, buddy.xsl, writer);
            writer.flush();
            writer.close();
        }
        buddy.getLogger().info("Transform done successfully in " + (System.currentTimeMillis() - start) + " milliseconds");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BLANK_XML;
public MyHelperClass info(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keys(){ return null; }}

class XSLTBuddy {
public MyHelperClass templateDir;
	public MyHelperClass out;
	public MyHelperClass src;
	public MyHelperClass params;
	public MyHelperClass xsl;
public MyHelperClass parseArgs(String[] o0){ return null; }
	public MyHelperClass getLogger(){ return null; }}

class XSLTransformer {

public MyHelperClass doTransform(Reader o0, Templates o1, MyHelperClass o2){ return null; }
	public MyHelperClass addParam(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getXSLTemplate(MyHelperClass o0, FileReader o1){ return null; }
	public MyHelperClass doTransform(Reader o0, Templates o1, MyHelperClass o2, FileWriter o3){ return null; }
	public MyHelperClass setTemplateDir(MyHelperClass o0){ return null; }}

class FileReader {

FileReader(MyHelperClass o0){}
	FileReader(){}}

class Templates {

}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class Reader {

}

class StringReader {

StringReader(MyHelperClass o0){}
	StringReader(){}}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class FileWriter {

FileWriter(MyHelperClass o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
