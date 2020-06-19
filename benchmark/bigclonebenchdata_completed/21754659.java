import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21754659 {

    private JButton getButtonSonido()  throws Throwable {
        MyHelperClass buttonSonido = new MyHelperClass();
        if (buttonSonido == null) {
//            MyHelperClass buttonSonido = new MyHelperClass();
            buttonSonido =(MyHelperClass)(Object) new JButton();
            MyHelperClass Messages = new MyHelperClass();
            buttonSonido.setText(Messages.getString("gui.AdministracionResorces.15"));
//            MyHelperClass buttonSonido = new MyHelperClass();
            buttonSonido.setIcon(new ImageIcon(getClass().getResource("/es/unizar/cps/tecnoDiscap/data/icons/view_sidetree.png")));
//            MyHelperClass buttonSonido = new MyHelperClass();
            buttonSonido.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent e) {
                    JFileChooser fc = new JFileChooser();
                    fc.addChoosableFileFilter(new SoundFilter());
                    MyHelperClass Messages = new MyHelperClass();
                    int returnVal = fc.showDialog(AdministracionResorces.this, Messages.getString("gui.AdministracionResorces.17"));
                    MyHelperClass JFileChooser = new MyHelperClass();
                    if (returnVal == (int)(Object)JFileChooser.APPROVE_OPTION) {
                        File file =(File)(Object) fc.getSelectedFile();
                        MyHelperClass rutaDatos = new MyHelperClass();
                        String rutaGlobal = System.getProperty("user.dir") + "/" + rutaDatos + "sonidos/" + file.getName();
//                        MyHelperClass rutaDatos = new MyHelperClass();
                        String rutaRelativa = rutaDatos + "sonidos/" + file.getName();
                        try {
                            FileInputStream fis = new FileInputStream(file);
                            FileOutputStream fos = new FileOutputStream(rutaGlobal, true);
                            FileChannel canalFuente =(FileChannel)(Object) fis.getChannel();
                            FileChannel canalDestino =(FileChannel)(Object) fos.getChannel();
                            canalFuente.transferTo(0, canalFuente.size(), canalDestino);
                            fis.close();
                            fos.close();
                            MyHelperClass imagen = new MyHelperClass();
                            imagen.setSonidoURL(rutaRelativa);
                            System.out.println(rutaGlobal + " " + rutaRelativa);
                            MyHelperClass buttonSonido = new MyHelperClass();
                            buttonSonido.setIcon(new ImageIcon(getClass().getResource("/es/unizar/cps/tecnoDiscap/data/icons/view_sidetreeOK.png")));
//                            MyHelperClass imagen = new MyHelperClass();
                            MyHelperClass gui = new MyHelperClass();
                            gui.getAudio().reproduceAudio(imagen);
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    } else {
                    }
                }
            });
        }
//        MyHelperClass buttonSonido = new MyHelperClass();
        return(JButton)(Object) buttonSonido;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass APPROVE_OPTION;
public MyHelperClass getAudio(){ return null; }
	public MyHelperClass addActionListener(<anonymous ActionListener> o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass setSonidoURL(String o0){ return null; }
	public MyHelperClass addActionListener(){ return null; }
	public MyHelperClass setText(MyHelperClass o0){ return null; }
	public MyHelperClass setIcon(ImageIcon o0){ return null; }}

class JButton {

}

class ImageIcon {

ImageIcon(URL o0){}
	ImageIcon(){}}

class JFileChooser {

public MyHelperClass addChoosableFileFilter(SoundFilter o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }}

class SoundFilter {

}

class AdministracionResorces {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}
