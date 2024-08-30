package com.iiiiii.accountbook.store.command.domain.aggregate.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class RequestModifyGoodStoreVO {
    private String goodMenuName;
    private Integer goodMenuPrice;
}