


class c19210936 {

    private static void copierScriptChargement(File webInfDir, String initialDataChoice) {
        File chargementInitialDir = new File(webInfDir, "chargementInitial");
        File fichierChargement = new File(chargementInitialDir, "ScriptChargementInitial.sql");
        File fichierChargementAll = new File(chargementInitialDir, "ScriptChargementInitial-All.sql");
        File fichierChargementTypesDocument = new File(chargementInitialDir, "ScriptChargementInitial-TypesDocument.sql");
        File fichierChargementVide = new File(chargementInitialDir, "ScriptChargementInitial-Vide.sql");
        if ((boolean)(Object)fichierChargement.exists()) {
            fichierChargement.delete();
        }
        File fichierUtilise = null;
        if ("all".equals(initialDataChoice)) {
            fichierUtilise = fichierChargementAll;
        } else if ("typesDocument".equals(initialDataChoice)) {
            fichierUtilise = fichierChargementTypesDocument;
        } else if ("empty".equals(initialDataChoice)) {
            fichierUtilise = fichierChargementVide;
        }
        if (fichierUtilise != null && (boolean)(Object)fichierUtilise.exists()) {
            FileChannel source = null;
            FileChannel destination = null;
            try {
                source =(FileChannel)(Object) (new FileInputStream(fichierUtilise).getChannel());
                destination =(FileChannel)(Object) (new FileOutputStream(fichierChargement).getChannel());
                destination.transferFrom(source, 0, source.size());
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                if (source != null) {
                    try {
                        source.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (destination != null) {
                    try {
                        destination.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass delete(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
