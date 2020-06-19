


class c11346792 {
public MyHelperClass ZipUtils;

    public void generate(FileObject outputDirectory, FileObject generatedOutputDirectory, List libraryModels, String tapdocXml) throws FileSystemException {
        if (!(Boolean)(Object)generatedOutputDirectory.exists()) {
            generatedOutputDirectory.createFolder();
        }
        if ((boolean)(Object)outputDirectory.exists()) {
            outputDirectory.createFolder();
        }
        MyHelperClass classResolver = new MyHelperClass();
        ZipUtils.extractZip(new ClasspathResource(classResolver, "/com/erinors/tapestry/tapdoc/service/xdoc/resources.zip"), outputDirectory);
        for (Library library :(Library[])(Object) (Object[])(Object)libraryModels) {
            String libraryName =(String)(Object) library.getName();
            String libraryLocation =(String)(Object) library.getLocation();
            MyHelperClass fileNameGenerator = new MyHelperClass();
            generatedOutputDirectory.resolveFile((String)(Object)fileNameGenerator.getLibraryDirectory(libraryLocation)).createFolder();
            try {
                MyHelperClass XsltUtils = new MyHelperClass();
                String result =(String)(Object) XsltUtils.xsltTransform(tapdocXml,(InputStream)(Object) getClass().getResourceAsStream("Library.xsl"), "libraryName", libraryName);
//                MyHelperClass fileNameGenerator = new MyHelperClass();
                FileObject index =(FileObject)(Object) generatedOutputDirectory.resolveFile((String)(Object)fileNameGenerator.getLibraryDirectory(libraryLocation)).resolveFile("index.xml");
                Writer out =(Writer)(Object) new OutputStreamWriter(index.getContent().getOutputStream(), "UTF-8");
                out.write(result);
                out.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            for (Component component :(Component[])(Object) (Object[])(Object)library.getComponents()) {
                String componentName =(String)(Object) component.getName();
                System.out.println("Generating " + libraryName + ":" + componentName + "...");
                Map parameters =(Map)(Object) new HashMap();
                parameters.put("libraryName", libraryName);
                parameters.put("componentName", componentName);
                MyHelperClass XsltUtils = new MyHelperClass();
                String result =(String)(Object) XsltUtils.xsltTransform(tapdocXml, getClass().getResourceAsStream("Component.xsl"), parameters);
                Writer out = null;
                try {
//                    MyHelperClass fileNameGenerator = new MyHelperClass();
                    FileObject index =(FileObject)(Object) generatedOutputDirectory.resolveFile((String)(Object)fileNameGenerator.getComponentIndexFile(libraryLocation, componentName, true));
                    out =(Writer)(Object) new OutputStreamWriter(index.getContent().getOutputStream(), "UTF-8");
                    out.write(result);
                    out.close();
                    Resource specificationLocation =(Resource)(Object) component.getSpecificationLocation();
                    if (specificationLocation.getRelativeResource(componentName + "_tapdoc/resource").getResourceURL() != null) {
                        File srcResourcesDirectory = new File(specificationLocation.getRelativeResource(componentName + "_tapdoc/resource").getResourceURL().toURI());
//                        MyHelperClass fileNameGenerator = new MyHelperClass();
                        FileObject dstResourcesFileObject =(FileObject)(Object) outputDirectory.resolveFile((String)(Object)fileNameGenerator.getComponentDirectory(libraryLocation, componentName)).resolveFile("resource");
                        if ((Boolean)(Object)srcResourcesDirectory.exists() && (Boolean)(Object)srcResourcesDirectory.isDirectory()) {
                            File[] files =(File[])(Object) srcResourcesDirectory.listFiles();
                            if (files != null) {
                                for (File resource : files) {
                                    if ((boolean)(Object)resource.isFile() && !(Boolean)(Object)resource.isHidden()) {
                                        FileObject resourceFileObject =(FileObject)(Object) dstResourcesFileObject.resolveFile((String)(Object)resource.getName());
                                        resourceFileObject.createFile();
                                        InputStream inResource = null;
                                        OutputStream outResource = null;
                                        try {
                                            inResource =(InputStream)(Object) new FileInputStream(resource);
                                            outResource =(OutputStream)(Object) resourceFileObject.getContent().getOutputStream();
                                            MyHelperClass IOUtils = new MyHelperClass();
                                            IOUtils.copy(inResource, outResource);
                                        } finally {
                                            MyHelperClass IOUtils = new MyHelperClass();
                                            IOUtils.closeQuietly(inResource);
//                                            MyHelperClass IOUtils = new MyHelperClass();
                                            IOUtils.closeQuietly(outResource);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } finally {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(out);
                }
            }
        }
        {
            Writer out = null;
            try {
                MyHelperClass XsltUtils = new MyHelperClass();
                String result =(String)(Object) XsltUtils.xsltTransform(tapdocXml,(InputStream)(Object) getClass().getResourceAsStream("Overview.xsl"));
                FileObject index =(FileObject)(Object) generatedOutputDirectory.resolveFile("index.xml");
                out =(Writer)(Object) new OutputStreamWriter(index.getContent().getOutputStream(), "UTF-8");
                out.write(result);
                out.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(out);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createFolder(){ return null; }
	public MyHelperClass getComponentIndexFile(String o0, String o1, boolean o2){ return null; }
	public MyHelperClass extractZip(ClasspathResource o0, FileObject o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass xsltTransform(String o0, InputStream o1){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass toURI(){ return null; }
	public MyHelperClass xsltTransform(String o0, InputStream o1, String o2, String o3){ return null; }
	public MyHelperClass getLibraryDirectory(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass closeQuietly(Writer o0){ return null; }
	public MyHelperClass resolveFile(String o0){ return null; }
	public MyHelperClass getComponentDirectory(String o0, String o1){ return null; }
	public MyHelperClass xsltTransform(String o0, java.io.InputStream o1, Map o2){ return null; }
	public MyHelperClass getResourceURL(){ return null; }}

class FileObject {

public MyHelperClass createFolder(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass createFile(){ return null; }
	public MyHelperClass resolveFile(String o0){ return null; }
	public MyHelperClass getContent(){ return null; }}

class List {

}

class Library {

public MyHelperClass getComponents(){ return null; }
	public MyHelperClass getLocation(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileSystemException extends Exception{
	public FileSystemException(String errorMessage) { super(errorMessage); }
}

class ClasspathResource {

ClasspathResource(){}
	ClasspathResource(MyHelperClass o0, String o1){}}

class Writer {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0, String o1){}}

class Component {

public MyHelperClass getSpecificationLocation(){ return null; }
	public MyHelperClass getName(){ return null; }}

class Map {

public MyHelperClass put(String o0, String o1){ return null; }}

class HashMap {

}

class Resource {

public MyHelperClass getRelativeResource(String o0){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass isHidden(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class InputStream {

}

class OutputStream {

}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}
