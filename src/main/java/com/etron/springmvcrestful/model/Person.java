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
public class Person implements Serializable {

    /** Primary key. */
    protected static final String PK = "idPerson";

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
    private int idPerson;
    @Column(nullable=false, length=35)
    private String nom;
    @Column(nullable=false, length=35)
    private String prenom;
    @Column(nullable=false, length=60)
    private String adresse;
    @OneToMany(mappedBy="person")
    private Set<Inscription> inscription;

    /** Default constructor. */
    public Person() {
        super();
    }

    /**
     * Access method for idPerson.
     *
     * @return the current value of idPerson
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Setter method for idPerson.
     *
     * @param aIdPerson the new value for idPerson
     */
    public void setIdPerson(int aIdPerson) {
        idPerson = aIdPerson;
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
     * Access method for inscription.
     *
     * @return the current value of inscription
     */
    public Set<Inscription> getInscription() {
        return inscription;
    }

    /**
     * Setter method for inscription.
     *
     * @param aInscription the new value for inscription
     */
    public void setInscription(Set<Inscription> aInscription) {
        inscription = aInscription;
    }

    /**
     * Compares the key for this instance with another Person.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Person and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Person)) {
            return false;
        }
        Person that = (Person) other;
        if (this.getIdPerson() != that.getIdPerson()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Person.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Person)) return false;
        return this.equalKeys(other) && ((Person)other).equalKeys(this);
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
        i = getIdPerson();
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
        StringBuffer sb = new StringBuffer("[Person |");
        sb.append(" idPerson=").append(getIdPerson());
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
        ret.put("idPerson", Integer.valueOf(getIdPerson()));
        return ret;
    }

}
