package jsf.sample;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class CountBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private int val;

    public int getVal() {
        return ++val;
    }
    public void setVal(int val) {
        this.val = val;
    }
}