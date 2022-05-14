package com.ozzymon.dudeytweaks;

import com.ozzymon.dudeytweaks.tools.ModItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class DudeyTweaksItems {
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, DudeyTweaks.MOD_ID);

    public static final RegistryObject<SwordItem> DUDEY_SWORD = ITEMS.register(
            "dudey_sword",
            () -> new SwordItem(
                    ModItemTier.CUSTOMNAMEHERE, 14, -2.8f,
                    new Item.Properties().group(ItemGroup.COMBAT)
            )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
