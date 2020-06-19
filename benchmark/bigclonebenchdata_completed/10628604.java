import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10628604 {

    public File extractID3v2TagDataIntoFile(File outputFile) throws Throwable, TagNotFoundException, IOException {
        MyHelperClass audioHeader = new MyHelperClass();
        int startByte = (int)(int)(Object) ((MP3AudioHeader)(MP3AudioHeader)(Object) audioHeader).getMp3StartByte();
        if (startByte >= 0) {
            MyHelperClass file = new MyHelperClass();
            FileInputStream fis = new FileInputStream((String)(Object)file);
            FileChannel fc =(FileChannel)(Object) fis.getChannel();
            MyHelperClass ByteBuffer = new MyHelperClass();
            ByteBuffer bb =(ByteBuffer)(Object) ByteBuffer.allocate(startByte);
            fc.read(bb);
            FileOutputStream out = new FileOutputStream(outputFile);
            out.write((int)(Object)bb.array());
            out.close();
            fc.close();
            fis.close();
            return outputFile;
        }
        throw new TagNotFoundException("There is no ID3v2Tag data in this file");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocate(int o0){ return null; }}

class TagNotFoundException extends Exception{
	public TagNotFoundException(String errorMessage) { super(errorMessage); }
}

class MP3AudioHeader {

public MyHelperClass getMp3StartByte(){ return null; }}

class FileChannel {

public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteBuffer {

public MyHelperClass array(){ return null; }}
