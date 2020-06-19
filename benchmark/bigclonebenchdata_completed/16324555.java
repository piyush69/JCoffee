


class c16324555 {
public static MyHelperClass converterBytesEmHexa(byte[] o0){ return null; }
//public MyHelperClass converterBytesEmHexa(byte[] o0){ return null; }

    public static String gerarDigest(String mensagem) {
        String mensagemCriptografada = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            System.out.println("Mensagem original: " + mensagem);
            md.update(mensagem.getBytes());
            byte[] digest =(byte[])(Object) md.digest();
            mensagemCriptografada =(String)(Object) converterBytesEmHexa(digest);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mensagemCriptografada;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
