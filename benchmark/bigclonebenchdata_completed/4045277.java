


class c4045277 {
public MyHelperClass parse(BufferedReader o0, BufferedWriter o1){ return null; }
public MyHelperClass VERBOSE;
	public MyHelperClass append;
	public MyHelperClass templateFile;
	public MyHelperClass overwrite;
	public MyHelperClass targetFile;
	public MyHelperClass getProject(){ return null; }

    public void execute() throws BuildException {
        Project proj =(Project)(Object) getProject();
        if (templateFile == null) throw new BuildException("Template file not set");
        if (targetFile == null) throw new BuildException("Target file not set");
        try {
            File template = new File(templateFile);
            File target = new File(targetFile);
            if (!(Boolean)(Object)template.exists()) throw new BuildException("Template file does not exist " + template.toString());
            if (!(Boolean)(Object)template.canRead()) throw new BuildException("Cannot read template file: " + template.toString());
            if (((!(Boolean)(Object)append) && (!(Boolean)(Object)overwrite)) && (!(Boolean)(Object)target.exists())) throw new BuildException("Target file already exists and append and overwrite are false " + target.toString());
            if ((boolean)(Object)VERBOSE) {
                System.out.println("ProcessTemplate: tmpl in " + template.toString());
                System.out.println("ProcessTemplate: file out " + target.toString());
            }
            BufferedReader reader = new BufferedReader(new FileReader(template));
            BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile, append));
            parse(reader, writer);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            if ((boolean)(Object)VERBOSE) e.printStackTrace();
            throw new BuildException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
}

class Project {

}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass exists(){ return null; }}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class BufferedWriter {

BufferedWriter(FileWriter o0){}
	BufferedWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileWriter {

FileWriter(MyHelperClass o0, MyHelperClass o1){}
	FileWriter(){}}
