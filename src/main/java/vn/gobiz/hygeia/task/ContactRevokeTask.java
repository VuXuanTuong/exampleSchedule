package vn.gobiz.hygeia.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class ContactRevokeTask {
    @Scheduled(cron = "${application.hygeia.cron.contact-Revoke-Task}")
    public void run() {
        System.out.println(String.format(" ExampleSchedule : %s", LocalDateTime.now().toString()));
    }
}
