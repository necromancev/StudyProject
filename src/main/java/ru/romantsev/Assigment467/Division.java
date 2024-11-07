package ru.romantsev.Assigment467;

public class Division extends Operation{
    @Override
    float operate(float first, float second) throws DividingByZeroException {
        if(second == 0){
            throw new DividingByZeroException("На ноль делить нельзя");
        }
        return first / second;
    }
}
