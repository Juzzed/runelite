/*
 * Copyright (c) 2018, Mantautas Jurksa <https://github.com/Juzzed>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package net.runelite.client.plugins.woodcutting;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import static net.runelite.api.AnimationID.*;
import static net.runelite.api.ItemID.*;

@AllArgsConstructor
enum Axe
{
	BRONZE(WOODCUTTING_BRONZE, BRONZE_AXE),
	IRON(WOODCUTTING_IRON, IRON_AXE),
	STEEL(WOODCUTTING_STEEL, STEEL_AXE),
	BLACK(WOODCUTTING_BLACK, BLACK_AXE),
	MITHRIL(WOODCUTTING_MITHRIL, MITHRIL_AXE),
	ADAMANT(WOODCUTTING_ADAMANT, ADAMANT_AXE),
	RUNE(WOODCUTTING_RUNE, RUNE_AXE),
	DRAGON(WOODCUTTING_DRAGON, DRAGON_AXE),
	INFERNAL(WOODCUTTING_INFERNAL, INFERNAL_AXE),
	THIRDAGE(WOODCUTTING_3A_AXE, _3RD_AGE_AXE);

	private static final List<Integer> AXE_ANIM_IDS = new ArrayList<>();
	private final Integer animID;
	private final Integer itemID;

	static
	{
		for (Axe axe : values())
		{
			AXE_ANIM_IDS.add(axe.animID);
		}
	}

	public static List<Integer> getAxeAnimIds()
	{
		return AXE_ANIM_IDS;
	}

	public static Integer getItemID(int animID)
	{
		for (Axe axe : Axe.values())
		{
			if (axe.animID == animID)
			{
				return axe.itemID;
			}
		}

		return null;
	}
}
