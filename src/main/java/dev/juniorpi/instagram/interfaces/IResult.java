package dev.juniorpi.instagram.interfaces;

public interface IResult<T> {
    T getResult();

    String getResultName();

    void setResult(T t);
}
