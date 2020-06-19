


class c17306198 {

        private File createWorkingCopy(File _originalRawDataFile) {
            File fOriginalRawDataFile = _originalRawDataFile;
            File fWorkingCopy;
            System.gc();
            try {
                MyHelperClass File = new MyHelperClass();
                fWorkingCopy =(File)(Object) File.createTempFile("MZmine", null);
                FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(fOriginalRawDataFile).getChannel());
                FileChannel destinationChannel =(FileChannel)(Object) (new FileOutputStream(fWorkingCopy).getChannel());
                long sourceChannelPos = 0;
                long sourceChannelSize =(long)(Object) sourceChannel.size();
                long maxReadSize = 5 * 1024 * 1024;
                long targetChannelPos = 0;
                while (sourceChannelPos < sourceChannelSize) {
                    long transferAmount = maxReadSize;
                    if (transferAmount > (sourceChannelSize - sourceChannelPos)) {
                        transferAmount = sourceChannelSize - sourceChannelPos;
                    }
                    sourceChannel.transferTo(sourceChannelPos, transferAmount, destinationChannel);
                    sourceChannelPos += transferAmount;
                }
                sourceChannel.close();
                destinationChannel.close();
            } catch (Exception ekse) {
                MyHelperClass Logger = new MyHelperClass();
                Logger.put("NODE WORKER THREAD: ERROR - Failed to create working copy!");
//                MyHelperClass Logger = new MyHelperClass();
                Logger.put(ekse.toString());
                return null;
            }
            return fWorkingCopy;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0){ return null; }
	public MyHelperClass createTempFile(String o0, Object o1){ return null; }}

class File {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(long o0, long o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
