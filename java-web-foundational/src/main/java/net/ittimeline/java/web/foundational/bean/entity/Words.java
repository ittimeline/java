package net.ittimeline.java.web.foundational.bean.entity;

/**
 * 搜索关键字
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/7 14:50
 * @since JDK11
 */
public class Words {

    private Long id;

    private String word;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Words{" +
                "id=" + id +
                ", word='" + word + '\'' +
                '}';
    }
}
