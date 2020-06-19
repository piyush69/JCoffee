import java.io.*;
import java.lang.*;
import java.util.*;



class c7911395 {
public MyHelperClass NULL;
public MyHelperClass recordAlbumData(Album o0, int o1){ return null; }
	public MyHelperClass prepareThumbsAndFTP(Photo[] o0, int o1, String o2){ return null; }
	public MyHelperClass prepareExtraFiles(Album o0, String o1){ return null; }
	public MyHelperClass fireChangesToGUI(Photo[] o0){ return null; }
	public MyHelperClass recordFotoData(Photo[] o0, int o1, int o2){ return null; }
public MyHelperClass PainelWebFotos;
	public MyHelperClass dispatchAlbum(){ return null; }

    public void executaAlteracoes() {
        MyHelperClass Album = new MyHelperClass();
        Album album =(Album)(Object) Album.getAlbum();
        Photo[] fotos =(Photo[])(Object) album.getFotos();
        Photo f;
        int ultimoFotoID = -1;
        int albumID =(int)(Object) album.getAlbumID();
        boolean sucesso =(boolean)(Object) NULL; //new boolean();
        sucesso = true;
        MyHelperClass PainelWebFotos = new MyHelperClass();
        PainelWebFotos.setCursorWait(true);
        albumID =(int)(Object) recordAlbumData(album, albumID);
//        MyHelperClass sucesso = new MyHelperClass();
        sucesso =(boolean)(Object) recordFotoData(fotos, ultimoFotoID, albumID);
        MyHelperClass Util = new MyHelperClass();
        String caminhoAlbum = Util.getFolder("albunsRoot").getPath() + File.separator + albumID;
        File diretorioAlbum = new File(caminhoAlbum);
        if (!diretorioAlbum.isDirectory()) {
            if (!diretorioAlbum.mkdir()) {
//                MyHelperClass Util = new MyHelperClass();
                Util.log("[AcaoAlterarAlbum.executaAlteracoes.7]/ERRO: diretorio " + caminhoAlbum + " n�o pode ser criado. abortando");
                return;
            }
        }
        for (int i = 0; i < fotos.length; i++) {
            f = fotos[i];
            if ((int)(Object)f.getCaminhoArquivo().length() > 0) {
                try {
                    FileChannel canalOrigem =(FileChannel)(Object) (new FileInputStream((String)(Object)f.getCaminhoArquivo()).getChannel());
                    FileChannel canalDestino =(FileChannel)(Object) (new FileOutputStream(caminhoAlbum + File.separator + f.getFotoID() + ".jpg").getChannel());
                    canalDestino.transferFrom(canalOrigem, 0, canalOrigem.size());
                    canalOrigem = null;
                    canalDestino = null;
                } catch (Exception e) {
//                    MyHelperClass Util = new MyHelperClass();
                    Util.log("[AcaoAlterarAlbum.executaAlteracoes.8]/ERRO: " + e);
//                    MyHelperClass sucesso = new MyHelperClass();
                    sucesso =(boolean)(Object)(MyHelperClass)(Object) false;
                }
            }
        }
        prepareThumbsAndFTP(fotos, albumID, caminhoAlbum);
        prepareExtraFiles(album, caminhoAlbum);
        fireChangesToGUI(fotos);
        dispatchAlbum();
        PainelWebFotos.setCursorWait(false);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass log(String o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass setCursorWait(boolean o0){ return null; }
	public MyHelperClass getAlbum(){ return null; }
	public MyHelperClass getFolder(String o0){ return null; }}

class Album {

public MyHelperClass getAlbumID(){ return null; }
	public MyHelperClass getFotos(){ return null; }}

class Photo {

public MyHelperClass getFotoID(){ return null; }
	public MyHelperClass getCaminhoArquivo(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}
