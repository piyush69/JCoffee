
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12838274 {
public MyHelperClass ImageProcessingUtils;
	public MyHelperClass Kdu_global;
	public MyHelperClass IOUtils;
	public MyHelperClass getReferenceExpansion(int o0, Kdu_channel_mapping o1, Kdu_codestream o2){ return null; }

    public BufferedImage extract() throws DjatokaException {
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
        try {
            MyHelperClass is = new MyHelperClass();
            if (is != null) {
                MyHelperClass File = new MyHelperClass();
                File f =(File)(Object) File.createTempFile("tmp", ".jp2");
                f.deleteOnExit();
                FileOutputStream fos = new FileOutputStream(f);
                MyHelperClass sourceFile = new MyHelperClass();
                sourceFile = f.getAbsolutePath();
//                MyHelperClass is = new MyHelperClass();
                IOUtils.copyStream(is, fos);
//                MyHelperClass is = new MyHelperClass();
                is.close();
                fos.close();
            }
        } catch (UncheckedIOException e) {
            throw new DjatokaException((String)(Object)e);
        }
        try {
            Jp2_source inputSource = new Jp2_source();
            Kdu_compressed_source input = null;
            Jp2_family_src jp2_family_in = new Jp2_family_src();
            Jp2_locator loc = new Jp2_locator();
            MyHelperClass sourceFile = new MyHelperClass();
            jp2_family_in.Open(sourceFile, true);
            inputSource.Open(jp2_family_in, loc);
            inputSource.Read_header();
            input =(Kdu_compressed_source)(Object) inputSource;
            Kdu_codestream codestream = new Kdu_codestream();
            codestream.Create(input);
            Kdu_channel_mapping channels = new Kdu_channel_mapping();
            if ((boolean)(Object)inputSource.Exists()) channels.Configure(inputSource, false); else channels.Configure(codestream);
            int ref_component =(int)(Object) channels.Get_source_component(0);
            Kdu_coords ref_expansion =(Kdu_coords)(Object) getReferenceExpansion(ref_component, channels, codestream);
            Kdu_dims image_dims = new Kdu_dims();
            codestream.Get_dims(ref_component, image_dims);
            Kdu_coords imageSize =(Kdu_coords)(Object) image_dims.Access_size();
            Kdu_coords imagePosition =(Kdu_coords)(Object) image_dims.Access_pos();
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
            imageSize.Set_x((int)(Object)imageSize.Get_x() * (int)(Object)ref_expansion.Get_x());
            imageSize.Set_y((int)(Object)imageSize.Get_y() * (int)(Object)ref_expansion.Get_y());
            imagePosition.Set_x((int)(Object)imagePosition.Get_x() * (int)(Object)ref_expansion.Get_x() / reduce - (((int)(Object)ref_expansion.Get_x() / reduce - 1) / 2));
            imagePosition.Set_y((int)(Object)imagePosition.Get_y() * (int)(Object)ref_expansion.Get_y() / reduce - (((int)(Object)ref_expansion.Get_y() / reduce - 1) / 2));
            Kdu_dims view_dims = new Kdu_dims();
            view_dims.Assign(image_dims);
            view_dims.Access_size().Set_x(imageSize.Get_x());
            view_dims.Access_size().Set_y(imageSize.Get_y());
            int region_buf_size =(int)(Object) imageSize.Get_x() * (int)(Object)imageSize.Get_y();
            int[] region_buf = new int[region_buf_size];
            Kdu_region_decompressor decompressor = new Kdu_region_decompressor();
//            MyHelperClass params = new MyHelperClass();
            decompressor.Start(codestream, channels, -1, params.getLevelReductionFactor(), 16384, image_dims, ref_expansion, new Kdu_coords(1, 1), false, Kdu_global.KDU_WANT_OUTPUT_COMPONENTS);
            Kdu_dims new_region = new Kdu_dims();
            Kdu_dims incomplete_region = new Kdu_dims();
            Kdu_coords viewSize =(Kdu_coords)(Object) view_dims.Access_size();
            incomplete_region.Assign(image_dims);
            int[] imgBuffer = new int[(int)(Object)viewSize.Get_x() * (int)(Object)viewSize.Get_y()];
            int[] kduBuffer = null;
            while ((boolean)(Object)decompressor.Process(region_buf, image_dims.Access_pos(), 0, 0, region_buf_size, incomplete_region, new_region)) {
                Kdu_coords newOffset =(Kdu_coords)(Object) new_region.Access_pos();
                Kdu_coords newSize =(Kdu_coords)(Object) new_region.Access_size();
                newOffset.Subtract(view_dims.Access_pos());
                kduBuffer = region_buf;
                int imgBuffereIdx =(int)(Object) newOffset.Get_x() +(int)(Object) newOffset.Get_y() * (int)(Object)viewSize.Get_x();
                int kduBufferIdx = 0;
                int xDiff =(int)(Object) viewSize.Get_x() - (int)(Object)newSize.Get_x();
                for (int j = 0; j < (int)(Object)newSize.Get_y(); j++, imgBuffereIdx += xDiff) {
                    for (int i = 0; i < (int)(Object)newSize.Get_x(); i++) {
                        imgBuffer[imgBuffereIdx++] = kduBuffer[kduBufferIdx++];
                    }
                }
            }
            MyHelperClass BufferedImage = new MyHelperClass();
            BufferedImage image = new BufferedImage(imageSize.Get_x(), imageSize.Get_y(), BufferedImage.TYPE_INT_RGB);
            image.setRGB(0, 0, viewSize.Get_x(), viewSize.Get_y(), imgBuffer, 0, viewSize.Get_x());
//            MyHelperClass params = new MyHelperClass();
            if ((int)(Object)params.getRotationDegree() > 0) {
//                MyHelperClass params = new MyHelperClass();
                image =(BufferedImage)(Object) ImageProcessingUtils.rotate(image, params.getRotationDegree());
            }
            decompressor.Native_destroy();
            channels.Native_destroy();
            if ((boolean)(Object)codestream.Exists()) codestream.Destroy();
            inputSource.Native_destroy();
            input.Native_destroy();
            jp2_family_in.Native_destroy();
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
public MyHelperClass TYPE_INT_RGB;
	public MyHelperClass KDU_WANT_OUTPUT_COMPONENTS;
public MyHelperClass getLevelReductionFactor(){ return null; }
	public MyHelperClass getRegion(){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass copyStream(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass Set_x(MyHelperClass o0){ return null; }
	public MyHelperClass Set_y(MyHelperClass o0){ return null; }
	public MyHelperClass getRotationDegree(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass rotate(BufferedImage o0, MyHelperClass o1){ return null; }}

class BufferedImage {

BufferedImage(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	BufferedImage(){}
	public MyHelperClass setRGB(int o0, int o1, MyHelperClass o2, MyHelperClass o3, int[] o4, int o5, MyHelperClass o6){ return null; }}

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
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Jp2_source {

public MyHelperClass Read_header(){ return null; }
	public MyHelperClass Open(Jp2_family_src o0, Jp2_locator o1){ return null; }
	public MyHelperClass Exists(){ return null; }
	public MyHelperClass Native_destroy(){ return null; }}

class Kdu_compressed_source {

public MyHelperClass Native_destroy(){ return null; }}

class Jp2_family_src {

public MyHelperClass Native_destroy(){ return null; }
	public MyHelperClass Open(MyHelperClass o0, boolean o1){ return null; }}

class Jp2_locator {

}

class Kdu_codestream {

public MyHelperClass Create(Kdu_compressed_source o0){ return null; }
	public MyHelperClass Destroy(){ return null; }
	public MyHelperClass Get_dims(int o0, Kdu_dims o1){ return null; }
	public MyHelperClass Exists(){ return null; }}

class Kdu_channel_mapping {

public MyHelperClass Get_source_component(int o0){ return null; }
	public MyHelperClass Configure(Jp2_source o0, boolean o1){ return null; }
	public MyHelperClass Configure(Kdu_codestream o0){ return null; }
	public MyHelperClass Native_destroy(){ return null; }}

class Kdu_coords {

Kdu_coords(){}
	Kdu_coords(int o0, int o1){}
	public MyHelperClass Set_y(int o0){ return null; }
	public MyHelperClass Get_y(){ return null; }
	public MyHelperClass Set_x(int o0){ return null; }
	public MyHelperClass Get_x(){ return null; }
	public MyHelperClass Subtract(MyHelperClass o0){ return null; }}

class Kdu_dims {

public MyHelperClass Assign(Kdu_dims o0){ return null; }
	public MyHelperClass Access_size(){ return null; }
	public MyHelperClass Access_pos(){ return null; }}

class Kdu_region_decompressor {

public MyHelperClass Process(int[] o0, MyHelperClass o1, int o2, int o3, int o4, Kdu_dims o5, Kdu_dims o6){ return null; }
	public MyHelperClass Start(Kdu_codestream o0, Kdu_channel_mapping o1, int o2, MyHelperClass o3, int o4, Kdu_dims o5, Kdu_coords o6, Kdu_coords o7, boolean o8, MyHelperClass o9){ return null; }
	public MyHelperClass Native_destroy(){ return null; }}

class KduException extends Exception{
	public KduException(String errorMessage) { super(errorMessage); }
}
