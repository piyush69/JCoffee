import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11324607 {
public MyHelperClass save(FileData o0){ return null; }

//    @Override
//    @Transactional
    public FileData store(FileData data, InputStream stream)  throws Throwable {
        try {
            FileData file =(FileData)(Object) save(data);
            file.setPath(file.getGroup() + File.separator + file.getId());
            file =(FileData)(Object) save(file);
            MyHelperClass PATH = new MyHelperClass();
            File folder = new File((String)(Object)PATH,(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) file.getGroup());
            if (!folder.exists()) folder.mkdirs();
            File filename = new File(folder, file.getId() + "");
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(stream, new FileOutputStream(filename));
            return file;
        } catch (IOException e) {
            throw new ServiceException("storage", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(InputStream o0, FileOutputStream o1){ return null; }}

class FileData {

public MyHelperClass getId(){ return null; }
	public MyHelperClass setPath(String o0){ return null; }
	public MyHelperClass getGroup(){ return null; }}

class Transactional {

}

class ServiceException extends Exception{
	public ServiceException(String errorMessage) { super(errorMessage); }
	ServiceException(String o0, IOException o1){}
	ServiceException(){}
}
