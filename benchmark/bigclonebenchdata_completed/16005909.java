


class c16005909 {

    public static byte[] hash(String identifier) {
        MyHelperClass function = new MyHelperClass();
        if (function.equals("SHA-1")) {
            try {
//                MyHelperClass function = new MyHelperClass();
                MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(function);
                md.reset();
                byte[] code =(byte[])(Object) md.digest(identifier.getBytes());
                MyHelperClass KEY_LENGTH = new MyHelperClass();
                byte[] value = new byte[(int)(Object)KEY_LENGTH / 8];
                int shrink = code.length / value.length;
                int bitCount = 1;
                for (int j = 0; j < code.length * 8; j++) {
                    int currBit = ((code[j / 8] & (1 << (j % 8))) >> j % 8);
                    if (currBit == 1) bitCount++;
                    if (((j + 1) % shrink) == 0) {
                        int shrinkBit = (bitCount % 2 == 0) ? 0 : 1;
                        value[j / shrink / 8] |= (shrinkBit << ((j / shrink) % 8));
                        bitCount = 1;
                    }
                }
                return value;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        MyHelperClass function = new MyHelperClass();
        if (function.equals("CRC32")) {
            CRC32 crc32 = new CRC32();
            crc32.reset();
            crc32.update(identifier.getBytes());
            long code =(long)(Object) crc32.getValue();
            MyHelperClass KEY_LENGTH = new MyHelperClass();
            code &= (0xffffffffffffffffL >>> (64 - (int)(Object)KEY_LENGTH));
//            MyHelperClass KEY_LENGTH = new MyHelperClass();
            byte[] value = new byte[(int)(Object)KEY_LENGTH / 8];
            for (int i = 0; i < value.length; i++) {
                value[value.length - i - 1] = (byte) ((code >> 8 * i) & 0xff);
            }
            return value;
        }
//        MyHelperClass function = new MyHelperClass();
        if (function.equals("Java")) {
            int code = identifier.hashCode();
            MyHelperClass KEY_LENGTH = new MyHelperClass();
            code &= (0xffffffff >>> (32 - (int)(Object)KEY_LENGTH));
//            MyHelperClass KEY_LENGTH = new MyHelperClass();
            byte[] value = new byte[(int)(Object)KEY_LENGTH / 8];
            for (int i = 0; i < value.length; i++) {
                value[value.length - i - 1] = (byte) ((code >> 8 * i) & 0xff);
            }
            return value;
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }
	public static MyHelperClass getInstance(MyHelperClass o0){ return null; }}

class CRC32 {

public MyHelperClass reset(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass getValue(){ return null; }}
