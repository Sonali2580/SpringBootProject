//2. Create a spring boot project which create a calculator rest api to perform
 //  4 basic calculator operations
package edu.learning.thursdaylab.logic;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorForAddition {
@GetMapping("/calculator/addition")
public String additionNo(@RequestParam(value="firstParamForAdd",required=true,defaultValue="3")int firstParamForAdd ,
		@RequestParam(value="secondParamForAdd", required=true,defaultValue="2")int secondParamForAdd)
{
	return"</h2>Sum of two number is"+Calc.addNo(firstParamForAdd, secondParamForAdd)+"</h2>";
}



}
