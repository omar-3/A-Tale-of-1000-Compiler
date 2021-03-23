package pascal.message;

import java.awt.*;

public class Message {
    /**
     * <h1>Message</h1>
     *
     * <p>Message format.</p>
     */
    private MessageType type;
    private Object body;

    /**
     * Constructor.
     * @param type the message type.
     * @param body the message body.
     */
    public Message(MessageType type, Object body)
    {
        this.type = type;
        this.body = body;
    }

}
