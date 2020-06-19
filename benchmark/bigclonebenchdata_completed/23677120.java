import java.io.*;
import java.lang.*;
import java.util.*;



class c23677120 {

	public static void unzip1(File zipfile, File outputdir) throws IOException {
		//Buffer for copying the files out of the zip input stream
		byte[] buffer = new byte[1024];
				
		//Create parent output directory if it doesn't exist
		if(!outputdir.exists()) {
			outputdir.mkdirs();
		}
				
		//Create the zip input stream
		//OR ArchiveInputStream zis = new ArchiveStreamFactory().createArchiveInputStream(ArchiveStreamFactory.ZIP, new FileInputStream(zipfile));
		ArchiveInputStream zis =(ArchiveInputStream)(Object) new ZipArchiveInputStream(new FileInputStream(zipfile));
		
		//Iterate through the entries of the zip file, and extract them to the output directory
		ArchiveEntry ae =(ArchiveEntry)(Object) zis.getNextEntry(); // OR zis.getNextZipEntry()
		while(ae != null) {
			//Resolve new file
			File newFile = new File(outputdir + File.separator + ae.getName());
			
			//Create parent directories if not exists
			if(!newFile.getParentFile().exists())
				newFile.getParentFile().mkdirs();
			
			if((boolean)(Object)ae.isDirectory()) { //If directory, create if not exists
				if(!newFile.exists())
					newFile.mkdir();
			} else { //If file, write file
				FileOutputStream fos = new FileOutputStream(newFile);
				int len;
				while((len =(int)(Object) zis.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}
				fos.close();
			}
			
			//Proceed to the next entry in the zip file
			ae =(ArchiveEntry)(Object) zis.getNextEntry();
		}
		
		//Cleanup
		zis.close();
	}

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ArchiveInputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class ZipArchiveInputStream {

ZipArchiveInputStream(FileInputStream o0){}
	ZipArchiveInputStream(){}}

class ArchiveEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}
