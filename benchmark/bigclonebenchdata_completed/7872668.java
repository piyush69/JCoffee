


class c7872668 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    private static boolean computeCustomerAverages(String completePath, String CustomerAveragesOutputFileName, String CustIndexFileName) {
        try {
            MyHelperClass fSep = new MyHelperClass();
            File inputFile = new File(completePath + fSep + "SmartGRAPE" + fSep + CustIndexFileName);
            FileChannel inC =(FileChannel)(Object) (new FileInputStream(inputFile).getChannel());
            int filesize = (int)(int)(Object) inC.size();
            ByteBuffer mappedfile =(ByteBuffer)(Object) inC.map(MapMode.READ_ONLY, 0, filesize);
            TIntObjectHashMap CustomerLimitsTHash = new TIntObjectHashMap(480189, 1);
            int startIndex, endIndex;
            TIntArrayList a;
            int custid;
            while ((boolean)(Object)mappedfile.hasRemaining()) {
                custid =(int)(Object) mappedfile.getInt();
                startIndex =(int)(Object) mappedfile.getInt();
                endIndex =(int)(Object) mappedfile.getInt();
                a = new TIntArrayList(2);
                a.add(startIndex);
                a.add(endIndex);
                CustomerLimitsTHash.put(custid, a);
            }
            inC.close();
            mappedfile = null;
            System.out.println("Loaded customer index hash");
//            MyHelperClass fSep = new MyHelperClass();
            File outFile = new File(completePath + fSep + "SmartGRAPE" + fSep + CustomerAveragesOutputFileName);
            FileChannel outC =(FileChannel)(Object) (new FileOutputStream(outFile, true).getChannel());
            int totalCusts =(int)(Object) CustomerLimitsTHash.size();
//            MyHelperClass fSep = new MyHelperClass();
            File movieMMAPDATAFile = new File(completePath + fSep + "SmartGRAPE" + fSep + "MovieRatingBinaryFile.txt");
            inC =(FileChannel)(Object) (new FileInputStream(movieMMAPDATAFile).getChannel());
            int[] itr =(int[])(Object) CustomerLimitsTHash.keys();
            startIndex = 0;
            endIndex = 0;
            a = null;
            ByteBuffer buf;
            for (int i = 0; i < totalCusts; i++) {
                int currentCust = itr[i];
                a = (TIntArrayList)(TIntArrayList)(Object) CustomerLimitsTHash.get(currentCust);
                startIndex =(int)(Object) a.get(0);
                endIndex =(int)(Object) a.get(1);
                if (endIndex > startIndex) {
                    MyHelperClass ByteBuffer = new MyHelperClass();
                    buf =(ByteBuffer)(Object) ByteBuffer.allocate((endIndex - startIndex + 1) * 3);
                    inC.read(buf, (startIndex - 1) * 3);
                } else {
                    MyHelperClass ByteBuffer = new MyHelperClass();
                    buf =(ByteBuffer)(Object) ByteBuffer.allocate(3);
                    inC.read(buf, (startIndex - 1) * 3);
                }
                buf.flip();
                int bufsize =(int)(Object) buf.capacity() / 3;
                float sum = 0;
                for (int q = 0; q < bufsize; q++) {
                    buf.getShort();
                    sum += (float)(Object)buf.get();
                }
                MyHelperClass ByteBuffer = new MyHelperClass();
                ByteBuffer outbuf =(ByteBuffer)(Object) ByteBuffer.allocate(8);
                outbuf.putInt(currentCust);
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
	public MyHelperClass getShort(){ return null; }
	public MyHelperClass hasRemaining(){ return null; }
	public MyHelperClass putFloat(float o0){ return null; }
	public MyHelperClass putInt(int o0){ return null; }
	public MyHelperClass capacity(){ return null; }
	public MyHelperClass flip(){ return null; }
	public MyHelperClass get(){ return null; }}

class TIntObjectHashMap {

TIntObjectHashMap(){}
	TIntObjectHashMap(int o0, int o1){}
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass put(int o0, TIntArrayList o1){ return null; }
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
