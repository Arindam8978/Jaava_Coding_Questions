package programming;

public class StringBuffereAndBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//im mutable-means it cannot be alter or change it's be constant.
		//String are immutable
		
		String abc = " javatraning";
		
		abc.concat("world");
		System.out.println(abc); //here will print javatraning the original contant can't be concatenet
		String s = abc.concat("world");
		System.out.println(s); // if we concat and store into another variable then it'll work.

		System.out.println("StringBuffer---------------------------------------------");
		
		//mutable - it can be alter.
		//StringBuffer and StringBuilder both are mutable and both are same but StringBuilder is faster because it's non syncrhonize.
		
		StringBuffer sb = new StringBuffer("hello"); //StringBuffer are thread safe and syncrhonize it's slower because it's syncrhonize.
		sb.append("world");
		System.out.println(sb);
		sb.insert(2, "She");//heShelloworld
		System.out.println(sb);
		sb.replace(5, 7, "aa");//heSheaaoworld
		System.out.println(sb);
		sb.deleteCharAt(12);//heSheaaoworl
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("StringBuilder---------------------------------------------");
		
		//StringBuilder are not thread safe and syncrhonize but it's faster

		StringBuilder sbb = new StringBuilder("hello"); // StringBuilder are not thread safe and syncrhonize but it's faster
		sbb.append("world");
		System.out.println(sbb);
		sbb.insert(2, "She");//heShelloworld
		System.out.println(sbb);
		sbb.replace(5, 7, "aa");//heSheaaoworld
		System.out.println(sbb);
		sbb.deleteCharAt(12);//heSheaaoworl
		System.out.println(sbb);
		sbb.reverse();
		System.out.println(sbb);
		
		
	}

}
