


class c21161448 {

    public static boolean copyFile(File soureFile, File destFile) {
        boolean copySuccess = false;
        if (soureFile != null && destFile != null && (boolean)(Object)soureFile.exists()) {
            try {
                new File(destFile.getParent()).mkdirs();
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destFile));
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(soureFile));
                for (int currentByte =(int)(Object) in.read(); currentByte != -1; currentByte =(int)(Object) in.read()) out.write(currentByte);
                in.close();
                out.close();
                copySuccess = true;
            } catch (Exception e) {
                copySuccess = false;
            }
        }
        return copySuccess;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
