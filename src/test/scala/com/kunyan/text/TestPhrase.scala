package com.kunyan.text

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by C.J.YOU on 2016/11/29.
  */
class TestPhrase extends FlatSpec with Matchers {

  "phrase" should "pass" in {

    val document = "算法可大致分为基本算法、数据结构的算法、数论算法、计算几何的算法、图的算法、动态规划以及数值分析、加密算法、排序算法、检索算法、随机化算法、并行算法、厄米变形模型、随机森林算法。\n" +
      "算法可以宽泛的分为三类，\n" +
      "一，有限的确定性算法，这类算法在有限的一段时间内终止。他们可能要花很长时间来执行指定的任务，但仍将在一定的时间内终止。这类算法得出的结果常取决于输入值。\n" +
      "二，有限的非确定算法，这类算法在有限的时间内终止。然而，对于一个（或一些）给定的数值，算法的结果并不是唯一的或确定的。\n" +
      "三，无限的算法，是那些由于没有定义终止定义条件，或定义的条件无法由输入的数据满足而不终止运行的算法。通常，无限算法的产生是由于未能确定的定义终止条件。"

    val text = """再造中金。中金167亿并购中投证券背后：失落的“贵族”能否崛起。中金公司与中投证券重组有利多方共赢。再造中金：与中投证券风格迥异 一加一是否大于二。“没落贵族”能否重现辉煌。研报：公司股价或翻倍。中金公司宣布与中投证券进行战略重组。中金公司167亿鲸吞中投证券 “十四爷”未来瞄着财富管理。中金公司巨资收购中投证券。距离中金公司公告称收购中投证券100%股权已经过去了6天。两家券商依然如往日一样高速运转。我们其实也没有太多的感觉。一位中投证券的员工表示。很多事情已经不一样了。汇金系券商整合的重磅之作正在缓缓拉开大幕。中金公司将以每股9.95元的发行价格。向中央汇金发行16.78亿股。汇金将持有中金公司58.58%。此次收购对中投证券估值对价为167亿元。中金公司与中投证券重组有利多方共赢。本报记者卓尚进11月4日。中国国际金融股份有限公司（以下简称“中金公司”）宣布。中金公司与其主要股东中央汇金投资有限责任公司（以下简称“汇金公司”）订立股权转让协议。将从汇金公司收购中国中投证券有限责任公司（以下简称“中投证券”）的全部股权。根据经资产评估机构评估、财政部核准的中投证券评估值。综合考虑行业发展状况、中投证券财务表现与未来发展及预期协同效应等多项因素。本次交易的对价确定为人民币167亿元。中金公司将通过向汇金公司发行中金公司内资股的方式支付。中投证券将成为中金公司的全资子公司。中金公司与主要股东中央汇金公司订立股权转让协议。将从汇金公司收购中投证券的全部股权。本次交易的对价确定为人民币167亿元。中金公司将通过向汇金公司发行中金公司内资股的方式支付。中投证券将成为中金公司的全资子公司。证券业再度上演并购案。这在当下的中国证券业已经算不上是什么稀奇事了。毕竟对于每一家券商来说。都怀揣着一个“做大做强”的梦想。而收购则是实现这个梦想的一个重要步骤。至少通过收购。券商“做大”的愿望可以成真。或者看到了“成真”的希望。而中金公司这个曾经的“投行贵族”当然也有着这样的梦想。新华社北京１１月４日专电（记者刘慧）中国国际金融股份有限公司（中金公司）４日宣布。经董事会批准，中金公司与该公司的主要股东中央汇金投资有限责任公司（汇金公司）订立股权转让协议。"""

    val phrase = Phrase.getPhrase(text, 10)
    println("phrase:" + phrase)

  }

}
