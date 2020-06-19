
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23188868 {
public MyHelperClass PlatformActivator;
	public MyHelperClass getFilesToZip(File o0, IPath o1, MyHelperClass o2){ return null; }

            public void run(IProgressMonitor runnerMonitor) throws CoreException {
                try {
                    Map projectFiles =(Map)(Object) new HashMap();
                    IPath basePath =(IPath)(Object) new Path("/");
                    MyHelperClass filesToZip = new MyHelperClass();
                    for (File nextLocation :(File[])(Object) (Object[])(Object)filesToZip) {
                        MyHelperClass fileFilter = new MyHelperClass();
                        projectFiles.putAll(getFilesToZip(nextLocation, basePath, fileFilter));
                    }
                    if ((boolean)(Object)projectFiles.isEmpty()) {
                        MyHelperClass zipFileName = new MyHelperClass();
                        PlatformActivator.logDebug("Zip file (" + zipFileName + ") not created because there were no files to zip");
                        return;
                    }
                    MyHelperClass PlatformActivator = new MyHelperClass();
                    IPath resultsPath =(IPath)(Object) PlatformActivator.getDefault().getResultsPath();
                    File copyRoot =(File)(Object) resultsPath.toFile();
                    copyRoot.mkdirs();
                    MyHelperClass finalZip = new MyHelperClass();
                    IPath zipFilePath =(IPath)(Object) resultsPath.append(new Path(finalZip));
                    String zipFileName =(String)(Object) zipFilePath.toPortableString();
                    ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
                    try {
                        MyHelperClass Deflater = new MyHelperClass();
                        out.setLevel(Deflater.DEFAULT_COMPRESSION);
                        for (String filePath :(String[])(Object) (Object[])(Object)projectFiles.keySet()) {
                            File nextFile =(File)(Object) projectFiles.get(filePath);
                            FileInputStream fin = new FileInputStream(nextFile);
                            try {
                                out.putNextEntry(new ZipEntry(filePath));
                                try {
                                    byte[] bin = new byte[4096];
                                    int bread =(int)(Object) fin.read(bin, 0, 4096);
                                    while (bread != -1) {
                                        out.write(bin, 0, bread);
                                        bread =(int)(Object) fin.read(bin, 0, 4096);
                                    }
                                } finally {
                                    out.closeEntry();
                                }
                            } finally {
                                fin.close();
                            }
                        }
                    } finally {
                        out.close();
                    }
                } catch (UncheckedIOException e) {
                    MyHelperClass Status = new MyHelperClass();
                    Status error = new Status(Status.ERROR, PlatformActivator.PLUGIN_ID, Status.ERROR, e.getLocalizedMessage(),(FileNotFoundException)(Object) e);
                    throw new CoreException((String)(Object)error);
                } catch (ArithmeticException e) {
                    MyHelperClass Status = new MyHelperClass();
                    Status error = new Status(Status.ERROR, PlatformActivator.PLUGIN_ID, Status.ERROR, e.getLocalizedMessage(),(FileNotFoundException)(Object) e);
                    throw new CoreException((String)(Object)error);
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PLUGIN_ID;
	public MyHelperClass DEFAULT_COMPRESSION;
	public MyHelperClass ERROR;
public MyHelperClass getDefault(){ return null; }
	public MyHelperClass logDebug(String o0){ return null; }
	public MyHelperClass getResultsPath(){ return null; }}

class IProgressMonitor {

}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class Map {

public MyHelperClass putAll(MyHelperClass o0){ return null; }
	public MyHelperClass keySet(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass isEmpty(){ return null; }}

class File {

public MyHelperClass mkdirs(){ return null; }}

class HashMap {

}

class IPath {

public MyHelperClass append(Path o0){ return null; }
	public MyHelperClass toFile(){ return null; }
	public MyHelperClass toPortableString(){ return null; }}

class Path {

Path(String o0){}
	Path(MyHelperClass o0){}
	Path(){}}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(FileOutputStream o0){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setLevel(MyHelperClass o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class Status {

Status(){}
	Status(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, String o3, FileNotFoundException o4){}
	Status(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, String o3, IOException o4){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
