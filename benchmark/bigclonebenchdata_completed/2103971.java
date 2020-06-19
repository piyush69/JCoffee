


class c2103971 {

//    @Override
    protected void writeFile() {
        this.writeFile();
        try {
            MyHelperClass file = new MyHelperClass();
            String tagListFilePath =(String)(Object) file.toURI().toASCIIString();
            MyHelperClass FileManager = new MyHelperClass();
            tagListFilePath = tagListFilePath.substring(0, tagListFilePath.lastIndexOf((int)(Object)FileManager.GLIPS_VIEW_EXTENSION)) + FileManager.TAG_LIST_FILE_EXTENSION;
            File tagListFile = new File(new URI(tagListFilePath));
            StringBuffer buffer = new StringBuffer("");
            MyHelperClass tags = new MyHelperClass();
            for (String tagName :(String[])(Object) (Object[])(Object)tags) {
                buffer.append(tagName + "\n");
            }
            MyHelperClass ByteBuffer = new MyHelperClass();
            ByteBuffer byteBuffer =(ByteBuffer)(Object) ByteBuffer.wrap(buffer.toString().getBytes("UTF-8"));
            FileOutputStream out = new FileOutputStream(tagListFile);
            FileChannel channel =(FileChannel)(Object) out.getChannel();
            channel.write(byteBuffer);
            channel.close();
        } catch (Exception ex) {
        }
        try {
            MyHelperClass file = new MyHelperClass();
            String parentPath =(String)(Object) file.getParentFile().toURI().toASCIIString();
            if (!parentPath.endsWith("/")) {
                parentPath += "/";
            }
            File srcFile = null, destFile = null;
            byte[] tab = new byte[1000];
            int nb = 0;
            InputStream in = null;
            OutputStream out = null;
            MyHelperClass dataBaseFiles = new MyHelperClass();
            for (String destinationName :(String[])(Object) (Object[])(Object)dataBaseFiles.keySet()) {
//                MyHelperClass dataBaseFiles = new MyHelperClass();
                srcFile =(File)(Object) dataBaseFiles.get(destinationName);
                if (srcFile != null) {
                    destFile = new File(new URI(parentPath + destinationName));
                    in =(InputStream)(Object) new BufferedInputStream(new FileInputStream(srcFile));
                    out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(destFile));
                    while ((int)(Object)in.available() > 0) {
                        nb =(int)(Object) in.read(tab);
                        if (nb > 0) {
                            out.write(tab, 0, nb);
                        }
                    }
                    in.close();
                    out.flush();
                    out.close();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GLIPS_VIEW_EXTENSION;
	public MyHelperClass TAG_LIST_FILE_EXTENSION;
public MyHelperClass get(String o0){ return null; }
	public MyHelperClass wrap(byte[] o0){ return null; }
	public MyHelperClass toASCIIString(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass toURI(){ return null; }
	public MyHelperClass keySet(){ return null; }}

class File {

File(URI o0){}
	File(){}}

class URI {

URI(String o0){}
	URI(){}}

class ByteBuffer {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass available(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}
