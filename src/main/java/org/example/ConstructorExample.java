package org.example;

public class ConstructorExample {

    int exampleInt;

    public ConstructorExample(int exampleInt) {
        this.exampleInt = exampleInt;
    }




    void UsingThis() {
        ExampleMethodForThis(this);
    }

    void ExampleMethodForThis(ConstructorExample constructorExample) {

    }



}
