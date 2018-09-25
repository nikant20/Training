package com.opteamix.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestIOStreams {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			FileWriter fileWriter = new FileWriter("D://abc.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			String line = null;
			System.out.println("Enter some charcters and type quit to stop");
			do {
				line = br.readLine();
				if(!line.equals("quit")) {
					bufferedWriter.write(line);
					bufferedWriter.newLine();
					bufferedWriter.flush();
				}
			} while (!line.equals("quit"));
			bufferedWriter.close();
			fileWriter.close();
			System.out.println("Done writing, refresh the project to see the file. Right click on project to refresh");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
