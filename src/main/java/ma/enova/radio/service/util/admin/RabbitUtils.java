package ma.enova.radio.service.util.admin;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class RabbitUtils {
	
    private static AmqpTemplate rabbitTemplate;
    private static String exchange;
	private static String routingkey;
    
    
	
	public RabbitUtils(@Value("${rabbitmq.exchange}") String exchange , @Value("${rabbitmq.routingkey}") String routingkey ,AmqpTemplate rabbitTemplate) {
		this.exchange = exchange;
		this.routingkey = routingkey;
		this.rabbitTemplate = rabbitTemplate;
		
	}

	public static <T> void convertAndSend(T t) {
		if (t != null) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				rabbitTemplate.convertAndSend(exchange, routingkey, mapper.writeValueAsString(t));
			} catch (AmqpException | JsonProcessingException e) {
				e.printStackTrace();
			}
		}
	}

	@Autowired
	public AmqpTemplate getRabbitTemplate() {
		return rabbitTemplate;
	}

	public void setRabbitTemplate(AmqpTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}
	
}
