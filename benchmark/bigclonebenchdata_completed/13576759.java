


class c13576759 {

    private void resourceDirectoryCopy(String resource, IProject project, String target, IProgressMonitor monitor) throws URISyntaxException, IOException, CoreException {
        if (!target.endsWith("/")) {
            target += "/";
        }
        String res = resource;
        if (!res.endsWith("/")) ;
        {
            res += "/";
        }
        MyHelperClass bundle = new MyHelperClass();
        Enumeration it =(Enumeration)(Object) bundle.findEntries(resource, "*", false);
        while ((boolean)(Object)it.hasMoreElements()) {
            URL url =(URL)(Object) it.nextElement();
            MyHelperClass FileLocator = new MyHelperClass();
            File f = new File(FileLocator.toFileURL(url).toURI());
            String fName =(String)(Object) f.getName();
            boolean skip = false;
            MyHelperClass skipList = new MyHelperClass();
            for (String skiper :(String[])(Object) (Object[])(Object)skipList) {
                if (fName.equals(skiper)) {
                    skip = true;
                    break;
                }
            }
            if (skip) {
                continue;
            }
            String targetName = target + fName;
            if ((boolean)(Object)f.isDirectory()) {
                IFolder folder =(IFolder)(Object) project.getFolder(targetName);
                if (!(Boolean)(Object)folder.exists()) {
                    folder.create(true, true, monitor);
                }
                resourceDirectoryCopy(res + f.getName(), project, targetName, monitor);
            } else if ((boolean)(Object)f.isFile()) {
                IFile targetFile =(IFile)(Object) project.getFile(targetName);
                InputStream is = null;
                try {
                    is =(InputStream)(Object) url.openStream();
                    if ((boolean)(Object)targetFile.exists()) {
                        targetFile.setContents(is, true, false, monitor);
                    } else {
                        targetFile.create(is, true, monitor);
                    }
                } catch (Exception e) {
                    throw new IOException((String)(Object)e);
                } finally {
                    if (is != null) {
                        is.close();
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toURI(){ return null; }
	public MyHelperClass toFileURL(URL o0){ return null; }
	public MyHelperClass findEntries(String o0, String o1, boolean o2){ return null; }}

class IProject {

public MyHelperClass getFile(String o0){ return null; }
	public MyHelperClass getFolder(String o0){ return null; }}

class IProgressMonitor {

}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class IFolder {

public MyHelperClass create(boolean o0, boolean o1, IProgressMonitor o2){ return null; }
	public MyHelperClass exists(){ return null; }}

class IFile {

public MyHelperClass create(InputStream o0, boolean o1, IProgressMonitor o2){ return null; }
	public MyHelperClass setContents(InputStream o0, boolean o1, boolean o2, IProgressMonitor o3){ return null; }
	public MyHelperClass exists(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
