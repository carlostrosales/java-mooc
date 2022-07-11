/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.util.ArrayList;
/**
 *
 * @author Carlos
 */
public class MessagingService {
    
    ArrayList<Message> list = new ArrayList<>();
    
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            list.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.list;
    }
}
