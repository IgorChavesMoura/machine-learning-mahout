package br.com.linkapp.recommendator.recommend;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import br.com.linkapp.recommendator.builder.CustomRecommenderBuilder;
import br.com.linkapp.recommendator.recommender.CustomRecommender;

public class RecommendProducts {
	public static void main(String[] args) throws IOException, TasteException {
		
		DataModel products = new CustomRecommender().getProductsModel();
		

		Recommender recommender = new CustomRecommenderBuilder().buildRecommender(products);
		
		
		List<RecommendedItem> recommendations1 = recommender.recommend(1, 1);
		
		System.out.println("Usuario 1 \n");
		for (RecommendedItem recommendation : recommendations1) {
			System.out.println(recommendation);
		}
		
		List<RecommendedItem> recommendations3 = recommender.recommend(3, 1);
		
		System.out.println("Usuario 3 \n");
		for (RecommendedItem recommendation : recommendations3) {
			System.out.println(recommendation);
		}

		List<RecommendedItem> recommendations4 = recommender.recommend(4, 1);
		
		System.out.println("Usuario 4 \n");
		for (RecommendedItem recommendation : recommendations4) {
			System.out.println(recommendation);
		}

	}
}