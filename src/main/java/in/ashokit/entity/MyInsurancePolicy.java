package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyInsurancePolicy  ////This will create a Table with name ===MY_INSURANCE_PLAN
{
	@Id
	@GeneratedValue
	private Integer planId; ///This will create a coloumn name ====PLAN_ID
	
	private String planName;
	
	private Integer planAmt;
	
	public MyInsurancePolicy(String planName,Integer planAmt)
	{
		this.planName=planName;
		this.planAmt=planAmt;
	}

}
