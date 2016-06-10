import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.Span;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by shrikant
 */
public class mychatbot {
    public static void main(String[] args) throws IOException {
//        String paragraph = "Hi. How are you? This is Mike.";
//
//        // always start with a model, a model is learned from training data
//        InputStream is = new FileInputStream("G:\\nlp\\bins\\en-sent.bin");
//        SentenceModel model = new SentenceModel(is);
//        SentenceDetectorME sdetector = new SentenceDetectorME(model);
//
//        String sentences[] = sdetector.sentDetect(paragraph);
//
//        System.out.println(sentences[0]);
//        System.out.println(sentences[1]);
//        is.close();

//        // Tokenizing the sentence.
//
//        InputStream is = new FileInputStream("G:\\\\nlp\\\\bins\\\\en-token.bin");
//
//        TokenizerModel model = new TokenizerModel(is);
//
//        Tokenizer tokenizer = new TokenizerME(model);
//
//        String tokens[] = tokenizer.tokenize("Hi. How are you? This is Mike.");
//
//        for (String a : tokens)
//            System.out.println(a);
//
//        is.close();

        InputStream is = new FileInputStream("G:\\nlp\\bins\\en-ner-person.bin");

        TokenNameFinderModel model = new TokenNameFinderModel(is);
        is.close();

        NameFinderME nameFinder = new NameFinderME(model);

        String []sentence = new String[]{
                "Mike",
                "Smith",
                "is",
                "a",
                "good",
                "person"
        };

        Span nameSpans[] = nameFinder.find(sentence);

        for(Span s: nameSpans)
            System.out.println(s.toString());


    }
}
