package com.bridgelabz.deckofcards;

public class DeckOfCards {
	public static void main(String[] args) {
		
		//Array of all the cards with the face type have been declared.
		String shape[]={"Spades","Clover","Diamond","Heart"};
		String rank[]={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		//Object from the player class has been initialized.
		Player object[]=new Player[4];
		
		//Loop to iterate through the number of players.
		for(int index=0;index<4;index++)
			object[index]=new Player();
		
		//A 2D Array has been initialized.
		int[][] combinations=new int[4][13];
		for(int index1=0;index1<4;index1++) {
			for(int index2=0;index2<13;index2++) {
				combinations[index1][index2]=0;
			}
		}
		
		//Check on a random basis that each and every player gets only 9 cards.
		for(int check=0;check<36;) {
			int index1=(int)(Math.random()*3);
			int index2=(int)(Math.random()*12);
			if(combinations[index1][index2]==0) {
				
				//Storing the value in Object array created from player class.
				if(check%4==0)
					object[0].getCards(rank[index2]+" of "+shape[index1]);
				if(check%4==1)
					object[1].getCards(rank[index2]+" of "+shape[index1]);
				if(check%4==2)
					object[2].getCards(rank[index2]+" of "+shape[index1]);
				if(check%4==3)
					object[3].getCards(rank[index2]+" of "+shape[index1]);
				check++;
				combinations[index1][index2]=1;
			}
		}
		
		//Printing the sorted value stored in linked list after applying the queue method.
		for(int index=0;index<4;index++) {
			System.out.print("Player "+(index+1)+":   ");
			object[index].queue.print();
			System.out.println();
		}
	}
}
