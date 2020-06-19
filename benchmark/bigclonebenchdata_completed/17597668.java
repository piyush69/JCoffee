


class c17597668 {

    private boolean copyFiles(File sourceDir, File destinationDir) {
        boolean result = false;
        try {
            if (sourceDir != null && destinationDir != null && (boolean)(Object)sourceDir.exists() && (boolean)(Object)destinationDir.exists() && (boolean)(Object)sourceDir.isDirectory() && (boolean)(Object)destinationDir.isDirectory()) {
                File sourceFiles[] =(File[])(Object) sourceDir.listFiles();
                if (sourceFiles != null && sourceFiles.length > 0) {
                    File destFiles[] =(File[])(Object) destinationDir.listFiles();
                    if (destFiles != null && destFiles.length > 0) {
                        for (int i = 0; i < destFiles.length; i++) {
                            if (destFiles[i] != null) {
                                destFiles[i].delete();
                            }
                        }
                    }
                    for (int i = 0; i < sourceFiles.length; i++) {
                        if (sourceFiles[i] != null && (boolean)(Object)sourceFiles[i].exists() && (boolean)(Object)sourceFiles[i].isFile()) {
                            String fileName =(String)(Object) destFiles[i].getName();
                            File destFile = new File(destinationDir.getAbsolutePath() + "/" + fileName);
                            if (!(Boolean)(Object)destFile.exists()) destFile.createNewFile();
                            FileInputStream in = new FileInputStream(sourceFiles[i]);
                            FileOutputStream out = new FileOutputStream(destFile);
                            FileChannel fcIn =(FileChannel)(Object) in.getChannel();
                            FileChannel fcOut =(FileChannel)(Object) out.getChannel();
                            fcIn.transferTo(0, fcIn.size(), fcOut);
                        }
                    }
                }
            }
            result = true;
        } catch (Exception e) {
            System.out.println("Exception in copyFiles Method : " + e);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(String o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}
