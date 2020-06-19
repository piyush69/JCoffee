
import java.io.UncheckedIOException;


class c19627256 {
public MyHelperClass IOUtils;
	public MyHelperClass outDir;

    public void compile(Project project) throws ProjectCompilerException {
        List resources =(List)(Object) project.getModel().getResource();
        for (Resource resource :(Resource[])(Object) (Object[])(Object)resources) {
            try {
                MyHelperClass srcDir = new MyHelperClass();
                IOUtils.copy(srcDir.getRelative(resource.getLocation()).getInputStream(), outDir.getRelative(resource.getLocation()).getOutputStream());
            } catch (UncheckedIOException e) {
                throw new ProjectCompilerException("Resource cannot be copied. Compilation failed",(IOException)(Object) e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResource(){ return null; }
	public MyHelperClass getRelative(MyHelperClass o0){ return null; }}

class Project {

public MyHelperClass getModel(){ return null; }}

class ProjectCompilerException extends Exception{
	public ProjectCompilerException(String errorMessage) { super(errorMessage); }
	ProjectCompilerException(String o0, IOException o1){}
	ProjectCompilerException(){}
}

class List {

}

class Resource {

public MyHelperClass getLocation(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
