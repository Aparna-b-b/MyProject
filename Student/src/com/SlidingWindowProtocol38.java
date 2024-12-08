
package com;

import java.util.Scanner;
public class SlidingWindowProtocol38{
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total frames to send");
		int totalframes = scanner.nextInt();
		System.out.println("Enter the windowSize");
		int windowsize = scanner.nextInt();
		int sent=0;
		int ack=0;
	
		while(sent<totalframes) {
			System.out.println("sending frames in window");
			for(int i=0;i<windowsize && sent+i<totalframes;i++) {
			System.out.println("Frame sent:"+(sent+i));
			}
			System.out.println("Enter no of frames acknowleged");
			int acknowledged = scanner.nextInt();
			if(acknowledged==0) {
				System.out.println("No frames acknowledged resending frames");
			}
			else {
				
			ack+=acknowledged;
			sent=ack;
			System.out.println("Acknowledged upto frames:"+(ack-1));
			System.out.println("Sliding window");
			}
			if(ack>=totalframes) {
				System.out.println("All frames sent successfully!!");
				break;
			}
		}
			scanner.close();
				
}
}
