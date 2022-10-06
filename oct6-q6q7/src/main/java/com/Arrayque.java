package com;
import java.util.ArrayList;


public class Arrayque {
	public static void main(String args[]) {
		boolean b = true;
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("b");
		s1.add("a");
		s1.add("c");
		s1.add("d");
		ArrayList<String> s2 = new ArrayList<String>();
		s2.add("a");
		s2.add("e");
		s2.add("f");
		ArrayList<String> s3 = new ArrayList<String>();
		s3.add("g");
		s3.add("h");
		s3.add("i");
		s3.add("a");
		ArrayList<String> s4 = new ArrayList<String>();
		s4.add("j");
		s4.add("a");
		s4.add("k");
		s4.add("l");
		ArrayList<String> s5 = new ArrayList<String>();
		s5.add("m");
		s5.add("n");
		s5.add("a");
		s5.add("o");
		s5.add("p");
		s5.add("q");
		s5.add("r");
		s5.add("s");
		
		
		
		for (String s:s1) {
			for (String ss:s2) {
				if (s == ss) {
					System.out.println("index of repeated letter in s1 is " + s1.indexOf(s));
					System.out.println("index of repeated letter in s2 is " + s2.indexOf(s));
					}}}
		for (String s:s1) {
			for (String ss2:s3) {
				if (s == ss2) {
					System.out.println("index of repeated letter in s3 is " + s3.indexOf(s));
					}}}
		for (String s:s1) {
			for (String ss3:s4) {
				if (s == ss3) {
					System.out.println("index of repeated letter in s4 is " + s4.indexOf(s));
					}}}
		for (String s:s1) {
			for (String ss4:s5) {
				if (s == ss4) {
					System.out.println("index of repeated letter in s5 is " + s5.indexOf(s));
					}}}
		
}
}