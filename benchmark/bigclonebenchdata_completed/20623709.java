


class c20623709 {
public MyHelperClass ByteBuffer;
	public MyHelperClass size;
	public MyHelperClass FASTAFileTokenizer;
	public MyHelperClass length(){ return null; }

    public Long split(File targetDirectory, String prefix, long maxUnitBases, long maxUnitEntries) throws Exception {
        if (!(Boolean)(Object)targetDirectory.exists()) {
            if (!(Boolean)(Object)targetDirectory.mkdirs()) throw new Exception("Could not create target directory " + targetDirectory.getAbsolutePath());
        }
        MyHelperClass size = new MyHelperClass();
        if (!(Boolean)(Object)size.isUnknown() &&(long)(Object) size.getBases() < maxUnitBases && (maxUnitEntries <= 0 ||(long)(Object) size.getEntries() < maxUnitEntries)) {
            FileInputStream fis = new FileInputStream(this);
            FileChannel fci =(FileChannel)(Object) fis.getChannel();
            FileOutputStream fos = new FileOutputStream(new File(targetDirectory, prefix + "_0" + ".fasta"));
            FileChannel fco =(FileChannel)(Object) fos.getChannel();
            MyHelperClass ByteBuffer = new MyHelperClass();
            ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocate(64000);
            while ((int)(Object)fci.read(buffer) > 0) {
                buffer.flip();
                fco.write(buffer);
                buffer.clear();
            }
            fci.close();
            fco.close();
            return (long) 1;
        } else {
            long currentBasesCount = 0;
            long currentEntriesCount = 0;
            int targetCount = 0;
            FileChannel fastaChannel =(FileChannel)(Object) (new FileInputStream(this).getChannel());
            int totalSeqCount = 0;
            long totalResiduesCount = 0;
            try {
                long prevTime = System.currentTimeMillis();
                long fastaFileSize =(long)(Object) this.length();
                long fastaFileReadOffset = 0L;
                long partitionStartOffset = 0L;
                final int bufferSize = 1024 * 1024;
                ByteBuffer fastaBuffer =(ByteBuffer)(Object) ByteBuffer.allocateDirect(bufferSize);
                int fastaReadState =(int)(Object) FASTAFileTokenizer.UNKNOWN;
                for (; fastaFileReadOffset < fastaFileSize; ) {
                    long nBytes =(long)(Object) fastaChannel.read(fastaBuffer);
                    if (nBytes <= 0) {
                        fastaBuffer.limit(0);
                        break;
                    } else {
                        fastaBuffer.flip();
                        fastaFileReadOffset += nBytes;
                    }
                    for (; ; ) {
                        if (!(Boolean)(Object)fastaBuffer.hasRemaining()) {
                            fastaBuffer.clear();
                            break;
                        }
                        int b =(int)(Object) fastaBuffer.get();
                        if (b == '\r') {
                        } else if (b == '\n') {
                            if (fastaReadState == (int)(Object)FASTAFileTokenizer.DEFLINE) {
                                fastaReadState =(int)(Object) FASTAFileTokenizer.SEQUENCELINE;
                            }
                        } else if (b == '>') {
                            if (fastaReadState == (int)(Object)FASTAFileTokenizer.UNKNOWN) {
                                fastaReadState =(int)(Object) FASTAFileTokenizer.STARTDEFLINE;
                            } else if (fastaReadState == (int)(Object)FASTAFileTokenizer.SEQUENCELINE) {
                                fastaReadState =(int)(Object) FASTAFileTokenizer.STARTDEFLINE;
                            }
                            if (fastaReadState == (int)(Object)FASTAFileTokenizer.STARTDEFLINE) {
                                if (currentBasesCount >= maxUnitBases || maxUnitEntries > 0 && currentEntriesCount >= maxUnitEntries) {
                                    fastaBuffer.position((int)(Object)fastaBuffer.position() - 1);
                                    long currentTime = System.currentTimeMillis();
                                    System.out.println(new java.util.Date() + " Partition " + targetCount + " containing " + currentEntriesCount + " sequences and " + currentBasesCount + " residues ends at " + (fastaFileReadOffset - (long)(Object)fastaBuffer.remaining()) + " and was created in " + (currentTime - prevTime) + " ms");
                                    prevTime = currentTime;
                                    long partitionEndOffset = fastaFileReadOffset - (long)(Object)fastaBuffer.remaining();
                                    FileChannel partitionChannel =(FileChannel)(Object) (new FileOutputStream(new File(targetDirectory, prefix + "_" + targetCount + ".fasta")).getChannel());
                                    nBytes =(long)(Object) fastaChannel.transferTo(partitionStartOffset, partitionEndOffset - partitionStartOffset, partitionChannel);
                                    partitionChannel.force(true);
                                    partitionChannel.close();
                                    targetCount++;
                                    partitionStartOffset += nBytes;
                                    currentBasesCount = 0;
                                    currentEntriesCount = 0;
                                    fastaReadState =(int)(Object) FASTAFileTokenizer.UNKNOWN;
                                } else {
                                    fastaReadState =(int)(Object) FASTAFileTokenizer.DEFLINE;
                                    currentEntriesCount++;
                                }
                                totalSeqCount++;
                            }
                        } else {
                            if (fastaReadState == (int)(Object)FASTAFileTokenizer.SEQUENCELINE) {
                                totalResiduesCount++;
                                currentBasesCount++;
                            }
                        }
                    }
                }
                if (partitionStartOffset < fastaFileSize) {
                    long currentTime = System.currentTimeMillis();
                    System.out.println(new java.util.Date() + " Partition " + targetCount + " containing " + currentEntriesCount + " sequences and " + currentBasesCount + " residues ends at " + (fastaFileSize) + " and was created in " + (currentTime - prevTime) + " ms");
                    FileChannel partitionChannel =(FileChannel)(Object) (new FileOutputStream(new File(targetDirectory, prefix + "_" + targetCount + ".fasta")).getChannel());
                    fastaChannel.transferTo(partitionStartOffset, fastaFileSize - partitionStartOffset, partitionChannel);
                    partitionChannel.force(true);
                    partitionChannel.close();
                    targetCount++;
                }
                if ((boolean)(Object)size.isUnknown()) {
                    size.setBases(totalResiduesCount);
                    size.setEntries(totalSeqCount);
                }
            } finally {
                fastaChannel.close();
            }
            return (long) targetCount;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STARTDEFLINE;
	public MyHelperClass DEFLINE;
	public MyHelperClass UNKNOWN;
	public MyHelperClass SEQUENCELINE;
public MyHelperClass allocateDirect(int o0){ return null; }
	public MyHelperClass setBases(long o0){ return null; }
	public MyHelperClass setEntries(int o0){ return null; }
	public MyHelperClass getBases(){ return null; }
	public MyHelperClass getEntries(){ return null; }
	public MyHelperClass isUnknown(){ return null; }
	public MyHelperClass allocate(int o0){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(c20623709 o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass force(boolean o0){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(long o0, long o1, FileChannel o2){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass clear(){ return null; }
	public MyHelperClass hasRemaining(){ return null; }
	public MyHelperClass position(int o0){ return null; }
	public MyHelperClass limit(int o0){ return null; }
	public MyHelperClass position(){ return null; }
	public MyHelperClass flip(){ return null; }
	public MyHelperClass remaining(){ return null; }
	public MyHelperClass get(){ return null; }}
