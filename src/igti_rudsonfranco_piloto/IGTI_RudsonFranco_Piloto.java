/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igti_rudsonfranco_piloto;



import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalyzeOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.CategoriesOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.ConceptsOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.DeleteModelOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.EmotionOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.EntitiesOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.KeywordsOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.ListModelsResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.MetadataOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.RelationsOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.SemanticRolesOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.SentimentOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;



        
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author xebec
 */
public class IGTI_RudsonFranco_Piloto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         NaturalLanguageUnderstanding service = new NaturalLanguageUnderstanding(
  "2018-03-16",
  "07dfab9a-163f-4e1c-aba5-8f0c78a20c58",
  "OyHTwC2aWr3L");

    String text = "Essa galinha é má.";

 

    SentimentOptions sentiment = new SentimentOptions.Builder().build();
    //EntitiesOptions entitiesOptions = new EntitiesOptions.Builder().emotion(true).sentiment(true).limit(2)
      //.build();

    //KeywordsOptions keywordsOptions = new KeywordsOptions.Builder().emotion(true).sentiment(true).limit(2)
      //.build();

    Features features = new Features.Builder().sentiment(sentiment).build();
    //Features features = new Features.Builder().entities(entitiesOptions).keywords(keywordsOptions).build();

    AnalyzeOptions parameters = new AnalyzeOptions.Builder().text(text).features(features).build();

    AnalysisResults response = service.analyze(parameters).execute();
    
    System.out.println(response);
        
    }
    
}
