
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8966080 {
public MyHelperClass Assert;
	public MyHelperClass IOUtils;
	public MyHelperClass getTestSourcesDirectory(){ return null; }
	public MyHelperClass getTestTool(){ return null; }

    public void testManageSources() throws Exception {
        this.getTestTool().manageSources(this.getTestSourcesDirectory());
        this.getTestTool().manageSources(this.getTestTool().getModules().getModule("Module"), this.getTestSourcesDirectory());
        final File implementationDirectory =(File)(Object) this.getTestSourcesDirectory();
        this.getTestTool().manageSources(this.getTestTool().getModules().getImplementation("Implementation"), implementationDirectory);
        this.getTestTool().manageSources(this.getTestTool().getModules().getImplementation("Implementation"), implementationDirectory);
        final File specificationDirectory =(File)(Object) this.getTestSourcesDirectory();
        this.getTestTool().manageSources(this.getTestTool().getModules().getSpecification("Specification"), specificationDirectory);
        this.getTestTool().manageSources(this.getTestTool().getModules().getSpecification("Specification"), specificationDirectory);
        IOUtils.copy((InputStream)(Object)this.getClass().getResourceAsStream("IllegalImplementationSource.java.txt"), new FileOutputStream(new File(implementationDirectory, "Implementation.java")));
        IOUtils.copy((InputStream)(Object)this.getClass().getResourceAsStream("IllegalSpecificationSource.java.txt"), new FileOutputStream(new File(specificationDirectory, "Specification.java")));
        try {
            this.getTestTool().manageSources(this.getTestTool().getModules().getImplementation("Implementation"), implementationDirectory);
            Assert.fail("Expected IOException not thrown.");
        } catch (UncheckedIOException e) {
            Assert.assertNotNull(e.getMessage());
            System.out.println(e.toString());
        }
        try {
            this.getTestTool().manageSources(this.getTestTool().getModules().getSpecification("Specification"), specificationDirectory);
            Assert.fail("Expected IOException not thrown.");
        } catch (UncheckedIOException e) {
            Assert.assertNotNull(e.getMessage());
            System.out.println(e.toString());
        }
        this.getTestTool().setProfile("DOES_NOT_EXIST");
        this.getTestTool().manageSources(this.getTestSourcesDirectory());
        this.getTestTool().manageSources(this.getTestTool().getModules().getModule("Module"), this.getTestSourcesDirectory());
        this.getTestTool().manageSources(this.getTestTool().getModules().getImplementation("Implementation"), this.getTestSourcesDirectory());
        this.getTestTool().manageSources(this.getTestTool().getModules().getSpecification("Specification"), this.getTestSourcesDirectory());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getImplementation(String o0){ return null; }
	public MyHelperClass getModule(String o0){ return null; }
	public MyHelperClass manageSources(MyHelperClass o0, File o1){ return null; }
	public MyHelperClass assertNotNull(String o0){ return null; }
	public MyHelperClass getModules(){ return null; }
	public MyHelperClass getSpecification(String o0){ return null; }
	public MyHelperClass manageSources(MyHelperClass o0){ return null; }
	public MyHelperClass setProfile(String o0){ return null; }
	public MyHelperClass manageSources(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass fail(String o0){ return null; }}

class File {

File(File o0, String o1){}
	File(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}
