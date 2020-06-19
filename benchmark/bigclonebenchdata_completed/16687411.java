


class c16687411 {

    private ByteBuffer readProgram(URL url) throws IOException {
        StringBuilder program = new StringBuilder();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line =(String)(Object) in.readLine()) != null) {
                program.append(line).append("\n");
            }
        } finally {
            if (in != null) in.close();
        }
        MyHelperClass BufferUtils = new MyHelperClass();
        ByteBuffer buffer =(ByteBuffer)(Object) BufferUtils.createByteBuffer(program.length());
        for (int i = 0; i < program.length(); i++) {
            buffer.put((byte) (program.charAt(i) & 0xFF));
        }
        buffer.flip();
        return buffer;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createByteBuffer(int o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class ByteBuffer {

public MyHelperClass put(byte o0){ return null; }
	public MyHelperClass flip(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
