package my.com.jenkins.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "ph_sec_user", schema = "phisprod")
public class User {

	@Id
	@GeneratedValue
	@Column(name="usr_id")
	private Integer id;
	
	@Column(name="usr_loginname")
	private String usrLoginName;
	
	@Column(name="usr_firstname")
	private String usrFirstNamess;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsrLoginName() {
		return usrLoginName;
	}
	
	public void setUsrLoginName(String usrLoginName) {
		this.usrLoginName = usrLoginName;
	}
	
	public String getUsrFirstName() {
		return usrFirstNamess;
	}
	
	public void setUsrFirstName(String usrFirstName) {
		this.usrFirstNamess = usrFirstName;
	}
}
