package dao;
import model.Patient;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.*;
class PatientRowMapper implements RowMapper<Patient>{

	public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Patient patient= new Patient();
		patient.setP_id(rs.getInt("p_id"));
		patient.setP_name(rs.getString("p_name"));
		patient.setP_gender(rs.getString("P_gender"));
		patient.setP_doc(rs.getString("p_doctor"));
		return patient;
	}
	
}
public class Daointerfaceimpl implements Daointerface {
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}





	public List<Patient> viewPatient() {
		String sql="select * from patient";
		List<Patient> patients= jdbcTemplate.query(sql, new PatientRowMapper());
		System.out.println(patients);
		return patients;
		
			}
				

		
	

	public String savePatient() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return null;
	}


}
