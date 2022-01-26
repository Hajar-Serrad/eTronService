// Generated with g9.

package com.etron.springmvcrestful.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Vehicule implements Serializable {

    /** Primary key. */
    protected static final String PK = "idVehicule";

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
    private int idVehicule;
    @Column(nullable=false)
    private LocalDate dateAchat;
    @Column(nullable=false, length=20)
    private String pointAchat;
    @OneToMany(mappedBy="vehicule")
    private Set<Abonnement> abonnement;

    /** Default constructor. */
    public Vehicule() {
        super();
    }

    /**
     * Access method for idVehicule.
     *
     * @return the current value of idVehicule
     */
    public int getIdVehicule() {
        return idVehicule;
    }

    /**
     * Setter method for idVehicule.
     *
     * @param aIdVehicule the new value for idVehicule
     */
    public void setIdVehicule(int aIdVehicule) {
        idVehicule = aIdVehicule;
    }

    /**
     * Access method for dateAchat.
     *
     * @return the current value of dateAchat
     */
    public LocalDate getDateAchat() {
        return dateAchat;
    }

    /**
     * Setter method for dateAchat.
     *
     * @param aDateAchat the new value for dateAchat
     */
    public void setDateAchat(LocalDate aDateAchat) {
        dateAchat = aDateAchat;
    }

    /**
     * Access method for pointAchat.
     *
     * @return the current value of pointAchat
     */
    public String getPointAchat() {
        return pointAchat;
    }

    /**
     * Setter method for pointAchat.
     *
     * @param aPointAchat the new value for pointAchat
     */
    public void setPointAchat(String aPointAchat) {
        pointAchat = aPointAchat;
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
     * Compares the key for this instance with another Vehicule.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Vehicule and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Vehicule)) {
            return false;
        }
        Vehicule that = (Vehicule) other;
        if (this.getIdVehicule() != that.getIdVehicule()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Vehicule.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Vehicule)) return false;
        return this.equalKeys(other) && ((Vehicule)other).equalKeys(this);
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
        i = getIdVehicule();
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
        StringBuffer sb = new StringBuffer("[Vehicule |");
        sb.append(" idVehicule=").append(getIdVehicule());
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
        ret.put("idVehicule", Integer.valueOf(getIdVehicule()));
        return ret;
    }

}
