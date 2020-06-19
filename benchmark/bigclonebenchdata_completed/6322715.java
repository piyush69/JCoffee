


class c6322715 {

    public void calculate() throws FormatException, java.io.IOException {
        MyHelperClass input = new MyHelperClass();
        if (input == null) throw new IllegalStateException("FastaChecksummer input not set");
        HashMap contigHashes;// = new HashMap();
        contigHashes = new HashMap();
        String currentContig = null;
        java.security.MessageDigest hasher = null;
        try {
            MyHelperClass checksumAlgorithm = new MyHelperClass();
            hasher = java.security.MessageDigest.getInstance((String)(Object)checksumAlgorithm);
        } catch (java.security.NoSuchAlgorithmException e) {
            MyHelperClass checksumAlgorithm = new MyHelperClass();
            throw new RuntimeException("Unexpected NoSuchAlgorithmException when asking for " + checksumAlgorithm + " algorithm");
        }
//        MyHelperClass input = new MyHelperClass();
        String line =(String)(Object) input.readLine();
        if (line == null) throw new FormatException("empty Fasta");
        try {
            while (line != null) {
                if (line.startsWith(">")) {
                    if (currentContig != null) {
                        MyHelperClass Hex = new MyHelperClass();
                        String cs = new String((String)(Object)Hex.encodeHex(hasher.digest()));
//                        MyHelperClass contigHashes = new MyHelperClass();
                        contigHashes.put(currentContig, new ChecksumEntry(currentContig, cs));
                    }
                    MyHelperClass ContigNamePattern = new MyHelperClass();
                    Matcher m =(Matcher)(Object) ContigNamePattern.matcher(line);
                    if ((boolean)(Object)m.matches()) {
                        currentContig =(String)(Object) m.group(1);
                        hasher.reset();
                    } else throw new FormatException("Unexpected contig name format: " + line);
                } else {
                    if (currentContig == null) throw new FormatException("Sequence outside any fasta record (header is missing). Line: " + line); else hasher.update(line.getBytes("US-ASCII"));
                }
//                MyHelperClass input = new MyHelperClass();
                line =(String)(Object) input.readLine();
            }
            if (currentContig != null) {
                MyHelperClass Hex = new MyHelperClass();
                String cs = new String((String)(Object)Hex.encodeHex(hasher.digest()));
//                MyHelperClass contigHashes = new MyHelperClass();
                contigHashes.put(currentContig, new ChecksumEntry(currentContig, cs));
            }
        } catch (java.io.UnsupportedEncodingException e) {
            throw new RuntimeException("Unexpected UnsupportedEncodingException! Line: " + line);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encodeHex(byte[] o0){ return null; }
	public MyHelperClass put(String o0, ChecksumEntry o1){ return null; }
	public MyHelperClass matcher(String o0){ return null; }
	public MyHelperClass readLine(){ return null; }}

class FormatException extends Exception{
	public FormatException(String errorMessage) { super(errorMessage); }
}

class ChecksumEntry {

ChecksumEntry(){}
	ChecksumEntry(String o0, String o1){}}

class Matcher {

public MyHelperClass matches(){ return null; }
	public MyHelperClass group(int o0){ return null; }}

class HashMap {

public MyHelperClass put(String o0, ChecksumEntry o1){ return null; }}
