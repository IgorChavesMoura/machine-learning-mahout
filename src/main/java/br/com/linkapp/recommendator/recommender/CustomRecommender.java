package br.com.linkapp.recommendator.recommender;

import java.io.File;
import java.io.IOException;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

public class CustomRecommender {
	
	private DataModel getModel(String path) throws IOException {
		File file = new File("src/main/resources/" + path);

		DataModel model = new FileDataModel(file);
		
		return model;
	}
	
	public DataModel getProductsModel() throws IOException{
		return getModel("dados.csv");
	}

	
	
	public DataModel getCoursesModel() throws IOException{
		return getModel("cursos2.csv");
	}
}
