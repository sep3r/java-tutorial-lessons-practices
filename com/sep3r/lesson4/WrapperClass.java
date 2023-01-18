package com.sep3r.lesson4;

//make parameterize type of wrapperClass
public class WrapperClass <T, N extends Number> {
    private T value;
    private N number;

    public WrapperClass(T value, N number) {
        this.value = value;
        this.number = number;
    }

    public WrapperClass() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public N getNumber() {
        return number;
    }

    public void setNumber(N number) {
        this.number = number;
    }
}
