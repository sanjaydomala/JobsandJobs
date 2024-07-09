package com.jobs.Data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentsV1 {
    private String userName;
    private String userAccount;
    private String accountType;
    private Long accountNo;
    private Long balance;
}
