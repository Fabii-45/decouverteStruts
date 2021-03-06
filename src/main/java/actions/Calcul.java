package actions;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Objects;

public class Calcul extends ActionSupport {

    private double operand1;
    private double operand2;
    private String operation;
    private double resultat;

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getOperand1() {

        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public String getOperation() {
        return operation;
    }

    public double getResultat() {
        return resultat;
    }

    @Override
    public void validate() {
        if (operation.equals("Division") && operand2 == 0){
            addFieldError("operand2", getText("calculatricestatique.affichererreur"));
        }
    }

    @Override
    public String execute() throws Exception {
        switch (operation){
            case "Addition": {
                resultat = operand1 + operand2;
                break;
            }
            case "Soustraction": {
                resultat = operand1 - operand2;
                break;
            }
            case "Multiplication": {
                resultat = operand1 * operand2;
                break;
            }
            case "Division": {
                resultat = operand1 / operand2;
                break;
            }

        }
        return super.execute();
    }
}
