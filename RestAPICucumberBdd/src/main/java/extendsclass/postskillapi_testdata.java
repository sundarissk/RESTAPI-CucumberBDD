package extendsclass;
import com.poiji.annotation.ExcelCellName;

public class postskillapi_testdata {
	@ExcelCellName("Skills")

	private String skill;

	public String getSkill() {
		return this.skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

}
