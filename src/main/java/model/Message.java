package model;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
/**
 * Created by aichatbotteam
 */
@AllArgsConstructor
public class Message {
    @Getter
    @Setter
    private String sessionId;
    private String message;
}
