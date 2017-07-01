package powercrystals.minefactoryreloaded.api;

import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

/**
 * Defines a class that MFR will use to local egg info for a given mob. This is
 * used to color the Safari Net based on the captured mob.
 *
 * @author PowerCrystals
 */
public interface IMobEggHandler {

	/**
	 * @param safariNet
	 *            The Safari Net that is looking for egg info.
	 *
	 * @return An EntityEggInfo, or null if this instance cannot handle this
	 *         mob.
	 */
	public EntityEggInfo getEgg(@Nonnull ItemStack safariNet);

}
