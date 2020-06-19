


class c13940142 {

    private void generateDocFile(String srcFileName, String s, String destFileName) {
        try {
            ZipFile docxFile = new ZipFile(new File(srcFileName));
            ZipEntry documentXML =(ZipEntry)(Object) docxFile.getEntry("word/document.xml");
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory dbf =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            InputStream documentXMLIS1 =(InputStream)(Object) docxFile.getInputStream(documentXML);
            Document doc =(Document)(Object) dbf.newDocumentBuilder().parse(documentXMLIS1);
            MyHelperClass TransformerFactory = new MyHelperClass();
            Transformer t =(Transformer)(Object) TransformerFactory.newInstance().newTransformer();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            t.transform(new DOMSource(doc), new StreamResult(baos));
            ZipOutputStream docxOutFile = new ZipOutputStream(new FileOutputStream(destFileName));
            Enumeration entriesIter = (Enumeration)(Enumeration)(Object) docxFile.entries();
            while ((boolean)(Object)entriesIter.hasMoreElements()) {
                ZipEntry entry =(ZipEntry)(Object) entriesIter.nextElement();
                if (entry.getName().equals("word/document.xml")) {
                    docxOutFile.putNextEntry(new ZipEntry(entry.getName()));
                    byte[] datas = s.getBytes("UTF-8");
                    docxOutFile.write(datas, 0, datas.length);
                    docxOutFile.closeEntry();
                } else if (entry.getName().equals("word/media/image1.png")) {
                    InputStream incoming =(InputStream)(Object) new FileInputStream("c:/aaa.jpg");
                    byte[] data = new byte[(int)(Object)incoming.available()];
                    int readCount =(int)(Object) incoming.read(data, 0, data.length);
                    docxOutFile.putNextEntry(new ZipEntry(entry.getName()));
                    docxOutFile.write(data, 0, readCount);
                    docxOutFile.closeEntry();
                } else {
                    InputStream incoming =(InputStream)(Object) docxFile.getInputStream(entry);
                    byte[] data = new byte[(int)(Object)incoming.available()];
                    int readCount =(int)(Object) incoming.read(data, 0, data.length);
                    docxOutFile.putNextEntry(new ZipEntry(entry.getName()));
                    docxOutFile.write(data, 0, readCount);
                    docxOutFile.closeEntry();
                }
            }
            docxOutFile.close();
        } catch (Exception e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(InputStream o0){ return null; }
	public MyHelperClass newTransformer(){ return null; }
	public MyHelperClass newInstance(){ return null; }}

class ZipFile {

ZipFile(){}
	ZipFile(File o0){}
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass entries(){ return null; }
	public MyHelperClass getEntry(String o0){ return null; }}

class File {

File(String o0){}
	File(){}}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}
	public MyHelperClass getName(){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass available(){ return null; }}

class Document {

}

class Transformer {

public MyHelperClass transform(DOMSource o0, StreamResult o1){ return null; }}

class ByteArrayOutputStream {

}

class DOMSource {

DOMSource(Document o0){}
	DOMSource(){}}

class StreamResult {

StreamResult(){}
	StreamResult(ByteArrayOutputStream o0){}}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
