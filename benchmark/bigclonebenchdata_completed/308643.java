


class c308643 {
public MyHelperClass uid(MyHelperClass o0){ return null; }
public MyHelperClass studyUID;
	public MyHelperClass seriesUID;
	public MyHelperClass classUID;
	public MyHelperClass instUID;
public MyHelperClass PXDATA_TAG;
	public MyHelperClass skipGroupLen;
	public MyHelperClass PXDATA_GROUPLEN;
	public MyHelperClass encodeParam(){ return null; }

    public void convert(File src, File dest) throws IOException {
        InputStream in =(InputStream)(Object) new BufferedInputStream(new FileInputStream(src));
        MyHelperClass pfact = new MyHelperClass();
        DcmParser p =(DcmParser)(Object) pfact.newDcmParser(in);
        MyHelperClass fact = new MyHelperClass();
        Dataset ds =(Dataset)(Object) fact.newDataset();
        p.setDcmHandler(ds.getDcmHandler());
        try {
            FileFormat format =(FileFormat)(Object) p.detectFileFormat();
            MyHelperClass FileFormat = new MyHelperClass();
            if (format != (FileFormat)(Object)FileFormat.ACRNEMA_STREAM) {
                System.out.println("\n" + src + ": not an ACRNEMA stream!");
                return;
            }
            MyHelperClass Tags = new MyHelperClass();
            p.parseDcmFile(format, Tags.PixelData);
//            MyHelperClass Tags = new MyHelperClass();
            if ((Boolean)(Object)ds.contains(Tags.StudyInstanceUID) || (Boolean)(Object)ds.contains(Tags.SeriesInstanceUID) || (boolean)(Object)ds.contains(Tags.SOPInstanceUID) || (boolean)(Object)ds.contains(Tags.SOPClassUID)) {
                System.out.println("\n" + src + ": contains UIDs!" + " => probable already DICOM - do not convert");
                return;
            }
//            MyHelperClass Tags = new MyHelperClass();
            boolean hasPixelData = p.getReadTag() == Tags.PixelData;
//            MyHelperClass Tags = new MyHelperClass();
            boolean inflate = hasPixelData &&(int)(Object) ds.getInt(Tags.BitsAllocated, 0) == 12;
            int pxlen =(int)(Object) p.getReadLength();
            if (hasPixelData) {
                if (inflate) {
//                    MyHelperClass Tags = new MyHelperClass();
                    ds.putUS(Tags.BitsAllocated, 16);
                    pxlen = pxlen * 4 / 3;
                }
//                MyHelperClass Tags = new MyHelperClass();
                if (pxlen != ((int)(Object)ds.getInt(Tags.BitsAllocated, 0) >>> 3) * (int)(Object)ds.getInt(Tags.Rows, 0) * (int)(Object)ds.getInt(Tags.Columns, 0) * (int)(Object)ds.getInt(Tags.NumberOfFrames, 1) * (int)(Object)ds.getInt(Tags.NumberOfSamples, 1)) {
                    System.out.println("\n" + src + ": mismatch pixel data length!" + " => do not convert");
                    return;
                }
            }
//            MyHelperClass Tags = new MyHelperClass();
            ds.putUI(Tags.StudyInstanceUID, uid(studyUID));
//            MyHelperClass Tags = new MyHelperClass();
            ds.putUI(Tags.SeriesInstanceUID, uid(seriesUID));
//            MyHelperClass Tags = new MyHelperClass();
            ds.putUI(Tags.SOPInstanceUID, uid(instUID));
//            MyHelperClass Tags = new MyHelperClass();
            ds.putUI(Tags.SOPClassUID, classUID);
//            MyHelperClass Tags = new MyHelperClass();
            if (!(Boolean)(Object)ds.contains(Tags.NumberOfSamples)) {
//                MyHelperClass Tags = new MyHelperClass();
                ds.putUS(Tags.NumberOfSamples, 1);
            }
//            MyHelperClass Tags = new MyHelperClass();
            if (!(Boolean)(Object)ds.contains(Tags.PhotometricInterpretation)) {
//                MyHelperClass Tags = new MyHelperClass();
                ds.putCS(Tags.PhotometricInterpretation, "MONOCHROME2");
            }
            MyHelperClass fmi = new MyHelperClass();
            if ((boolean)(Object)fmi) {
                MyHelperClass UIDs = new MyHelperClass();
                ds.setFileMetaInfo(fact.newFileMetaInfo(ds, UIDs.ImplicitVRLittleEndian));
            }
            OutputStream out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(dest));
            try {
            } finally {
                ds.writeFile(out, encodeParam());
                if (hasPixelData) {
                    if (!(Boolean)(Object)skipGroupLen) {
                        out.write(PXDATA_GROUPLEN);
                        int grlen = pxlen + 8;
                        out.write((byte) grlen);
                        out.write((byte) (grlen >> 8));
                        out.write((byte) (grlen >> 16));
                        out.write((byte) (grlen >> 24));
                    }
                    out.write(PXDATA_TAG);
                    out.write((byte) pxlen);
                    out.write((byte) (pxlen >> 8));
                    out.write((byte) (pxlen >> 16));
                    out.write((byte) (pxlen >> 24));
                }
                if (inflate) {
                    int b2, b3;
                    for (; pxlen > 0; pxlen -= 3) {
                        out.write(in.read());
                        b2 =(int)(Object) in.read();
                        b3 =(int)(Object) in.read();
                        out.write(b2 & 0x0f);
                        out.write(b2 >> 4 | ((b3 & 0x0f) << 4));
                        out.write(b3 >> 4);
                    }
                } else {
                    for (; pxlen > 0; --pxlen) {
                        out.write(in.read());
                    }
                }
                out.close();
            }
            System.out.print('.');
        } finally {
            in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SeriesInstanceUID;
	public MyHelperClass BitsAllocated;
	public MyHelperClass SOPClassUID;
	public MyHelperClass ACRNEMA_STREAM;
	public MyHelperClass Rows;
	public MyHelperClass StudyInstanceUID;
	public MyHelperClass Columns;
	public MyHelperClass PhotometricInterpretation;
	public MyHelperClass ImplicitVRLittleEndian;
	public MyHelperClass PixelData;
	public MyHelperClass NumberOfSamples;
	public MyHelperClass SOPInstanceUID;
	public MyHelperClass NumberOfFrames;
public MyHelperClass newDcmParser(InputStream o0){ return null; }
	public MyHelperClass newDataset(){ return null; }
	public MyHelperClass newFileMetaInfo(Dataset o0, MyHelperClass o1){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class DcmParser {

public MyHelperClass getReadTag(){ return null; }
	public MyHelperClass parseDcmFile(FileFormat o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReadLength(){ return null; }
	public MyHelperClass detectFileFormat(){ return null; }
	public MyHelperClass setDcmHandler(MyHelperClass o0){ return null; }}

class Dataset {

public MyHelperClass putUS(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass getInt(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass getDcmHandler(){ return null; }
	public MyHelperClass putUI(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass putCS(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass writeFile(OutputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass setFileMetaInfo(MyHelperClass o0){ return null; }
	public MyHelperClass contains(MyHelperClass o0){ return null; }}

class FileFormat {

}

class OutputStream {

public MyHelperClass write(int o0){ return null; }
	public MyHelperClass write(byte o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}
