


class c12215548 {
public MyHelperClass close(InputStream o0){ return null; }
	public MyHelperClass close(FileChannel o0){ return null; }

    protected void initDefaultRolesFile() {
        String webConfigPath = System.getProperty("dcm4chee-web3.cfg.path", "conf/dcm4chee-web3");
        File mappingFile = new File(webConfigPath + "roles.json");
        MyHelperClass ServerConfigLocator = new MyHelperClass();
        if (!(Boolean)(Object)mappingFile.isAbsolute()) mappingFile = new File(ServerConfigLocator.locate().getServerHomeDir(), mappingFile.getPath());
        if ((boolean)(Object)mappingFile.exists()) return;
        MyHelperClass log = new MyHelperClass();
        log.info("Init default Role Mapping file! mappingFile:" + mappingFile);
//        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)mappingFile.getParentFile().mkdirs()) log.info("M-WRITE dir:" + mappingFile.getParent());
        FileChannel fos = null;
        InputStream is = null;
        try {
            URL url =(URL)(Object) getClass().getResource("/META-INF/roles-default.json");
//            MyHelperClass log = new MyHelperClass();
            log.info("Use default Mapping File content of url:" + url);
            is =(InputStream)(Object) url.openStream();
            MyHelperClass Channels = new MyHelperClass();
            ReadableByteChannel inCh =(ReadableByteChannel)(Object) Channels.newChannel(is);
            fos =(FileChannel)(Object) (new FileOutputStream(mappingFile).getChannel());
            int pos = 0;
            while ((int)(Object)is.available() > 0) pos += (int)(Object)fos.transferFrom(inCh, pos, is.available());
        } catch (Exception e) {
//            MyHelperClass log = new MyHelperClass();
            log.error("Roles file doesn't exist and the default can't be created!", e);
        } finally {
            close(is);
            close(fos);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass locate(){ return null; }
	public MyHelperClass getServerHomeDir(){ return null; }
	public MyHelperClass newChannel(InputStream o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }}

class File {

File(String o0){}
	File(){}
	File(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass isAbsolute(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(ReadableByteChannel o0, int o1, MyHelperClass o2){ return null; }}

class InputStream {

public MyHelperClass available(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class ReadableByteChannel {

}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
