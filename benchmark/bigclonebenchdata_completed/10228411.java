


class c10228411 {

    public File createReadmeFile(File dir, MavenProject mavenProject) throws IOException {
        InputStream is =(InputStream)(Object) getClass().getResourceAsStream("README.template");
        StringWriter sw = new StringWriter();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(is, sw);
        String content = sw.getBuffer().toString();
        MyHelperClass StringUtils = new MyHelperClass();
        content =(String)(Object) StringUtils.replace(content, "{project_name}", mavenProject.getArtifactId());
        File readme = new File(dir, "README.TXT");
        MyHelperClass FileUtils = new MyHelperClass();
        FileUtils.writeStringToFile(readme, content);
        return readme;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writeStringToFile(File o0, String o1){ return null; }
	public MyHelperClass replace(String o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }}

class File {

File(File o0, String o1){}
	File(){}}

class MavenProject {

public MyHelperClass getArtifactId(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class StringWriter {

public MyHelperClass getBuffer(){ return null; }}
