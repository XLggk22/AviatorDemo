package my.test.aviator.AviatorDemo;

import java.util.HashMap;
import java.util.Map;

import com.googlecode.aviator.AviatorEvaluator;

/**
 * Hello world!
 *
 */
public class Test {
	public static void main(String[] args) {
		//比较运算
		Boolean execute = (Boolean)AviatorEvaluator.execute("0<500 && 500<=5000");
		if(execute){
			System.out.println("你妹");
		}
		System.out.println(execute);
		
		//算术表达式
		Long result = (Long)AviatorEvaluator.execute("1+2+3");
		System.out.println(result);//6
		
		//变量和字符串相加
		//传入map
		Map<String, Object> env = new HashMap<>();
		env.put("yourname","aviator");
		String result3 = (String)AviatorEvaluator.execute(" 'hello ' + yourname ", env);
		System.out.println(result3);
		//传入对象
		String aviator2 = "aviator2";
		String result4= (String) AviatorEvaluator.exec(" 'hello ' + yourname ",aviator2);
		System.out.println(result4);
		
		//三元表达式
		String result5=(String)AviatorEvaluator.execute("3>0? 'yes':'no'");
		System.out.println(result5);
		
		//函数调用
		Object execute2 = AviatorEvaluator.execute("string.length('hello')");//求字符串长度
		System.out.println(execute2);
		Object execute3 = AviatorEvaluator.execute("math.pow(-3,2)");   //求n次方
		System.out.println(execute3);
		
	}
}
