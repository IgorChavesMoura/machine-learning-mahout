package br.com.linkapp.recommendator.recommend;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import br.com.linkapp.recommendator.builder.CustomRecommenderBuilder;
import br.com.linkapp.recommendator.recommender.CustomRecommender;

public class RecommendCourses {
	public static void main(String[] args) throws IOException, TasteException {
		DataModel courses = new CustomRecommender().getCoursesModel();
		 
		Recommender recommender = new CustomRecommenderBuilder().buildRecommender(courses);
		
		List<RecommendedItem> recommendations = recommender.recommend(15, 6);
		
		for(RecommendedItem recommendation : recommendations) {
			System.out.println(recommendation);
		}
	}
}
