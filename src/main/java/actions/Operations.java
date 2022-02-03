package actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.inject.Inject;
import modele.CalculatriceDynamiqueDuFutur;

import java.util.Collection;

public class Operations extends ActionSupport {

    private CalculatriceDynamiqueDuFutur facade;
    @Inject("facade")
    public void setFacade(CalculatriceDynamiqueDuFutur facade) {
        this.facade = facade;
    }

    public Collection<String> getLesOperations() {
        return facade.getOperations();
    }
}
