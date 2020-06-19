import java.io.*;
import java.lang.*;
import java.util.*;



class c18084457 {
public MyHelperClass session;
	public MyHelperClass cookie;
	public MyHelperClass FileTransferHeader;
	public MyHelperClass Channels;
	public MyHelperClass address;
	public MyHelperClass port;
	public MyHelperClass getSocket(){ return null; }

    public void run() {
        try {
            Socket socket =(Socket)(Object) getSocket();
            System.out.println("opening socket to " + address + " on " + port);
            InputStream in =(InputStream)(Object) socket.getInputStream();
            for (; ; ) {
                FileTransferHeader header =(FileTransferHeader)(Object) FileTransferHeader.readHeader(in);
                if (header == null) break;
                System.out.println("header: " + header);
                String[] parts =(String[])(Object) header.getFilename().getSegments();
                String filename;
                if (parts.length > 0) filename = "dl-" + parts[parts.length - 1]; else filename = "dl-" + session.getScreenname();
                System.out.println("writing to file " + filename);
                long sum = 0;
                if (new File(filename).exists()) {
                    FileInputStream fis = new FileInputStream(filename);
                    byte[] block = new byte[10];
                    for (int i = 0; i < block.length; ) {
                        int count = fis.read(block);
                        if (count == -1) break;
                        i += count;
                    }
                    FileTransferChecksum summer = new FileTransferChecksum();
                    summer.update(block, 0, 10);
                    sum =(long)(Object) summer.getValue();
                }
                FileChannel fileChannel =(FileChannel)(Object) (new FileOutputStream(filename).getChannel());
                FileTransferHeader outHeader = new FileTransferHeader(header);
                outHeader.setHeaderType(FileTransferHeader.HEADERTYPE_ACK);
                outHeader.setIcbmMessageId(cookie);
                outHeader.setBytesReceived(0);
                outHeader.setReceivedChecksum(sum);
                OutputStream socketOut =(OutputStream)(Object) socket.getOutputStream();
                System.out.println("sending header: " + outHeader);
                outHeader.write(socketOut);
                for (int i = 0; i < (int)(Object)header.getFileSize(); ) {
                    long transferred =(long)(Object) fileChannel.transferFrom(Channels.newChannel(in), 0,(int)(Object) header.getFileSize() - i);
                    System.out.println("transferred " + transferred);
                    if (transferred == -1) return;
                    i += transferred;
                }
                System.out.println("finished transfer!");
                fileChannel.close();
                FileTransferHeader doneHeader = new FileTransferHeader(header);
                doneHeader.setHeaderType(FileTransferHeader.HEADERTYPE_RECEIVED);
                doneHeader.setFlags((int)(Object)doneHeader.getFlags() | (int)(Object)FileTransferHeader.FLAG_DONE);
                doneHeader.setBytesReceived((int)(Object)doneHeader.getBytesReceived() + 1);
                doneHeader.setIcbmMessageId(cookie);
                doneHeader.setFilesLeft((int)(Object)doneHeader.getFilesLeft() - 1);
                doneHeader.write(socketOut);
                if ((int)(Object)doneHeader.getFilesLeft() - 1 <= 0) {
                    socket.close();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HEADERTYPE_RECEIVED;
	public MyHelperClass FLAG_DONE;
	public MyHelperClass HEADERTYPE_ACK;
public MyHelperClass readHeader(InputStream o0){ return null; }
	public MyHelperClass getScreenname(){ return null; }
	public MyHelperClass newChannel(InputStream o0){ return null; }
	public MyHelperClass getSegments(){ return null; }}

class Socket {

public MyHelperClass close(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class FileTransferHeader {

FileTransferHeader(FileTransferHeader o0){}
	FileTransferHeader(){}
	public MyHelperClass getBytesReceived(){ return null; }
	public MyHelperClass getFilename(){ return null; }
	public MyHelperClass getFilesLeft(){ return null; }
	public MyHelperClass setIcbmMessageId(MyHelperClass o0){ return null; }
	public MyHelperClass setReceivedChecksum(long o0){ return null; }
	public MyHelperClass setFilesLeft(int o0){ return null; }
	public MyHelperClass getFlags(){ return null; }
	public MyHelperClass setBytesReceived(int o0){ return null; }
	public MyHelperClass setHeaderType(MyHelperClass o0){ return null; }
	public MyHelperClass setFlags(int o0){ return null; }
	public MyHelperClass write(OutputStream o0){ return null; }
	public MyHelperClass getFileSize(){ return null; }}

class FileTransferChecksum {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass getValue(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferFrom(MyHelperClass o0, int o1, int o2){ return null; }}
