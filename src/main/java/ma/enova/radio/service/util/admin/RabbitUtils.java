package ma.enova.radio.service.util.admin;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RabbitUtils {
	
	public static <T> void convertAndSend(T t, String exchange, String routingkey, AmqpTemplate rabbitTemplate) {
		if (t != null) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				rabbitTemplate.convertAndSend(exchange, routingkey, mapper.writeValueAsString(t));
			} catch (AmqpException | JsonProcessingException e) {
				e.printStackTrace();
			}
		}
	}

}
