import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7672521 {

    public void removeExifTag(File jpegImageFile, File dst) throws Throwable, IOException, ImageReadException, ImageWriteException {
        OutputStream os = null;
        try {
            TiffOutputSet outputSet = null;
            MyHelperClass Sanselan = new MyHelperClass();
            IImageMetadata metadata =(IImageMetadata)(Object) Sanselan.getMetadata(jpegImageFile);
            JpegImageMetadata jpegMetadata = (JpegImageMetadata)(JpegImageMetadata)(Object) metadata;
            if (null != jpegMetadata) {
                TiffImageMetadata exif =(TiffImageMetadata)(Object) jpegMetadata.getExif();
                if (null != exif) {
                    outputSet =(TiffOutputSet)(Object) exif.getOutputSet();
                }
            }
            if (null == outputSet) {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copyFileNio(jpegImageFile, dst);
                return;
            }
            {
                MyHelperClass TiffConstants = new MyHelperClass();
                outputSet.removeField(TiffConstants.EXIF_TAG_APERTURE_VALUE);
                TiffOutputDirectory exifDirectory =(TiffOutputDirectory)(Object) outputSet.getExifDirectory();
//                MyHelperClass TiffConstants = new MyHelperClass();
                if (null != exifDirectory) exifDirectory.removeField(TiffConstants.EXIF_TAG_APERTURE_VALUE);
            }
            os = new FileOutputStream(dst);
            os = new BufferedOutputStream(os);
            new ExifRewriter().updateExifMetadataLossless(jpegImageFile, os, outputSet);
            os.close();
            os = null;
        } finally {
            if (os != null) try {
                os.close();
            } catch (IOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EXIF_TAG_APERTURE_VALUE;
public MyHelperClass copyFileNio(File o0, File o1){ return null; }
	public MyHelperClass getMetadata(File o0){ return null; }}

class ImageReadException extends Exception{
	public ImageReadException(String errorMessage) { super(errorMessage); }
}

class ImageWriteException extends Exception{
	public ImageWriteException(String errorMessage) { super(errorMessage); }
}

class TiffOutputSet {

public MyHelperClass getExifDirectory(){ return null; }
	public MyHelperClass removeField(MyHelperClass o0){ return null; }}

class IImageMetadata {

}

class JpegImageMetadata {

public MyHelperClass getExif(){ return null; }}

class TiffImageMetadata {

public MyHelperClass getOutputSet(){ return null; }}

class TiffOutputDirectory {

public MyHelperClass removeField(MyHelperClass o0){ return null; }}

class ExifRewriter {

public MyHelperClass updateExifMetadataLossless(File o0, OutputStream o1, TiffOutputSet o2){ return null; }}
