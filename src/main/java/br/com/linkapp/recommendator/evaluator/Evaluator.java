package br.com.linkapp.recommendator.evaluator;

import java.io.IOException;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;

import br.com.linkapp.recommendator.builder.CustomRecommenderBuilder;
import br.com.linkapp.recommendator.recommender.CustomRecommender;

public class Evaluator {
	public static void main(String[] args) throws IOException, TasteException{
		
		RandomUtils.useTestSeed(); //Escolhe sempre os mesmos caras pra testar 
		
		DataModel model = new CustomRecommender().getCoursesModel();
		
		RecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
		RecommenderBuilder builder = new CustomRecommenderBuilder();
		double error = evaluator.evaluate(builder, null, model, 0.9,1.0);
		System.out.println(error);
	}
}