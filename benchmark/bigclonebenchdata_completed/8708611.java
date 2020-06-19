


class c8708611 {

    private String extractFileFromZip(ZipFile zip, String fileName) throws IOException {
        String contents = null;
        ZipEntry entry =(ZipEntry)(Object) zip.getEntry(fileName);
        if (entry != null) {
            InputStream input =(InputStream)(Object) zip.getInputStream(entry);
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyAndClose(input, buffer);
            contents = buffer.toString();
        }
        return contents;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyAndClose(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class ZipFile {

public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass getEntry(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipEntry {

}

class InputStream {

}

class ByteArrayOutputStream {

}
