package actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.inject.Inject;
import modele.CalculatriceDynamiqueDuFutur;
import modele.exceptions.NonSupporteeException;

import java.util.Collection;

public class CalculDynamique extends ActionSupport {

    private double operand1;
    private double operand2;
    private String operation;
    private double resultat;
    private CalculatriceDynamiqueDuFutur facade;
    private long compteur;

    @Inject("facade")
    public void setFacade(CalculatriceDynamiqueDuFutur facade) {
        this.facade = facade;
    }

    public Collection<String> getLesOperations() {
        return facade.getOperations();
    }

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

    public CalculatriceDynamiqueDuFutur getFacade() {
        return facade;
    }

    public long getCompteur() {
        return compteur;
    }

    @Override
    public void validate() {
        if (operation.equals("Division") && operand2 == 0){
            addFieldError("operand2", getText("calculatricestatique.affichererreur"));
        }
    }

    @Override
    public String execute() throws Exception {
        resultat = facade.doCalcul(operation,operand1,operand2);
        compteur = facade.getValeurCompteur()+1;
        return super.execute();
    }

}
