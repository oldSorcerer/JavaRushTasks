package com.javarush.task.jdk13.task41.task4109;

public abstract class RequisitionBase extends AbstractEntity {

    public User user;
    public String name;
    public String mail;
    public String utmMark;
    public String webinarType;
    public String promoCode;

    public RequisitionBase() {
    }

    public RequisitionBase(RequisitionBase requisitionBase) {
        super(requisitionBase);
        this.user = (User) requisitionBase.user.clone();
        this.name = requisitionBase.name;
        this.mail = requisitionBase.mail;
        this.utmMark = requisitionBase.utmMark;
        this.webinarType = requisitionBase.webinarType;
        this.promoCode = requisitionBase.promoCode;
    }
}
