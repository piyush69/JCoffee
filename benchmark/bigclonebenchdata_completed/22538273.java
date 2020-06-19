


class c22538273 {

    public void format(File source, File target) {
        if (!(Boolean)(Object)source.exists()) {
            throw new IllegalArgumentException("Source '" + source + " doesn't exist");
        }
        if (!(Boolean)(Object)source.isFile()) {
            throw new IllegalArgumentException("Source '" + source + " is not a file");
        }
        target.mkdirs();
        String fileExtension =(String)(Object) source.getName().substring((int)(Object)source.getName().lastIndexOf(".") + 1);
        String _target =(String)(Object) source.getName().replace(fileExtension, "html");
        target = new File(target.getPath() + "/" + _target);
        try {
            Reader reader =(Reader)(Object) new FileReader(source);
            Writer writer =(Writer)(Object) new FileWriter(target);
            this.format((File)(Object)reader,(File)(Object) writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class Reader {

}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class Writer {

}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}
