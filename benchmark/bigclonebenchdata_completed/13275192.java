


class c13275192 {
public static MyHelperClass Format;
//public MyHelperClass Format;

    public static void main(String[] args) throws Exception {
        MyHelperClass ImageIO = new MyHelperClass();
        BufferedImage image =(BufferedImage)(Object) ImageIO.read((URL)(Object)BitmapFont.class.getResource("Candara-38-Bold.png"));
        URL url =(URL)(Object) BitmapFontData.class.getResource("Candara-38-Bold.fnt");
        BitmapFontData bitmapFontData = new BitmapFontData(url.openStream(), true);
        BitmapFont font = new BitmapFont(bitmapFontData, true);
        font.drawMultiLine("Hello world\nthis is a\ntest!!!", 100, 100);
        VertexData vertexData =(VertexData)(Object) font.createVertexData();
        MyHelperClass Display = new MyHelperClass();
        Display.setDisplayMode(new DisplayMode(640, 480));
//        MyHelperClass Display = new MyHelperClass();
        Display.create();
        RenderPass renderPass = new RenderPass();
        MyHelperClass GL11 = new MyHelperClass();
        renderPass.setClearMask((int)(Object)GL11.GL_COLOR_BUFFER_BIT | (int)(Object)GL11.GL_DEPTH_BUFFER_BIT);
        renderPass.setClearColor(new Color4f(0.3f, 0.4f, 0.5f, 1f));
        MyHelperClass View = new MyHelperClass();
        renderPass.setView(View.createOrtho(0, 640, 0, 480, -1000, 1000));
        MyHelperClass TextureLoader = new MyHelperClass();
        ByteBuffer[][] pixels = { {(ByteBuffer)(Object) TextureLoader.getImageData(image) } };
        MyHelperClass TextureType = new MyHelperClass();
        Texture texture = new Texture(TextureType.TEXTURE_2D, 4, image.getWidth(), image.getHeight(), 0, Format.BGRA, pixels, false, false);
        Shape shape = new Shape(vertexData);
        shape.getState().setUnit(0, new Unit(texture));
        shape.getState().setBlendEnabled(true);
        MyHelperClass BlendSrcFunc = new MyHelperClass();
        shape.getState().setBlendSrcFunc(BlendSrcFunc.SRC_ALPHA);
        MyHelperClass BlendDstFunc = new MyHelperClass();
        shape.getState().setBlendDstFunc(BlendDstFunc.ONE_MINUS_SRC_ALPHA);
        renderPass.getRootNode().addShape(shape);
        Renderer renderer = new Renderer(new SceneGraph(renderPass));
//        MyHelperClass Display = new MyHelperClass();
        while (!(Boolean)(Object)Display.isCloseRequested()) {
            renderer.render();
//            MyHelperClass Display = new MyHelperClass();
            Display.update();
        }
//        MyHelperClass Display = new MyHelperClass();
        Display.destroy();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BGRA;
	public MyHelperClass TEXTURE_2D;
	public MyHelperClass GL_COLOR_BUFFER_BIT;
	public MyHelperClass SRC_ALPHA;
	public MyHelperClass GL_DEPTH_BUFFER_BIT;
	public MyHelperClass ONE_MINUS_SRC_ALPHA;
public MyHelperClass setDisplayMode(DisplayMode o0){ return null; }
	public MyHelperClass read(URL o0){ return null; }
	public MyHelperClass createOrtho(int o0, int o1, int o2, int o3, int o4, int o5){ return null; }
	public MyHelperClass destroy(){ return null; }
	public MyHelperClass setUnit(int o0, Unit o1){ return null; }
	public MyHelperClass create(){ return null; }
	public MyHelperClass isCloseRequested(){ return null; }
	public MyHelperClass setBlendEnabled(boolean o0){ return null; }
	public MyHelperClass setBlendSrcFunc(MyHelperClass o0){ return null; }
	public MyHelperClass getImageData(BufferedImage o0){ return null; }
	public MyHelperClass setBlendDstFunc(MyHelperClass o0){ return null; }
	public MyHelperClass update(){ return null; }
	public MyHelperClass addShape(Shape o0){ return null; }}

class BufferedImage {

public MyHelperClass getHeight(){ return null; }
	public MyHelperClass getWidth(){ return null; }}

class BitmapFont {

BitmapFont(BitmapFontData o0, boolean o1){}
	BitmapFont(){}
	public MyHelperClass drawMultiLine(String o0, int o1, int o2){ return null; }
	public MyHelperClass createVertexData(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class BitmapFontData {

BitmapFontData(MyHelperClass o0, boolean o1){}
	BitmapFontData(){}}

class VertexData {

}

class DisplayMode {

DisplayMode(){}
	DisplayMode(int o0, int o1){}}

class RenderPass {

public MyHelperClass setClearMask(int o0){ return null; }
	public MyHelperClass setView(MyHelperClass o0){ return null; }
	public MyHelperClass setClearColor(Color4f o0){ return null; }
	public MyHelperClass getRootNode(){ return null; }}

class Color4f {

Color4f(){}
	Color4f(float o0, float o1, float o2, float o3){}}

class ByteBuffer {

}

class Texture {

Texture(MyHelperClass o0, int o1, MyHelperClass o2, MyHelperClass o3, int o4, MyHelperClass o5, ByteBuffer[][] o6, boolean o7, boolean o8){}
	Texture(){}}

class Shape {

Shape(VertexData o0){}
	Shape(){}
	public MyHelperClass getState(){ return null; }}

class Unit {

Unit(Texture o0){}
	Unit(){}}

class Renderer {

Renderer(SceneGraph o0){}
	Renderer(){}
	public MyHelperClass render(){ return null; }}

class SceneGraph {

SceneGraph(){}
	SceneGraph(RenderPass o0){}}
