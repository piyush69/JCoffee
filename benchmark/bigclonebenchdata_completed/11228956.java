import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11228956 {

    protected Model loadModel(URL url, String filenameBase, SourceModelType modelType, URL baseURL, String skin, float scale, int flags, AppearanceFactory appFactory, GeometryFactory geomFactory, NodeFactory nodeFactory, AnimationFactory animFactory, SpecialItemsHandler siHandler, Model model) throws Throwable, IOException, IncorrectFormatException, ParsingException {
        boolean convertZup2Yup = modelType.getConvertFlag(flags);
        switch(modelType) {
            MyHelperClass AC3D = new MyHelperClass();
            case AC3D:
                MyHelperClass AC3DPrototypeLoader = new MyHelperClass();
                AC3DPrototypeLoader.load(url.openStream(), baseURL, appFactory, geomFactory, nodeFactory, true, model, siHandler);
                break;
            MyHelperClass ASE = new MyHelperClass();
            case ASE:
                MyHelperClass AseReader = new MyHelperClass();
                AseReader.load(url.openStream(), baseURL, appFactory, geomFactory, convertZup2Yup, scale, nodeFactory, animFactory, siHandler, model);
                break;
            MyHelperClass BSP = new MyHelperClass();
            case BSP:
                MyHelperClass GroupType = new MyHelperClass();
                BSPPrototypeLoader.load(url.openStream(), filenameBase, baseURL, geomFactory, true, 0.03f, appFactory, nodeFactory, model, GroupType.BSP_TREE, siHandler);
                break;
            MyHelperClass CAL3D = new MyHelperClass();
            case CAL3D:
                break;
            MyHelperClass COLLADA = new MyHelperClass();
            case COLLADA:
                convertZup2Yup = true;
                MyHelperClass COLLADALoader = new MyHelperClass();
                COLLADALoader.load(baseURL, url.openStream(), appFactory, geomFactory, convertZup2Yup, scale, nodeFactory, animFactory, siHandler, model);
                break;
            MyHelperClass MD2 = new MyHelperClass();
            case MD2:
                MyHelperClass MD2File = new MyHelperClass();
                MD2File.load(url.openStream(), baseURL, appFactory, skin, geomFactory, convertZup2Yup, scale, nodeFactory, animFactory, siHandler, model);
                break;
            MyHelperClass MD3 = new MyHelperClass();
            case MD3:
                MyHelperClass MD3File = new MyHelperClass();
                MD3File.load(url.openStream(), baseURL, appFactory, geomFactory, convertZup2Yup, scale, nodeFactory, animFactory, siHandler, model);
                break;
            MyHelperClass MD5 = new MyHelperClass();
            case MD5:
                {
                    MyHelperClass MD5MeshReader = new MyHelperClass();
                    Object[][][] boneWeights = MD5MeshReader.load(url.openStream(), baseURL, appFactory, skin, geomFactory, convertZup2Yup, scale, nodeFactory, animFactory, siHandler, model);
                    ((SpecialItemsHandlerImpl) siHandler).flush();
                    List<URL> animResources = new ResourceLocator(baseURL).findAllResources("md5anim", true, false);
                    for (URL animURL : animResources) {
                        MyHelperClass LoaderUtils = new MyHelperClass();
                        String filename = LoaderUtils.extractFilenameWithoutExt(animURL);
                        MyHelperClass MD5AnimationReader = new MyHelperClass();
                        MD5AnimationReader.load(animURL.openStream(), filename, baseURL, appFactory, geomFactory, convertZup2Yup, scale, nodeFactory, model.getShapes(), boneWeights, animFactory, siHandler, model);
                    }
                }
                break;
            MyHelperClass MS3D = new MyHelperClass();
            case MS3D:
                break;
            MyHelperClass OBJ = new MyHelperClass();
            case OBJ:
                GroupNode rootGroup = model;
                if (scale != 1.0f) {
                    TransformGroup scaleGroup = new TransformGroup();
                    scaleGroup.getTransform().setScale(scale);
                    model.addChild(scaleGroup);
                    model.setMainGroup(scaleGroup);
                    rootGroup = scaleGroup;
                }
                MyHelperClass OBJPrototypeLoader = new MyHelperClass();
                OBJPrototypeLoader.load(url.openStream(), baseURL, appFactory, skin, geomFactory, convertZup2Yup, scale, nodeFactory, siHandler, rootGroup);
                break;
            MyHelperClass TDS = new MyHelperClass();
            case TDS:
                MyHelperClass TDSFile = new MyHelperClass();
                TDSFile.load(url.openStream(), baseURL, appFactory, geomFactory, convertZup2Yup, nodeFactory, animFactory, siHandler, model);
        }
        return (model);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SourceModelType {

}

class AppearanceFactory {

}

class GeometryFactory {

}

class NodeFactory {

}

class AnimationFactory {

}

class SpecialItemsHandler {

}

class Model {

}

class IncorrectFormatException extends Exception{
	public IncorrectFormatException(String errorMessage) { super(errorMessage); }
}

class ParsingException extends Exception{
	public ParsingException(String errorMessage) { super(errorMessage); }
}

class SpecialItemsHandlerImpl {

}

class ResourceLocator {

}

class GroupNode {

}

class TransformGroup {

}
