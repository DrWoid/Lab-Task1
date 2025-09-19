class MyFirstClass {
    public static void main(String[] s) {

        MySecondClass o = new MySecondClass(20,2);
        System.out.println(o.thanos());

        for(int i=1;i<=8;i++){
            for(int j=1;j<=8;j++){
                o.setFirst(i);
                o.setSecond(j);
                System.out.print(o.thanos());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
class MySecondClass{
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
