package com.wsk.gain;

import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.relics.AbstractRelic;
import com.megacrit.cardcrawl.rewards.RewardItem;
import com.megacrit.cardcrawl.rooms.MonsterRoomBoss;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author wsk1103
 * @date 2019/3/8
 * @description 根据概率性，向奖励界面加入一个随机稀有度的遗物和3张金卡。
 */
public class GainRelicsAllTime {

    public void receiveRewards(ArrayList<RewardItem> rewards) {
        if (AbstractDungeon.getCurrRoom() instanceof MonsterRoomBoss) {
            return;
        }
        for (RewardItem reward : rewards) {
            if (reward.type == RewardItem.RewardType.RELIC) {
                return;
            }
        }
        Random random = new Random();
        int r = random.nextInt(100);
        AbstractRelic.RelicTier tier = AbstractRelic.RelicTier.COMMON;
        if (r >= 91) {
            tier = AbstractRelic.RelicTier.BOSS;
        } else if (r >= 80) {
            tier = AbstractRelic.RelicTier.RARE;
        } else if (r >= 65) {
            tier = AbstractRelic.RelicTier.UNCOMMON;
        } else if (r >= 45) {
            tier = AbstractRelic.RelicTier.SHOP;
        }
        rewards.add(new RewardItem(AbstractDungeon.returnRandomRelic(tier)));
        //加入金卡
        RewardItem item = new RewardItem(AbstractCard.CardColor.COLORLESS);
        ArrayList<AbstractCard> cards = item.cards;
        cards.clear();
        for (int i = 0; i < 3; i++) {
            cards.add(AbstractDungeon.getCard(AbstractCard.CardRarity.RARE));
        }
        rewards.add(item);
    }
}
