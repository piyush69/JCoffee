


class c1455792 {
public MyHelperClass processTemplate(String o0, File o1, VelocityContext o2){ return null; }

    public void generate(String rootDir, RootModel root) throws Exception {
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyStream((InputStream)(Object)HTMLGenerator.class.getResourceAsStream("stylesheet.css"), new FileOutputStream(new File(rootDir, "stylesheet.css")));
        MyHelperClass Velocity = new MyHelperClass();
        Velocity.init();
        VelocityContext context = new VelocityContext();
        context.put("model", root);
        context.put("util", new VelocityUtils());
        MyHelperClass messages = new MyHelperClass();
        context.put("msg", messages);
        processTemplate("index.html", new File(rootDir, "index.html"), context);
        processTemplate("list.html", new File(rootDir, "list.html"), context);
        processTemplate("summary.html", new File(rootDir, "summary.html"), context);
        File imageDir = new File(rootDir, "images");
        imageDir.mkdir();
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyStream((InputStream)(Object)HTMLGenerator.class.getResourceAsStream("primarykey.gif"), new FileOutputStream(new File(imageDir, "primarykey.gif")));
        File tableDir = new File(rootDir, "tables");
        tableDir.mkdir();
        for (TableModel table :(TableModel[])(Object) (Object[])(Object)root.getTables()) {
            context.put("table", table);
            processTemplate("table.html", new File(tableDir, table.getTableName() + ".html"), context);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyStream(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass init(){ return null; }}

class RootModel {

public MyHelperClass getTables(){ return null; }}

class HTMLGenerator {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class File {

File(File o0, String o1){}
	File(String o0, String o1){}
	File(){}
	public MyHelperClass mkdir(){ return null; }}

class VelocityContext {

public MyHelperClass put(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass put(String o0, RootModel o1){ return null; }
	public MyHelperClass put(String o0, VelocityUtils o1){ return null; }
	public MyHelperClass put(String o0, TableModel o1){ return null; }}

class VelocityUtils {

}

class TableModel {

public MyHelperClass getTableName(){ return null; }}

class InputStream {

}
