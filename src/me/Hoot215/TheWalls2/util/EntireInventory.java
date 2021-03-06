/*
 * TheWalls2: The Walls 2 plugin. Copyright (C) 2012 Andrew Stevanus (Hoot215)
 * <hoot893@gmail.com>
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package me.Hoot215.TheWalls2.util;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class EntireInventory
  {
    private ItemStack[] contents;
    private ItemStack[] armourContents;
    
    public EntireInventory(PlayerInventory playerInv)
      {
        contents = playerInv.getContents();
        armourContents = playerInv.getArmorContents();
      }
    
    public ItemStack[] getContents ()
      {
        return contents;
      }
    
    public ItemStack[] getArmourContents ()
      {
        return armourContents;
      }
  }