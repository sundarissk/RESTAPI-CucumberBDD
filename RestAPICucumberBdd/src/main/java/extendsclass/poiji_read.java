package extendsclass;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import com.poiji.bind.Poiji;
import com.poiji.option.PoijiOptions;

public class poiji_read {

	public Iterator<postskillapi_testdata> xcelread(String sname) {
		String xread = null;
		PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings().sheetName("postskillapi").build();
		List<postskillapi_testdata> vskill = Poiji.fromExcel(new File(
				"C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\src\\test\\resources\\TestData\\ApiBdd.xls"),
				postskillapi_testdata.class, options);

		for (int i = 0; i < 2; i++) {
			xread = vskill.get(i).getSkill();
			System.out.println(xread);
			System.out.println("*********************");
			// return vskill;
		}

		return vskill.iterator();

	}
}
