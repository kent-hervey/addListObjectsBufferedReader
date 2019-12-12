package com.hervey.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		List<People> peopleList = new ArrayList<People>();

		String incoming;

		while (true) {
			incoming = reader.readLine();
			if(!(incoming.equals(""))) {
				peopleList.add(new People(incoming, Integer.parseInt(reader.readLine())));
			}
			else {
				break;
			}
		}

		System.out.println(peopleList.toString());
		
		//peopleList.get(index)
		
	}

}
