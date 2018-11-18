package Work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoadToll {
	
	public RoadToll(int i){
		System.out.println(i);
	}
	
	public void RoadToll(){
		System.out.println("Josj");
	}

	

}


class R extends RoadToll{
	R(){
		System.out.println("R no arg");
	}
	
public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		new RoadToll(10).RoadToll();
	}
}