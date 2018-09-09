package com.github.xiejj.settlement.repositories;

import com.github.xiejj.settlement.domain.domain.SettlementBill;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
public interface SettlementBillRepository {
    SettlementBill settlemntBillBy(final String templateName, final Integer billNumber);
}
