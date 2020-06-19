


class c17662157 {

    public static void main(String[] argz) {
        int X, Y, Z;
        X = 256;
        Y = 256;
        Z = 256;
        try {
            String work_folder = "C:\\Documents and Settings\\Entheogen\\My Documents\\school\\jung\\vol_data\\CT_HEAD3";
            FileOutputStream out_stream = new FileOutputStream(new File(work_folder + "\\converted.dat"));
            FileChannel out =(FileChannel)(Object) out_stream.getChannel();
            String f_name = "head256.raw";
            File file = new File(work_folder + "\\" + f_name);
            FileChannel in =(FileChannel)(Object) (new FileInputStream(file).getChannel());
            MyHelperClass BufferUtil = new MyHelperClass();
            ByteBuffer buffa =(ByteBuffer)(Object) BufferUtil.newByteBuffer((int)(int)(Object) file.length());
            in.read(buffa);
            in.close();
            int N = 256;
//            MyHelperClass BufferUtil = new MyHelperClass();
            FloatBuffer output_data =(FloatBuffer)(Object) BufferUtil.newFloatBuffer(N * N * N);
            float min = Float.MAX_VALUE;
            for (int i = 0, j = 0; i < (int)(Object)buffa.capacity(); i++, j++) {
                byte c =(byte)(Object) buffa.get(i);
                min = Math.min(min, (float) (c));
                output_data.put((float) (c));
            }
            for (int i = 0; i < Y - X; ++i) {
                for (int j = 0; j < Y; ++j) {
                    for (int k = 0; k < Z; ++k) {
                        output_data.put(min);
                    }
                }
            }
            output_data.rewind();
            System.out.println("size of output_data = " + Integer.toString((int)(Object)output_data.capacity()));
//            MyHelperClass BufferUtil = new MyHelperClass();
            out.write(BufferUtil.copyFloatBufferAsByteBuffer(output_data));
//            MyHelperClass BufferUtil = new MyHelperClass();
            ByteBuffer buffa2 =(ByteBuffer)(Object) BufferUtil.newByteBuffer(2);
            buffa2.put((byte) '.');
            out.close();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyFloatBufferAsByteBuffer(FloatBuffer o0){ return null; }
	public MyHelperClass newFloatBuffer(int o0){ return null; }
	public MyHelperClass newByteBuffer(int o0){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass length(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass put(byte o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass capacity(){ return null; }}

class FloatBuffer {

public MyHelperClass put(float o0){ return null; }
	public MyHelperClass capacity(){ return null; }
	public MyHelperClass rewind(){ return null; }}
