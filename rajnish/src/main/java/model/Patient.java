package model;

public class Patient {
private int p_id;
private String p_name;
private String p_gender;
private String p_doc; //main doc supervising patient
public int getP_id() {
	return p_id;
}
public void setP_id(int p_id) {
	this.p_id = p_id;
}
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public String getP_gender() {
	return p_gender;
}
public void setP_gender(String string) {
	this.p_gender = string;
}
public String getP_doc() {
	return p_doc;
}
public void setP_doc(String p_doc) {
	this.p_doc = p_doc;
}

}
