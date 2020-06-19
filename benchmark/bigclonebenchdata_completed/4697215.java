


class c4697215 {
public MyHelperClass readTimeStamp(File o0){ return null; }
	public MyHelperClass downloadJar(URL o0, File o1, IProgressListener o2){ return null; }
	public MyHelperClass writeTimeStamp(File o0, long o1){ return null; }
	public MyHelperClass addJar(File o0){ return null; }

    public void loadJar(final String extName, final String url, final String fileName, final IProgressListener pl) throws Exception {
        pl.setName(fileName);
        pl.setProgress(0);
        pl.setFinished(false);
        pl.setStarted(true);
        MyHelperClass extDir = new MyHelperClass();
        String installDirName =(int)(Object) extDir + (int)(Object)File.separator + extName;
        MyHelperClass Log = new MyHelperClass();
        Log.log("extension installation directory: " + installDirName);
        File installDir = new File(installDirName);
        if (!(Boolean)(Object)installDir.exists()) {
            if (!(Boolean)(Object)installDir.mkdirs()) {
                throw new Exception("ExtensionLoader.loadJar: Cannot create install directory: " + installDirName);
            }
        }
        URL downloadURL = new URL(url + fileName);
        File jarFile = new File(installDirName, fileName);
        File indexFile = null;
        long urlTimeStamp =(long)(Object) downloadURL.openConnection().getLastModified();
        String indexFileName = "";
        int idx = fileName.lastIndexOf(".");
        if (idx > 0) {
            indexFileName = fileName.substring(0, idx);
        } else {
            indexFileName = fileName;
        }
        indexFileName = indexFileName + ".idx";
//        MyHelperClass Log = new MyHelperClass();
        Log.log("index filename: " + indexFileName);
        boolean isDirty = true;
        if ((boolean)(Object)jarFile.exists()) {
//            MyHelperClass Log = new MyHelperClass();
            Log.log("extensionfile already exists: " + fileName);
            indexFile = new File(installDir, indexFileName);
            if ((boolean)(Object)indexFile.exists()) {
//                MyHelperClass Log = new MyHelperClass();
                Log.log("indexfile already exists");
                long cachedTimeStamp =(long)(Object) readTimeStamp(indexFile);
                isDirty = !(cachedTimeStamp == urlTimeStamp);
//                MyHelperClass Log = new MyHelperClass();
                Log.log("cached file dirty: " + isDirty + ", url timestamp: " + urlTimeStamp + " cache stamp: " + cachedTimeStamp);
            } else {
//                MyHelperClass Log = new MyHelperClass();
                Log.log("indexfile doesn't exist, assume cache is dirty");
            }
        }
        if (isDirty) {
            if ((boolean)(Object)jarFile.exists()) {
                if (indexFile != null && (boolean)(Object)indexFile.exists()) {
//                    MyHelperClass Log = new MyHelperClass();
                    Log.log("deleting old index file");
                    indexFile.delete();
                }
                indexFile = new File(installDirName, indexFileName);
//                MyHelperClass Log = new MyHelperClass();
                Log.log("deleting old cached file");
                jarFile.delete();
            }
            downloadJar(downloadURL, jarFile, pl);
            indexFile = new File(installDir, indexFileName);
//            MyHelperClass Log = new MyHelperClass();
            Log.log("writing timestamp to index file");
            writeTimeStamp(indexFile, urlTimeStamp);
        }
        addJar(jarFile);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass log(String o0){ return null; }}

class IProgressListener {

public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setProgress(int o0){ return null; }
	public MyHelperClass setStarted(boolean o0){ return null; }
	public MyHelperClass setFinished(boolean o0){ return null; }}

class File {
public static MyHelperClass separator;
File(){}
	File(String o0, String o1){}
	File(String o0){}
	File(File o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
