package com.bridgelabz.deckofcards;

import com.bridgelabz.utility.LinkedListUsingQueue;

//Implementing the Cards interface for the methods.
public class Player implements Cards {
	
	//Declarations.
	int index=0;
	String cards[];
	String rank[]={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	public LinkedListUsingQueue queue=new LinkedListUsingQueue();
	
	//This method will help in creating the object array in main class.
	public Player()
	{
		cards=new String[9];
		for(int index=0;index<9;index++)
			cards[index]=new String();
	}
	
	//Enqueueing the sorted data in cards.
	public void getCards(String card)
	{
		
		cards[index]=card;
		index++;
		if(index==9)
			sort();
	}
	
	//Enqueueing the sorted value in the linked list.
	public void sort()
	{
		for(int index1=0;index1<rank.length;index1++)
		{
			for(int index2=0;index2<cards.length;index2++)
			{
				if(cards[index2].charAt(0)==rank[index1].charAt(0))
				{
					queue.enqueue(cards[index2]);
				}
			}
		}
	}
}
