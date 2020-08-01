package com.test.externalFundTransfer;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class LoginDto
{
    private String amount;
    private String externalServicesId;
    private String fromAccountId;
    private String isoCurrency;
    private String narrative;
    private String toAccountId;
    private String websiteId;
}



