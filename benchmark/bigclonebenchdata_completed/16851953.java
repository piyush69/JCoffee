


class c16851953 {
public MyHelperClass assertTrue(String o0, boolean o1){ return null; }

//    @Test
    public void testTrainingDefault() throws IOException {
        MyHelperClass File = new MyHelperClass();
        File temp =(File)(Object) File.createTempFile("fannj_", ".tmp");
        temp.deleteOnExit();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy((InputStream)(Object)this.getClass().getResourceAsStream("xor.data"), new FileOutputStream(temp));
        List layers =(List)(Object) new ArrayList();
        MyHelperClass Layer = new MyHelperClass();
        layers.add(Layer.create(2));
        MyHelperClass ActivationFunction = new MyHelperClass();
        layers.add(Layer.create(3, ActivationFunction.FANN_SIGMOID_SYMMETRIC));
//        MyHelperClass ActivationFunction = new MyHelperClass();
        layers.add(Layer.create(1, ActivationFunction.FANN_SIGMOID_SYMMETRIC));
        Fann fann = new Fann(layers);
        Trainer trainer = new Trainer(fann);
        float desiredError = .001f;
        float mse =(float)(Object) trainer.train(temp.getPath(), 500000, 1000, desiredError);
        assertTrue("" + mse, mse <= desiredError);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FANN_SIGMOID_SYMMETRIC;
public MyHelperClass create(int o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass create(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Test {

}

class File {

public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class List {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class Layer {

}

class ArrayList {

}

class Fann {

Fann(){}
	Fann(List o0){}}

class Trainer {

Trainer(){}
	Trainer(Fann o0){}
	public MyHelperClass train(MyHelperClass o0, int o1, int o2, float o3){ return null; }}

class InputStream {

}
