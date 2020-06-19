


class c21092340 {

    public static URL addToArchive(Pod pod, ZipOutputStream podArchiveOutputStream, String filename, InputStream source) throws IOException {
        ZipEntry entry = new ZipEntry(filename);
        podArchiveOutputStream.putNextEntry(entry);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(source, podArchiveOutputStream);
        podArchiveOutputStream.closeEntry();
        MyHelperClass PodArchiveResolver = new MyHelperClass();
        return(URL)(Object) PodArchiveResolver.withinPodArchive(pod, filename);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass withinPodArchive(Pod o0, String o1){ return null; }}

class Pod {

}

class ZipOutputStream {

public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }}

class InputStream {

}

class URL {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}
