


class c668660 {

    private static void readAndRewrite(File inFile, File outFile) throws IOException {
        MyHelperClass ImageIO = new MyHelperClass();
        ImageInputStream iis =(ImageInputStream)(Object) ImageIO.createImageInputStream(new BufferedInputStream(new FileInputStream(inFile)));
        MyHelperClass DcmParserFactory = new MyHelperClass();
        DcmParser dcmParser =(DcmParser)(Object) DcmParserFactory.getInstance().newDcmParser(iis);
        MyHelperClass DcmObjectFactory = new MyHelperClass();
        Dataset ds =(Dataset)(Object) DcmObjectFactory.getInstance().newDataset();
        dcmParser.setDcmHandler(ds.getDcmHandler());
        MyHelperClass Tags = new MyHelperClass();
        dcmParser.parseDcmFile(null, Tags.PixelData);
        MyHelperClass pdFact = new MyHelperClass();
        PixelDataReader pdReader =(PixelDataReader)(Object) pdFact.newReader(ds, iis, dcmParser.getDcmDecodeParam().byteOrder, dcmParser.getReadVR());
        System.out.println("reading " + inFile + "...");
        pdReader.readPixelData(false);
//        MyHelperClass ImageIO = new MyHelperClass();
        ImageOutputStream out =(ImageOutputStream)(Object) ImageIO.createImageOutputStream(new BufferedOutputStream(new FileOutputStream(outFile)));
        MyHelperClass DcmEncodeParam = new MyHelperClass();
        DcmEncodeParam dcmEncParam =(DcmEncodeParam)(Object) DcmEncodeParam.IVR_LE;
        ds.writeDataset(out, dcmEncParam);
//        MyHelperClass Tags = new MyHelperClass();
        ds.writeHeader(out, dcmEncParam, Tags.PixelData, dcmParser.getReadVR(), dcmParser.getReadLength());
        System.out.println("writing " + outFile + "...");
//        MyHelperClass pdFact = new MyHelperClass();
        PixelDataWriter pdWriter =(PixelDataWriter)(Object) pdFact.newWriter(pdReader.getPixelDataArray(), false, ds, out, dcmParser.getDcmDecodeParam().byteOrder, dcmParser.getReadVR());
        pdWriter.writePixelData();
        out.flush();
        out.close();
        System.out.println("done!");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IVR_LE;
	public MyHelperClass PixelData;
	public MyHelperClass byteOrder;
public MyHelperClass newDcmParser(ImageInputStream o0){ return null; }
	public MyHelperClass createImageOutputStream(BufferedOutputStream o0){ return null; }
	public MyHelperClass createImageInputStream(BufferedInputStream o0){ return null; }
	public MyHelperClass newReader(Dataset o0, ImageInputStream o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass newWriter(MyHelperClass o0, boolean o1, Dataset o2, ImageOutputStream o3, MyHelperClass o4, MyHelperClass o5){ return null; }
	public MyHelperClass newDataset(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ImageInputStream {

}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class DcmParser {

public MyHelperClass getDcmDecodeParam(){ return null; }
	public MyHelperClass getReadVR(){ return null; }
	public MyHelperClass setDcmHandler(MyHelperClass o0){ return null; }
	public MyHelperClass parseDcmFile(Object o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReadLength(){ return null; }}

class Dataset {

public MyHelperClass writeHeader(ImageOutputStream o0, DcmEncodeParam o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4){ return null; }
	public MyHelperClass getDcmHandler(){ return null; }
	public MyHelperClass writeDataset(ImageOutputStream o0, DcmEncodeParam o1){ return null; }}

class PixelDataReader {

public MyHelperClass getPixelDataArray(){ return null; }
	public MyHelperClass readPixelData(boolean o0){ return null; }}

class ImageOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class DcmEncodeParam {

}

class PixelDataWriter {

public MyHelperClass writePixelData(){ return null; }}
