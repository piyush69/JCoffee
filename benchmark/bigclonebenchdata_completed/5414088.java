import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5414088 {
public static MyHelperClass ResourceManager;
	public static MyHelperClass UtilMethods;
	public static MyHelperClass IdentifierCache;
	public static MyHelperClass Logger;
	public static MyHelperClass CacheLocator;
	public static MyHelperClass getAssetIOFile(File o0){ return null; }
public MyHelperClass Logger;
	public MyHelperClass ResourceManager;
	public MyHelperClass IdentifierCache;
	public MyHelperClass UtilMethods;
	public MyHelperClass CacheLocator;
	public MyHelperClass getAssetIOFile(File o0){ return null; }

    public static void saveFileData(File file, File destination, java.io.File newDataFile) throws Throwable, Exception {
        String fileName =(String)(Object) file.getFileName();
        MyHelperClass FileFactory = new MyHelperClass();
        String assetsPath = FileFactory.getRealAssetsRootPath();
        new java.io.File(assetsPath).mkdir();
        java.io.File workingFile =(File)(Object) getAssetIOFile(file);
        DotResourceCache vc = CacheLocator.getVeloctyResourceCache();
        vc.remove(ResourceManager.RESOURCE_TEMPLATE + workingFile.getPath());
        if (destination != null &&(int)(Object) destination.getInode() > 0) {
            FileInputStream is = new FileInputStream(workingFile);
            FileChannel channelFrom =(FileChannel)(Object) is.getChannel();
            java.io.File newVersionFile =(File)(Object) getAssetIOFile(destination);
            FileChannel channelTo = (FileChannel)(Object)new FileOutputStream(newVersionFile).getChannel();
            channelFrom.transferTo(0, channelFrom.size(), channelTo);
            channelTo.force(false);
            channelTo.close();
            channelFrom.close();
        }
        if (newDataFile != null) {
            FileChannel writeCurrentChannel = (FileChannel)(Object)new FileOutputStream(workingFile).getChannel();
            writeCurrentChannel.truncate(0);
            FileChannel fromChannel = (FileChannel)(Object)new FileInputStream(newDataFile).getChannel();
            fromChannel.transferTo(0, fromChannel.size(), writeCurrentChannel);
            writeCurrentChannel.force(false);
            writeCurrentChannel.close();
            fromChannel.close();
            if (UtilMethods.isImage(fileName)) {
                BufferedImage img =(BufferedImage)(Object) javax.imageio.ImageIO.read(workingFile);
                int height = img.getHeight();
                file.setHeight(height);
                int width = img.getWidth();
                file.setWidth(width);
            }
            String folderPath = workingFile.getParentFile().getAbsolutePath();
            Identifier identifier = IdentifierCache.getIdentifierFromIdentifierCache(file);
            java.io.File directory = new java.io.File(folderPath);
            java.io.File[] files = directory.listFiles((new FileFactory()).new ThumbnailsFileNamesFilter(identifier));
            for (java.io.File iofile : files) {
                try {
                    iofile.delete();
                } catch (SecurityException e) {
                    Logger.error(FileFactory.class, "EditFileAction._saveWorkingFileData(): " + iofile.getName() + " cannot be erased. Please check the file permissions.");
                } catch (Exception e) {
                    Logger.error(FileFactory.class, "EditFileAction._saveWorkingFileData(): " + e.getMessage());
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RESOURCE_TEMPLATE;
public MyHelperClass getVeloctyResourceCache(){ return null; }
	public MyHelperClass error(Class<FileFactory o0, String o1){ return null; }
	public MyHelperClass getIdentifierFromIdentifierCache(File o0){ return null; }
	public MyHelperClass getRealAssetsRootPath(){ return null; }
	public MyHelperClass isImage(String o0){ return null; }}

class File {

public MyHelperClass setHeight(int o0){ return null; }
	public MyHelperClass setWidth(int o0){ return null; }
	public MyHelperClass getInode(){ return null; }
	public MyHelperClass getFileName(){ return null; }}

class DotResourceCache {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass force(boolean o0){ return null; }
	public MyHelperClass truncate(int o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedImage {

public MyHelperClass getWidth(){ return null; }
	public MyHelperClass getHeight(){ return null; }}

class Identifier {

}

class FileFactory {

}

class ThumbnailsFileNamesFilter {

}
