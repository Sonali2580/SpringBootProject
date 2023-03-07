//2. Create a spring boot project which create a calculator rest api to perform
 //  4 basic calculator operations
package edu.learning.thursdaylab.logic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorForMultiplication {
	@GetMapping("/calculator/multi")
	public String additionNo(@RequestParam(value="firstParamForMul",required=true,defaultValue="3")int firstParamForMul ,
			@RequestParam(value="secondParamForMul", required=true,defaultValue="2")int secondParamForMul)
	{
		return"</h2>Sum of two number is"+Calc.addNo(firstParamForMul, secondParamForMul)+"</h2>";
	}

}
