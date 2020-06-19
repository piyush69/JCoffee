import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22170050 {
public MyHelperClass UrlFindingUtils;

    private void copyTemplates(ProjectPath pPath)  throws Throwable {
        String sourceAntPath = pPath.sourceAntPath();
        MyHelperClass projectOperations = new MyHelperClass();
        final String moduleName = projectOperations.getFocusedTopLevelPackage().toString();
        MyHelperClass logger = new MyHelperClass();
        logger.info("Module Name: " + moduleName);
//        MyHelperClass projectOperations = new MyHelperClass();
        String targetDirectory = pPath.canonicalFileSystemPath(projectOperations);
//        MyHelperClass logger = new MyHelperClass();
        logger.info("Moving into target Directory: " + targetDirectory);
        if (!targetDirectory.endsWith("/")) {
            targetDirectory += "/";
        }
        MyHelperClass fileManager = new MyHelperClass();
        if (!fileManager.exists(targetDirectory)) {
//            MyHelperClass fileManager = new MyHelperClass();
            fileManager.createDirectory(targetDirectory);
        }
        System.out.println("Target Directory: " + pPath.sourceAntPath());
        MyHelperClass TemplateUtils = new MyHelperClass();
        String path = TemplateUtils.getTemplatePath(getClass(), sourceAntPath);
        MyHelperClass context = new MyHelperClass();
        Set<URL> urls = UrlFindingUtils.findMatchingClasspathResources(context.getBundleContext(), path);
        MyHelperClass Assert = new MyHelperClass();
        Assert.notNull(urls, "Could not search bundles for resources for Ant Path '" + path + "'");
        if (urls.isEmpty()) {
//            MyHelperClass logger = new MyHelperClass();
            logger.info("URLS are empty stopping...");
        }
        for (URL url : urls) {
//            MyHelperClass logger = new MyHelperClass();
            logger.info("Stepping into " + url.toExternalForm());
            String fileName = url.getPath().substring(url.getPath().lastIndexOf("/") + 1);
            fileName = fileName.replace("-template", "");
            String targetFilename = targetDirectory + fileName;
//            MyHelperClass logger = new MyHelperClass();
            logger.info("Handling " + targetFilename);
//            MyHelperClass fileManager = new MyHelperClass();
            if (!fileManager.exists(targetFilename)) {
                try {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.info("Copied file");
                    MyHelperClass FileCopyUtils = new MyHelperClass();
                    String input = FileCopyUtils.copyToString(new InputStreamReader(url.openStream()));
//                    MyHelperClass projectOperations = new MyHelperClass();
                    logger.info("TopLevelPackage: " + projectOperations.getFocusedTopLevelPackage());
//                    MyHelperClass projectOperations = new MyHelperClass();
                    logger.info("SegmentPackage: " + pPath.canonicalFileSystemPath(projectOperations));
//                    MyHelperClass projectOperations = new MyHelperClass();
                    String topLevelPackage = projectOperations.getFocusedTopLevelPackage().toString();
                    input = input.replace("__TOP_LEVEL_PACKAGE__", topLevelPackage);
                    input = input.replace("__SEGMENT_PACKAGE__", pPath.segmentPackage());
//                    MyHelperClass projectOperations = new MyHelperClass();
                    input = input.replace("__PROJECT_NAME__", projectOperations.getFocusedProjectName());
                    MyHelperClass entityName = new MyHelperClass();
                    input = input.replace((char)(Object)"__ENTITY_NAME__", entityName);
//                    MyHelperClass fileManager = new MyHelperClass();
                    MutableFile mutableFile = fileManager.createFile(targetFilename);
//                    MyHelperClass FileCopyUtils = new MyHelperClass();
                    FileCopyUtils.copy(input.getBytes(), mutableFile.getOutputStream());
                } catch (IOException ioe) {
                    throw new IllegalStateException("Unable to create '" + targetFilename + "'", ioe);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getFocusedTopLevelPackage(){ return null; }
	public MyHelperClass notNull(Set<URL o0, String o1){ return null; }
	public MyHelperClass getFocusedProjectName(){ return null; }
	public MyHelperClass getBundleContext(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getTemplatePath(Class o0, String o1){ return null; }
	public MyHelperClass createDirectory(String o0){ return null; }
	public MyHelperClass createFile(String o0){ return null; }
	public MyHelperClass copyToString(InputStreamReader o0){ return null; }
	public MyHelperClass exists(String o0){ return null; }}

class ProjectPath {

public MyHelperClass canonicalFileSystemPath(MyHelperClass o0){ return null; }
	public MyHelperClass sourceAntPath(){ return null; }
	public MyHelperClass segmentPackage(){ return null; }}

class MutableFile {

public MyHelperClass getOutputStream(){ return null; }}
