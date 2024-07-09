package net.brian.practicemod.items;

import net.brian.practicemod.PracticeMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PracticeMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FLESHCRAFT = CREATIVE_MODE_TABS.register("fleshcraft",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NEURALKEY.get()))
                    .title(Component.translatable("creativetab.fleshcraft"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.NEURALKEY.get());
                        output.accept(Items.BONE);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
