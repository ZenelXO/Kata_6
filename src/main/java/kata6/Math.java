package kata6;

public class Math {
    private String input1;
    private String operator;

    public Math(String input1, String operator) {
        this.input1 = input1;
        this.operator = operator;
    }

    public String execute(){
        int result=1;
        for(int i=1; i<=Integer.parseInt(input1); i++){
            result *= i;
        }
        return Integer.toString(result);
    }
}