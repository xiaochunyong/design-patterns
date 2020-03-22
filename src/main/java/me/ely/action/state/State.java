package me.ely.action.state;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public interface State {
    // 投入25分钱
    public  void insertQuarter();

    // 退回25分钱
    public void ejectQuarter();

    // 转动曲柄
    void turnCrank();

    // 发放糖果
    void dispense();
}
