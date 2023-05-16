package home_savyy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

public class MailConfig {

    @Bean
    public static JavaMailSenderImpl getMailConfig(){
        JavaMailSenderImpl emailConfig = new JavaMailSenderImpl();

        // Set Properties:
        Properties props = emailConfig.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        // Set Mail Credentials:
        emailConfig.setHost("sandbox.smtp.mailtrap.io");
        emailConfig.setPort(587);
        emailConfig.setUsername("a7cc9830cf8adf");
        emailConfig.setPassword("53a497be2ddc3f");

        return emailConfig;
    }
    // End Of Email Config Method.
}
