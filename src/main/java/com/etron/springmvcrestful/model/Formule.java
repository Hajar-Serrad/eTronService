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
public class Formule implements Serializable {

    /** Primary key. */
    protected static final String PK = "idFormule";

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
    private int idFormule;
    @Column(nullable=false, length=10)
    private String type;
    @Column(nullable=false, precision=12)
    private float base;
    @Column(nullable=false, precision=12)
    private float charge22;
    @Column(nullable=false, precision=12)
    private float charge50;
    @Column(nullable=false, precision=12)
    private float ionity;
    @OneToMany(mappedBy="formule")
    private Set<Abonnement> abonnement;

    /** Default constructor. */
    public Formule() {
        super();
    }

    /**
     * Access method for idFormule.
     *
     * @return the current value of idFormule
     */
    public int getIdFormule() {
        return idFormule;
    }

    /**
     * Setter method for idFormule.
     *
     * @param aIdFormule the new value for idFormule
     */
    public void setIdFormule(int aIdFormule) {
        idFormule = aIdFormule;
    }

    /**
     * Access method for type.
     *
     * @return the current value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter method for type.
     *
     * @param aType the new value for type
     */
    public void setType(String aType) {
        type = aType;
    }

    /**
     * Access method for base.
     *
     * @return the current value of base
     */
    public float getBase() {
        return base;
    }

    /**
     * Setter method for base.
     *
     * @param aBase the new value for base
     */
    public void setBase(float aBase) {
        base = aBase;
    }

    /**
     * Access method for charge22.
     *
     * @return the current value of charge22
     */
    public float getCharge22() {
        return charge22;
    }

    /**
     * Setter method for charge22.
     *
     * @param aCharge22 the new value for charge22
     */
    public void setCharge22(float aCharge22) {
        charge22 = aCharge22;
    }

    /**
     * Access method for charge50.
     *
     * @return the current value of charge50
     */
    public float getCharge50() {
        return charge50;
    }

    /**
     * Setter method for charge50.
     *
     * @param aCharge50 the new value for charge50
     */
    public void setCharge50(float aCharge50) {
        charge50 = aCharge50;
    }

    /**
     * Access method for ionity.
     *
     * @return the current value of ionity
     */
    public float getIonity() {
        return ionity;
    }

    /**
     * Setter method for ionity.
     *
     * @param aIonity the new value for ionity
     */
    public void setIonity(float aIonity) {
        ionity = aIonity;
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
     * Compares the key for this instance with another Formule.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Formule and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Formule)) {
            return false;
        }
        Formule that = (Formule) other;
        if (this.getIdFormule() != that.getIdFormule()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Formule.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Formule)) return false;
        return this.equalKeys(other) && ((Formule)other).equalKeys(this);
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
        i = getIdFormule();
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
        StringBuffer sb = new StringBuffer("[Formule |");
        sb.append(" idFormule=").append(getIdFormule());
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
        ret.put("idFormule", Integer.valueOf(getIdFormule()));
        return ret;
    }

}
