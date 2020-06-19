import java.io.*;
import java.lang.*;
import java.util.*;



class c5875194 {

    @SuppressWarnings("unchecked")
    public static void unzip(String zipFileName, String folder, boolean isCreate) throws IOException {
        File file = new File(zipFileName);
        File folderfile = null;
        if (file.exists() && file.isFile()) {
            String mfolder = folder == null ? file.getParent() : folder;
            String fn = file.getName();
            fn = fn.substring(0, fn.lastIndexOf("."));
            mfolder = isCreate ? (mfolder + File.separator + fn) : mfolder;
            folderfile = new File(mfolder);
            if (!folderfile.exists()) {
                folderfile.mkdirs();
            }
        } else {
            throw new FileNotFoundException("不存在 zip 文件");
        }
        ZipFile zipFile = new ZipFile(file);
        try {
            Enumeration<ZipArchiveEntry> en =(Enumeration<ZipArchiveEntry>)(Object) zipFile.getEntries();
            ZipArchiveEntry ze = null;
            while (en.hasMoreElements()) {
                ze = en.nextElement();
                if ((boolean)(Object)ze.isDirectory()) {
                    String dirName =(String)(Object) ze.getName();
                    dirName = dirName.substring(0, dirName.length() - 1);
                    File f = new File(folderfile.getPath() + File.separator + dirName);
                    f.mkdirs();
                } else {
                    File f = new File(folderfile.getPath() + File.separator + ze.getName());
                    if (!f.getParentFile().exists()) {
                        f.getParentFile().mkdirs();
                    }
                    f.createNewFile();
                    InputStream in =(InputStream)(Object) zipFile.getInputStream(ze);
                    OutputStream out = new FileOutputStream(f);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(in, out);
                    out.close();
                    in.close();
                }
            }
        } finally {
            zipFile.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class ZipFile {

ZipFile(File o0){}
	ZipFile(){}
	public MyHelperClass getInputStream(ZipArchiveEntry o0){ return null; }
	public MyHelperClass getEntries(){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipArchiveEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}
