import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20926398 {
public MyHelperClass cursorArchiveFile;
	public MyHelperClass hotSpotYPrefix;
	public MyHelperClass log;
	public MyHelperClass timePrefix;

    public static Cursor load(URL url, String descriptor)  throws Throwable {
        if (url == null) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.WARNING, "Trying to load a cursor with a null url.");
            return null;
        }
        String cursorFile = url.getFile();
        BufferedReader reader = null;
        int lineNumber = 0;
        try {
            DirectoryTextureLoader loader;
            URL cursorUrl;
            MyHelperClass cursorDescriptorFile = new MyHelperClass();
            if (cursorFile.endsWith((String)(Object)cursorDescriptorFile)) {
                cursorUrl = url;
                MyHelperClass cursorCache = new MyHelperClass();
                Cursor cached = cursorCache.get(url);
                if (cached != null) return cached;
                reader = new BufferedReader(new InputStreamReader(url.openStream()));
                loader = new DirectoryTextureLoader(url, false);
            MyHelperClass cursorArchiveFile = new MyHelperClass();
            } else if (cursorFile.endsWith(cursorArchiveFile)) {
                loader = new DirectoryTextureLoader(url, true);
                MyHelperClass defaultDescriptorFile = new MyHelperClass();
                if (descriptor == null) descriptor =(String)(Object) defaultDescriptorFile;
                cursorUrl = loader.makeUrl(descriptor);
                MyHelperClass cursorCache = new MyHelperClass();
                Cursor cached = cursorCache.get(url);
                if (cached != null) return cached;
                ZipInputStream zis = new ZipInputStream(url.openStream());
                ZipEntry entry;
                boolean found = false;
                while ((entry = zis.getNextEntry()) != null) {
                    if (descriptor.equals(entry.getName())) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    throw new IOException("Descriptor file \"" + descriptor + "\" was not found.");
                }
                reader = new BufferedReader(new InputStreamReader((InputStream)(Object)zis));
            } else {
                MyHelperClass Level = new MyHelperClass();
                log.log(Level.WARNING, "Invalid cursor fileName \"{0}\".", cursorFile);
                return null;
            }
            Cursor cursor = new Cursor();
            cursor.url = cursorUrl;
            List<Integer> delays = new ArrayList<Integer>();
            List<String> frameFileNames = new ArrayList<String>();
            Map<String, Texture> textureCache = new HashMap<String, Texture>();
            String line;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                MyHelperClass commentString = new MyHelperClass();
                int commentIndex = line.indexOf((int)(Object)commentString);
                if (commentIndex != -1) {
                    line = line.substring(0, commentIndex);
                }
                MyHelperClass delims = new MyHelperClass();
                StringTokenizer tokens = new StringTokenizer(line,(String)(Object) delims);
                if (!tokens.hasMoreTokens()) continue;
                String prefix = tokens.nextToken();
                MyHelperClass hotSpotXPrefix = new MyHelperClass();
                if (prefix.equals(hotSpotXPrefix)) {
                    cursor.hotSpotOffset.x = Integer.valueOf(tokens.nextToken());
                MyHelperClass hotSpotYPrefix = new MyHelperClass();
                } else if (prefix.equals(hotSpotYPrefix)) {
                    cursor.hotSpotOffset.y = Integer.valueOf(tokens.nextToken());
                MyHelperClass timePrefix = new MyHelperClass();
                } else if (prefix.equals(timePrefix)) {
                    delays.add(Integer.valueOf(tokens.nextToken()));
                    MyHelperClass imagePrefix = new MyHelperClass();
                    if (tokens.nextToken().equals(imagePrefix)) {
                        String file = tokens.nextToken("");
                        file = file.substring(file.indexOf('=') + 1);
                        file.trim();
                        frameFileNames.add(file);
                        if (textureCache.get(file) == null) {
                            textureCache.put(file, loader.loadTexture(file));
                        }
                    } else {
                        throw new NoSuchElementException();
                    }
                }
            }
            cursor.frameFileNames = frameFileNames.toArray(new String[0]);
            cursor.textureCache = textureCache;
            cursor.delays = new int[delays.size()];
            cursor.images = new Image[frameFileNames.size()];
            cursor.textures = new Texture[frameFileNames.size()];
            for (int i = 0; i < cursor.frameFileNames.length; i++) {
                cursor.textures[i] = textureCache.get(cursor.frameFileNames[i]);
                cursor.images[i] = cursor.textures[i].getImage();
                cursor.delays[i] = delays.get(i);
            }
            if (delays.size() == 1) cursor.delays = null;
            if (cursor.images.length == 0) {
                MyHelperClass Level = new MyHelperClass();
                log.log(Level.WARNING, "The cursor has no animation frames.");
                return null;
            }
            cursor.width = cursor.images[0].getWidth();
            cursor.height = cursor.images[0].getHeight();
            MyHelperClass cursorCache = new MyHelperClass();
            cursorCache.put(cursor.url, cursor);
            return cursor;
        } catch (MalformedURLException mue) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.WARNING, "Unable to load cursor.", mue);
        } catch (IOException ioe) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.WARNING, "Unable to load cursor.", ioe);
        } catch (NumberFormatException nfe) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.WARNING, "Numerical error while parsing the " + "file \"{0}\" at line {1}", new Object[] { url, lineNumber });
        } catch (IndexOutOfBoundsException ioobe) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.WARNING, "Error, \"=\" expected in the file \"{0}\" at line {1}", new Object[] { url, lineNumber });
        } catch (NoSuchElementException nsee) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.WARNING, "Error while parsing the file \"{0}\" at line {1}", new Object[] { url, lineNumber });
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ioe) {
                    MyHelperClass Level = new MyHelperClass();
                    log.log(Level.SEVERE, "Unable to close the steam.", ioe);
                }
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
	public MyHelperClass SEVERE;
public MyHelperClass get(URL o0){ return null; }}

class Cursor {
public MyHelperClass url;
	public MyHelperClass hotSpotOffset;
	public MyHelperClass textureCache;
	public MyHelperClass textures;
	public MyHelperClass width;
	public MyHelperClass delays;
	public MyHelperClass frameFileNames;
	public MyHelperClass images;
	public MyHelperClass height;
}

class DirectoryTextureLoader {

DirectoryTextureLoader(URL o0, boolean o1){}
	DirectoryTextureLoader(){}
	public MyHelperClass loadTexture(String o0){ return null; }
	public MyHelperClass makeUrl(String o0){ return null; }}

class ZipInputStream {

ZipInputStream(InputStream o0){}
	ZipInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class Texture {

}

class Image {

}
