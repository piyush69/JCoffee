import java.io.*;
import java.lang.*;
import java.util.*;



class c23677121 {

	public static void unzip2(File zipfile, File outputdir) throws IOException {
		//Buffer for extracting files
		byte[] buffer = new byte[1024];
				
		//Zip file
		ZipFile zip = new ZipFile(zipfile);
				
		//Get entries
		Enumeration<ZipArchiveEntry> files =(Enumeration<ZipArchiveEntry>)(Object) zip.getEntries();
				
		//Iterate through the entries
		while(files.hasMoreElements()) {
			//Get entry
			ZipArchiveEntry ze = files.nextElement();
					
			//Resolve entry file
			File newFile = new File(outputdir + File.separator + ze.getName());
					
			//Make parent directories
			newFile.getParentFile().mkdirs();
					
			if((boolean)(Object)ze.isDirectory()) { //If directory, create it
				newFile.mkdir();
			} else { //If file, extract it
				InputStream is =(InputStream)(Object) zip.getInputStream(ze);
				FileOutputStream fos = new FileOutputStream(newFile);
				int len;
				while((len = is.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}
				fos.close();
				is.close();
			}	
		}
				
		//Cleanup
		zip.close();
	}

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ZipFile {

ZipFile(File o0){}
	ZipFile(){}
	public MyHelperClass getInputStream(ZipArchiveEntry o0){ return null; }
	public MyHelperClass getEntries(){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipArchiveEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}
