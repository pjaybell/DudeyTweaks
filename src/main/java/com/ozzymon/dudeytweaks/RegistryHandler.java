package com.ozzymon.dudeytweaks;

import com.ozzymon.dudeytweaks.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
	// create DeferredRegister object
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DudeyTweaks.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			DudeyTweaks.MOD_ID);

	public static void init() {
		// attach DeferredRegister to the event bus
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

	// register item
	public static final RegistryObject<SwordItem> DUDEY_SWORD = ITEMS.register(
			"dudey_sword",
			() -> new SwordItem(
					ModItemTier.CUSTOMNAMEHERE, 14, -2.8f,
					new Item.Properties().group(ItemGroup.COMBAT)
			)
	);
	// register block
	public static final RegistryObject<Block> DUDEYRITE_ORE = BLOCKS.register("dudeyrite_ore",
			() -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 6.0f)
					.sound(SoundType.STONE).harvestLevel(4).harvestTool(ToolType.PICKAXE)));

	public static final RegistryObject<Item> DUDEYRITE_ORE_ITEM = ITEMS.register("dudeyrite_ore",
			() -> new BlockItem(DUDEYRITE_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

	public static final RegistryObject<Block> DUDEYRITE_BLOCK = BLOCKS.register("dudeyrite_block",
			() -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(10.0f, 10.0f)
					.sound(SoundType.METAL).harvestLevel(4).harvestTool(ToolType.PICKAXE)));

	public static final RegistryObject<Item> DUDEYRITE_BLOCK_ITEM = ITEMS.register("dudeyrite_block",
			() -> new BlockItem(DUDEYRITE_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}