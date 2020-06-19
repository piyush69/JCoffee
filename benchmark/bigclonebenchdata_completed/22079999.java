
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22079999 {
public static MyHelperClass getLightColorScheme(String o0, Color[] o1){ return null; }
	public static MyHelperClass getDarkColorScheme(String o0, Color[] o1){ return null; }
//public MyHelperClass getDarkColorScheme(String o0, Color[] o1){ return null; }
//	public MyHelperClass getLightColorScheme(String o0, Color[] o1){ return null; }

    public static ColorSchemes getColorSchemes(URL url) {
        List schemes =(List)(Object) new ArrayList();
        BufferedReader reader = null;
        Color ultraLight = null;
        Color extraLight = null;
        Color light = null;
        Color mid = null;
        Color dark = null;
        Color ultraDark = null;
        Color foreground = null;
        String name = null;
        ColorSchemeKind kind = null;
        boolean inColorSchemeBlock = false;
        try {
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            while (true) {
                String line =(String)(Object) reader.readLine();
                if (line == null) break;
                line = line.trim();
                if (line.length() == 0) continue;
                if (line.startsWith("#")) {
                    continue;
                }
                if (line.indexOf("{") >= 0) {
                    if (inColorSchemeBlock) {
                        throw new IllegalArgumentException("Already in color scheme definition");
                    }
                    inColorSchemeBlock = true;
                    name = line.substring(0, line.indexOf("{")).trim();
                    continue;
                }
                if (line.indexOf("}") >= 0) {
                    if (!inColorSchemeBlock) {
                        throw new IllegalArgumentException("Not in color scheme definition");
                    }
                    inColorSchemeBlock = false;
                    if ((name == null) || (kind == null) || (ultraLight == null) || (extraLight == null) || (light == null) || (mid == null) || (dark == null) || (ultraDark == null) || (foreground == null)) {
                        throw new IllegalArgumentException("Incomplete specification");
                    }
                    Color[] colors = new Color[] { ultraLight, extraLight, light, mid, dark, ultraDark, foreground };
                    MyHelperClass ColorSchemeKind = new MyHelperClass();
                    if (kind == (ColorSchemeKind)(Object)ColorSchemeKind.LIGHT) {
                        schemes.add(getLightColorScheme(name, colors));
                    } else {
                        schemes.add(getDarkColorScheme(name, colors));
                    }
                    name = null;
                    kind = null;
                    ultraLight = null;
                    extraLight = null;
                    light = null;
                    mid = null;
                    dark = null;
                    ultraDark = null;
                    foreground = null;
                    continue;
                }
                String[] split = line.split("=");
                if (split.length != 2) {
                    throw new IllegalArgumentException("Unsupported format in line " + line);
                }
                String key = split[0].trim();
                String value = split[1].trim();
                if ("kind".equals(key)) {
                    if (kind == null) {
                        if ("Light".equals(value)) {
                            MyHelperClass ColorSchemeKind = new MyHelperClass();
                            kind =(ColorSchemeKind)(Object) ColorSchemeKind.LIGHT;
                            continue;
                        }
                        if ("Dark".equals(value)) {
                            MyHelperClass ColorSchemeKind = new MyHelperClass();
                            kind =(ColorSchemeKind)(Object) ColorSchemeKind.DARK;
                            continue;
                        }
                        throw new IllegalArgumentException("Unsupported format in line " + line);
                    }
                    throw new IllegalArgumentException("'kind' should only be defined once");
                }
                if ("colorUltraLight".equals(key)) {
                    if (ultraLight == null) {
                        MyHelperClass Color = new MyHelperClass();
                        ultraLight =(Color)(Object) Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'ultraLight' should only be defined once");
                }
                if ("colorExtraLight".equals(key)) {
                    if (extraLight == null) {
                        MyHelperClass Color = new MyHelperClass();
                        extraLight =(Color)(Object) Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'extraLight' should only be defined once");
                }
                if ("colorLight".equals(key)) {
                    if (light == null) {
                        MyHelperClass Color = new MyHelperClass();
                        light =(Color)(Object) Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'light' should only be defined once");
                }
                if ("colorMid".equals(key)) {
                    if (mid == null) {
                        MyHelperClass Color = new MyHelperClass();
                        mid =(Color)(Object) Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'mid' should only be defined once");
                }
                if ("colorDark".equals(key)) {
                    if (dark == null) {
                        MyHelperClass Color = new MyHelperClass();
                        dark =(Color)(Object) Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'dark' should only be defined once");
                }
                if ("colorUltraDark".equals(key)) {
                    if (ultraDark == null) {
                        MyHelperClass Color = new MyHelperClass();
                        ultraDark =(Color)(Object) Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'ultraDark' should only be defined once");
                }
                if ("colorForeground".equals(key)) {
                    if (foreground == null) {
                        MyHelperClass Color = new MyHelperClass();
                        foreground =(Color)(Object) Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'foreground' should only be defined once");
                }
                throw new IllegalArgumentException("Unsupported format in line " + line);
            }
            ;
        } catch (UncheckedIOException ioe) {
            throw new IllegalArgumentException(ioe);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (UncheckedIOException ioe) {
                }
            }
        }
        return new ColorSchemes(schemes);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DARK;
	public MyHelperClass LIGHT;
public MyHelperClass decode(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class List {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class SubstanceColorScheme {

}

class ArrayList {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class Color {

}

class ColorSchemeKind {

}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ColorSchemes {

ColorSchemes(){}
	ColorSchemes(List o0){}}
