package org.lenny.behavioural.chainofresponsibility;

public class PayloadHandler implements HandlerChain {

    String payload;
    private HandlerChain next;

    public PayloadHandler(String payload) {
        this.payload = payload;
    }

    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader + "\n" + payload;
        if (next == null)
            return outputHeader;
        else
            return next.addHandler(outputHeader);
    }

    public void setNext(HandlerChain next) {
        this.next = next;
    }
}
