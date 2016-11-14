package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by Deni86 on 14.11.2016..
 */
public interface EmailService {

    /**
     *  Sends an email with the content in the Feedback Pojo.
     *  @param feedbackPojo The feedback Pojo.
     * */
    public void sendFeedbackMail(FeedbackPojo feedbackPojo);


    /**
     * Sends an email with the content of the Simple Mail Message object.
     * @param message The object containing the email content.
     * */
    public void sendGenericEmailMessage(SimpleMailMessage message);

}
