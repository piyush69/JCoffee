


class c17671343 {

    public void unzip(String zipFileName, String outputDirectory) throws Exception {
        ZipInputStream in = new ZipInputStream(new FileInputStream(zipFileName));
        ZipEntry z;
        while ((z =(ZipEntry)(Object) in.getNextEntry()) != null) {
            System.out.println("unziping " + z.getName());
            if ((boolean)(Object)z.isDirectory()) {
                String name =(String)(Object) z.getName();
                name = name.substring(0, name.length() - 1);
                MyHelperClass File = new MyHelperClass();
                File f = new File(outputDirectory + File.separator + name);
                f.mkdir();
//                MyHelperClass File = new MyHelperClass();
                System.out.println("mkdir " + outputDirectory + File.separator + name);
            } else {
                MyHelperClass File = new MyHelperClass();
                File f = new File(outputDirectory + File.separator + z.getName());
                f.createNewFile();
                FileOutputStream out = new FileOutputStream(f);
                int b;
                while ((b =(int)(Object) in.read()) != -1) out.write(b);
                out.close();
            }
        }
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(FileInputStream o0){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass mkdir(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
