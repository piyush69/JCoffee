
import java.io.UncheckedIOException;


class c12838273 {
public MyHelperClass IOUtils;

    public BufferedImage extractUsingCompositor() throws IOException, DjatokaException {
        boolean useRegion = false;
        int left = 0;
        int top = 0;
        int width = 50;
        int height = 50;
        boolean useleftDouble = false;
        Double leftDouble = 0.0;
        boolean usetopDouble = false;
        Double topDouble = 0.0;
        boolean usewidthDouble = false;
        Double widthDouble = 0.0;
        boolean useheightDouble = false;
        Double heightDouble = 0.0;
        MyHelperClass params = new MyHelperClass();
        if (params.getRegion() != null) {
//            MyHelperClass params = new MyHelperClass();
            StringTokenizer st = new StringTokenizer(params.getRegion(), "{},");
            String token;
            if ((token =(String)(Object) st.nextToken()).contains(".")) {
                topDouble = Double.parseDouble(token);
                usetopDouble = true;
            } else top = Integer.parseInt(token);
            if ((token =(String)(Object) st.nextToken()).contains(".")) {
                leftDouble = Double.parseDouble(token);
                useleftDouble = true;
            } else left = Integer.parseInt(token);
            if ((token =(String)(Object) st.nextToken()).contains(".")) {
                heightDouble = Double.parseDouble(token);
                useheightDouble = true;
            } else height = Integer.parseInt(token);
            if ((token =(String)(Object) st.nextToken()).contains(".")) {
                widthDouble = Double.parseDouble(token);
                usewidthDouble = true;
            } else width = Integer.parseInt(token);
            useRegion = true;
        }
        MyHelperClass is = new MyHelperClass();
        if (is != null) {
            MyHelperClass File = new MyHelperClass();
            File f =(File)(Object) File.createTempFile("tmp", ".jp2");
            f.deleteOnExit();
            FileOutputStream fos = new FileOutputStream(f);
            MyHelperClass sourceFile = new MyHelperClass();
            sourceFile = f.getAbsolutePath();
//            MyHelperClass is = new MyHelperClass();
            IOUtils.copyStream(is, fos);
        }
        Kdu_simple_file_source raw_src = null;
        Jp2_family_src family_src = new Jp2_family_src();
        Jpx_source wrapped_src = new Jpx_source();
        Kdu_region_compositor compositor = null;
        BufferedImage image = null;
        try {
            MyHelperClass sourceFile = new MyHelperClass();
            family_src.Open(sourceFile);
            int success =(int)(Object) wrapped_src.Open(family_src, true);
            if (success < 0) {
                family_src.Close();
                wrapped_src.Close();
//                MyHelperClass sourceFile = new MyHelperClass();
                raw_src = new Kdu_simple_file_source(sourceFile);
            }
            compositor = new Kdu_region_compositor();
            if (raw_src != null) compositor.Create(raw_src); else compositor.Create(wrapped_src);
            Kdu_dims imageDimensions = new Kdu_dims();
            compositor.Get_total_composition_dims(imageDimensions);
            Kdu_coords imageSize =(Kdu_coords)(Object) imageDimensions.Access_size();
            Kdu_coords imagePosition =(Kdu_coords)(Object) imageDimensions.Access_pos();
            if (useleftDouble) left =(int)(Object) imagePosition.Get_x() + (int) Math.round(leftDouble * (Double)(Object)imageSize.Get_x());
            if (usetopDouble) top =(int)(Object) imagePosition.Get_y() + (int) Math.round(topDouble * (Double)(Object)imageSize.Get_y());
            if (useheightDouble) height = (int) Math.round(heightDouble * (Double)(Object)imageSize.Get_y());
            if (usewidthDouble) width = (int) Math.round(widthDouble * (Double)(Object)imageSize.Get_x());
            if (useRegion) {
                imageSize.Set_x(width);
                imageSize.Set_y(height);
                imagePosition.Set_x(left);
                imagePosition.Set_y(top);
            }
//            MyHelperClass params = new MyHelperClass();
            int reduce = 1 << (int)(Object)params.getLevelReductionFactor();
            imageSize.Set_x((int)(Object)imageSize.Get_x());
            imageSize.Set_y((int)(Object)imageSize.Get_y());
            imagePosition.Set_x((int)(Object)imagePosition.Get_x() / reduce - (1 / reduce - 1) / 2);
            imagePosition.Set_y((int)(Object)imagePosition.Get_y() / reduce - (1 / reduce - 1) / 2);
            Kdu_dims viewDims = new Kdu_dims();
            viewDims.Assign(imageDimensions);
            viewDims.Access_size().Set_x(imageSize.Get_x());
            viewDims.Access_size().Set_y(imageSize.Get_y());
            compositor.Add_compositing_layer(0, viewDims, viewDims);
//            MyHelperClass params = new MyHelperClass();
            if ((int)(Object)params.getRotationDegree() == 90) compositor.Set_scale(true, false, true, 1.0F); else if ((int)(Object)params.getRotationDegree() == 180) compositor.Set_scale(false, true, true, 1.0F); else if ((int)(Object)params.getRotationDegree() == 270) compositor.Set_scale(true, true, false, 1.0F); else compositor.Set_scale(false, false, false, 1.0F);
            compositor.Get_total_composition_dims(viewDims);
            Kdu_coords viewSize =(Kdu_coords)(Object) viewDims.Access_size();
            compositor.Set_buffer_surface(viewDims);
            int[] imgBuffer = new int[(int)(Object)viewSize.Get_x() * (int)(Object)viewSize.Get_y()];
            Kdu_compositor_buf compositorBuffer =(Kdu_compositor_buf)(Object) compositor.Get_composition_buffer(viewDims);
            int regionBufferSize = 0;
            int[] kduBuffer = null;
            Kdu_dims newRegion = new Kdu_dims();
            while ((boolean)(Object)compositor.Process(100000, newRegion)) {
                Kdu_coords newOffset =(Kdu_coords)(Object) newRegion.Access_pos();
                Kdu_coords newSize =(Kdu_coords)(Object) newRegion.Access_size();
                newOffset.Subtract(viewDims.Access_pos());
                int newPixels =(int)(Object) newSize.Get_x() * (int)(Object)newSize.Get_y();
                if (newPixels == 0) continue;
                if (newPixels > regionBufferSize) {
                    regionBufferSize = newPixels;
                    kduBuffer = new int[regionBufferSize];
                }
                compositorBuffer.Get_region(newRegion, kduBuffer);
                int imgBuffereIdx =(int)(Object) newOffset.Get_x() +(int)(Object) newOffset.Get_y() * (int)(Object)viewSize.Get_x();
                int kduBufferIdx = 0;
                int xDiff =(int)(Object) viewSize.Get_x() - (int)(Object)newSize.Get_x();
                for (int j = 0; j < (int)(Object)newSize.Get_y(); j++, imgBuffereIdx += xDiff) {
                    for (int i = 0; i < (int)(Object)newSize.Get_x(); i++) {
                        imgBuffer[imgBuffereIdx++] = kduBuffer[kduBufferIdx++];
                    }
                }
            }
//            MyHelperClass params = new MyHelperClass();
            if ((int)(Object)params.getRotationDegree() == 90 ||(int)(Object) params.getRotationDegree() == 270) image = new BufferedImage(imageSize.Get_y(), imageSize.Get_x(), BufferedImage.TYPE_INT_RGB); else image = new BufferedImage(imageSize.Get_x(), imageSize.Get_y(), BufferedImage.TYPE_INT_RGB);
            image.setRGB(0, 0, viewSize.Get_x(), viewSize.Get_y(), imgBuffer, 0, viewSize.Get_x());
            if (compositor != null) compositor.Native_destroy();
            wrapped_src.Native_destroy();
            family_src.Native_destroy();
            if (raw_src != null) raw_src.Native_destroy();
            return image;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            throw new DjatokaException((String)(Object)e);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DjatokaException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLevelReductionFactor(){ return null; }
	public MyHelperClass getRegion(){ return null; }
	public MyHelperClass copyStream(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass Set_x(MyHelperClass o0){ return null; }
	public MyHelperClass Set_y(MyHelperClass o0){ return null; }
	public MyHelperClass getRotationDegree(){ return null; }}

class BufferedImage {
public static MyHelperClass TYPE_INT_RGB;
BufferedImage(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	BufferedImage(){}
	public MyHelperClass setRGB(int o0, int o1, MyHelperClass o2, MyHelperClass o3, int[] o4, int o5, MyHelperClass o6){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DjatokaException extends Exception{
	public DjatokaException(String errorMessage) { super(errorMessage); }
}

class StringTokenizer {

StringTokenizer(){}
	StringTokenizer(MyHelperClass o0, String o1){}
	public MyHelperClass nextToken(){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class Kdu_simple_file_source {

Kdu_simple_file_source(MyHelperClass o0){}
	Kdu_simple_file_source(){}
	public MyHelperClass Native_destroy(){ return null; }}

class Jp2_family_src {

public MyHelperClass Open(MyHelperClass o0){ return null; }
	public MyHelperClass Close(){ return null; }
	public MyHelperClass Native_destroy(){ return null; }}

class Jpx_source {

public MyHelperClass Open(Jp2_family_src o0, boolean o1){ return null; }
	public MyHelperClass Close(){ return null; }
	public MyHelperClass Native_destroy(){ return null; }}

class Kdu_region_compositor {

public MyHelperClass Native_destroy(){ return null; }
	public MyHelperClass Get_total_composition_dims(Kdu_dims o0){ return null; }
	public MyHelperClass Set_scale(boolean o0, boolean o1, boolean o2, float o3){ return null; }
	public MyHelperClass Create(Jpx_source o0){ return null; }
	public MyHelperClass Create(Kdu_simple_file_source o0){ return null; }
	public MyHelperClass Set_buffer_surface(Kdu_dims o0){ return null; }
	public MyHelperClass Get_composition_buffer(Kdu_dims o0){ return null; }
	public MyHelperClass Process(int o0, Kdu_dims o1){ return null; }
	public MyHelperClass Add_compositing_layer(int o0, Kdu_dims o1, Kdu_dims o2){ return null; }}

class Kdu_dims {

public MyHelperClass Assign(Kdu_dims o0){ return null; }
	public MyHelperClass Access_size(){ return null; }
	public MyHelperClass Access_pos(){ return null; }}

class Kdu_coords {

public MyHelperClass Set_y(int o0){ return null; }
	public MyHelperClass Get_y(){ return null; }
	public MyHelperClass Set_x(int o0){ return null; }
	public MyHelperClass Get_x(){ return null; }
	public MyHelperClass Subtract(MyHelperClass o0){ return null; }}

class Kdu_compositor_buf {

public MyHelperClass Get_region(Kdu_dims o0, int[] o1){ return null; }}

class KduException extends Exception{
	public KduException(String errorMessage) { super(errorMessage); }
}
