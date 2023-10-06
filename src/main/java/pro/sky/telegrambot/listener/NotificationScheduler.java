package pro.sky.telegrambot.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class NotificationScheduler {
    private static Logger logger = LoggerFactory.getLogger(NotificationScheduler.class);


    @Scheduled(fixedDelay = 5000L)
    public void scheduler(){
        logger.info("scheduler");
    }
}
