


class c17847880 {
public static MyHelperClass Constant;
public static MyHelperClass CryptionControl;
//public MyHelperClass CryptionControl;
//	public MyHelperClass Constant;

    public static boolean saveToTempFile(Context context, String filePath, DirType dirType, String tempSavePath, boolean secrete) {
        FileOutputStream fos = null;
        InputStream in = null;
        byte[] buffer = new byte[1024];
        int readLength = 0;
        boolean result = false;
        try {
            try {
                MyHelperClass File = new MyHelperClass();
                File f = new File((int)(Object)context.getFilesDir().getAbsolutePath() + (int)(Object)File.separator + tempSavePath);
                if ((boolean)(Object)f.exists()) {
                    context.deleteFile(tempSavePath);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            MyHelperClass Context = new MyHelperClass();
            fos =(FileOutputStream)(Object) context.openFileOutput(tempSavePath, Context.MODE_WORLD_READABLE);
            MyHelperClass logger = new MyHelperClass();
            logger.error("tempfile:" + tempSavePath);
            MyHelperClass DirType = new MyHelperClass();
            if (dirType == (DirType)(Object)DirType.assets) {
                AssetManager assetManager =(AssetManager)(Object) context.getAssets();
                in =(InputStream)(Object) assetManager.open(filePath);
//            MyHelperClass DirType = new MyHelperClass();
            } else if (dirType == (DirType)(Object)DirType.file && Constant.getUpdateDataPath() != null) {
                MyHelperClass Constant = new MyHelperClass();
                in =(InputStream)(Object) new FileInputStream((int)(Object)Constant.getUpdateDataPath() + (int)(Object)File.separator + filePath);
//            MyHelperClass DirType = new MyHelperClass();
            } else if (dirType == (DirType)(Object)DirType.sd && Constant.getSdPath() != null) {
                MyHelperClass Constant = new MyHelperClass();
                in =(InputStream)(Object) new FileInputStream((int)(Object)Constant.getSdPath() + (int)(Object)File.separator + filePath);
//            MyHelperClass DirType = new MyHelperClass();
            } else if (dirType == (DirType)(Object)DirType.extSd && Constant.getExtSdPath() != null) {
                MyHelperClass Constant = new MyHelperClass();
                in =(InputStream)(Object) new FileInputStream((int)(Object)Constant.getExtSdPath() + (int)(Object)File.separator + filePath);
            }
            if (in == null) {
                return false;
            }
            readLength =(int)(Object) in.read(buffer);
            MyHelperClass ZipToFile = new MyHelperClass();
            if (readLength >= (int)(Object)ZipToFile.encrypLength && secrete) {
//                MyHelperClass ZipToFile = new MyHelperClass();
                byte[] encrypByte = new byte[(int)(Object)ZipToFile.encrypLength];
//                MyHelperClass ZipToFile = new MyHelperClass();
                System.arraycopy(buffer, 0, encrypByte, 0,(int)(Object) ZipToFile.encrypLength);
//                MyHelperClass ZipToFile = new MyHelperClass();
                byte[] temp =(byte[])(Object) CryptionControl.getInstance().decryptECB(encrypByte, ZipToFile.rootKey);
//                MyHelperClass ZipToFile = new MyHelperClass();
                System.arraycopy(temp, 0, buffer, 0,(int)(Object) ZipToFile.encrypLength);
            }
            while (readLength > 0) {
                fos.write(buffer, 0, readLength);
                fos.flush();
                readLength =(int)(Object) in.read(buffer);
            }
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.flush();
                    fos.close();
                } catch (Exception e) {
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e) {
                }
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass encrypLength;
	public MyHelperClass file;
	public MyHelperClass separator;
	public MyHelperClass sd;
	public MyHelperClass rootKey;
	public MyHelperClass MODE_WORLD_READABLE;
	public MyHelperClass assets;
	public MyHelperClass extSd;
public MyHelperClass getExtSdPath(){ return null; }
	public MyHelperClass getSdPath(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getUpdateDataPath(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass decryptECB(byte[] o0, MyHelperClass o1){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Context {

public MyHelperClass deleteFile(String o0){ return null; }
	public MyHelperClass getAssets(){ return null; }
	public MyHelperClass openFileOutput(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getFilesDir(){ return null; }}

class DirType {

}

class FileOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class File {
public static MyHelperClass separator;
File(){}
	File(String o0){}
	public MyHelperClass exists(){ return null; }}

class AssetManager {

public MyHelperClass open(String o0){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
