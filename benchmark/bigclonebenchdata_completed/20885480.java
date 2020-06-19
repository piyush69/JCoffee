import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20885480 {
public MyHelperClass isConverged(MyHelperClass o0, double o1, float o2, MyHelperClass o3){ return null; }
	public MyHelperClass evaluate(BufferedDocuments o0, String o1){ return null; }
public MyHelperClass FEAT_MODEL_GAMMA;
	public MyHelperClass output;
	public MyHelperClass FEATURES;
	public MyHelperClass CFG_OPT_HISTORY_SIZE;
	public MyHelperClass CFG_EVAL_METRICS;
	public MyHelperClass evaluation;
	public MyHelperClass minimize(GradientPoint o0, GradientPoint o1, GradientPoint o2, float o3, float o4, float o5, float o6, Random o7){ return null; }
	public MyHelperClass getRandomPoint(Random o0, GradientPoint o1, float o2, Object o3){ return null; }
	public MyHelperClass isConvergedWeights(GradientPoint o0, GradientPoint o1, float o2){ return null; }
	public MyHelperClass isConvergedScore(String o0, GradientPoint o1, GradientPoint o2, float o3){ return null; }

    private void anneal(final float maxGamma, final float gammaAccel, final float objectiveTolerance, final float objectiveAccel, final float scoreTolerance, final float paramTolerance, final float distanceLimit, final float randomLimit, final long randomSeed, final BufferedDocuments references, final int n, final int maxNbest, File stateFile, boolean keepState) {
        float gamma = 0;
        boolean annealObjective = true;
        double[] convergedScores = new double[n];
        double[] totalLogScores = new double[n];
        boolean[] isConverged = new boolean[n];
        GradientPoint[] initPoints = new GradientPoint[n];
        GradientPoint[] prevInitPoints = new GradientPoint[n];
        GradientPoint[] bestInitPoints = new GradientPoint[n];
        GradientPoint[] prevMinPoints = new GradientPoint[n];
        Random rand = new Random(randomSeed);
        Time time = new Time();
        if (stateFile != null && stateFile.length() > 0) {
            time.reset();
            try {
                ObjectInputStream stream = new ObjectInputStream(new FileInputStream(stateFile));
                gamma = stream.readFloat();
                annealObjective = stream.readBoolean();
                convergedScores = (double[]) stream.readObject();
                totalLogScores = (double[]) stream.readObject();
                isConverged = (boolean[]) stream.readObject();
                initPoints = (GradientPoint[]) stream.readObject();
                prevInitPoints = (GradientPoint[]) stream.readObject();
                bestInitPoints = (GradientPoint[]) stream.readObject();
                prevMinPoints = (GradientPoint[]) stream.readObject();
                rand = (Random) stream.readObject();
                int size = stream.readInt();
                for (int id = 0; id < size; id++) {
                    MyHelperClass CONFIG = new MyHelperClass();
                    Feature feature =(Feature)(Object) FEATURES.getRaw(CONFIG, stream.readUTF(), 0f);
                    if ((int)(Object)feature.getId() != id) throw new Exception("Features have changed");
                }
                MyHelperClass evaluation = new MyHelperClass();
                evaluation.read(stream);
                stream.close();
                MyHelperClass output = new MyHelperClass();
                output.println("# Resuming from previous optimization state (" + time + ")");
//                MyHelperClass output = new MyHelperClass();
                output.println();
            } catch (Exception e) {
                e.printStackTrace();
                MyHelperClass Log = new MyHelperClass();
                Log.getInstance().severe("Failed loading optimization state (" + stateFile + "): " + e.getMessage());
            }
        } else {
            final int evaluations =(int)(Object) CFG_OPT_HISTORY_SIZE.getValue();
            final GradientPoint[] randPoints = new GradientPoint[n * evaluations];
            for (int i = 0; i < n; i++) {
                MyHelperClass evaluation = new MyHelperClass();
                evaluation.setParallelId(i);
                for (int j = 0; j < evaluations; j++) {
                    if (i != 0) randPoints[i * n + j] =(GradientPoint)(Object) getRandomPoint(rand, randPoints[0], distanceLimit, null);
                    evaluate(references, i + ":" + j);
                    if (i == 0) {
//                        MyHelperClass evaluation = new MyHelperClass();
                        randPoints[0] = new GradientPoint(evaluation, null);
                        gamma =(float)(Object) FEAT_MODEL_GAMMA.getValue();
                        break;
                    }
                }
            }
            MyHelperClass evaluation = new MyHelperClass();
            for (int i = 0; i < randPoints.length; i++) if (randPoints[i] != null) randPoints[i] = new GradientPoint(evaluation, randPoints[i], output);
            for (int i = 0; i < n; i++) {
                prevInitPoints[i] = null;
                initPoints[i] = randPoints[i * n];
                if (i != 0) for (int j = 1; j < evaluations; j++) if ((int)(Object)randPoints[i * n + j].getScore() < (int)(Object)initPoints[i].getScore()) initPoints[i] = randPoints[i * n + j];
                bestInitPoints[i] = initPoints[i];
                convergedScores[i] = Float.MAX_VALUE;
            }
        }
        for (int searchCount = 1; ; searchCount++) {
            boolean isFinished = true;
            for (int i = 0; i < n; i++) isFinished = isFinished && isConverged[i];
            if (isFinished) {
                MyHelperClass output = new MyHelperClass();
                output.println("*** N-best list converged. Modifying annealing schedule. ***");
//                MyHelperClass output = new MyHelperClass();
                output.println();
                if (annealObjective) {
                    boolean objectiveConverged = true;
                    MyHelperClass SCORE_EPSILON = new MyHelperClass();
                    for (int i = 0; objectiveConverged && i < n; i++) objectiveConverged =(boolean)(Object) isConverged(bestInitPoints[i].getScore(), convergedScores[i], objectiveTolerance, SCORE_EPSILON);
                    annealObjective = false;
                    for (Metric metric :(Metric[])(Object) (Object[])(Object)CFG_EVAL_METRICS.getValue()) if ((boolean)(Object)metric.doAnnealing()) {
                        float weight =(float)(Object) metric.getWeight();
                        if (weight != 0) if (objectiveConverged) metric.setWeight(0); else {
                            annealObjective = true;
                            metric.setWeight(weight / objectiveAccel);
                        }
                    }
                }
                if (!annealObjective) {
                    if (Math.abs(gamma) >= maxGamma) {
                        GradientPoint bestPoint = bestInitPoints[0];
                        for (int i = 1; i < n; i++) if ((int)(Object)bestInitPoints[i].getScore() < (int)(Object)bestPoint.getScore()) bestPoint = bestInitPoints[i];
//                        MyHelperClass output = new MyHelperClass();
                        output.format("Best Score: %+.7g%n", bestPoint.getScore());
//                        MyHelperClass output = new MyHelperClass();
                        output.println();
                        MyHelperClass evaluation = new MyHelperClass();
                        bestPoint = new GradientPoint(evaluation, bestPoint, output);
                        break;
                    }
                    gamma *= gammaAccel;
                    MyHelperClass GAMMA_EPSILON = new MyHelperClass();
                    if (Math.abs(gamma) + (float)(Object)GAMMA_EPSILON >= maxGamma) gamma = gamma >= 0 ? maxGamma : -maxGamma;
                }
                for (int i = 0; i < n; i++) {
                    convergedScores[i] =(double)(Object) bestInitPoints[i].getScore();
                    MyHelperClass evaluation = new MyHelperClass();
                    initPoints[i] = new GradientPoint(evaluation, bestInitPoints[i], gamma, output);
                    bestInitPoints[i] = initPoints[i];
                    prevInitPoints[i] = null;
                    prevMinPoints[i] = null;
                    isConverged[i] = false;
                }
                searchCount = 0;
            }
            for (int i = 0; i < n; i++) {
                if (isConverged[i]) continue;
                MyHelperClass output = new MyHelperClass();
                if (n > 1) output.println("Minimizing point " + i);
                Gradient gradient =(Gradient)(Object) initPoints[i].getGradient();
                MyHelperClass FEATURES = new MyHelperClass();
                for (int id = 0; id < (int)(Object)FEATURES.size(); id++) output.format("GRAD %-65s %-+13.7g%n", FEATURES.getName(id), gradient.get(id));
//                MyHelperClass output = new MyHelperClass();
                output.println();
                time.reset();
                GradientPoint minPoint =(GradientPoint)(Object) minimize(initPoints[i], prevInitPoints[i], bestInitPoints[i], scoreTolerance, paramTolerance, distanceLimit, randomLimit, rand);
                final float[] weights =(float[])(Object) minPoint.getWeights();
//                MyHelperClass FEATURES = new MyHelperClass();
                for (int j = 0; j < weights.length; j++) output.format("PARM %-65s %-+13.7g%n", FEATURES.getName(j), weights[j]);
//                MyHelperClass output = new MyHelperClass();
                output.println();
//                MyHelperClass output = new MyHelperClass();
                output.format("Minimum Score: %+.7g (average distance of %.2f)%n", minPoint.getScore(), minPoint.getAverageDistance());
//                MyHelperClass output = new MyHelperClass();
                output.println();
//                MyHelperClass output = new MyHelperClass();
                output.println("# Minimized gradient (" + time + ")");
//                MyHelperClass output = new MyHelperClass();
                output.println();
//                MyHelperClass output = new MyHelperClass();
                output.flush();
                isConverged[i] = weights == (float[])(Object)initPoints[i].getWeights();
                prevInitPoints[i] = initPoints[i];
                prevMinPoints[i] = minPoint;
                initPoints[i] = minPoint;
            }
            for (int i = 0; i < n; i++) {
                if (isConverged[i]) continue;
                isConverged[i] =(Boolean)(Object) isConvergedScore("minimum", prevMinPoints[i], prevInitPoints[i], scoreTolerance) && (Boolean)(Object)isConvergedWeights(prevMinPoints[i], prevInitPoints[i], paramTolerance);
                MyHelperClass evaluation = new MyHelperClass();
                prevMinPoints[i].setWeightsAndRescore(evaluation);
//                MyHelperClass evaluation = new MyHelperClass();
                evaluation.setParallelId(i);
                evaluate(references, Integer.toString(i));
            }
            Set<Point> prunePoints = new HashSet<Point>();
            prunePoints.addAll((Collection<? extends Point>)(Object)Arrays.asList(bestInitPoints));
            prunePoints.addAll((Collection<? extends Point>)(Object)Arrays.asList(prevInitPoints));
            prunePoints.addAll((Collection<? extends Point>)(Object)Arrays.asList(initPoints));
            MyHelperClass output = new MyHelperClass();
            evaluation.prune(prunePoints, maxNbest, output);
            for (int i = 0; i < n; i++) {
                final boolean bestIsPrev = bestInitPoints[i] == prevInitPoints[i];
                final boolean bestIsInit = bestInitPoints[i] == initPoints[i];
                MyHelperClass evaluation = new MyHelperClass();
                bestInitPoints[i] = new GradientPoint(evaluation, bestInitPoints[i], bestIsInit ? output : null);
                if (bestIsPrev) prevInitPoints[i] = bestInitPoints[i];
                if (bestIsInit) initPoints[i] = bestInitPoints[i];
                if (!bestIsPrev && prevInitPoints[i] != null) {
//                    MyHelperClass evaluation = new MyHelperClass();
                    prevInitPoints[i] = new GradientPoint(evaluation, prevInitPoints[i], null);
                    if ((int)(Object)prevInitPoints[i].getScore() <= (int)(Object)bestInitPoints[i].getScore()) bestInitPoints[i] = prevInitPoints[i];
                }
                if (!bestIsInit) {
//                    MyHelperClass evaluation = new MyHelperClass();
                    initPoints[i] = new GradientPoint(evaluation, initPoints[i], output);
                    if ((int)(Object)initPoints[i].getScore() <= (int)(Object)bestInitPoints[i].getScore()) bestInitPoints[i] = initPoints[i];
                }
            }
            for (int i = 0; i < n; i++) if (isConverged[i]) if (prevMinPoints[i] == null) {
//                MyHelperClass output = new MyHelperClass();
                output.println("# Convergence failed: no previous minimum is defined");
//                MyHelperClass output = new MyHelperClass();
                output.println();
                isConverged[i] = false;
            } else {
                isConverged[i] =(Boolean)(Object) isConvergedScore("best known", bestInitPoints[i], initPoints[i], scoreTolerance) && (Boolean)(Object)isConvergedScore("previous minimum", prevMinPoints[i], initPoints[i], scoreTolerance);
            }
            if (stateFile != null) {
                time.reset();
                try {
                    File dir = stateFile.getCanonicalFile().getParentFile();
                    File temp = File.createTempFile("cunei-opt-", ".tmp", dir);
                    ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(temp));
                    stream.writeFloat(gamma);
                    stream.writeBoolean(annealObjective);
                    stream.writeObject(convergedScores);
                    stream.writeObject(totalLogScores);
                    stream.writeObject(isConverged);
                    stream.writeObject(initPoints);
                    stream.writeObject(prevInitPoints);
                    stream.writeObject(bestInitPoints);
                    stream.writeObject(prevMinPoints);
                    stream.writeObject(rand);
                    MyHelperClass FEATURES = new MyHelperClass();
                    stream.writeInt((int)(Object)FEATURES.size());
//                    MyHelperClass FEATURES = new MyHelperClass();
                    for (int id = 0; id < (int)(Object)FEATURES.size(); id++) stream.writeUTF((String)(Object)FEATURES.getName(id));
                    MyHelperClass evaluation = new MyHelperClass();
                    evaluation.write(stream);
                    stream.close();
                    if (!temp.renameTo(stateFile)) {
                        FileChannel in = null;
                        FileChannel out = null;
                        try {
                            in = (FileChannel)(Object)new FileInputStream(temp).getChannel();
                            out = (FileChannel)(Object)new FileOutputStream(stateFile).getChannel();
                            in.transferTo(0, in.size(), out);
                            temp.delete();
                        } finally {
                            if (in != null) in.close();
                            if (out != null) out.close();
                        }
                    }
//                    MyHelperClass output = new MyHelperClass();
                    output.println("# Saved optimization state (" + time + ")");
//                    MyHelperClass output = new MyHelperClass();
                    output.println();
                } catch (IOException e) {
                    MyHelperClass Log = new MyHelperClass();
                    Log.getInstance().severe("Failed writing optimization state: " + e.getMessage());
                }
            }
        }
        if (stateFile != null && !keepState) stateFile.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass setParallelId(int o0){ return null; }
	public MyHelperClass getName(int o0){ return null; }
	public MyHelperClass format(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass format(String o0, MyHelperClass o1, float o2){ return null; }
	public MyHelperClass getValue(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass format(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass println(){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass getRaw(MyHelperClass o0, String o1, float o2){ return null; }
	public MyHelperClass prune(Set<Point> o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(ObjectOutputStream o0){ return null; }
	public MyHelperClass read(ObjectInputStream o0){ return null; }}

class BufferedDocuments {

}

class Phrase {

}

class GradientPoint {

GradientPoint(MyHelperClass o0, Object o1){}
	GradientPoint(MyHelperClass o0, GradientPoint o1, float o2, MyHelperClass o3){}
	GradientPoint(){}
	GradientPoint(MyHelperClass o0, GradientPoint o1, MyHelperClass o2){}
	GradientPoint(MyHelperClass o0, GradientPoint o1, Object o2){}
	public MyHelperClass setWeightsAndRescore(MyHelperClass o0){ return null; }
	public MyHelperClass getGradient(){ return null; }
	public MyHelperClass getScore(){ return null; }
	public MyHelperClass getWeights(){ return null; }
	public MyHelperClass getAverageDistance(){ return null; }}

class Time {

public MyHelperClass reset(){ return null; }}

class Feature {

public MyHelperClass getId(){ return null; }}

class Gradient {

public MyHelperClass get(int o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class Metric {

public MyHelperClass doAnnealing(){ return null; }
	public MyHelperClass setWeight(int o0){ return null; }
	public MyHelperClass getWeight(){ return null; }
	public MyHelperClass setWeight(float o0){ return null; }}

class ProjectedSentenceEvaluation {

}
