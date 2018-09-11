package com.github.xiejj.settlement.domain.model;

import java.util.List;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
public interface SettlementBill {

    List<TemplateVariable> composeVariables();
}
