
import java.io.UncheckedIOException;


class c11039844 {
public static MyHelperClass GLUtils;
//public MyHelperClass GLUtils;

    public static int load(Context context, URL url) throws Exception {
        int texture[] = new int[1];
        MyHelperClass GLES20 = new MyHelperClass();
        GLES20.glGenTextures(1, texture, 0);
        int textureId = texture[0];
//        MyHelperClass GLES20 = new MyHelperClass();
        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, textureId);
        InputStream is =(InputStream)(Object) url.openStream();
        Bitmap tmpBmp;
        try {
            MyHelperClass BitmapFactory = new MyHelperClass();
            tmpBmp =(Bitmap)(Object) BitmapFactory.decodeStream(is);
        } finally {
            try {
                is.close();
            } catch (UncheckedIOException e) {
            }
        }
//        MyHelperClass GLES20 = new MyHelperClass();
        GLES20.glTexParameterf(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MIN_FILTER, GLES20.GL_LINEAR_MIPMAP_NEAREST);
        MyHelperClass MyGLUtils = new MyHelperClass();
        MyGLUtils.checkGlError("glTexParameterf GL_TEXTURE_MIN_FILTER");
//        MyHelperClass GLES20 = new MyHelperClass();
        GLES20.glTexParameterf(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MAG_FILTER, GLES20.GL_LINEAR);
//        MyHelperClass MyGLUtils = new MyHelperClass();
        MyGLUtils.checkGlError("glTexParameterf GL_TEXTURE_MAG_FILTER");
//        MyHelperClass GLES20 = new MyHelperClass();
        GLUtils.texImage2D(GLES20.GL_TEXTURE_2D, 0, tmpBmp, 0);
//        MyHelperClass MyGLUtils = new MyHelperClass();
        MyGLUtils.checkGlError("texImage2D");
//        MyHelperClass GLES20 = new MyHelperClass();
        GLES20.glGenerateMipmap(GLES20.GL_TEXTURE_2D);
//        MyHelperClass MyGLUtils = new MyHelperClass();
        MyGLUtils.checkGlError("glGenerateMipmap");
        tmpBmp.recycle();
//        MyHelperClass GLES20 = new MyHelperClass();
        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, 0);
        return textureId;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GL_TEXTURE_MIN_FILTER;
	public MyHelperClass GL_TEXTURE_2D;
	public MyHelperClass GL_LINEAR_MIPMAP_NEAREST;
	public MyHelperClass GL_LINEAR;
	public MyHelperClass GL_TEXTURE_MAG_FILTER;
public MyHelperClass glBindTexture(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass glGenTextures(int o0, int[] o1, int o2){ return null; }
	public MyHelperClass texImage2D(MyHelperClass o0, int o1, Bitmap o2, int o3){ return null; }
	public MyHelperClass glTexParameterf(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass decodeStream(InputStream o0){ return null; }
	public MyHelperClass glGenerateMipmap(MyHelperClass o0){ return null; }
	public MyHelperClass checkGlError(String o0){ return null; }}

class Context {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class Bitmap {

public MyHelperClass recycle(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
