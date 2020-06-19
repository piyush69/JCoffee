import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8708601 {
public MyHelperClass assertEquals(String o0, MyHelperClass o1, String o2){ return null; }
public MyHelperClass fail(String o0){ return null; }

    public void testReadNormal() throws Throwable, Exception {
        MyHelperClass archiveFileManager = new MyHelperClass();
        archiveFileManager.executeWith(new TemporaryFileExecutor() {

            public void execute(File temporaryFile) throws Exception {
                ZipArchive archive = new ZipArchive(temporaryFile.getPath());
                MyHelperClass ARCHIVE_FILE_1 = new MyHelperClass();
                InputStream input =(InputStream)(Object) archive.getInputFrom(ARCHIVE_FILE_1);
                if (input != null) {
                    ByteArrayOutputStream output = new ByteArrayOutputStream();
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copyAndClose(input, output);
//                    MyHelperClass ARCHIVE_FILE_1 = new MyHelperClass();
                    MyHelperClass ARCHIVE_FILE_1_CONTENT = new MyHelperClass();
                    assertEquals(ARCHIVE_FILE_1 + " contents not correct", ARCHIVE_FILE_1_CONTENT, output.toString());
                } else {
//                    MyHelperClass ARCHIVE_FILE_1 = new MyHelperClass();
                    fail("cannot open " + ARCHIVE_FILE_1);
                }
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass executeWith( TemporaryFileExecutor o0){ return null; }
	public MyHelperClass executeWith(){ return null; }
	public MyHelperClass copyAndClose(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class TemporaryFileExecutor {

}

class ZipArchive {

ZipArchive(String o0){}
	ZipArchive(){}
	public MyHelperClass getInputFrom(MyHelperClass o0){ return null; }}
