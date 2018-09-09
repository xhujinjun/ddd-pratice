package com.github.xiejj.settlement.gateways.persistence;

import com.github.xiejj.settlement.domain.domain.SettlementBill;
import com.github.xiejj.settlement.repositories.SettlementBillRepository;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
@Mapper
@Component
public class SettlementBillMapper implements SettlementBillRepository {
    @Override
    public SettlementBill settlemntBillBy(final String templateName, final Integer billNumber) {
        return null;
    }
}
