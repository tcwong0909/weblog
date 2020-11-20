package com.tcwong.pattern.memento;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/11/20
 * Since 1.8
 */
public class Test {

    public static void main(String[] args) {
        DraftsBox draftsBox = new DraftsBox();
        Editor editor = new Editor("标题001", "内容001", "图片001");
        ArticleMemento articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);
        System.out.println("1、初始化");
        printArticle(editor);

        System.out.println("2、开始第一次修改>>>>");
        editor.setTitle("标题002");
        editor.setContent("内容002");
        editor.setImgs("图片002");
        articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);
        printArticle(editor);

        System.out.println("3、开始第二次修改>>>>");
        editor.setTitle("标题003");
        editor.setContent("内容003");
        editor.setImgs("图片003");
        printArticle(editor);

        System.out.println("4、第一步撤回>>>>");
        ArticleMemento memento = draftsBox.getMemento();
        editor.undoFromMemento(memento);
        printArticle(editor);

        System.out.println("5、第二步撤回>>>>");
        memento = draftsBox.getMemento();
        editor.undoFromMemento(memento);
        printArticle(editor);

    }

    private static void printArticle(Editor editor) {
        System.out.println("文本信息:"+editor);
    }
}
