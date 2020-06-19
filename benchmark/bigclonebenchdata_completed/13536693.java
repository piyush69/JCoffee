


class c13536693 {

	public static void decompress(File apps,File f) throws IOException{
		String filename=(String)(Object)f.getName();
  MyHelperClass PACK_FILE_SUFFIX = new MyHelperClass();
		filename=filename.substring(0,filename.length()-(int)(Object)PACK_FILE_SUFFIX.length());
		File dir=new File(apps,filename);
		if(!(Boolean)(Object)dir.exists()){
			dir.mkdirs();
		}
		if((boolean)(Object)dir.isDirectory()){
			JarFile jar=new JarFile(f);
			Enumeration files=(Enumeration)(Object)jar.entries();
			while((boolean)(Object)files.hasMoreElements()){
				JarEntry je=(JarEntry)(Object)files.nextElement();
				if((boolean)(Object)je.isDirectory()){
					File item=new File(dir,(String)(Object)je.getName());
					item.mkdirs();
				}else{
					File item=new File(dir,(String)(Object)je.getName());
					item.getParentFile().mkdirs();
					InputStream input=(InputStream)(Object)jar.getInputStream(je);
					FileOutputStream out=new FileOutputStream(item);
     MyHelperClass IOUtils = new MyHelperClass();
					IOUtils.copy(input, out);
					input.close();
					out.close();
				}
				//System.out.println(je.isDirectory() + je.getName());
			}
		}
	}

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JarFile {

JarFile(File o0){}
	JarFile(){}
	public MyHelperClass entries(){ return null; }
	public MyHelperClass getInputStream(JarEntry o0){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class JarEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
