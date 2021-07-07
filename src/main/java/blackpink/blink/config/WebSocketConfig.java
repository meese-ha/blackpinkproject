package blackpink.blink.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;


@Configuration 
//websocket 서버를 상요한다는 설정 또한,
//websocketmessagebrockerconfigure를 상속 받아 몇몇 메소드를 구현하여 websocket 연결 속성을 설정한다.

public class WebSocketConfig{}
