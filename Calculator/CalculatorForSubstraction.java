//2. Create a spring boot project which create a calculator rest api to perform
 //  4 basic calculator operations
package edu.learning.thursdaylab.logic;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//this class is for substraction
@RestController
public class CalculatorForSubstraction {
	@GetMapping("/calculator/sub")
	public String additionNo(@RequestParam(value="firstParamForSub",required=true,defaultValue="3")int firstParamForSub ,
			@RequestParam(value="secondParamForSub", required=true,defaultValue="2")int secondParamForSub)
	{
		return"</h2>Sum of two number is"+Calc.subNo(firstParamForSub, secondParamForSub)+"</h2>";
	}

}
