package com.order.notification.application;

import com.order.notification.core.dto.EmailDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "emailService", url = "http://localhost:8080/api/email")
public interface EmailService {

    @PostMapping()
    void sendEmail(@RequestBody EmailDto emailDto);

}
