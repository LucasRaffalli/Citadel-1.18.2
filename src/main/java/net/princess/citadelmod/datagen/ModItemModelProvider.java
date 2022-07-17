package net.princess.citadelmod.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.princess.citadelmod.CitadelMod;
import net.princess.citadelmod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CitadelMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ZORIUM_INGOT.get());

        handheldItem(ModItems.ZORIUM_AXE.get());
        handheldItem(ModItems.ZORIUM_SHOVEL.get());
        handheldItem(ModItems.ZORIUM_PICKAXE.get());
        handheldItem(ModItems.ZORIUM_SWORD.get());
        handheldItem(ModItems.ZORIUM_HOE.get());

        simpleItem(ModItems.ZORIUM_HELMET.get());
        simpleItem(ModItems.ZORIUM_CHESTPLATE.get());
        simpleItem(ModItems.ZORIUM_LEGGING.get());
        simpleItem(ModItems.ZORIUM_BOOTs.get());

        simpleItem(ModItems.NETHERITE_HAMMER.get());
        simpleItem(ModItems.RAW_ZORIUM.get());
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CitadelMod.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(CitadelMod.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }
}