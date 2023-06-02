package com.javarush.task.jdk13.task41.task4109;

public class CguRequisition extends RequisitionWithPhone {

    public String requestedSubscriptionType;
    public String language;

    public CguRequisition() {
    }

    public CguRequisition(CguRequisition cguRequisition) {
        super(cguRequisition);
        this.requestedSubscriptionType = cguRequisition.requestedSubscriptionType;
        this.language = cguRequisition.language;
    }

    @Override
    public AbstractEntity clone() {
        return new CguRequisition(this);
    }
}
