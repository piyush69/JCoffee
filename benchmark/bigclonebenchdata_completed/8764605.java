


class c8764605 {

    public void test1() throws Exception {
        String senha = "minhaSenha";
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
        digest.update(senha.getBytes());
        byte[] bytes =(byte[])(Object) digest.digest();
        BASE64Encoder encoder = new BASE64Encoder();
        String senhaCodificada =(String)(Object) encoder.encode(bytes);
        System.out.println("Senha     : " + senha);
        System.out.println("Senha SHA1: " + senhaCodificada);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
