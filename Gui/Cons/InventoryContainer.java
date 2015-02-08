package FizzyClubMods.Gui.Cons;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import FizzyClubMods.Gui.Inv.FizzyClubInv;
import FizzyClubMods.Gui.Funtion.INVFunction;
import FizzyClubMods.Gui.Slot.SlotArmor;
import FizzyClubMods.Gui.Slot.SlotCustomArmor;
import FizzyClubMods.Items.ItemCustomArmor;

public class InventoryContainer extends Container {
	FizzyClubInv inventory;
	private static final int ARMOR_START = FizzyClubInv.ArmorSlots.length;

	public InventoryContainer(EntityPlayer entityplayer, FizzyClubInv inv) {
		int var3;
		int var4;

		addSlotToContainer(new SlotCustomArmor(inv, 0, 80, 10, entityplayer));
		addSlotToContainer(new SlotCustomArmor(inv, 1, 80, 60, entityplayer));

		for (var3 = 0; var3 < 4; ++var3) {
			addSlotToContainer(new SlotArmor(entityplayer, inv,
					inv.getSizeInventory() - 1 - var3, 8, 8 + var3 * 18, var3));
		}
		for (var3 = 0; var3 < 9; var3++) {
			addSlotToContainer(new Slot(entityplayer.inventory, var3,
					8 + var3 * 18, 142));
		}
		for (var3 = 0; var3 < 3; var3++) {
			for (var4 = 0; var4 < 9; var4++) {
				addSlotToContainer(new Slot(entityplayer.inventory, var4 + var3
						* 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
				// addSlotToContainer(new Slot(entityplayer.inventory, var4 +
				// (var3 + 1) * 9, 9 + var4 * 18, 108 + var3 * 18));
			}
		}
		if (inv == null) {
			inv = INVFunction.getInventory(entityplayer.username);
		}

		if (isPlayerNotUsingContainer(entityplayer)) {
			setPlayerIsPresent(entityplayer, true);
		}
		this.inventory = inv;
	}

	public boolean canInteractWith(EntityPlayer entityplayer) {
		return true;
	}

	@SuppressWarnings("null")
	public ItemStack transferStackInSlot(EntityPlayer player, int par2) {
		ItemStack itemstack = null;
		Slot slot = (Slot) this.inventorySlots.get(par2);

		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			slot.onSlotChange(itemstack1, itemstack);
		}
		// Item is in inventory / hotbar, try to place either in custom or armor
		// slots
		else {
			// if item is our custom item
			if (itemstack.getItem() instanceof ItemCustomArmor) {
				if (!this.mergeItemStack(itemstack, 0,
						FizzyClubInv.ArmorSlots.length, false)) {
					return null;
				}
			}
			// if item is armor
			else if (itemstack.getItem() instanceof ItemArmor) {
				int type = ((ItemArmor) itemstack.getItem()).armorType;
				if (!this.mergeItemStack(itemstack, ARMOR_START + type,
						ARMOR_START + type + 1, false)) {
					return null;
				}
			}
		}

		return itemstack;
	}
}