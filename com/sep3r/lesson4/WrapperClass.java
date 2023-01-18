package com.sep3r.lesson4;

//make parameterize type of wrapperClass
public class WrapperClass <T> {
    private T value;
    public WrapperClass() {
    }
    public WrapperClass(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
