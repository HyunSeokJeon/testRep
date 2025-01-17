package chap14.sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", 90, 96),
			new Student("�ſ��", 95, 93)
			);
	
	
	public static Double printAvg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = printAvg(t -> t.getEnglishScore());
		System.out.println(englishAvg);
		
		double mathAvg = printAvg(t -> t.getMathScore());
		System.out.println(mathAvg);
	}
}
