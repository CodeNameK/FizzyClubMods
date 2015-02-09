package FizzyClubMods.Gui.Cons;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
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
	

	public InventoryContainer(EntityPlayer entityplayer, FizzyClubInv inv) {
		int var3;
		int var4;
//
     	addSlotToContainer(new SlotCustomArmor(inv, 0, 80, 10, entityplayer));
//		addSlotToContainer(new SlotCustomArmor(inv, 1, 80, 30, entityplayer));
//		//addSlotToContainer(new SlotCustomArmor(inv, 1, 80, 60, entityplayer));
//		addSlotToContainer(new SlotCustomArmor(inv, 4, 80, 60, entityplayer));
		
//		for (var3 = 0; var3 < 4; ++var3) {
//
//			addSlotToContainer(new SlotCustomArmor(inv,var3, 80,10+(var3*18), entityplayer));
//		}
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
	
	
	
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
    {
		return null;
//        if (par2 >= this.inventorySlots.size() - 9 && par2 < this.inventorySlots.size())
//        {
//            Slot slot = (Slot)this.inventorySlots.get(par2);
//
//            if (slot != null && slot.getHasStack())
//            {
//                slot.putStack((ItemStack)null);
//             
//            }
//        }
//
//        return null;
   }
	
}