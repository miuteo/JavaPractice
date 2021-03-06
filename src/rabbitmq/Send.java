package rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * Created by teodor.miu on 05-May-17.
 */
public class Send {
    private final static String QUEUE_NAME = "hello";
    public static void main(String[]argv)throws Exception{
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME,false,false,false,null);
        for(int i=0;i<1000;i++){
//            Thread.sleep(1000);
            String message = "["+i+"]Hello World!";
            channel.basicPublish("",QUEUE_NAME,null,message.getBytes());
            System.out.println("[x] Sent '"+message+"'");
        }



        channel.close();
        connection.close();
    }
}
