// Generated with g9.

package com.etron.springmvcrestful.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Inscription implements Serializable {

    /** Primary key. */
    protected static final String PK = "idInscription";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(unique=true, nullable=false, precision=10)
    private int idInscription;
    @Column(nullable=false, length=50)
    private String nom;
    @Column(nullable=false, length=50)
    private String prenom;
    @Column(nullable=false, length=30)
    private String email;
    @Column(nullable=false, length=10)
    private String mdp;
    @Column(nullable=false, length=150)
    private String adresse;
    @OneToMany(mappedBy="inscription")
    private Set<Abonnement> abonnement;

    /** Default constructor. */
    public Inscription() {
        super();
    }

    /**
     * Access method for idInscription.
     *
     * @return the current value of idInscription
     */
    public int getIdInscription() {
        return idInscription;
    }

    /**
     * Setter method for idInscription.
     *
     * @param aIdInscription the new value for idInscription
     */
    public void setIdInscription(int aIdInscription) {
        idInscription = aIdInscription;
    }

    /**
     * Access method for nom.
     *
     * @return the current value of nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter method for nom.
     *
     * @param aNom the new value for nom
     */
    public void setNom(String aNom) {
        nom = aNom;
    }

    /**
     * Access method for prenom.
     *
     * @return the current value of prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Setter method for prenom.
     *
     * @param aPrenom the new value for prenom
     */
    public void setPrenom(String aPrenom) {
        prenom = aPrenom;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * Access method for mdp.
     *
     * @return the current value of mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * Setter method for mdp.
     *
     * @param aMdp the new value for mdp
     */
    public void setMdp(String aMdp) {
        mdp = aMdp;
    }

    /**
     * Access method for adresse.
     *
     * @return the current value of adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Setter method for adresse.
     *
     * @param aAdresse the new value for adresse
     */
    public void setAdresse(String aAdresse) {
        adresse = aAdresse;
    }

    /**
     * Access method for abonnement.
     *
     * @return the current value of abonnement
     */
    public Set<Abonnement> getAbonnement() {
        return abonnement;
    }

    /**
     * Setter method for abonnement.
     *
     * @param aAbonnement the new value for abonnement
     */
    public void setAbonnement(Set<Abonnement> aAbonnement) {
        abonnement = aAbonnement;
    }

    /**
     * Compares the key for this instance with another Inscription.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Inscription and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Inscription)) {
            return false;
        }
        Inscription that = (Inscription) other;
        if (this.getIdInscription() != that.getIdInscription()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Inscription.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Inscription)) return false;
        return this.equalKeys(other) && ((Inscription)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getIdInscription();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Inscription |");
        sb.append(" idInscription=").append(getIdInscription());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idInscription", Integer.valueOf(getIdInscription()));
        return ret;
    }

}
