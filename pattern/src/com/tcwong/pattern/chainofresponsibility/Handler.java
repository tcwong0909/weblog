package com.tcwong.pattern.chainofresponsibility;

public abstract class Handler<T> {
    protected Handler<T> next;

    public void next(Handler handler) {
        this.next = handler;
    }

    public abstract void doHandler(User user);

    public static class Builder<T> {
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler handler) {
            if (this.head == null) {
                this.head = handler;
                this.tail = handler;
            } else {
                this.tail.next(handler);
                this.tail = handler;
            }
            return this;
        }

        public Handler build() {
            return this.head;
        }

    }

}
