


class c23672408 {

    private void copyIconFiles(UmlClass clazz) {
        if ((boolean)(Object)clazz.hasAnnotation("icon16")) {
            String i16 =(String)(Object) clazz.annotationValue("icon16");
            String fileType = ".png";
            if (i16.endsWith(".jpg")) fileType = ".jpg";
            if (i16.endsWith(".gif")) fileType = ".gif";
            MyHelperClass output_dir = new MyHelperClass();
            String desti16 = output_dir + "/../resources/images/" + clazz.getName() + "16" + fileType;
            try {
                FileChannel src =(FileChannel)(Object) (new FileInputStream(i16).getChannel());
                FileChannel dst =(FileChannel)(Object) (new FileOutputStream(desti16).getChannel());
                dst.transferFrom(src, 0, src.size());
                src.close();
                dst.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if ((boolean)(Object)clazz.hasAnnotation("icon32")) {
            String i32 =(String)(Object) clazz.annotationValue("icon32");
            String fileType = ".png";
            if (i32.endsWith(".jpg")) fileType = ".jpg";
            if (i32.endsWith(".gif")) fileType = ".gif";
            MyHelperClass output_dir = new MyHelperClass();
            String desti32 = output_dir + "/../resources/images/" + clazz.getName() + "32" + fileType;
            try {
                FileChannel src =(FileChannel)(Object) (new FileInputStream(i32).getChannel());
                FileChannel dst =(FileChannel)(Object) (new FileOutputStream(desti32).getChannel());
                dst.transferFrom(src, 0, src.size());
                src.close();
                dst.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class UmlClass {

public MyHelperClass annotationValue(String o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass hasAnnotation(String o0){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
