package dev.loki.parkinglot.models;

import java.util.Date;
import java.util.List;

public class Bill extends id{
    private Ticket ticket;
    private Date exitTime;
    private double amount;
    private List<Payment> paymentList;
    private BillStatus paymentStatus;

}
