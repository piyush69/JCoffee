


class c6379126 {
public MyHelperClass escreverLicoesPage(File o0){ return null; }
	public MyHelperClass escreverCapitulosPages(File o0){ return null; }
	public MyHelperClass escreverMidiasPage(File o0){ return null; }
	public MyHelperClass copiarMidias(File o0, File o1){ return null; }
public MyHelperClass JOptionPane;
	public MyHelperClass criarDiretorioCss(){ return null; }
	public MyHelperClass criarDiretorioArquivos(){ return null; }
	public MyHelperClass criarDiretorioSite(){ return null; }
	public MyHelperClass escreverIndexHead(){ return null; }
	public MyHelperClass criarDiretorioCapitulos(){ return null; }
	public MyHelperClass escreverBodyHeader(){ return null; }
	public MyHelperClass escreverFooter(){ return null; }
	public MyHelperClass criarDiretorioLicoes(){ return null; }
	public MyHelperClass criarDiretorioMidias(){ return null; }
	public MyHelperClass escreverIndexBodyContent(){ return null; }

    public boolean gerarTutorialPage() {
        try {
            File indexDir =(File)(Object) criarDiretorioSite();
            File cssDir =(File)(Object) criarDiretorioCss();
            File capDir =(File)(Object) criarDiretorioCapitulos();
            File licDir =(File)(Object) criarDiretorioLicoes();
            File midDir =(File)(Object) criarDiretorioMidias();
            File filesDir =(File)(Object) criarDiretorioArquivos();
            File videosDir = new File(filesDir + "/videos");
            videosDir.mkdir();
            File imagensDir = new File(filesDir + "/imagens");
            imagensDir.mkdir();
            String local = System.getProperty("user.dir");
            FileChannel srcCss1 =(FileChannel)(Object) (new FileInputStream(local + "/bin/style/layout.css").getChannel());
            FileChannel destCss1 =(FileChannel)(Object) (new FileOutputStream(cssDir + "/layout.css").getChannel());
            destCss1.transferFrom(srcCss1, 0, srcCss1.size());
            srcCss1.close();
            destCss1.close();
            FileChannel srcCss2 =(FileChannel)(Object) (new FileInputStream(local + "/bin/style/elementos.css").getChannel());
            FileChannel destCss2 =(FileChannel)(Object) (new FileOutputStream(cssDir + "/elementos.css").getChannel());
            destCss2.transferFrom(srcCss2, 0, srcCss2.size());
            srcCss2.close();
            destCss2.close();
            FileChannel srcCss3 =(FileChannel)(Object) (new FileInputStream(local + "/bin/style/estilo-cap-lic-mid.css").getChannel());
            FileChannel destCss3 =(FileChannel)(Object) (new FileOutputStream(cssDir + "/estilo-cap-lic-mid.css").getChannel());
            destCss3.transferFrom(srcCss3, 0, srcCss3.size());
            srcCss3.close();
            destCss3.close();
            FileChannel srcCss4 =(FileChannel)(Object) (new FileInputStream(local + "/bin/style/layout_ie.css").getChannel());
            FileChannel destCss4 =(FileChannel)(Object) (new FileOutputStream(cssDir + "/layout_ie.css").getChannel());
            destCss4.transferFrom(srcCss4, 0, srcCss4.size());
            srcCss4.close();
            destCss4.close();
            FileChannel srcCss5 =(FileChannel)(Object) (new FileInputStream(local + "/bin/style/elementos_ie.css").getChannel());
            FileChannel destCss5 =(FileChannel)(Object) (new FileOutputStream(cssDir + "/elementos_ie.css").getChannel());
            destCss5.transferFrom(srcCss5, 0, srcCss5.size());
            srcCss5.close();
            destCss5.close();
            FileChannel srcCss6 =(FileChannel)(Object) (new FileInputStream(local + "/bin/style/estilo-cap-lic-mid_ie.css").getChannel());
            FileChannel destCss6 =(FileChannel)(Object) (new FileOutputStream(cssDir + "/estilo-cap-lic-mid_ie.css").getChannel());
            destCss6.transferFrom(srcCss6, 0, srcCss6.size());
            srcCss6.close();
            destCss6.close();
            copiarMidias(videosDir, imagensDir);
            escreverMidiasPage(midDir);
            escreverLicoesPage(licDir);
            escreverCapitulosPages(capDir);
            FileWriter indexHtml = new FileWriter(indexDir + "/index.html");
            indexHtml.write((int)(Object)escreverIndexHead() + (int)(Object)escreverBodyHeader() + (int)(Object)escreverIndexBodyContent() + (int)(Object)escreverFooter());
            indexHtml.close();
            System.out.println("Site gerado com sucesso");
            JOptionPane.showMessageDialog(null, "Web Site gerado com sucesso", "\\o/", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Site não gerado");
            JOptionPane.showMessageDialog(null, "Web Site não gerado corretamente", "Ops...", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdir(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
