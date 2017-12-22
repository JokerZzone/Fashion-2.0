<!-- 限时抢购 -->
<div class="xianshiqianggou">
    <!-- 标题栏 -->
    <div class="title">
        <img src="../img/xsqg_2.jpg" alt="限时抢购">
    </div>
    <!-- 内部小模块：一排4个，根据后台变动 -->
    <ul class="goodsUL">
        <!-- 小模块 -->
        <c:forEach begin="1" end="4" step="1">
            <a href="###">
                <li class="goodsLI">
                    <!-- 边框 -->
                    <div class="border">
                        <!-- 倒计时 -->
                        <div class="countdown">
                            剩余 <span class="hour">14</span>
                            小时 <span>11</span> 分 <span>08.5</span> 秒
                        </div>
                        <!-- 商品图片 -->
                        <img src="../img/kouhong.jpg" alt="口红">
                        <div class="goodsKnow">雅诗兰黛花漾倾慕唇膏02#值得倾慕的双唇，塑造饱满色泽，丰盈翘弹唇型</div>
                        <!-- 抢购 -->
                        <div class="snapUp">
                            <div>￥</div>
                            <!-- 价格 -->
                            <div class="price">198.00</div>
                        </div>
                    </div>
                    <!-- 已购买 -->
                    <div class="buy">
                        <span class="number">210 </span>人已购买
                    </div>
                </li>
            </a>
        </c:forEach>
    </ul>
</div>