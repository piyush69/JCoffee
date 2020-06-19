
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9727050 {
public MyHelperClass precompCache;
	public MyHelperClass loadOBJFrames(String o0){ return null; }

    private PrecomputedAnimatedModel loadPrecomputedModel_(URL url) {
        MyHelperClass precompCache = new MyHelperClass();
        if ((boolean)(Object)precompCache.containsKey(url.toExternalForm())) {
//            MyHelperClass precompCache = new MyHelperClass();
            return ((PrecomputedAnimatedModel)(Object)precompCache.get(url.toExternalForm()).copy());
        }
        MyHelperClass TextureLoader = new MyHelperClass();
        TextureLoader.getInstance().getTexture("");
        List frames =(List)(Object) new ArrayList();
        Map animations =(Map)(Object) new Hashtable();
        if ((boolean)(Object)url.toExternalForm().endsWith(".amo")) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                String objFileName =(String)(Object) reader.readLine();
                objFileName = url.toExternalForm().substring(0, url.toExternalForm().lastIndexOf("/")) + "/" + objFileName;
                frames =(List)(Object) loadOBJFrames(objFileName);
                String line;
                while ((line =(String)(Object) reader.readLine()) != null) {
                    StringTokenizer tokenizer = new StringTokenizer(line);
                    String animName =(String)(Object) tokenizer.nextToken();
                    int from = Integer.valueOf((String)(Object)tokenizer.nextToken());
                    int to = Integer.valueOf((String)(Object)tokenizer.nextToken());
                    tokenizer.nextToken();
                    animations.put(animName, new Animation(animName, from, to));
                }
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            frames =(List)(Object) loadOBJFrames((String)(Object)url.toExternalForm());
        }
        PrecomputedAnimatedModel precompModel = new PrecomputedAnimatedModel(frames, animations);
        precompCache.put(url.toExternalForm(), precompModel);
        return (precompModel);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getTexture(String o0){ return null; }
	public MyHelperClass copy(){ return null; }
	public MyHelperClass put(MyHelperClass o0, PrecomputedAnimatedModel o1){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass containsKey(MyHelperClass o0){ return null; }
	public MyHelperClass substring(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class PrecomputedAnimatedModel {

PrecomputedAnimatedModel(List o0, Map o1){}
	PrecomputedAnimatedModel(){}}

class List {

}

class SharedGroup {

}

class ArrayList {

}

class Map {

public MyHelperClass put(String o0, Animation o1){ return null; }}

class Animation {

Animation(String o0, int o1, int o2){}
	Animation(){}}

class Hashtable {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class StringTokenizer {

StringTokenizer(String o0){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
