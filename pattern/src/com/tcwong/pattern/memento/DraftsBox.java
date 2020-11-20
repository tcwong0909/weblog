package com.tcwong.pattern.memento;

import java.util.Stack;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/11/20
 * Since 1.8
 */
public class DraftsBox {
    /**
    * 用栈数据结构
    */
    private Stack<ArticleMemento> STACK = new Stack<>();

    /**
    * 添加草稿
    */
    public void addMemento(ArticleMemento articleMemento) {
        STACK.push(articleMemento);
    }

    /**
    * 获取草稿
    */
    public ArticleMemento getMemento() {
        ArticleMemento articleMemento = STACK.pop();
        return articleMemento;
    }
}
