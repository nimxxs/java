package day06;

public class NewLotto {
	int lotto[]=new int[6];{
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=(int) (Math.random()*45)+1;
			System.out.print(lotto[i]+" ");
		}
	}
}
