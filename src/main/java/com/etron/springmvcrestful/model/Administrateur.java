// Generated with g9.

package com.etron.springmvcrestful.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Administrateur implements Serializable {

    /** Primary key. */
    protected static final String PK = "idAdministrateur";

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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int idAdministrateur;
    @Column(nullable=false, length=50)
    private String nom;
    @Column(nullable=false, length=50)
    private String prenom;
    @Column(nullable=false, length=60)
    private String email;
    @Column(nullable=false, length=10)
    private String mdp;

    /** Default constructor. */
    public Administrateur() {
        super();
    }

    /**
     * Access method for idAdministrateur.
     *
     * @return the current value of idAdministrateur
     */
    public int getIdAdministrateur() {
        return idAdministrateur;
    }

    /**
     * Setter method for idAdministrateur.
     *
     * @param aIdAdministrateur the new value for idAdministrateur
     */
    public void setIdAdministrateur(int aIdAdministrateur) {
        idAdministrateur = aIdAdministrateur;
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
     * Compares the key for this instance with another Administrateur.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Administrateur and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Administrateur)) {
            return false;
        }
        Administrateur that = (Administrateur) other;
        if (this.getIdAdministrateur() != that.getIdAdministrateur()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Administrateur.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Administrateur)) return false;
        return this.equalKeys(other) && ((Administrateur)other).equalKeys(this);
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
        i = getIdAdministrateur();
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
        StringBuffer sb = new StringBuffer("[Administrateur |");
        sb.append(" idAdministrateur=").append(getIdAdministrateur());
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
        ret.put("idAdministrateur", Integer.valueOf(getIdAdministrateur()));
        return ret;
    }

}
