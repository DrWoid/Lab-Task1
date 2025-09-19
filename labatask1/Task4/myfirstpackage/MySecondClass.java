package myfirstpackage;
public class MySecondClass{
    private int first;
    private int second;

    public MySecondClass(int first,int second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(int n){
        this.first = n;
    }
    public void setSecond(int n){
        this.second = n;
    }

    public int getFirst(){
        return first;
    }
    public int getSecond(){
        return second;
    }
    /*мой комментарий :)*/
    /*вариант на 3 задание :4 "целочисленное деление"*/
    public int thanos(){
        return first/second;
    }

}