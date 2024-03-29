package kata6;

public class MathBoard {
    private String input1;
    private String operator;
    private String input2;

    public MathBoard(String input1, String operator, String input2) {
        this.input1 = input1;
        this.operator = operator;
        this.input2 = input2;
    }

    public String execute(){
        switch (operator){
            case "!":
                return factorial();
            case "^":
                return pow();
        }
        return "No se encuentra el operador";
    }

    public String factorial(){
        int result=0;
        if(Integer.parseInt(input1) > 0){
            result=1;
            for(int i=1; i<=Integer.parseInt(input1); i++){
                result *= i;
            }
        }else{
            result=-1;
            for(int i=1; i<=-Integer.parseInt(input1); i++){
                result *= i;
            }
        }
        return Integer.toString(result);
    }

    public String pow(){
        double result = Math.pow(Integer.parseInt(input1), Integer.parseInt(input2));
        return Double.toString(result);
    }
}