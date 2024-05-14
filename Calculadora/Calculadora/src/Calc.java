public class Calc {
    //Criação de variável para armazenar primeiro valor;
    private int num1 = 0;
    //Criação de variável para armazenar segundo valor;
    private int num2 = 0;
    //Criação de variável para armazenar o operador;
    private char op;


    //Métodos gets e sets de cada variável, para que eu possa pegar e adicionar valor às variáveis;

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getOp() {
        return op;
    }
    public void setOp(char op) {
        this.op = op;
    }




}
