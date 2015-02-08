package FizzyClubMods.Gui.Funtion;

import FizzyClubMods.Gui.Inv.FizzyClubInv;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.ServerConfigurationManager;

public class INVFunction
{
  public static void addEntry(String var1, FizzyClubInv var2)
  {
    if ((MinecraftServer.getServer() != null) && (MinecraftServer.getServer().getConfigurationManager() != null))
    {
      EntityPlayerMP var3 = MinecraftServer.getServer().getConfigurationManager().getPlayerForUsername(var1);
      try
      {
        if (var3 != null)
        {
          if (var3.getEntityData().hasKey("PlayerPersisted"))
          {
            var3.getEntityData().getCompoundTag("PlayerPersisted").setCompoundTag("iCraftInv", var2.writeToNBT(new NBTTagCompound("iCraftInv")));
          }
          else
          {
            var3.getEntityData().setCompoundTag("PlayerPersisted", new NBTTagCompound("PlayerPersisted"));
            var3.getEntityData().getCompoundTag("PlayerPersisted").setCompoundTag("iCraftInv", var2.writeToNBT(new NBTTagCompound("iCraftInv")));
          }
        }
      }
      catch (Throwable var5)
      {
        var5.printStackTrace();
      }
    }
  }

  public static FizzyClubInv getInventory(String var1) {
	  FizzyClubInv var2 = new FizzyClubInv(var1);

    if ((MinecraftServer.getServer() != null) && (MinecraftServer.getServer().getConfigurationManager() != null))
    {
      EntityPlayerMP var3 = MinecraftServer.getServer().getConfigurationManager().getPlayerForUsername(var1);

      if (var3 != null)
      {
        if ((var3.getEntityData().hasKey("PlayerPersisted")) && (var3.getEntityData().getCompoundTag("PlayerPersisted").hasKey("iCraftInv")))
        {
          var2.readFromNBT(var3.getEntityData().getCompoundTag("PlayerPersisted").getCompoundTag("iCraftInv"));
        }
        else
        {
          if (!var3.getEntityData().hasKey("PlayerPersisted"))
          {
            var3.getEntityData().setCompoundTag("PlayerPersisted", new NBTTagCompound("PlayerPersisted"));
          }

          var3.getEntityData().getCompoundTag("PlayerPersisted").setCompoundTag("iCraftInv", var2.writeToNBT(new NBTTagCompound()));
        }
      }
    }

    return var2;
  }
}