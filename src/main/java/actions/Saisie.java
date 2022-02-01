package actions;

import com.opensymphony.xwork2.ActionSupport;

public class Saisie extends ActionSupport {

    private String pseudo;
    private String motSecret;

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setMotSecret(String motSecret) {
        this.motSecret = motSecret;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getMotSecret() {
        return motSecret;
    }

    @Override
    public String execute() throws Exception {
        if(pseudo.length()<3 || motSecret.length()<3){
            addFieldError("pseudo",getText("connexion.erreurTaille"));
            return INPUT;
        }


        return super.execute();
    }


}
