import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22728534 {

    private JButton getButtonImagen()  throws Throwable {
        MyHelperClass buttonImagen = new MyHelperClass();
        if (buttonImagen == null) {
//            MyHelperClass buttonImagen = new MyHelperClass();
            buttonImagen =(MyHelperClass)(Object) new JButton();
            MyHelperClass Messages = new MyHelperClass();
            buttonImagen.setText(Messages.getString("gui.AdministracionResorces.6"));
//            MyHelperClass buttonImagen = new MyHelperClass();
            buttonImagen.setIcon(new ImageIcon("data/icons/view_sidetree.png"));
//            MyHelperClass buttonImagen = new MyHelperClass();
            buttonImagen.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent e) {
                    JFileChooser fc = new JFileChooser();
                    fc.addChoosableFileFilter(new ImageFilter());
                    fc.setAccessory(new ImagePreview(fc));
                    MyHelperClass Messages = new MyHelperClass();
                    int returnVal = fc.showDialog(AdministracionResorces.this, Messages.getString("gui.AdministracionResorces.8"));
                    MyHelperClass JFileChooser = new MyHelperClass();
                    if (returnVal == (int)(Object)JFileChooser.APPROVE_OPTION) {
                        File file =(File)(Object) fc.getSelectedFile();
                        MyHelperClass rutaDatos = new MyHelperClass();
                        String rutaGlobal = System.getProperty("user.dir") + "/" + rutaDatos + "imagenes/" + file.getName();
//                        MyHelperClass rutaDatos = new MyHelperClass();
                        String rutaRelativa = rutaDatos + "imagenes/" + file.getName();
                        try {
                            FileInputStream fis = new FileInputStream(file);
                            FileOutputStream fos = new FileOutputStream(rutaGlobal, true);
                            FileChannel canalFuente =(FileChannel)(Object) fis.getChannel();
                            FileChannel canalDestino =(FileChannel)(Object) fos.getChannel();
                            canalFuente.transferTo(0, canalFuente.size(), canalDestino);
                            fis.close();
                            fos.close();
                            MyHelperClass imagen = new MyHelperClass();
                            imagen.setImagenURL(rutaRelativa);
                            MyHelperClass gui = new MyHelperClass();
                            gui.getEntrenamientoIzquierdaLabel().setIcon(gui.getProcesadorDatos().escalaImageIcon(((Imagen) gui.getComboBoxImagenesIzquierda().getSelectedItem()).getImagenURL()));
//                            MyHelperClass gui = new MyHelperClass();
                            gui.getEntrenamientoDerechaLabel().setIcon(gui.getProcesadorDatos().escalaImageIcon(((Imagen) gui.getComboBoxImagenesDerecha().getSelectedItem()).getImagenURL()));
                            MyHelperClass buttonImagen = new MyHelperClass();
                            buttonImagen.setIcon(new ImageIcon("data/icons/view_sidetreeOK.png"));
//                            MyHelperClass imagen = new MyHelperClass();
                            MyHelperClass labelImagenPreview = new MyHelperClass();
                            labelImagenPreview.setIcon(gui.getProcesadorDatos().escalaImageIcon(imagen.getImagenURL()));
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    } else {
                    }
                }
            });
        }
//        MyHelperClass buttonImagen = new MyHelperClass();
        return(JButton)(Object) buttonImagen;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass APPROVE_OPTION;
public MyHelperClass addActionListener(){ return null; }
	public MyHelperClass escalaImageIcon(MyHelperClass o0){ return null; }
	public MyHelperClass getEntrenamientoDerechaLabel(){ return null; }
	public MyHelperClass getSelectedItem(){ return null; }
	public MyHelperClass addActionListener(<anonymous ActionListener> o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass setText(MyHelperClass o0){ return null; }
	public MyHelperClass setImagenURL(String o0){ return null; }
	public MyHelperClass getComboBoxImagenesDerecha(){ return null; }
	public MyHelperClass getProcesadorDatos(){ return null; }
	public MyHelperClass getComboBoxImagenesIzquierda(){ return null; }
	public MyHelperClass getImagenURL(){ return null; }
	public MyHelperClass setIcon(ImageIcon o0){ return null; }
	public MyHelperClass getEntrenamientoIzquierdaLabel(){ return null; }}

class JButton {

}

class ImageIcon {

ImageIcon(String o0){}
	ImageIcon(){}}

class JFileChooser {

public MyHelperClass setAccessory(ImagePreview o0){ return null; }
	public MyHelperClass addChoosableFileFilter(ImageFilter o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }}

class ImageFilter {

}

class ImagePreview {

ImagePreview(JFileChooser o0){}
	ImagePreview(){}}

class AdministracionResorces {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class Imagen {

public MyHelperClass getImagenURL(){ return null; }}
