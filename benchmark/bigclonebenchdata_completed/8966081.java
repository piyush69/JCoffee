
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8966081 {
public MyHelperClass Assert;
	public MyHelperClass IOUtils;
	public MyHelperClass getTestSourcesDirectory(){ return null; }
	public MyHelperClass getTestTool(){ return null; }

    public void testMandatorySections() throws Exception {
        final File specificationDirectory =(File)(Object) this.getTestSourcesDirectory();
        final File implementationDirectory =(File)(Object) this.getTestSourcesDirectory();
        IOUtils.copy((InputStream)(Object)this.getClass().getResourceAsStream("ImplementationWithoutAnnotationsSection.java.txt"), new FileOutputStream(new File(implementationDirectory, "Implementation.java")));
        try {
            this.getTestTool().manageSources(this.getTestTool().getModules().getImplementation("Implementation"), implementationDirectory);
            Assert.fail("Expected IOException not thrown.");
        } catch (UncheckedIOException e) {
            Assert.assertNotNull(e.getMessage());
            System.out.println(e);
        }
        IOUtils.copy((InputStream)(Object)this.getClass().getResourceAsStream("ImplementationWithoutDependenciesSection.java.txt"), new FileOutputStream(new File(implementationDirectory, "Implementation.java")));
        try {
            this.getTestTool().manageSources(this.getTestTool().getModules().getImplementation("Implementation"), implementationDirectory);
            Assert.fail("Expected IOException not thrown.");
        } catch (UncheckedIOException e) {
            Assert.assertNotNull(e.getMessage());
            System.out.println(e);
        }
        IOUtils.copy((InputStream)(Object)this.getClass().getResourceAsStream("ImplementationWithoutMessagesSection.java.txt"), new FileOutputStream(new File(implementationDirectory, "Implementation.java")));
        try {
            this.getTestTool().manageSources(this.getTestTool().getModules().getImplementation("Implementation"), implementationDirectory);
            Assert.fail("Expected IOException not thrown.");
        } catch (UncheckedIOException e) {
            Assert.assertNotNull(e.getMessage());
            System.out.println(e);
        }
        IOUtils.copy((InputStream)(Object)this.getClass().getResourceAsStream("ImplementationWithoutPropertiesSection.java.txt"), new FileOutputStream(new File(implementationDirectory, "Implementation.java")));
        try {
            this.getTestTool().manageSources(this.getTestTool().getModules().getImplementation("Implementation"), implementationDirectory);
            Assert.fail("Expected IOException not thrown.");
        } catch (UncheckedIOException e) {
            Assert.assertNotNull(e.getMessage());
            System.out.println(e);
        }
        IOUtils.copy((InputStream)(Object)this.getClass().getResourceAsStream("ImplementationOfSpecificationWithoutConstructorsSection.java.txt"), new FileOutputStream(new File(implementationDirectory, "ImplementationOfSpecification.java")));
        try {
            this.getTestTool().manageSources(this.getTestTool().getModules().getImplementation("ImplementationOfSpecification"), implementationDirectory);
            Assert.fail("Expected IOException not thrown.");
        } catch (UncheckedIOException e) {
            Assert.assertNotNull(e.getMessage());
            System.out.println(e);
        }
        IOUtils.copy((InputStream)(Object)this.getClass().getResourceAsStream("SpecificationWithoutAnnotationsSection.java.txt"), new FileOutputStream(new File(specificationDirectory, "Specification.java")));
        try {
            this.getTestTool().manageSources(this.getTestTool().getModules().getSpecification("Specification"), specificationDirectory);
            Assert.fail("Expected IOException not thrown.");
        } catch (UncheckedIOException e) {
            Assert.assertNotNull(e.getMessage());
            System.out.println(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getImplementation(String o0){ return null; }
	public MyHelperClass manageSources(MyHelperClass o0, File o1){ return null; }
	public MyHelperClass getSpecification(String o0){ return null; }
	public MyHelperClass assertNotNull(String o0){ return null; }
	public MyHelperClass getModules(){ return null; }
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
