import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2476569 {
public static MyHelperClass CDocumentReconstructor;
//public MyHelperClass CDocumentReconstructor;

    public static void reconstruct(final List files, final Map properties, final OutputStream fout, final String base_url, final String producer, final PageSize[] size, final List hf) throws Throwable, CConvertException {
        OutputStream out = fout;
        OutputStream out2 = fout;
        boolean signed = false;
        OutputStream oldOut = null;
        File tmp = null;
        File tmp2 = null;
        try {
            tmp = File.createTempFile("yahp", "pdf");
            tmp2 = File.createTempFile("yahp", "pdf");
            oldOut = out;
            MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
            if ("true".equals(properties.get(IHtmlToPdfTransformer.USE_PDF_SIGNING))) {
                signed = true;
                out2 = new FileOutputStream(tmp2);
            } else {
                out2 = oldOut;
            }
            out = new FileOutputStream(tmp);
            Document document = null;
            PdfCopy writer = null;
            boolean first = true;
            Map mapSizeDoc = new HashMap();
            int totalPage = 0;
            for (int i = 0; i < files.size(); i++) {
                final File fPDF = (File) files.get(i);
                final PdfReader reader = new PdfReader(fPDF.getAbsolutePath());
                reader.consolidateNamedDestinations();
                final int n =(int)(Object) reader.getNumberOfPages();
                if (first) {
                    first = false;
                    document = new Document(reader.getPageSizeWithRotation(1));
                    writer = new PdfCopy(document, out);
                    MyHelperClass PdfWriter = new MyHelperClass();
                    writer.setPdfVersion(PdfWriter.VERSION_1_3);
                    writer.setFullCompression();
//                    MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                    if ("true".equals(properties.get(IHtmlToPdfTransformer.USE_PDF_ENCRYPTION))) {
//                        MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                        final String password = (String) properties.get(IHtmlToPdfTransformer.PDF_ENCRYPTION_PASSWORD);
                        MyHelperClass CDocumentReconstructor = new MyHelperClass();
                        final int securityType =(int)(Object) CDocumentReconstructor.getSecurityFlags(properties);
//                        MyHelperClass PdfWriter = new MyHelperClass();
                        writer.setEncryption(PdfWriter.STRENGTH128BITS, password, null, securityType);
                    }
//                    MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                    final String title = (String) properties.get(IHtmlToPdfTransformer.PDF_TITLE);
                    if (title != null) {
                        document.addTitle(title);
                    } else if (base_url != null) {
                        document.addTitle(base_url);
                    }
//                    MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                    final String creator = (String) properties.get(IHtmlToPdfTransformer.PDF_CREATOR);
                    if (creator != null) {
                        document.addCreator(creator);
                    } else {
//                        MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                        document.addCreator(IHtmlToPdfTransformer.VERSION);
                    }
//                    MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                    final String author = (String) properties.get(IHtmlToPdfTransformer.PDF_AUTHOR);
                    if (author != null) {
                        document.addAuthor(author);
                    }
//                    MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                    final String sproducer = (String) properties.get(IHtmlToPdfTransformer.PDF_PRODUCER);
                    if (sproducer != null) {
                        document.addProducer(sproducer);
                    } else {
//                        MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                        document.addProducer(IHtmlToPdfTransformer.VERSION + " - http://www.allcolor.org/YaHPConverter/ - " + producer);
                    }
                    document.open();
                }
                PdfImportedPage page;
                for (int j = 0; j < n; ) {
                    ++j;
                    totalPage++;
                    mapSizeDoc.put("" + totalPage, "" + i);
                    page =(PdfImportedPage)(Object) writer.getImportedPage(reader, j);
                    writer.addPage(page);
                }
            }
            document.close();
            out.flush();
            out.close();
            {
                final PdfReader reader = new PdfReader(tmp.getAbsolutePath());
                ;
                final int n =(int)(Object) reader.getNumberOfPages();
                final PdfStamper stp = new PdfStamper(reader, out2);
                int i = 0;
                MyHelperClass BaseFont = new MyHelperClass();
                BaseFont.createFont(BaseFont.HELVETICA, BaseFont.WINANSI, BaseFont.EMBEDDED);
                final CHtmlToPdfFlyingSaucerTransformer trans = new CHtmlToPdfFlyingSaucerTransformer();
                while (i < n) {
                    i++;
                    int indexSize = Integer.parseInt((String) mapSizeDoc.get("" + i));
                    final int[] dsize =(int[])(Object) size[indexSize].getSize();
                    final int[] dmargin =(int[])(Object) size[indexSize].getMargin();
                    for (final Iterator it = hf.iterator(); it.hasNext(); ) {
                        final CHeaderFooter chf = (CHeaderFooter) it.next();
                        MyHelperClass CHeaderFooter = new MyHelperClass();
                        if (chf.getSfor().equals(CHeaderFooter.ODD_PAGES) && (i % 2 == 0)) {
                            continue;
//                        MyHelperClass CHeaderFooter = new MyHelperClass();
                        } else if (chf.getSfor().equals(CHeaderFooter.EVEN_PAGES) && (i % 2 != 0)) {
                            continue;
                        }
                        final String text =(String)(Object) chf.getContent().replaceAll("<pagenumber>", "" + i).replaceAll("<pagecount>", "" + n);
                        final PdfContentByte over =(PdfContentByte)(Object) stp.getOverContent(i);
                        final ByteArrayOutputStream bbout = new ByteArrayOutputStream();
//                        MyHelperClass CHeaderFooter = new MyHelperClass();
                        if (chf.getType().equals(CHeaderFooter.HEADER)) {
                            trans.transform(new ByteArrayInputStream(text.getBytes("utf-8")), base_url, new PageSize(dsize[0] - (dmargin[0] + dmargin[1]), dmargin[3]), new ArrayList(), properties, bbout);
//                        MyHelperClass CHeaderFooter = new MyHelperClass();
                        } else if (chf.getType().equals(CHeaderFooter.FOOTER)) {
                            trans.transform(new ByteArrayInputStream(text.getBytes("utf-8")), base_url, new PageSize(dsize[0] - (dmargin[0] + dmargin[1]), dmargin[2]), new ArrayList(), properties, bbout);
                        }
                        final PdfReader readerHF = new PdfReader(bbout.toByteArray());
//                        MyHelperClass CHeaderFooter = new MyHelperClass();
                        if (chf.getType().equals(CHeaderFooter.HEADER)) {
                            over.addTemplate(stp.getImportedPage(readerHF, 1), dmargin[0], dsize[1] - dmargin[3]);
//                        MyHelperClass CHeaderFooter = new MyHelperClass();
                        } else if (chf.getType().equals(CHeaderFooter.FOOTER)) {
                            over.addTemplate(stp.getImportedPage(readerHF, 1), dmargin[0], 0);
                        }
                        readerHF.close();
                    }
                }
                stp.close();
            }
            try {
                out2.flush();
            } catch (Exception ignore) {
            } finally {
                try {
                    out2.close();
                } catch (Exception ignore) {
                }
            }
            if (signed) {
//                MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                final String keypassword = (String) properties.get(IHtmlToPdfTransformer.PDF_SIGNING_PRIVATE_KEY_PASSWORD);
//                MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                final String password = (String) properties.get(IHtmlToPdfTransformer.PDF_ENCRYPTION_PASSWORD);
//                MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                final String keyStorepassword = (String) properties.get(IHtmlToPdfTransformer.PDF_SIGNING_KEYSTORE_PASSWORD);
//                MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                final String privateKeyFile = (String) properties.get(IHtmlToPdfTransformer.PDF_SIGNING_PRIVATE_KEY_FILE);
//                MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                final String reason = (String) properties.get(IHtmlToPdfTransformer.PDF_SIGNING_REASON);
//                MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                final String location = (String) properties.get(IHtmlToPdfTransformer.PDF_SIGNING_LOCATION);
//                MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                final boolean selfSigned = !"false".equals(properties.get(IHtmlToPdfTransformer.USE_PDF_SELF_SIGNING));
                PdfReader reader = null;
                if (password != null) {
                    reader = new PdfReader(tmp2.getAbsolutePath(), password.getBytes());
                } else {
                    reader = new PdfReader(tmp2.getAbsolutePath());
                }
                final KeyStore ks = selfSigned ? KeyStore.getInstance(KeyStore.getDefaultType()) : KeyStore.getInstance("pkcs12");
                ks.load(new FileInputStream(privateKeyFile), keyStorepassword.toCharArray());
                final String alias = (String) ks.aliases().nextElement();
                final PrivateKey key = (PrivateKey) ks.getKey(alias, keypassword.toCharArray());
                final Certificate chain[] =(java.security.Certificate[])(Object) ks.getCertificateChain(alias);
                MyHelperClass PdfStamper = new MyHelperClass();
                final PdfStamper stp =(PdfStamper)(Object) PdfStamper.createSignature(reader, oldOut, '\0');
//                MyHelperClass IHtmlToPdfTransformer = new MyHelperClass();
                if ("true".equals(properties.get(IHtmlToPdfTransformer.USE_PDF_ENCRYPTION))) {
                    MyHelperClass PdfWriter = new MyHelperClass();
                    stp.setEncryption(PdfWriter.STRENGTH128BITS, password, null, CDocumentReconstructor.getSecurityFlags(properties));
                }
                final PdfSignatureAppearance sap =(PdfSignatureAppearance)(Object) stp.getSignatureAppearance();
                if (selfSigned) {
                    MyHelperClass PdfSignatureAppearance = new MyHelperClass();
                    sap.setCrypto(key, chain, null, PdfSignatureAppearance.SELF_SIGNED);
                } else {
                    MyHelperClass PdfSignatureAppearance = new MyHelperClass();
                    sap.setCrypto(key, chain, null, PdfSignatureAppearance.WINCER_SIGNED);
                }
                if (reason != null) {
                    sap.setReason(reason);
                }
                if (location != null) {
                    sap.setLocation(location);
                }
                stp.close();
                oldOut.flush();
            }
        } catch (final Exception e) {
            throw new CConvertException("ERROR: An Exception occured while reconstructing the pdf document: " + e.getMessage(), e);
        } finally {
            try {
                tmp.delete();
            } catch (final Exception ignore) {
            }
            try {
                tmp2.delete();
            } catch (final Exception ignore) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PDF_SIGNING_PRIVATE_KEY_PASSWORD;
	public MyHelperClass VERSION_1_3;
	public MyHelperClass PDF_CREATOR;
	public MyHelperClass PDF_SIGNING_REASON;
	public MyHelperClass USE_PDF_SELF_SIGNING;
	public MyHelperClass WINANSI;
	public MyHelperClass HEADER;
	public MyHelperClass PDF_SIGNING_KEYSTORE_PASSWORD;
	public MyHelperClass WINCER_SIGNED;
	public MyHelperClass EMBEDDED;
	public MyHelperClass HELVETICA;
	public MyHelperClass EVEN_PAGES;
	public MyHelperClass PDF_SIGNING_LOCATION;
	public MyHelperClass USE_PDF_ENCRYPTION;
	public MyHelperClass PDF_ENCRYPTION_PASSWORD;
	public MyHelperClass SELF_SIGNED;
	public MyHelperClass VERSION;
	public MyHelperClass PDF_PRODUCER;
	public MyHelperClass ODD_PAGES;
	public MyHelperClass STRENGTH128BITS;
	public MyHelperClass PDF_TITLE;
	public MyHelperClass PDF_AUTHOR;
	public MyHelperClass FOOTER;
	public MyHelperClass PDF_SIGNING_PRIVATE_KEY_FILE;
	public MyHelperClass USE_PDF_SIGNING;
public MyHelperClass createSignature(PdfReader o0, OutputStream o1, char o2){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass getSecurityFlags(Map o0){ return null; }
	public MyHelperClass createFont(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }}

class PageSize {

PageSize(){}
	PageSize(int o0, int o1){}
	public MyHelperClass getMargin(){ return null; }
	public MyHelperClass getSize(){ return null; }}

class CConvertException extends Exception{
	public CConvertException(String errorMessage) { super(errorMessage); }
	CConvertException(String o0, Exception o1){}
	CConvertException(){}
}

class PdfCopy {

PdfCopy(Document o0, OutputStream o1){}
	PdfCopy(){}
	public MyHelperClass setFullCompression(){ return null; }
	public MyHelperClass getImportedPage(PdfReader o0, int o1){ return null; }
	public MyHelperClass setPdfVersion(MyHelperClass o0){ return null; }
	public MyHelperClass setEncryption(MyHelperClass o0, String o1, Object o2, int o3){ return null; }
	public MyHelperClass addPage(PdfImportedPage o0){ return null; }}

class PdfReader {

PdfReader(byte[] o0){}
	PdfReader(){}
	PdfReader(String o0){}
	PdfReader(String o0, byte[] o1){}
	public MyHelperClass getNumberOfPages(){ return null; }
	public MyHelperClass consolidateNamedDestinations(){ return null; }
	public MyHelperClass getPageSizeWithRotation(int o0){ return null; }
	public MyHelperClass close(){ return null; }}

class PdfImportedPage {

}

class PdfStamper {

PdfStamper(){}
	PdfStamper(PdfReader o0, OutputStream o1){}
	public MyHelperClass getImportedPage(PdfReader o0, int o1){ return null; }
	public MyHelperClass getOverContent(int o0){ return null; }
	public MyHelperClass setEncryption(MyHelperClass o0, String o1, Object o2, MyHelperClass o3){ return null; }
	public MyHelperClass getSignatureAppearance(){ return null; }
	public MyHelperClass close(){ return null; }}

class CHtmlToPdfFlyingSaucerTransformer {

public MyHelperClass transform(ByteArrayInputStream o0, String o1, PageSize o2, ArrayList o3, Map o4, ByteArrayOutputStream o5){ return null; }}

class CHeaderFooter {

public MyHelperClass getSfor(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getType(){ return null; }}

class PdfContentByte {

public MyHelperClass addTemplate(MyHelperClass o0, int o1, int o2){ return null; }}

class PdfSignatureAppearance {

public MyHelperClass setCrypto(PrivateKey o0, Certificate[] o1, Object o2, MyHelperClass o3){ return null; }
	public MyHelperClass setLocation(String o0){ return null; }
	public MyHelperClass setReason(String o0){ return null; }}

class Document {

Document(){}
	Document(MyHelperClass o0){}
	public MyHelperClass addAuthor(String o0){ return null; }
	public MyHelperClass addCreator(String o0){ return null; }
	public MyHelperClass addProducer(String o0){ return null; }
	public MyHelperClass open(){ return null; }
	public MyHelperClass addCreator(MyHelperClass o0){ return null; }
	public MyHelperClass addTitle(String o0){ return null; }
	public MyHelperClass close(){ return null; }}
