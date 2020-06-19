import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23188867 {
public MyHelperClass getFilesToZip(File o0, IPath o1, FilenameFilter o2){ return null; }

    public void createZipCopy(IUIContext ui, final String zipFileName, final File[] filesToZip, final FilenameFilter fileFilter, Timestamp timestamp)  throws Throwable {
        MyHelperClass TestCase = new MyHelperClass();
        TestCase.assertNotNull(ui);
//        MyHelperClass TestCase = new MyHelperClass();
        TestCase.assertNotNull(zipFileName);
//        MyHelperClass TestCase = new MyHelperClass();
        TestCase.assertFalse(zipFileName.trim().length() == 0);
//        MyHelperClass TestCase = new MyHelperClass();
        TestCase.assertNotNull(filesToZip);
//        MyHelperClass TestCase = new MyHelperClass();
        TestCase.assertNotNull(timestamp);
        String nameCopy = zipFileName;
        if (nameCopy.endsWith(".zip")) {
            nameCopy = nameCopy.substring(0, zipFileName.length() - 4);
        }
        nameCopy = nameCopy + "_" + timestamp.toString() + ".zip";
        final String finalZip = nameCopy;
        IWorkspaceRunnable noResourceChangedEventsRunner = new IWorkspaceRunnable() {

            public void run(IProgressMonitor runnerMonitor) throws CoreException {
                try {
                    Map<String, File> projectFiles = new HashMap<String, File>();
                    IPath basePath =(IPath)(Object) new Path("/");
                    for (File nextLocation : filesToZip) {
                        projectFiles.putAll((File>)(Object)getFilesToZip(nextLocation, basePath, fileFilter));
                    }
                    if (projectFiles.isEmpty()) {
                        MyHelperClass PlatformActivator = new MyHelperClass();
                        PlatformActivator.logDebug("Zip file (" + zipFileName + ") not created because there were no files to zip");
                        return;
                    }
                    MyHelperClass PlatformActivator = new MyHelperClass();
                    IPath resultsPath = PlatformActivator.getDefault().getResultsPath();
                    File copyRoot =(File)(Object) resultsPath.toFile();
                    copyRoot.mkdirs();
                    IPath zipFilePath = resultsPath.append(new Path(finalZip));
                    String zipFileName =(String)(Object) zipFilePath.toPortableString();
                    ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
                    try {
                        MyHelperClass Deflater = new MyHelperClass();
                        out.setLevel(Deflater.DEFAULT_COMPRESSION);
                        for (String filePath : projectFiles.keySet()) {
                            File nextFile = projectFiles.get(filePath);
                            FileInputStream fin = new FileInputStream(nextFile);
                            try {
                                out.putNextEntry(new ZipEntry(filePath));
                                try {
                                    byte[] bin = new byte[4096];
                                    int bread = fin.read(bin, 0, 4096);
                                    while (bread != -1) {
                                        out.write(bin, 0, bread);
                                        bread = fin.read(bin, 0, 4096);
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
                } catch (FileNotFoundException e) {
                    MyHelperClass Status = new MyHelperClass();
                    MyHelperClass PlatformActivator = new MyHelperClass();
                    Status error = new Status(Status.ERROR, PlatformActivator.PLUGIN_ID, Status.ERROR, e.getLocalizedMessage(), e);
                    throw new CoreException((String)(Object)error);
                } catch (IOException e) {
                    MyHelperClass Status = new MyHelperClass();
                    MyHelperClass PlatformActivator = new MyHelperClass();
                    Status error = new Status(Status.ERROR, PlatformActivator.PLUGIN_ID, Status.ERROR, e.getLocalizedMessage(), e);
                    throw new CoreException((String)(Object)error);
                }
            }
        };
        try {
            MyHelperClass ResourcesPlugin = new MyHelperClass();
            IWorkspace workspace =(IWorkspace)(Object) ResourcesPlugin.getWorkspace();
            MyHelperClass IWorkspace = new MyHelperClass();
            workspace.run(noResourceChangedEventsRunner, workspace.getRoot(), IWorkspace.AVOID_UPDATE, new NullProgressMonitor());
        } catch (CoreException ce) {
            MyHelperClass PlatformActivator = new MyHelperClass();
            PlatformActivator.logException(ce);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass AVOID_UPDATE;
	public MyHelperClass PLUGIN_ID;
	public MyHelperClass DEFAULT_COMPRESSION;
	public MyHelperClass ERROR;
public MyHelperClass logDebug(String o0){ return null; }
	public MyHelperClass getResultsPath(){ return null; }
	public MyHelperClass assertFalse(boolean o0){ return null; }
	public MyHelperClass assertNotNull(Timestamp o0){ return null; }
	public MyHelperClass assertNotNull(String o0){ return null; }
	public MyHelperClass assertNotNull(IUIContext o0){ return null; }
	public MyHelperClass assertNotNull(File[] o0){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass logException(CoreException o0){ return null; }
	public MyHelperClass getWorkspace(){ return null; }}

class IUIContext {

}

class IWorkspaceRunnable {

}

class IWorkspace {

public MyHelperClass getRoot(){ return null; }
	public MyHelperClass run(IWorkspaceRunnable o0, MyHelperClass o1, MyHelperClass o2, NullProgressMonitor o3){ return null; }}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class IProgressMonitor {

}

class IPath {

public MyHelperClass append(Path o0){ return null; }
	public MyHelperClass toPortableString(){ return null; }
	public MyHelperClass toFile(){ return null; }}

class Path {

Path(String o0){}
	Path(){}}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(FileOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass setLevel(MyHelperClass o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class Status {

}

class NullProgressMonitor {

}
