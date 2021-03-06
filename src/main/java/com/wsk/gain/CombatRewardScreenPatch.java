package com.wsk.gain;

import com.evacipated.cardcrawl.modthespire.lib.*;
import com.megacrit.cardcrawl.screens.CombatRewardScreen;
import com.megacrit.cardcrawl.ui.buttons.DynamicButton;
import javassist.CtBehavior;

/**
 * @author wsk1103
 * @date 2019/3/8
 * @description 战斗结束后，奖励界面
 */
@SpirePatch(clz = CombatRewardScreen.class, method = "setupItemReward")
public class CombatRewardScreenPatch {

    @SpireInsertPatch(locator = Locator.class)
    public static void insert(CombatRewardScreen instance) {
        GainRelicsAllTime allTime = new GainRelicsAllTime();
        allTime.receiveRewards(instance.rewards);
        GainRareCard gainRareCard = new GainRareCard();
        gainRareCard.receiveRewards(instance.rewards);
    }


    private static class Locator extends SpireInsertLocator {
        @Override
        public int[] Locate(CtBehavior ctMethodToPatch)
                throws Exception {
            Matcher finalMatcher = new Matcher.MethodCallMatcher(DynamicButton.class, "hide");
            int[] found = LineFinder.findAllInOrder(ctMethodToPatch, finalMatcher);
            return new int[]{found[0]};
        }
    }
}
