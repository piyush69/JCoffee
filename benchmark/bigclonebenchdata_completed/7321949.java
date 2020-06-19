
import java.io.UncheckedIOException;


class c7321949 {
public MyHelperClass m_items;
	public MyHelperClass m_attachmentPathRoot;
	public MyHelperClass File;
	public MyHelperClass DocumentBuilderFactory;
	public MyHelperClass ATTACHMENT_FOLDER_PLACEHOLDER;
	public MyHelperClass TransformerFactory;
	public MyHelperClass Level;
	public MyHelperClass log;
	public MyHelperClass setBinaryData(byte[] o0){ return null; }
	public MyHelperClass getAttachmentPathSnippet(){ return null; }
	public MyHelperClass getEntryName(int o0){ return null; }
	public MyHelperClass setBinaryData(Object o0){ return null; }

    private boolean saveLOBDataToFileSystem() {
        MyHelperClass m_attachmentPathRoot = new MyHelperClass();
        if ("".equals(m_attachmentPathRoot)) {
            MyHelperClass log = new MyHelperClass();
            log.severe("no attachmentPath defined");
            return false;
        }
        MyHelperClass m_items = new MyHelperClass();
        if (m_items == null ||(int)(Object) m_items.size() == 0) {
            setBinaryData(null);
            return true;
        }
        final DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
        try {
            final DocumentBuilder builder =(DocumentBuilder)(Object) factory.newDocumentBuilder();
            final Document document =(Document)(Object) builder.newDocument();
            final Element root =(Element)(Object) document.createElement("attachments");
            document.appendChild(root);
            document.setXmlStandalone(true);
            for (int i = 0; i < (int)(Object)m_items.size(); i++) {
                log.fine(m_items.get(i).toString());
                File entryFile =(File)(Object) m_items.get(i).getFile();
                final String path =(String)(Object) entryFile.getAbsolutePath();
                log.fine(path + " - " + m_attachmentPathRoot);
                if (!path.startsWith((String)(Object)m_attachmentPathRoot)) {
                    log.fine("move file: " + path);
                    FileChannel in = null;
                    FileChannel out = null;
                    try {
                        final File destFolder = new File((int)(Object)m_attachmentPathRoot + (int)(Object)File.separator + (int)(Object)getAttachmentPathSnippet());
                        if (!(Boolean)(Object)destFolder.exists()) {
                            if (!(Boolean)(Object)destFolder.mkdirs()) {
                                log.warning("unable to create folder: " + destFolder.getPath());
                            }
                        }
                        final File destFile = new File((int)(Object)m_attachmentPathRoot + (int)(Object)File.separator + (int)(Object)getAttachmentPathSnippet() + (int)(Object)File.separator + (int)(Object)entryFile.getName());
                        in =(FileChannel)(Object) (new FileInputStream(entryFile).getChannel());
                        out =(FileChannel)(Object) (new FileOutputStream(destFile).getChannel());
                        in.transferTo(0, in.size(), out);
                        in.close();
                        out.close();
                        if ((boolean)(Object)entryFile.exists()) {
                            if (!(Boolean)(Object)entryFile.delete()) {
                                entryFile.deleteOnExit();
                            }
                        }
                        entryFile = destFile;
                    } catch (UncheckedIOException e) {
                        e.printStackTrace();
                        log.severe("unable to copy file " + entryFile.getAbsolutePath() + " to " + m_attachmentPathRoot + File.separator + getAttachmentPathSnippet() + File.separator + entryFile.getName());
                    } finally {
                        if (in != null && (boolean)(Object)in.isOpen()) {
                            in.close();
                        }
                        if (out != null && (boolean)(Object)out.isOpen()) {
                            out.close();
                        }
                    }
                }
                final Element entry =(Element)(Object) document.createElement("entry");
                entry.setAttribute("name", getEntryName(i));
                String filePathToStore =(String)(Object) entryFile.getAbsolutePath();
                filePathToStore = filePathToStore.replaceFirst((String)(Object)m_attachmentPathRoot.replaceAll("\\\\", "\\\\\\\\"),(String)(Object) ATTACHMENT_FOLDER_PLACEHOLDER);
                log.fine(filePathToStore);
                entry.setAttribute("file", filePathToStore);
                root.appendChild(entry);
            }
            final Source source =(Source)(Object) new DOMSource(document);
            final ByteArrayOutputStream bos = new ByteArrayOutputStream();
            final Result result =(Result)(Object) new StreamResult(bos);
            final Transformer xformer =(Transformer)(Object) TransformerFactory.newInstance().newTransformer();
            xformer.transform(source, result);
            final byte[] xmlData =(byte[])(Object) bos.toByteArray();
            log.fine(bos.toString());
            setBinaryData(xmlData);
            return true;
        } catch (Exception e) {
            log.log(Level.SEVERE, "saveLOBData", e);
        }
        setBinaryData(null);
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
	public MyHelperClass separator;
public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass newTransformer(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass newDocument(){ return null; }}

class Document {

public MyHelperClass appendChild(Element o0){ return null; }
	public MyHelperClass setXmlStandalone(boolean o0){ return null; }
	public MyHelperClass createElement(String o0){ return null; }}

class Element {

public MyHelperClass setAttribute(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass appendChild(Element o0){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }}

class File {

File(){}
	File(int o0){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass isOpen(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Source {

}

class DOMSource {

DOMSource(){}
	DOMSource(Document o0){}}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class Result {

}

class StreamResult {

StreamResult(){}
	StreamResult(ByteArrayOutputStream o0){}}

class Transformer {

public MyHelperClass transform(Source o0, Result o1){ return null; }}
