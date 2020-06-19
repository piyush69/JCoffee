import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18208567 {
public MyHelperClass INFO;
	public MyHelperClass addAdPage(Document o0, PdfContentByte o1){ return null; }
public MyHelperClass Dimension;
	public MyHelperClass PdfWriter;
	public MyHelperClass MyFonts;
	public MyHelperClass MyProperties;
	public MyHelperClass index;
	public MyHelperClass Dimensions;
	public MyHelperClass even;
	public MyHelperClass createSections(String o0){ return null; }

    public void createPdf(final String eventURI) throws Throwable, IOException, DocumentException {
        createSections(eventURI);
        even =(MyHelperClass)(Object) false;
        final Document document = new Document(Dimensions.getDimension(even, Dimension.MEDIABOX));
        final PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(MyProperties.getOutput()));
        writer.setViewerPreferences(PdfWriter.PageLayoutTwoColumnRight);
        writer.setCropBoxSize(Dimensions.getDimension(even, Dimension.CROPBOX));
        writer.setBoxSize("trim", Dimensions.getDimension(even, Dimension.TRIMBOX));
        writer.setBoxSize("bleed", Dimensions.getDimension(even, Dimension.BLEEDBOX));
        final EventBackgroundAndPageNumbers event = new EventBackgroundAndPageNumbers();
        writer.setPageEvent(event);
        document.open();
        final PdfContentByte content = writer.getDirectContent();
        event.setTabs(INFO.getTab());
        importPages(document, content, new PdfReader(INFO.getOutput()), INFO.getTitle());
        importPages(document, content, MyProperties.getBefore(), event);
        addAdPage(document, content);
        PdfReader reader = new PdfReader(INFO.getOutput());
        String[] titles = { "", "" };
        for (int i = 1; i <= reader.getNumberOfPages(); i++) {
            titles = index.getSubtitle(titles, i);
            event.setTabs(titles[0].toLowerCase());
            addTitleLeft(content, Dimensions.getTitleArea(even), titles[0], MyFonts.TITLE);
            addTitleRight(content, Dimensions.getTitleArea(even), titles[1], MyFonts.DATE);
            content.addTemplate(writer.getImportedPage(reader, i), Dimensions.getOffsetX(even), Dimensions.getOffsetY(even));
            document.newPage();
            even = !(Boolean)(Object)even;
        }
        addAdPage(document, content);
        importPages(document, content, MyProperties.getAfter(), event);
        int total = writer.getPageNumber() - 1;
        event.setNoMorePageNumbers();
        event.setTabs(INFO.getTab());
        reader = new PdfReader(INFO.getOutput());
        for (int i = 1; i <= reader.getNumberOfPages(); i++) {
            addTitleLeft(content, Dimensions.getTitleArea(even), INFO.getTitle(), MyFonts.TITLE);
            content.addTemplate(writer.getImportedPage(reader, i), Dimensions.getOffsetX(even), Dimensions.getOffsetY(even));
            document.newPage();
            even = !(Boolean)(Object)even;
        }
        document.close();
        final File file = new File(MyProperties.getOutput());
        final byte[] original = new byte[(int) file.length()];
        final FileInputStream f = new FileInputStream(file);
        f.read(original);
        reader = new PdfReader(original);
        final List<Integer> ranges = new ArrayList<Integer>();
        for (int i = 1; i <= total; i++) {
            ranges.add(i);
            if (i == total / 2) {
                for (int j = total + 1; j <= reader.getNumberOfPages(); j++) {
                    ranges.add(j);
                }
            }
        }
        reader.selectPages(ranges);
        final PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(MyProperties.getOutput()));
        stamper.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CROPBOX;
	public MyHelperClass TITLE;
	public MyHelperClass TRIMBOX;
	public MyHelperClass BLEEDBOX;
	public MyHelperClass MEDIABOX;
	public MyHelperClass DATE;
	public MyHelperClass PageLayoutTwoColumnRight;
public MyHelperClass getTitleArea(MyHelperClass o0){ return null; }
	public MyHelperClass getOffsetY(MyHelperClass o0){ return null; }
	public MyHelperClass getAfter(){ return null; }
	public MyHelperClass getBefore(){ return null; }
	public MyHelperClass getSubtitle(String[] o0, int o1){ return null; }
	public MyHelperClass getInstance(Document o0, FileOutputStream o1){ return null; }
	public MyHelperClass getOffsetX(MyHelperClass o0){ return null; }
	public MyHelperClass getOutput(){ return null; }}

class DocumentException extends Exception{
	public DocumentException(String errorMessage) { super(errorMessage); }
}

class Document {

public MyHelperClass open(){ return null; }
	public MyHelperClass newPage(){ return null; }
	public MyHelperClass close(){ return null; }}

class PdfWriter {

public MyHelperClass setPageEvent(EventBackgroundAndPageNumbers o0){ return null; }
	public MyHelperClass getImportedPage(PdfReader o0, int o1){ return null; }
	public MyHelperClass getDirectContent(){ return null; }
	public MyHelperClass getPageNumber(){ return null; }}

class EventBackgroundAndPageNumbers {

public MyHelperClass setNoMorePageNumbers(){ return null; }
	public MyHelperClass setTabs(String o0){ return null; }}

class PdfContentByte {

}

class PdfReader {

PdfReader(byte[] o0){}
	PdfReader(){}
	public MyHelperClass selectPages(List<Integer o0){ return null; }
	public MyHelperClass getNumberOfPages(){ return null; }}

class PdfStamper {

PdfStamper(){}
	PdfStamper(PdfReader o0, FileOutputStream o1){}
	public MyHelperClass close(){ return null; }}
