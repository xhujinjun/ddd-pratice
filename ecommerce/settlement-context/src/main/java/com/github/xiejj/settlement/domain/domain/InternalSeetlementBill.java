package com.github.xiejj.settlement.domain.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
@Data
public class InternalSeetlementBill implements SettlementBill {

    private String billNumber;
    private String newAndOldBillNumber;
    private String flightIdentity;
    private String flightNumber;
    private String flightRoute;
    private String scheduledDate;
    private String passengerClass;
    private List<Passenger> passengers;
    private String serviceReason;
    private List<CostDetail> costDetails;
    private BigDecimal totalCost;

    @Override
    public List<TemplateVariable> composeVariables() {
        return Arrays.asList(new TemplateVariable(0, 0, newAndOldBillNumber),
                new TemplateVariable(1, 0, flightIdentity),
                new TemplateVariable(1, 2, flightRoute));
    }

}
