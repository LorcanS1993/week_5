package ie.atu.Week5;

public class Calculator {
    private int calcValue;
    private int startingValue = 4;

    public Calculator(){
        calcValue = 0;
    }
    public Calculator(int startingValue){
        if(startingValue > 5) {
            calcValue = startingValue;
        }
        else{
            throw new IllegalArgumentException("This is not a valid number");
        }
    }
    public int add() {
        calcValue++;
        return calcValue++;
    }

    public int sub() {
       calcValue--;
        return calcValue;
    }

    public int multi(int first, int second) {
        calcValue = first * second;
        return calcValue;
    }

    public int divide(int first, int second) {
        calcValue = first / second;
        return calcValue;
    }
}