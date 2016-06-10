package web.controller;

import model.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aichatbotteam
 */
@RestController
public class ChatController {
    @RequestMapping("/chat")
    public String chat(@RequestParam(value = "msg", defaultValue = "") String msg){

        return "hello";
    }
}
