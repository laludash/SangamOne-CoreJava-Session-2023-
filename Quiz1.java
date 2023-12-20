package com.javaprogram.com;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Capitals {	
	private String country; private String capital; 
	public Capitals(String country, String capital){
		this.capital  = capital; this.country = country;}
	public String getCountry(){return country;}
	public String getCapital(){return capital;}}
public class Quiz1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<Capitals> q1 =  readCapitalCSV("Quiz_Capitals.csv");
		if(q1.isEmpty()){
			System.out.println("No quiz questions found");}
		Collections.shuffle(q1);
		Scanner sc1 = new Scanner(System.in);
		int score = 0;
		List<String> wrong = new ArrayList<>();
		System.out.println("Welcome to the Capitals Quiz ");
		int nofQ = Math.min(14, q1.size());  // min find the minimum value.
		for(int i =0; i<nofQ; i++){
			Capitals q2 = q1.get(i);
			System.out.println("Question" +(i+1)+ "-> What is the capital of " +q2.getCountry());
			String Ans = sc1.nextLine().trim();
			if(Ans.equalsIgnoreCase(q2.getCapital())){
				score = score + 10;}}
		 System.out.println("\n Quiz Complete");
	     System.out.println("Your Score Is: " + score + "/100");}
	private static List<Capitals> readCapitalCSV(String filename) throws FileNotFoundException, IOException{
		List<Capitals> li = new ArrayList<>();
		String line; 
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
			br.readLine();
			while((line = br.readLine()) != null){
				String[] data = line.split(",");
				if(data.length == 2){
					li.add(new Capitals(data[0], data[1]));}}
		}catch(IOException e){e.printStackTrace();}
		return li;}
}
