
import java.io.UncheckedIOException;


class c20149832 {
public MyHelperClass setContentView(MyHelperClass o0){ return null; }
	public MyHelperClass createBitmap(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass findViewById(MyHelperClass o0){ return null; }
public MyHelperClass requestWindowFeature(MyHelperClass o0){ return null; }
public MyHelperClass Config;
	public MyHelperClass layout;
	public MyHelperClass drawable;
	public MyHelperClass id;
public MyHelperClass Typeface;
	public MyHelperClass Align;
	public MyHelperClass Color;
	public MyHelperClass getResources(){ return null; }

//    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.onCreate(savedInstanceState);
        MyHelperClass Window = new MyHelperClass();
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(layout.main);
        try {
            URL url = new URL("http://placekitten.com/g/500/250");
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setDoInput(true);
            conn.setConnectTimeout(3000);
            conn.setReadTimeout(5000);
            MyHelperClass BitmapFactory = new MyHelperClass();
            Bitmap kitten =(Bitmap)(Object) BitmapFactory.decodeStream(conn.getInputStream());
            conn.disconnect();
            Bitmap frame =(Bitmap)(Object) BitmapFactory.decodeResource(getResources(), drawable.frame500);
            Bitmap output =(Bitmap)(Object) createBitmap(frame.getWidth(), frame.getHeight(), Config.ARGB_8888);
            output.eraseColor(Color.BLACK);
            Canvas canvas = new Canvas(output);
            canvas.drawBitmap(kitten, 125, 125, new Paint());
            canvas.drawBitmap(frame, 0, 0, new Paint());
            Paint textPaint = new Paint();
            textPaint.setColor(Color.WHITE);
            textPaint.setTypeface(Typeface.create(Typeface.SERIF, Typeface.BOLD));
            textPaint.setTextAlign(Align.CENTER);
            textPaint.setAntiAlias(true);
            textPaint.setTextSize(36);
            canvas.drawText("Cute",(int)(Object) output.getWidth() / 2, ((int)(Object)output.getHeight() / 2) + 140, textPaint);
            textPaint.setTextSize(24);
            canvas.drawText("Some of us just haz it.",(int)(Object) output.getWidth() / 2, ((int)(Object)output.getHeight() / 2) + 180, textPaint);
            ImageView imageView = (ImageView)(ImageView)(Object) this.findViewById(id.imageView);
            imageView.setImageBitmap(output);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass imageView;
	public MyHelperClass SERIF;
	public MyHelperClass frame500;
	public MyHelperClass FEATURE_NO_TITLE;
	public MyHelperClass ARGB_8888;
	public MyHelperClass WHITE;
	public MyHelperClass BLACK;
	public MyHelperClass main;
	public MyHelperClass CENTER;
	public MyHelperClass BOLD;
public MyHelperClass decodeResource(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass create(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass decodeStream(MyHelperClass o0){ return null; }}

class Bundle {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class Bitmap {

public MyHelperClass eraseColor(MyHelperClass o0){ return null; }
	public MyHelperClass getHeight(){ return null; }
	public MyHelperClass getWidth(){ return null; }}

class Canvas {

Canvas(Bitmap o0){}
	Canvas(){}
	public MyHelperClass drawText(String o0, int o1, int o2, Paint o3){ return null; }
	public MyHelperClass drawBitmap(Bitmap o0, int o1, int o2, Paint o3){ return null; }}

class Paint {

public MyHelperClass setAntiAlias(boolean o0){ return null; }
	public MyHelperClass setTextSize(int o0){ return null; }
	public MyHelperClass setTypeface(MyHelperClass o0){ return null; }
	public MyHelperClass setColor(MyHelperClass o0){ return null; }
	public MyHelperClass setTextAlign(MyHelperClass o0){ return null; }}

class ImageView {

public MyHelperClass setImageBitmap(Bitmap o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
