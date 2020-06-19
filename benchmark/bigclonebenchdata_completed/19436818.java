import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19436818 {
public MyHelperClass ActionBuilderUtils;

    private void collectImageFile(@(Annotation)(Object)NotNull final Progress progress, @NotNull final File collectedDirectory) throws Throwable, IOException {
        MyHelperClass ACTION_BUILDER = new MyHelperClass();
        final File file = new File(collectedDirectory, ActionBuilderUtils.getString(ACTION_BUILDER, "configSource.image.name"));
        final FileOutputStream fos = new FileOutputStream(file);
        try {
            final FileChannel outChannel =(FileChannel)(Object) fos.getChannel();
            try {
                MyHelperClass faceObjects = new MyHelperClass();
                final int numOfFaceObjects = faceObjects.size();
//                MyHelperClass ACTION_BUILDER = new MyHelperClass();
                progress.setLabel(ActionBuilderUtils.getString(ACTION_BUILDER, "archCollectImages"), numOfFaceObjects);
                MyHelperClass ByteBuffer = new MyHelperClass();
                final ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                MyHelperClass Charset = new MyHelperClass();
                final Charset charset = Charset.forName("ISO-8859-1");
                int i = 0;
//                MyHelperClass faceObjects = new MyHelperClass();
                for (final FaceObject faceObject : (Object[])(Object)faceObjects) {
                    final String face = faceObject.getFaceName();
                    MyHelperClass archFaceProvider = new MyHelperClass();
                    final String path = archFaceProvider.getFilename(face);
                    try {
                        final FileInputStream fin = new FileInputStream(path);
                        try {
                            final FileChannel inChannel =(FileChannel)(Object) fin.getChannel();
                            final long imageSize = inChannel.size();
                            byteBuffer.clear();
//                            MyHelperClass faceObjects = new MyHelperClass();
                            byteBuffer.put(("IMAGE " + (faceObjects.isIncludeFaceNumbers() ? i + " " : "") + imageSize + " " + face + "\n").getBytes((String)(Object)charset));
                            byteBuffer.flip();
                            outChannel.write(byteBuffer);
                            inChannel.transferTo(0L, imageSize, outChannel);
                        } finally {
                            fin.close();
                        }
                    } catch (final FileNotFoundException ignored) {
//                        MyHelperClass ACTION_BUILDER = new MyHelperClass();
                        ACTION_BUILDER.showMessageDialog(progress.getParentComponent(), "archCollectErrorFileNotFound", path);
                        return;
                    } catch (final IOException e) {
//                        MyHelperClass ACTION_BUILDER = new MyHelperClass();
                        ACTION_BUILDER.showMessageDialog(progress.getParentComponent(), "archCollectErrorIOException", path, e);
                        return;
                    }
                    if (i++ % 100 == 0) {
                        progress.setValue(i);
                    }
                }
//                MyHelperClass faceObjects = new MyHelperClass();
                progress.setValue(faceObjects.size());
            } finally {
                outChannel.close();
            }
        } finally {
            fos.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass forName(String o0){ return null; }
	public MyHelperClass allocate(int o0){ return null; }
	public MyHelperClass isIncludeFaceNumbers(){ return null; }
	public MyHelperClass getFilename(String o0){ return null; }}

class Progress {

public MyHelperClass setValue(int o0){ return null; }
	public MyHelperClass getParentComponent(){ return null; }}

class NotNull {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(long o0, long o1, FileChannel o2){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteBuffer {

public MyHelperClass clear(){ return null; }
	public MyHelperClass flip(){ return null; }}

class Charset {

}

class FaceObject {

}
