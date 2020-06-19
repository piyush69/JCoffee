


class c8966082 {
public MyHelperClass IOUtils;
	public MyHelperClass getTestSourcesDirectory(){ return null; }
	public MyHelperClass getTestTool(){ return null; }

    public void testOptionalSections() throws Exception {
        final File implementationDirectory =(File)(Object) this.getTestSourcesDirectory();
        final File specificationDirectory =(File)(Object) this.getTestSourcesDirectory();
        IOUtils.copy((InputStream)(Object)this.getClass().getResourceAsStream("ImplementationWithoutConstructorsSection.java.txt"), new FileOutputStream(new File(implementationDirectory, "Implementation.java")));
        this.getTestTool().manageSources(this.getTestTool().getModules().getImplementation("Implementation"), implementationDirectory);
        IOUtils.copy((InputStream)(Object)this.getClass().getResourceAsStream("ImplementationWithoutDefaultConstructorSection.java.txt"), new FileOutputStream(new File(implementationDirectory, "Implementation.java")));
        this.getTestTool().manageSources(this.getTestTool().getModules().getImplementation("Implementation"), implementationDirectory);
        IOUtils.copy((InputStream)(Object)this.getClass().getResourceAsStream("ImplementationWithoutDocumentationSection.java.txt"), new FileOutputStream(new File(implementationDirectory, "Implementation.java")));
        this.getTestTool().manageSources(this.getTestTool().getModules().getImplementation("Implementation"), implementationDirectory);
        IOUtils.copy((InputStream)(Object)this.getClass().getResourceAsStream("ImplementationWithoutLicenseSection.java.txt"), new FileOutputStream(new File(implementationDirectory, "Implementation.java")));
        this.getTestTool().manageSources(this.getTestTool().getModules().getImplementation("Implementation"), implementationDirectory);
        IOUtils.copy((InputStream)(Object)this.getClass().getResourceAsStream("SpecificationWithoutDocumentationSection.java.txt"), new FileOutputStream(new File(specificationDirectory, "Specification.java")));
        this.getTestTool().manageSources(this.getTestTool().getModules().getSpecification("Specification"), specificationDirectory);
        IOUtils.copy((InputStream)(Object)this.getClass().getResourceAsStream("SpecificationWithoutLicenseSection.java.txt"), new FileOutputStream(new File(specificationDirectory, "Specification.java")));
        this.getTestTool().manageSources(this.getTestTool().getModules().getSpecification("Specification"), specificationDirectory);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getImplementation(String o0){ return null; }
	public MyHelperClass manageSources(MyHelperClass o0, File o1){ return null; }
	public MyHelperClass getSpecification(String o0){ return null; }
	public MyHelperClass getModules(){ return null; }}

class File {

File(File o0, String o1){}
	File(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class InputStream {

}
