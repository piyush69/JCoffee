


class c7872667 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    private static boolean computeMovieAverages(String completePath, String MovieAveragesOutputFileName, String MovieIndexFileName) {
        try {
            MyHelperClass fSep = new MyHelperClass();
            File inputFile = new File(completePath + fSep + "SmartGRAPE" + fSep + MovieIndexFileName);
            FileChannel inC =(FileChannel)(Object) (new FileInputStream(inputFile).getChannel());
            int filesize = (int)(int)(Object) inC.size();
            ByteBuffer mappedfile =(ByteBuffer)(Object) inC.map(MapMode.READ_ONLY, 0, filesize);
            TShortObjectHashMap MovieLimitsTHash = new TShortObjectHashMap(17770, 1);
            int i = 0, totalcount = 0;
            short movie;
            int startIndex, endIndex;
            TIntArrayList a;
            while ((boolean)(Object)mappedfile.hasRemaining()) {
                movie =(short)(Object) mappedfile.getShort();
                startIndex =(int)(Object) mappedfile.getInt();
                endIndex =(int)(Object) mappedfile.getInt();
                a = new TIntArrayList(2);
                a.add(startIndex);
                a.add(endIndex);
                MovieLimitsTHash.put(movie, a);
            }
            inC.close();
            mappedfile = null;
            System.out.println("Loaded movie index hash");
//            MyHelperClass fSep = new MyHelperClass();
            File outFile = new File(completePath + fSep + "SmartGRAPE" + fSep + MovieAveragesOutputFileName);
            FileChannel outC =(FileChannel)(Object) (new FileOutputStream(outFile, true).getChannel());
            int totalMovies =(int)(Object) MovieLimitsTHash.size();
//            MyHelperClass fSep = new MyHelperClass();
            File movieMMAPDATAFile = new File(completePath + fSep + "SmartGRAPE" + fSep + "CustomerRatingBinaryFile.txt");
            inC =(FileChannel)(Object) (new FileInputStream(movieMMAPDATAFile).getChannel());
            short[] itr =(short[])(Object) MovieLimitsTHash.keys();
            MyHelperClass Arrays = new MyHelperClass();
            Arrays.sort(itr);
            ByteBuffer buf;
            for (i = 0; i < totalMovies; i++) {
                short currentMovie = itr[i];
                a = (TIntArrayList)(TIntArrayList)(Object) MovieLimitsTHash.get(currentMovie);
                startIndex =(int)(Object) a.get(0);
                endIndex =(int)(Object) a.get(1);
                if (endIndex > startIndex) {
                    MyHelperClass ByteBuffer = new MyHelperClass();
                    buf =(ByteBuffer)(Object) ByteBuffer.allocate((endIndex - startIndex + 1) * 5);
                    inC.read(buf, (startIndex - 1) * 5);
                } else {
                    MyHelperClass ByteBuffer = new MyHelperClass();
                    buf =(ByteBuffer)(Object) ByteBuffer.allocate(5);
                    inC.read(buf, (startIndex - 1) * 5);
                }
                buf.flip();
                int bufsize =(int)(Object) buf.capacity() / 5;
                float sum = 0;
                for (int q = 0; q < bufsize; q++) {
                    buf.getInt();
                    sum += (float)(Object)buf.get();
                }
                MyHelperClass ByteBuffer = new MyHelperClass();
                ByteBuffer outbuf =(ByteBuffer)(Object) ByteBuffer.allocate(6);
                outbuf.putShort(currentMovie);
                outbuf.putFloat(sum / bufsize);
                outbuf.flip();
                outC.write(outbuf);
                buf.clear();
                buf = null;
                a.clear();
                a = null;
            }
            inC.close();
            outC.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
public MyHelperClass sort(short[] o0){ return null; }
	public MyHelperClass allocate(int o0){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileChannel {

public MyHelperClass read(ByteBuffer o0, int o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, int o2){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass getInt(){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass putShort(short o0){ return null; }
	public MyHelperClass getShort(){ return null; }
	public MyHelperClass hasRemaining(){ return null; }
	public MyHelperClass putFloat(float o0){ return null; }
	public MyHelperClass capacity(){ return null; }
	public MyHelperClass flip(){ return null; }
	public MyHelperClass get(){ return null; }}

class TShortObjectHashMap {

TShortObjectHashMap(){}
	TShortObjectHashMap(int o0, int o1){}
	public MyHelperClass put(short o0, TIntArrayList o1){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass get(short o0){ return null; }
	public MyHelperClass keys(){ return null; }}

class TIntArrayList {

TIntArrayList(){}
	TIntArrayList(int o0){}
	public MyHelperClass clear(){ return null; }
	public MyHelperClass add(int o0){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0, boolean o1){}
	public MyHelperClass getChannel(){ return null; }}
