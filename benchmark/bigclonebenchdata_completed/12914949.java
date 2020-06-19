


class c12914949 {

    private void downloadImage(final String sImgName) {
        if (sImgName != null && sImgName.length() > 0) {
            MyHelperClass m_sTargetDir = new MyHelperClass();
            File f = new File(m_sTargetDir);
            if ((boolean)(Object)f.canWrite()) {
                f = new File(f, sImgName);
                if (!(Boolean)(Object)f.exists()) {
                    try {
                        MyHelperClass m_sCodeBase = new MyHelperClass();
                        URL url = new URL((char)(Object)m_sCodeBase + '/' + sImgName);
                        BufferedInputStream is = new BufferedInputStream(url.openStream());
                        BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(f));
                        int c;
                        while ((c =(int)(Object) is.read()) != -1) {
                            os.write(c);
                        }
                        is.close();
                        os.close();
                    } catch (Exception exc) {
                        System.out.println("TestImagesHelper::downloadImage(): " + exc);
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(MyHelperClass o0){}
	File(File o0, String o1){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass canWrite(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
