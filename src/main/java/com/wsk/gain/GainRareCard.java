package com.wsk.gain;

import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.rewards.RewardItem;

import java.util.*;

/**
 * @author wsk1103
 * @date 2019/6/17
 * @description 战斗胜利后，奖励界面增加3张金卡
 */
public class GainRareCard {

    private static Queue<AbstractCard> cardList = null;

    private int num = 3;

    public void receiveRewards(ArrayList<RewardItem> rewards) {
        //加入金卡
        if (cardList == null || cardList.size() < num) {
            cardList = new PriorityQueue<>();
            List<AbstractCard> randomCard = AbstractDungeon.rareCardPool.group;
            //乱序一下
            Collections.shuffle(randomCard);
            cardList.addAll(randomCard);
        }
        RewardItem item = new RewardItem(AbstractCard.CardColor.COLORLESS);
        ArrayList<AbstractCard> cards = item.cards;
        cards.clear();
        for (int i = 0; i < 3; i++) {
            cards.add(cardList.poll());
        }
        rewards.add(item);
    }
}
