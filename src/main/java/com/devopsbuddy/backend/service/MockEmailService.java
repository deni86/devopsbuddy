package com.devopsbuddy.backend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by Deni86 on 14.11.2016..
 */

/**
 * Mock implementation of an email service
 *
 * Created by deni86 on 12/11/2016.
 * */
public class MockEmailService extends AbstractEmailService {
    /** The application logger*/
    private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);


    @Override
    public void sendGenericEmailMessage(SimpleMailMessage message) {
        LOG.debug("Simulation an email service...");
        LOG.info(message.toString());
        LOG.debug("Email sent.");
    }
}
