


class c20644476 {
public static MyHelperClass StdQTConstants4;
//public MyHelperClass StdQTConstants4;

    private static AtomContainer askForMovieSettings() throws IOException, QTException {
        MyHelperClass REFERENCE_MOVIE_RESOURCE = new MyHelperClass();
        final InputStream inputStream =(InputStream)(Object) QuickTimeFormatGenerator.class.getResourceAsStream((String)(Object)REFERENCE_MOVIE_RESOURCE);
        final ByteArrayOutputStream byteArray = new ByteArrayOutputStream(1024 * 100);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(inputStream, byteArray);
        final byte[] movieBytes =(byte[])(Object) byteArray.toByteArray();
        final QTHandle qtHandle = new QTHandle(movieBytes);
        MyHelperClass StdQTConstants = new MyHelperClass();
        final DataRef dataRef = new DataRef(qtHandle, StdQTConstants.kDataRefFileExtensionTag, ".mov");
//        MyHelperClass StdQTConstants = new MyHelperClass();
        final Movie movie =(Movie)(Object) Movie.fromDataRef(dataRef,(int)(Object) StdQTConstants.newMovieActive | (int)(Object)StdQTConstants4.newMovieAsyncOK);
//        MyHelperClass StdQTConstants = new MyHelperClass();
        final MovieExporter exporter = new MovieExporter(StdQTConstants.kQTFileTypeMovie);
        exporter.doUserDialog(movie, null, 0, movie.getDuration());
        return(AtomContainer)(Object) exporter.getExportSettingsFromAtomContainer();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass kQTFileTypeMovie;
	public MyHelperClass kDataRefFileExtensionTag;
	public MyHelperClass newMovieAsyncOK;
	public MyHelperClass newMovieActive;
public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class AtomContainer {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class QTException extends Exception{
	public QTException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class ByteArrayOutputStream {

ByteArrayOutputStream(int o0){}
	ByteArrayOutputStream(){}
	public MyHelperClass toByteArray(){ return null; }}

class QTHandle {

QTHandle(){}
	QTHandle(byte[] o0){}}

class DataRef {

DataRef(QTHandle o0, MyHelperClass o1, String o2){}
	DataRef(){}}

class Movie {

public MyHelperClass getDuration(){ return null; }
	public static MyHelperClass fromDataRef(DataRef o0, int o1){ return null; }}

class MovieExporter {

MovieExporter(MyHelperClass o0){}
	MovieExporter(){}
	public MyHelperClass doUserDialog(Movie o0, Object o1, int o2, MyHelperClass o3){ return null; }
	public MyHelperClass getExportSettingsFromAtomContainer(){ return null; }}

class QuickTimeFormatGenerator {

}
