package com.iiiiii.accountbook.acc_group_post.command.domain.aggregate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccGroupPostVO {
    private int code;
    private String createdAt;
    private String title;
    private String detail;
    private int memberCode;
    private int accGroupCode;
}