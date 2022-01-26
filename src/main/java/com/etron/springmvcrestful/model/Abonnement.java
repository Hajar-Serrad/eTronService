// Generated with g9.

package com.etron.springmvcrestful.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Abonnement implements Serializable {

    /** Primary key. */
    protected static final String PK = "idAbonnement";

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
    private int idAbonnement;
    @Column(nullable=false)
    private LocalDate dateDebut;
    @Column(nullable=false)
    private LocalDate dateFin;
    @ManyToOne(optional=false)
    @JoinColumn(name="idVehicule", nullable=false)
    private Vehicule vehicule;
    @ManyToOne(optional=false)
    @JoinColumn(name="idFormule", nullable=false)
    private Formule formule;
    @ManyToOne(optional=false)
    @JoinColumn(name="idInscription", nullable=false)
    private Inscription inscription;

    /** Default constructor. */
    public Abonnement() {
        super();
    }

    /**
     * Access method for idAbonnement.
     *
     * @return the current value of idAbonnement
     */
    public int getIdAbonnement() {
        return idAbonnement;
    }

    /**
     * Setter method for idAbonnement.
     *
     * @param aIdAbonnement the new value for idAbonnement
     */
    public void setIdAbonnement(int aIdAbonnement) {
        idAbonnement = aIdAbonnement;
    }

    /**
     * Access method for dateDebut.
     *
     * @return the current value of dateDebut
     */
    public LocalDate getDateDebut() {
        return dateDebut;
    }

    /**
     * Setter method for dateDebut.
     *
     * @param aDateDebut the new value for dateDebut
     */
    public void setDateDebut(LocalDate aDateDebut) {
        dateDebut = aDateDebut;
    }

    /**
     * Access method for dateFin.
     *
     * @return the current value of dateFin
     */
    public LocalDate getDateFin() {
        return dateFin;
    }

    /**
     * Setter method for dateFin.
     *
     * @param aDateFin the new value for dateFin
     */
    public void setDateFin(LocalDate aDateFin) {
        dateFin = aDateFin;
    }

    /**
     * Access method for vehicule.
     *
     * @return the current value of vehicule
     */
    public Vehicule getVehicule() {
        return vehicule;
    }

    /**
     * Setter method for vehicule.
     *
     * @param aVehicule the new value for vehicule
     */
    public void setVehicule(Vehicule aVehicule) {
        vehicule = aVehicule;
    }

    /**
     * Access method for formule.
     *
     * @return the current value of formule
     */
    public Formule getFormule() {
        return formule;
    }

    /**
     * Setter method for formule.
     *
     * @param aFormule the new value for formule
     */
    public void setFormule(Formule aFormule) {
        formule = aFormule;
    }

    /**
     * Access method for inscription.
     *
     * @return the current value of inscription
     */
    public Inscription getInscription() {
        return inscription;
    }

    /**
     * Setter method for inscription.
     *
     * @param aInscription the new value for inscription
     */
    public void setInscription(Inscription aInscription) {
        inscription = aInscription;
    }

    /**
     * Compares the key for this instance with another Abonnement.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Abonnement and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Abonnement)) {
            return false;
        }
        Abonnement that = (Abonnement) other;
        if (this.getIdAbonnement() != that.getIdAbonnement()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Abonnement.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Abonnement)) return false;
        return this.equalKeys(other) && ((Abonnement)other).equalKeys(this);
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
        i = getIdAbonnement();
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
        StringBuffer sb = new StringBuffer("[Abonnement |");
        sb.append(" idAbonnement=").append(getIdAbonnement());
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
        ret.put("idAbonnement", Integer.valueOf(getIdAbonnement()));
        return ret;
    }

}
