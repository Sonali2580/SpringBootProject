//2. Create a spring boot project which create a calculator rest api to perform
 //  4 basic calculator operations
package edu.learning.thursdaylab.logic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorForDivision {
	@GetMapping("/calculator/division")
	public String additionNo(@RequestParam(value="firstParamForDiv",required=true,defaultValue="3")int firstParamForDiv ,
			@RequestParam(value="secondParamForDiv", required=true,defaultValue="2")int secondParamForDiv)
	{
		return"</h2>Sum of two number is"+Calc.addNo(firstParamForDiv, secondParamForDiv)+"</h2>";
	}

}
