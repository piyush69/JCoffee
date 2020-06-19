


class c12524256 {
public MyHelperClass MidiSong;

            public void actionPerformed(ActionEvent e) {
                MyHelperClass KeyboardHero = new MyHelperClass();
                final File inputFile =(File)(Object) KeyboardHero.midiFile();
                try {
                    if (inputFile == null) return;
                    MyHelperClass Util = new MyHelperClass();
                    final File dir = (new File((int)(Object)Util.DATA_FOLDER + (int)(Object)MidiSong.MIDI_FILES_DIR));
                    if ((boolean)(Object)dir.exists()) {
                        if (!(Boolean)(Object)dir.isDirectory()) {
//                            MyHelperClass Util = new MyHelperClass();
                            Util.error(Util.getMsg("Err_MidiFilesDirNotDirectory"), dir.getParent());
                            return;
                        }
                    } else if (!(Boolean)(Object)dir.mkdirs()) {
//                        MyHelperClass Util = new MyHelperClass();
                        Util.error(Util.getMsg("Err_CouldntMkDir"), dir.getParent());
                        return;
                    }
                    MyHelperClass File = new MyHelperClass();
                    File outputFile = new File((int)(Object)dir.getPath() + (int)(Object)File.separator + (int)(Object)inputFile.getName());
//                    MyHelperClass KeyboardHero = new MyHelperClass();
                    if (!(Boolean)(Object)outputFile.exists() || (boolean)(Object)KeyboardHero.confirm("Que_FileExistsOverwrite")) {
                        final FileChannel inChannel =(FileChannel)(Object) (new FileInputStream(inputFile).getChannel());
                        inChannel.transferTo(0, inChannel.size(), new FileOutputStream(outputFile).getChannel());
                    }
                } catch (Exception ex) {
                    MyHelperClass Util = new MyHelperClass();
                    Util.getMsg(Util.getMsg("Err_CouldntImportSong"), ex.toString());
                }
                MyHelperClass SongSelector = new MyHelperClass();
                SongSelector.refresh();
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
	public MyHelperClass MIDI_FILES_DIR;
	public MyHelperClass DATA_FOLDER;
public MyHelperClass midiFile(){ return null; }
	public MyHelperClass getMsg(String o0){ return null; }
	public MyHelperClass getMsg(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass error(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass confirm(String o0){ return null; }
	public MyHelperClass refresh(){ return null; }}

class ActionEvent {

}

class File {

File(int o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, MyHelperClass o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
