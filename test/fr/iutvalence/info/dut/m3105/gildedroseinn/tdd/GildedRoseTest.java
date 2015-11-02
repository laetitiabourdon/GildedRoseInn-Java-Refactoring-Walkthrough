package fr.iutvalence.info.dut.m3105.gildedroseinn.tdd;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring.GildedRose;
import fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring.Item;

public class GildedRoseTest
{
	
	
	@Test
	public void updateQualityAndSellInWithMinusOneForAll()
	{
		List<Item> items; 
		items = new ArrayList<Item>();
		items.add(new Item("Conjured Mana Cake", 3, 6));
		
		GildedRose gildedRose = new GildedRose();
		
		gildedRose.updateQualityAndSellInForAllItems(items);
		
		assertEquals(((Item) items).getQuality(), 2);
		assertEquals(((Item) items).getSellIn(), 5);
		
	}
}
