package co.in.nixlab.attendance_manager.models;

public class User {
    String _uid;
    String _name;
    String _email;
    String _uname;
    String _pass;
    String _user_type;

    public User() {
    }

    public User(String _uid, String _name, String _email, String _uname,
                String _pass, String _user_type) {
        this._uid = _uid;
        this._name = _name;
        this._email = _email;
        this._uname = _uname;
        this._pass = _pass;
        this._user_type = _user_type;
    }

    public User(String _name, String _email, String _uname,
                String _pass, String _user_type) {
        this._name = _name;
        this._email = _email;
        this._uname = _uname;
        this._pass = _pass;
        this._user_type = _user_type;
    }

    public User(String _pass) {
        this._pass = _pass;
    }

    public String get_uid() {
        return _uid;
    }

    public void set_uid(String _uid) {
        this._uid = _uid;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_uname() {
        return _uname;
    }

    public void set_uname(String _uname) {
        this._uname = _uname;
    }

    public String get_pass() {
        return _pass;
    }

    public void set_pass(String _pass) {
        this._pass = _pass;
    }

    public String getUser_type() {
        return _user_type;
    }

    public void setUser_type(String _user_type) {
        this._user_type = _user_type;
    }
}
