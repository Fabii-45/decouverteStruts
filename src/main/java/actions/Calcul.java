package actions;

import com.opensymphony.xwork2.ActionSupport;

public class Calcul extends ActionSupport {

    private double operand1;
    private double operand2;
    private String operation;

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

    @Override
    public String execute() throws Exception {
        switch (operation){
            case "Addition": {
                double resultat = operand1 + operand2;
                break;
            }
            case "Soustraction": {
                double resultat = operand1 - operand2;
                break;
            }
            case "Multiplication": {
                double resultat = operand1 * operand2;
                break;
            }
            case "Division": {
                double resultat = operand1 / operand2;
                break;
            }

            addFieldError("resultat",getText("calculatricestatique."));
            return INPUT;
        }
        return super.execute();
    }
}
