public class Operacao {

    private double valor1;
    private double valor2;
    

    public Operacao(){
        this.valor1=0;
        this.valor2=0;
    }

    public void setValores(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public double getValor1(){
        return valor1;
    }

    public double getValor2(){
        return valor2;
    }

    public double getAdicao(){
        double res = 0;
        res = getValor1() + getValor2();
        return res;
    }

    public double getSubtracao(){
        double res = 0;
        res = getValor1() - getValor2();
        return res;
    }

    public double getMultiplicacao(){
        double res = 0;
        res = getValor1() * getValor2();
        return res;
    }

    public double getDivisao(){
        double res = 0;
        res = getValor1() / getValor2();
        return res;
    }


   
    
}
