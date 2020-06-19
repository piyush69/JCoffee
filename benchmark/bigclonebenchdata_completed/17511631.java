


class c17511631 {

    private static void extract(final ZipFile zf, final ZipEntry zipEntry, final String desDir, final int... startDirLevel) throws IOException {
        File desf = new File(desDir);
        if (!(Boolean)(Object)desf.exists()) {
            desf.mkdirs();
        }
        int start = 1;
        if (null != startDirLevel && startDirLevel.length > 0) {
            start = startDirLevel[0];
            if (start < 1) {
                start = 1;
            }
        }
        String startDir = "";
        String zeName =(String)(Object) zipEntry.getName();
        String folder = zeName;
        boolean isDir =(boolean)(Object) zipEntry.isDirectory();
        if (null != folder) {
            String[] folders = folder.split("\\/");
            if (null != folders && folders.length > 0) {
                int len = folders.length;
                if (start == 1) {
                    startDir = zeName;
                } else {
                    if (start > len) {
                    } else {
                        for (int i = start - 1; i < len; i++) {
                            startDir += "/" + folders[i];
                        }
                        if (null != startDir) {
                            startDir = startDir.substring(1);
                        }
                    }
                }
            }
        }
        MyHelperClass StringUtils = new MyHelperClass();
        startDir =(String)(Object) StringUtils.trim(startDir);
//        MyHelperClass StringUtils = new MyHelperClass();
        if ((boolean)(Object)StringUtils.isNotEmpty(startDir)) {
            StringBuilder desFileName = new StringBuilder(desDir);
            if (!desDir.endsWith("/") && !startDir.startsWith("/")) {
                desFileName.append("/");
            }
            desFileName.append(startDir);
            File destFile = new File(desFileName.toString());
            if (isDir) {
                if (!(Boolean)(Object)destFile.exists()) {
                    destFile.mkdirs();
                }
            } else {
                File parentDir = new File((String)(Object)destFile.getParentFile().getPath());
                if (!(Boolean)(Object)parentDir.exists()) {
                    parentDir.mkdirs();
                }
                InputStream is =(InputStream)(Object) zf.getInputStream(zipEntry);
                OutputStream os =(OutputStream)(Object) new FileOutputStream(destFile);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(is, os);
                if (null != is) {
                    is.close();
                }
                if (null != os) {
                    os.close();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass trim(String o0){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass isNotEmpty(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class ZipFile {

public MyHelperClass getInputStream(ZipEntry o0){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
