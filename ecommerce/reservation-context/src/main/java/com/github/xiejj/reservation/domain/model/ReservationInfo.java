package com.github.xiejj.reservation.domain.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/11
 */
@Data
public class ReservationInfo {
    private Timestamp reservationTime;

    private String shopName;

    private
    private String commercailAddr;

    private String commercailPhone;
}
