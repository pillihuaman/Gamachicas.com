/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.System.BusinessEntity.Base;

/**
 *
 * @author zarmir
 */
public class UserBE {
private Number _iduser ;
private String _name;
private  String  _alias;
private  String  _password;
private  String _token;
private String _firstname;
private  String _secondName;
private  String _email;
private String _phone;
private Boolean _status;

    /**
     * @return the _iduser
     */
    public Number getIduser() {
        return _iduser;
    }

    /**
     * @param _iduser the _iduser to set
     */
    public void setIduser(Number _iduser) {
        this._iduser = _iduser;
    }

    /**
     * @return the _name
     */
    public String getName() {
        return _name;
    }

    /**
     * @param _name the _name to set
     */
    public void setName(String _name) {
        this._name = _name;
    }

    /**
     * @return the _alias
     */
    public String getAlias() {
        return _alias;
    }

    /**
     * @param _alias the _alias to set
     */
    public void setAlias(String _alias) {
        this._alias = _alias;
    }

    /**
     * @return the _password
     */
    public String getPassword() {
        return _password;
    }

    /**
     * @param _password the _password to set
     */
    public void setPassword(String _password) {
        this._password = _password;
    }

    /**
     * @return the _token
     */
    public String getToken() {
        return _token;
    }

    /**
     * @param _token the _token to set
     */
    public void setToken(String _token) {
        this._token = _token;
    }

    /**
     * @return the _firstname
     */
    public String getFirstname() {
        return _firstname;
    }

    /**
     * @param _firstname the _firstname to set
     */
    public void setFirstname(String _firstname) {
        this._firstname = _firstname;
    }

    /**
     * @return the _secondName
     */
    public String getSecondName() {
        return _secondName;
    }

    /**
     * @param _secondName the _secondName to set
     */
    public void setSecondName(String _secondName) {
        this._secondName = _secondName;
    }

    /**
     * @return the _Email
     */
    public String getEmail() {
        return _email;
    }

    /**
     * @param _Email the _Email to set
     */
    public void setEmail(String _Email) {
        this._email = _Email;
    }

    /**
     * @return the _phone
     */
    public String getPhone() {
        return _phone;
    }

    /**
     * @param _phone the _phone to set
     */
    public void setPhone(String _phone) {
        this._phone = _phone;
    }

    /**
     * @return the _status
     */
    public Boolean getStatus() {
        return _status;
    }

    /**
     * @param _status the _status to set
     */
    public void setStatus(Boolean _status) {
        this._status = _status;
    }
    
}
