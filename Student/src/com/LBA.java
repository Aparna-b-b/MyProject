package com;

import java.util.*;

 class LBA {
	public static void main(String[]args) {
		int op;
		Scanner s = new Scanner(System.in);
		int remain=0;
		int bktCap =0;
		System.out.println("Enter bucket capacity ");
		bktCap=s.nextInt();
		System.out.println("Enter total  no of inputs");
		int n = s.nextInt();
		int pkt[] = new int[10];
		System.out.println("Enter data output rate:");
		int dr = s.nextInt();
		System.out.println("Enter the inputvalues:");
		for(int i=0;i<n;i++) {
			int val = s.nextInt();
			pkt[i]=val;
		}
		for(int i=0;i<=n;i++) {
			int total=pkt[i]+remain;
			if(total>bktCap) {
				if(pkt[i]>bktCap) {
					System.out.println("incoming packet "+pkt[i]+"bytes is greater than bucket capacity"+bktCap);
					System.out.println("Bucket capacity exceeded Packet REJECTED\n");
				}
			}
			else {
				remain+=pkt[i];
				System.out.println("Incoming packet size is"+pkt[i]);
				if(remain<=dr) {
					op=remain;
					remain=0;
					
				}
				else {
					op=dr;
					remain-=dr;
					System.out.println("Packet size"+op+"is transmitted");
					System.out.println("Remaining capacity"+remain);
					System.out.println();
				}
			}
		}
	}

}
