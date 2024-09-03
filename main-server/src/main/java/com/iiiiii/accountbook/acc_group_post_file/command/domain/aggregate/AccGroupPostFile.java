package com.iiiiii.accountbook.acc_group_post_file.command.domain.aggregate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccGroupPostFile {
    private int code;
    private String name;
    private String path;
    private int accGroupPostCode;
}
