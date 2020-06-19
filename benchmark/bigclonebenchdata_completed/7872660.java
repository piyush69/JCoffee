
import java.io.UncheckedIOException;


class c7872660 {

    private static boolean genCustomerLocationsFileAndCustomerIndexFile(String completePath, String masterFile, String CustLocationsFileName, String CustIndexFileName) {
        try {
            TIntObjectHashMap CustInfoHash = new TIntObjectHashMap(480189, 1);
            MyHelperClass fSep = new MyHelperClass();
            File inFile = new File(completePath + fSep + "SmartGRAPE" + fSep + masterFile);
            FileChannel inC =(FileChannel)(Object) (new FileInputStream(inFile).getChannel());
//            MyHelperClass fSep = new MyHelperClass();
            File outFile1 = new File(completePath + fSep + "SmartGRAPE" + fSep + CustIndexFileName);
            FileChannel outC1 =(FileChannel)(Object) (new FileOutputStream(outFile1, true).getChannel());
//            MyHelperClass fSep = new MyHelperClass();
            File outFile2 = new File(completePath + fSep + "SmartGRAPE" + fSep + CustLocationsFileName);
            FileChannel outC2 =(FileChannel)(Object) (new FileOutputStream(outFile2, true).getChannel());
            int fileSize = (int)(int)(Object) inC.size();
            int totalNoDataRows = fileSize / 7;
            for (int i = 1; i <= totalNoDataRows; i++) {
                MyHelperClass ByteBuffer = new MyHelperClass();
                ByteBuffer mappedBuffer =(ByteBuffer)(Object) ByteBuffer.allocate(7);
                inC.read(mappedBuffer);
                mappedBuffer.position(0);
                short movieName =(short)(Object) mappedBuffer.getShort();
                int customer =(int)(Object) mappedBuffer.getInt();
                byte rating =(byte)(Object) mappedBuffer.get();
                mappedBuffer.clear();
                if ((boolean)(Object)CustInfoHash.containsKey(customer)) {
                    TIntArrayList locations = (TIntArrayList)(TIntArrayList)(Object) CustInfoHash.get(customer);
                    locations.add(i);
                    CustInfoHash.put(customer, locations);
                } else {
                    TIntArrayList locations = new TIntArrayList();
                    locations.add(i);
                    CustInfoHash.put(customer, locations);
                }
            }
            int[] customers =(int[])(Object) CustInfoHash.keys();
            MyHelperClass Arrays = new MyHelperClass();
            Arrays.sort(customers);
            int count = 1;
            for (int i = 0; i < customers.length; i++) {
                int customer = customers[i];
                TIntArrayList locations = (TIntArrayList)(TIntArrayList)(Object) CustInfoHash.get(customer);
                int noRatingsForCust =(int)(Object) locations.size();
                MyHelperClass ByteBuffer = new MyHelperClass();
                ByteBuffer outBuf1 =(ByteBuffer)(Object) ByteBuffer.allocate(12);
                outBuf1.putInt(customer);
                outBuf1.putInt(count);
                outBuf1.putInt(count + noRatingsForCust - 1);
                outBuf1.flip();
                outC1.write(outBuf1);
                count += noRatingsForCust;
                for (int j = 0; j < (int)(Object)locations.size(); j++) {
//                    MyHelperClass ByteBuffer = new MyHelperClass();
                    ByteBuffer outBuf2 =(ByteBuffer)(Object) ByteBuffer.allocate(4);
                    outBuf2.putInt((int)(Object)locations.get(j));
                    outBuf2.flip();
                    outC2.write(outBuf2);
                }
            }
            inC.close();
            outC1.close();
            outC2.close();
            return true;
        } catch (UncheckedIOException e) {
            System.err.println(e);
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass sort(int[] o0){ return null; }
	public MyHelperClass allocate(int o0){ return null; }}

class TIntObjectHashMap {

TIntObjectHashMap(){}
	TIntObjectHashMap(int o0, int o1){}
	public MyHelperClass keys(){ return null; }
	public MyHelperClass containsKey(int o0){ return null; }
	public MyHelperClass put(int o0, TIntArrayList o1){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0, boolean o1){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass getInt(){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass getShort(){ return null; }
	public MyHelperClass position(int o0){ return null; }
	public MyHelperClass putInt(int o0){ return null; }
	public MyHelperClass flip(){ return null; }
	public MyHelperClass get(){ return null; }}

class TIntArrayList {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
