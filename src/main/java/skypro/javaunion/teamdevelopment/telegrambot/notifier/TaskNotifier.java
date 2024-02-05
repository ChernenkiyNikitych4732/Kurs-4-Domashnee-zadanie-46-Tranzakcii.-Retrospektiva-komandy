package skypro.javaunion.teamdevelopment.telegrambot.notifier;

import skypro.javaunion.teamdevelopment.telegrambot.config.BotConfig;
import skypro.javaunion.teamdevelopment.telegrambot.service.TelegramBot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@EnableScheduling
public class TaskNotifier {
    private final static Logger logger = LoggerFactory.getLogger(TaskNotifier.class);
    private final BotConfig botConfig;
    private final TelegramBot bot;

    public TaskNotifier(BotConfig botConfig, TelegramBot bot) {
        this.botConfig = botConfig;
        this.bot = bot;
    }


    public Long getWaitingTimeForReportDays() {
        return botConfig.getWaitingTimeForReportDays();
    }

    //@Scheduled(cron = "0 0/1 * * * *")
    @Scheduled(timeUnit = TimeUnit.HOURS, fixedDelay = 2)
    public void notifyTask1() {
        System.out.println(" Метода -->  @Scheduled(timeUnit = TimeUnit.HOURS, fixedDelay = 2) \n " +
                "                  public void notifyTask1()  ЗАПУСТИЛСЯ !!!!! ");
    }
}