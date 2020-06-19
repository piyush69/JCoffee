


class c16673099 {
public static MyHelperClass closeFileChannel(FileChannel o0){ return null; }
//public MyHelperClass closeFileChannel(FileChannel o0){ return null; }

    public static void copyTo(java.io.File source, java.io.File dest) throws Exception {
        java.io.FileInputStream inputStream = null;
        java.nio.channels.FileChannel sourceChannel = null;
        java.io.FileOutputStream outputStream = null;
        java.nio.channels.FileChannel destChannel = null;
        long size = source.length();
        long bufferSize = 1024;
        long count = 0;
        if (size < bufferSize) bufferSize = size;
        Exception exception = null;
        try {
            if (dest.exists() == false) dest.createNewFile();
            inputStream = new java.io.FileInputStream(source);
            sourceChannel = inputStream.getChannel();
            outputStream = new java.io.FileOutputStream(dest);
            destChannel = outputStream.getChannel();
            while (count < size) count += sourceChannel.transferTo(count, bufferSize, destChannel);
        } catch (Exception e) {
            exception = e;
        } finally {
            closeFileChannel((FileChannel)(Object)sourceChannel);
            closeFileChannel((FileChannel)(Object)destChannel);
        }
        if (exception != null) throw exception;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileChannel {

}
