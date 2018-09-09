package com.github.xiejj.settlement.web;

import com.github.xiejj.settlement.application.SettlementBillAppService;
import com.github.xiejj.settlement.web.model.ExportBillReviewRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
@RestController
@RequestMapping("/bill-review")
public class BillTemplateController {
    @Resource
    private SettlementBillAppService settlementBillAppService;

    @PostMapping("/export-template")
    public void exportBillReviewByTemplate(@RequestBody ExportBillReviewRequest request, HttpServletResponse response) {
        settlementBillAppService
                .exportByTemplate(request.getTemplateName(), request.getBillNumber(), response::getOutputStream);
    }
}
