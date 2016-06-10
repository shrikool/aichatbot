package web.controller;

import model.Message;
import nlp.ChatAnalyzerUtility;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by aichatbotteam
 */
@RestController
public class ChatController {
    @RequestMapping("/chat")
    public String chat(@RequestParam(value = "msg", defaultValue = "") String msg) throws IOException {
        StringBuilder sentAnalyzer = new StringBuilder();
        String[] tokens = ChatAnalyzerUtility.Tokenize(msg);
        for (String token : tokens) {
            sentAnalyzer.append(token);
            sentAnalyzer.append("\n");
        }
        return sentAnalyzer.toString();
    }
}
